package modelo.persistencia;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import modelo.dominio.ModeloVeiculo;

public class PersisteModeloVeiculo extends DaoBase{
    public static File arquivo;
    public static List<ModeloVeiculo> listaModeloVeiculo;
                        
    
    public PersisteModeloVeiculo() {
        arquivo = new File("src/arquivos/ModeloVeiculo.txt");
        listaModeloVeiculo = new ArrayList<ModeloVeiculo>();
        retornarTodosModelos();
    }
    
    public static void retornarTodosModelos(){
        
        if(arquivo.exists()){
            FileReader reader = null;
            try{
                reader = new FileReader(arquivo);
                BufferedReader leitor = new BufferedReader(reader);
           
                String linha = null;
                try{
                    while((linha = leitor.readLine()) != null){
                        ModeloVeiculo modeloVeiculo = new ModeloVeiculo();
                        modeloVeiculo.setModelo(linha);
                        listaModeloVeiculo.add(modeloVeiculo);
                    }

                    reader.close();
                    leitor.close();
                } catch (IOException ex){
                    System.out.println("Erro na leitura ou escrita do arquivo " 
                            + arquivo.getName());
                }
                
            } catch (IOException ex) {
                System.out.println("Erro na leitura ou escrita do arquivo " 
                        + arquivo.getName());
            }
            
        }
        else{
            System.out.println("Arquivo " + arquivo.getName() + "não foi encontrado");
        }
        
    }
    
    public boolean salvar(ModeloVeiculo modeloVeiculo) {
        if(arquivo.exists()){
            FileWriter writer = null;
            try {
                writer = new FileWriter(arquivo);
                PrintWriter dados = new PrintWriter(writer);
                
                //busca todos os tipos existentes
                
                boolean achou = false;
                for(ModeloVeiculo modelo : listaModeloVeiculo){
                    if(modelo.getModelo().equals(modeloVeiculo.getModelo())){
                        achou = true;
                    }
                }
                if(achou == false){
                    listaModeloVeiculo.add(modeloVeiculo);
                }
                
                for(ModeloVeiculo modelo : listaModeloVeiculo){
                    dados.println(modelo.getModelo());
                }
                
                writer.close();
                dados.close();
                return true;
            } catch (IOException ex) {
                System.out.println("Erro na escrita/leitura do arquivo");
                return false;
            }
        }
        else{
            System.out.println("Arquvo não encontrado");
            return false;
        }

    }
    
    public boolean verificarModeloJaCadastrado(ModeloVeiculo modelo){
        abrirDB();
        ModeloVeiculo m = new ModeloVeiculo();
        
        Query query = em.createQuery("FROM ModeloVeiculo m WHERE m.modelo = :modelo");
        query.setParameter("modelo", modelo.getModelo());
        
        try{
            m = (ModeloVeiculo)query.getSingleResult();
            return true;
        }catch(NoResultException ex){
            fecharDB();
            return false;
        }
    }
    
    public void salvarBD(ModeloVeiculo modelo){
        abrirDB();
        
        em.persist(modelo);
        em.getTransaction().commit();
        
        fecharDB();
    }
    
    public List retornarTodosModelosBD(){
        abrirDB();
        List lista = null;
        Query query = em.createQuery("FROM ModeloVeiculo");
        try{
            lista = query.getResultList();
            fecharDB();
            return lista;
        }catch(NoResultException ex){
            fecharDB();
            return lista;
        }
    }
}
