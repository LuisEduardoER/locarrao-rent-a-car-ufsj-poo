package locarrao.visao.grafica;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.dominio.Funcionarios;
import modelo.dominio.Veiculos;
import modelo.persistencia.PersisteMarcaVeiculo;
import modelo.persistencia.PersisteModeloVeiculo;
import modelo.persistencia.PersisteTipoVeiculo;
import modelo.persistencia.PersisteVeiculos;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class VisaoRelatorioVeiculosMaisRentaveis extends javax.swing.JFrame {
    
    private final static Logger log = Logger.getLogger(VisaoRelatorioVeiculosMaisRentaveis.class);
    SimpleDateFormat formatarData = new SimpleDateFormat("dd/MM/yyyy");
    Funcionarios funcionario = VisaoMenu.funcionario;
    

    PersisteTipoVeiculo persisteTipoVeiculo = new PersisteTipoVeiculo();
    PersisteModeloVeiculo persisteModeloVeiculo = new PersisteModeloVeiculo();
    PersisteMarcaVeiculo persisteMarcaVeiculo = new PersisteMarcaVeiculo();
    PersisteVeiculos persisteVeiculo = new PersisteVeiculos();
    List<Veiculos> lista = null;
    
    public VisaoRelatorioVeiculosMaisRentaveis() {
        initComponents();
        preencherLista();
        inserirNaTabela(lista);
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTabelaVeiculo = new javax.swing.JTable();
        jBAtualizar = new javax.swing.JButton();
        jBFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTabelaVeiculo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Placa", "Tipo", "Modelo", "Marca", "Ano", "Cor", "Total Locações"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTabelaVeiculo);

        jBAtualizar.setText("Atualizar");
        jBAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAtualizarActionPerformed(evt);
            }
        });

        jBFechar.setText("Fechar");
        jBFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGap(362, 362, 362)
                .addComponent(jBAtualizar)
                .addGap(18, 18, 18)
                .addComponent(jBFechar)
                .addContainerGap(280, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBAtualizar)
                    .addComponent(jBFechar))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jBAtualizar, jBFechar});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAtualizarActionPerformed
        inserirNaTabela(lista);
    }//GEN-LAST:event_jBAtualizarActionPerformed

    private void jBFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBFecharActionPerformed

    public static void main(String args[]) {
        PropertyConfigurator.configure("log4j.properties");
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new VisaoRelatorioVeiculosMaisRentaveis().setVisible(true);
            }
        });
    }
    
    /**
     * Primeiro é gerado uma lista ordenada de forma decrescente pelo valor total de locaçoes 
     * e depois é retirado da lista os veículos que tem valor total igual à 0
     */
    public void preencherLista(){
        lista = persisteVeiculo.retornarVeiculosMaisRentaveis();
        
        for(Veiculos item: lista){
            if(item.getValorTotalLocacoes() == 0){
                lista.remove(item);
            }
        }
    }
       
    /**
     * Insere os dados da lista de veículos mais rentáveis na tabela
     * @param lista 
     */
    
    public void inserirNaTabela(List<Veiculos> lista){
        preencherLista();
        
        if(lista.isEmpty()){
            JOptionPane.showMessageDialog(null, "Nenhum veículo Cadastrado!");
        }else{
            Object[] objeto = null;
            DefaultTableModel modelo = (DefaultTableModel)jTabelaVeiculo.getModel();
            
            modelo.setRowCount(0);
            for(Veiculos item: lista){
                objeto = new Object[]{item.getPlaca(),
                                      persisteTipoVeiculo.
                        retornarTipoVeiculo(item.getTipoVeiculo()).getTipo(),
                                      persisteModeloVeiculo.
                        retornarModeloVeiculo(item.getModeloVeiculo()).getModelo(),
                                      persisteMarcaVeiculo.
                        retornarMarcaVeiculo(item.getMarcaVeiculo()).getMarca(),
                                      item.getAno(),
                                      item.getCor(),
                                      item.getValorTotalLocacoes()
                                      };

                modelo.addRow(objeto);
             
            }
            
            log.info(formatarData.format(new Date()) + " - Relatório de veículos mas rentáveis feito pelo funcionário " + 
                    funcionario.getUsuario());
        }
        
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAtualizar;
    private javax.swing.JButton jBFechar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabelaVeiculo;
    // End of variables declaration//GEN-END:variables
}
