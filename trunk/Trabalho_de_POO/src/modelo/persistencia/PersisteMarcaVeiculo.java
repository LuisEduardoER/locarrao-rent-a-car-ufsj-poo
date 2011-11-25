package modelo.persistencia;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import modelo.dominio.MarcaVeiculo;
import modelo.dominio.ModeloVeiculo;

public class PersisteMarcaVeiculo extends DaoBase{
    public static File arquivo;
    public static List<MarcaVeiculo> listaMarcaVeiculo;
                        
    
    public PersisteMarcaVeiculo(){
        arquivo = new File("src/arquivos/MarcaVeiculo.txt");
        listaMarcaVeiculo = new ArrayList<MarcaVeiculo>();
        retornarTodasMarcas();
    }
    
    public static void retornarTodasMarcas(){
        if(arquivo.exists()){
            try {
                FileReader reader = new FileReader(arquivo);
                BufferedReader leitor = new BufferedReader(reader);
                
                String linha = null;
                MarcaVeiculo marcaVeiculo = new MarcaVeiculo();
                try {
                    while((linha = leitor.readLine()) != null){
                        marcaVeiculo.setMarca(linha);
                        listaMarcaVeiculo.add(marcaVeiculo);
                        marcaVeiculo = new MarcaVeiculo();
                    }
                } catch (IOException ex) {
                    System.out.println("Erro na leitura ou escrita do arquivo " + 
                            arquivo.getName());
                }
            } catch (FileNotFoundException ex) {
                System.out.println("Arquivo " + arquivo.getName() + "não foi encontrado");
            }
        }
        else{
            System.out.println("Arquivo " + arquivo.getName() + "não foi encontrado");
        }
    }
    
    public boolean salvar(MarcaVeiculo marcaVeiculo) {
        if(arquivo.exists()){
            FileWriter writer = null;
            try {
                writer = new FileWriter(arquivo);
                PrintWriter dados = new PrintWriter(writer);
                
                //busca todos os tipos existentes
                
                boolean achou = false;
                for(MarcaVeiculo marca : listaMarcaVeiculo){
                    if(marca.getMarca().equals(marcaVeiculo.getMarca())){
                        achou = true;
                    }
                }
                if(achou == false){
                    listaMarcaVeiculo.add(marcaVeiculo);
                }
                
                for(MarcaVeiculo marca : listaMarcaVeiculo){
                    dados.println(marca.getMarca());
                }
                
                writer.close();
                dados.close();
                return true;
            } catch (IOException ex) {
                System.out.println("Erro na leitura ou escrita do arquivo " +
                            arquivo.getName());
                return false;
            }
        }
        else{
            System.out.println("Arquivo " + arquivo.getName() + " não foi encontrado");
            return false;
        }

    }
    
    public void salvarBD(MarcaVeiculo marca){
        abrirDB();
        
        em.persist(marca);
        em.getTransaction().commit();
        
        fecharDB();
    }
    
    public boolean verificarMarcaJaCadastrado(MarcaVeiculo marca){
        abrirDB();
        MarcaVeiculo m = new MarcaVeiculo();
        
        Query query = em.createQuery("FROM ModeloVeiculo m WHERE m.modelo = :marca");
        query.setParameter("marca", marca.getMarca());
        
        try{
            m = (MarcaVeiculo)query.getSingleResult();
            return true;
        }catch(NoResultException ex){
            fecharDB();
            return false;
        }
    }
    
    public MarcaVeiculo retornarMarcaVeiculo(MarcaVeiculo marca){
        abrirDB();
        
        try{
            marca = (MarcaVeiculo) em.find(MarcaVeiculo.class, marca.getId());
            fecharDB();
            return marca;
        }catch(NoResultException ex){
            fecharDB();
            return marca;
        }
    }
    public List retornarTodosModelosBD(){
        abrirDB();
        List lista = null;
        Query query = em.createQuery("FROM MarcaVeiculo");
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
