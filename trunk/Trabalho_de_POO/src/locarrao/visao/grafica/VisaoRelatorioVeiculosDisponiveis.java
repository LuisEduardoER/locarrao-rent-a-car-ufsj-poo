package locarrao.visao.grafica;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.dominio.Veiculos;
import modelo.persistencia.PersisteMarcaVeiculo;
import modelo.persistencia.PersisteModeloVeiculo;
import modelo.persistencia.PersisteTipoVeiculo;

public class VisaoRelatorioVeiculosDisponiveis extends javax.swing.JFrame {

    PersisteTipoVeiculo persisteTipoVeiculo = new PersisteTipoVeiculo();
    PersisteModeloVeiculo persisteModeloVeiculo = new PersisteModeloVeiculo();
    PersisteMarcaVeiculo persisteMarcaVeiculo = new PersisteMarcaVeiculo();
    
    public VisaoRelatorioVeiculosDisponiveis() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTabelaVeiculo = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabelaVeiculo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Placa", "Tipo", "Modelo", "Marca", "Ano", "Cor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTabelaVeiculo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new VisaoRelatorioVeiculosDisponiveis().setVisible(true);
            }
        });
    }
    
    public void inserirNaTabela(List<Veiculos> lista){
        if(lista == null){
            JOptionPane.showMessageDialog(null, "Nenhum veículo está disponível!");
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
                                      item.getCor()
                                      };

                modelo.addRow(objeto);
             
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabelaVeiculo;
    // End of variables declaration//GEN-END:variables
}
