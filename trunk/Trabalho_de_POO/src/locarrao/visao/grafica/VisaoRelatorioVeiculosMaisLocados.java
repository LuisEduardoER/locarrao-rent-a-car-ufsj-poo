package locarrao.visao.grafica;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.dominio.Veiculos;
import modelo.persistencia.PersisteMarcaVeiculo;
import modelo.persistencia.PersisteModeloVeiculo;
import modelo.persistencia.PersisteTipoVeiculo;
import modelo.persistencia.PersisteVeiculos;

public class VisaoRelatorioVeiculosMaisLocados extends javax.swing.JFrame {

    PersisteTipoVeiculo persisteTipoVeiculo = new PersisteTipoVeiculo();
    PersisteModeloVeiculo persisteModeloVeiculo = new PersisteModeloVeiculo();
    PersisteMarcaVeiculo persisteMarcaVeiculo = new PersisteMarcaVeiculo();
    PersisteVeiculos persisteVeiculo = new PersisteVeiculos();
    List<Veiculos> lista = null;
    
    public VisaoRelatorioVeiculosMaisLocados() {
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabelaVeiculo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Placa", "Tipo", "Modelo", "Marca", "Ano", "Cor", "Locações"
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(412, Short.MAX_VALUE)
                .addComponent(jBAtualizar)
                .addGap(313, 313, 313))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBAtualizar)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAtualizarActionPerformed
        preencherLista();
        inserirNaTabela(lista);
    }//GEN-LAST:event_jBAtualizarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new VisaoRelatorioVeiculosMaisLocados().setVisible(true);
            }
        });
    }
    
    public void preencherLista(){
        lista = persisteVeiculo.retornarVeiculosMaisLocados();
        
        for(Veiculos item: lista){
            if(item.getTotalLocacoes() == 0){
                lista.remove(item);
            }
        }
    }
       
    public void inserirNaTabela(List<Veiculos> lista){
        if(lista == null){
            JOptionPane.showMessageDialog(null, "Nenhum veículo Cadastrado!");
        }else{
            Object[] objeto = null;
            DefaultTableModel modelo = (DefaultTableModel)jTabelaVeiculo.getModel();
            
            modelo.setRowCount(0);
            for(Veiculos item: lista){
                objeto = new Object[]{item.getPlaca(),
                                      persisteTipoVeiculo.retornarTipoVeiculo(item.getTipoVeiculo()),
                                      persisteModeloVeiculo.retornarModeloVeiculo(item.getModeloVeiculo()),
                                      persisteMarcaVeiculo.retornarMarcaVeiculo(item.getMarcaVeiculo()),
                                      item.getAno(),
                                      item.getCor(),
                                      item.getTotalLocacoes()
                                      };

                modelo.addRow(objeto);
             
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAtualizar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabelaVeiculo;
    // End of variables declaration//GEN-END:variables
}
