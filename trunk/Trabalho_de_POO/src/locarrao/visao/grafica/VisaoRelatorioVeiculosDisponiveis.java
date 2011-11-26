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

public class VisaoRelatorioVeiculosDisponiveis extends javax.swing.JFrame {
    private final static Logger log = Logger.getLogger(VisaoRelatorioVeiculosDisponiveis.class);
    SimpleDateFormat formatarData = new SimpleDateFormat("dd/MM/yyyy");
    Funcionarios funcionario = VisaoMenu.funcionario;
    
    
    PersisteTipoVeiculo persisteTipoVeiculo = new PersisteTipoVeiculo();
    PersisteModeloVeiculo persisteModeloVeiculo = new PersisteModeloVeiculo();
    PersisteMarcaVeiculo persisteMarcaVeiculo = new PersisteMarcaVeiculo();
    PersisteVeiculos persisteVeiculo = new PersisteVeiculos();
    List<Veiculos> lista = null;
    
    public VisaoRelatorioVeiculosDisponiveis() {
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
        PropertyConfigurator.configure("log4j.properties");
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new VisaoRelatorioVeiculosDisponiveis().setVisible(true);
            }
        });
    }
    
    
    public void preencherLista(){
        lista = persisteVeiculo.veiculosDisponiveisBD();
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
            
            log.info(formatarData.format(new Date()) + " - Relatório de Veículos Disponíveis feito pelo funcionário " +
                    funcionario.getUsuario());
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAtualizar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabelaVeiculo;
    // End of variables declaration//GEN-END:variables
}
