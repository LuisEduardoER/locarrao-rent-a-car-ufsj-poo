package locarrao.visao.grafica;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.dominio.Funcionarios;
import modelo.dominio.Locacao;
import modelo.persistencia.PersisteCliente;
import modelo.persistencia.PersisteLocacao;
import modelo.persistencia.PersisteMotorista;
import modelo.persistencia.PersisteVeiculos;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class VisaoRelatorioLocacaoesAbertas extends javax.swing.JFrame {
    private final static Logger log = Logger.getLogger(VisaoRelatorioLocacaoesAbertas.class);
    SimpleDateFormat formatarData = new SimpleDateFormat("dd/MM/yyyy");
    Funcionarios funcionario = VisaoMenu.funcionario;
    
    
    PersisteLocacao persisteLocacao = new PersisteLocacao();
    PersisteCliente persisteCliente = new PersisteCliente();
    PersisteMotorista persisteMotorista = new PersisteMotorista();
    PersisteVeiculos persisteVeiculo = new PersisteVeiculos();
    
    public VisaoRelatorioLocacaoesAbertas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jDateInicial = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jDateFinal = new com.toedter.calendar.JDateChooser();
        jBPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableLocacoes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Data Inicial");

        jLabel2.setText("Data Inicial");

        jBPesquisar.setText("Pesquisar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jDateInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1)))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jDateFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addComponent(jBPesquisar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBPesquisar)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37))
        );

        jTableLocacoes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cliente", "Motorista", "Veículo", "Km de Saída", "Km de Chegada", "Data de Saída", "Data de Chegada", "Modo de Locacao", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableLocacoes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        PropertyConfigurator.configure("log4j.properties");
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new VisaoRelatorioLocacaoesAbertas().setVisible(true);
            }
        });
    }
    
    /**
     * Insere na tabela os valores da lista de locações aberta
     * @param lista 
     */
    public void inserirNaTabela(List<Locacao> lista){
        if(lista == null){
            JOptionPane.showMessageDialog(null, "Nenhum locação foi encontrada!");
        }else{
            Object[] objeto = null;
            DefaultTableModel modelo = (DefaultTableModel)jTableLocacoes.getModel();
            SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");

            modelo.setRowCount(0);
            for(Locacao item: lista){
                objeto = new Object[]{persisteCliente.retornarClienteBD(item.getCliente()),
                                      persisteMotorista.pesquisarMotoristaBD(item.getMotorista()),
                                      persisteVeiculo.pesquisarVeiculoPelaPlacaBD(item.getVeiculo()),
                                      item.getQuilometragemDeSaida(),
                                      item.getQuilometragemDeEntrada(),
                                      formataData.format(item.getDataSaida()),
                                      formataData.format(item.getDataDevolucao()),
                                      item.getTipo(),
                                      item.getValor()
                                      };

                modelo.addRow(objeto);
             
            }
        }
    }
    
    
    /**
     * Verifica se foi inserida somente uma das datas
     * @return 
     */
    public boolean verificarCamposEmBranco(){
        if(jDateInicial.getDate() == null && jDateFinal.getDate() != null){
            JOptionPane.showMessageDialog(null, "Você preencheu somente o campo Data Final! \n"
                    + "Preencha o Campo Data Inicial ou então remova o preenchimento do campo Data Final");
            jDateInicial.requestFocus();
            return false;
        }else if(jDateInicial.getDate() != null && jDateFinal.getDate() == null){
                JOptionPane.showMessageDialog(null, "Você preencheu somente o campo Data Inicial! \n"
                        + "Preencha o Campo Data Inicial ou então remova o preenchimento do campo Data Inicial");
                jDateInicial.requestFocus();
                return false;
        }else{
            return true;
        }
    
    }
    
    /**
     * Verifica se as datas foram digitadas ou não
     * @return 
     */
    public boolean verificarCamposDatas(){
        if(jDateInicial.getDate() == null && jDateFinal.getDate() == null){
            return true;
        }else{
            return false;
        }
    }
    
    /**
     * Gera o relatório, fazendo antes as verificações necessárias
     */
    public void criarRelatorio(){
        List<Locacao> lista = null;
        
        if(verificarCamposEmBranco()){
            if(verificarCamposDatas()){
                lista = persisteLocacao.retornarLocacoesAbertasDB();
                
            }else{
                lista = persisteLocacao.retornarLocacoesAbertasDB(jDateInicial.getDate(),
                        jDateFinal.getDate());
            }
            inserirNaTabela(lista);
            
            log.info(formatarData.format(new Date()) + " - Relatório Locações abertas realizado pelo funcionário" 
                    + funcionario.getUsuario());
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBPesquisar;
    private com.toedter.calendar.JDateChooser jDateFinal;
    private com.toedter.calendar.JDateChooser jDateInicial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableLocacoes;
    // End of variables declaration//GEN-END:variables
}
