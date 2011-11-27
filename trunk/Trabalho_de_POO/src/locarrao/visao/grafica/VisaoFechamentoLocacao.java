package locarrao.visao.grafica;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.dominio.Clientes;
import modelo.dominio.Funcionarios;
import modelo.dominio.Locacao;
import modelo.dominio.Veiculos;
import modelo.persistencia.PersisteCliente;
import modelo.persistencia.PersisteLocacao;
import modelo.persistencia.PersisteMotorista;
import modelo.persistencia.PersisteVeiculos;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class VisaoFechamentoLocacao extends javax.swing.JFrame {
    private final static Logger log = Logger.getLogger(VisaoFechamentoLocacao.class);
    SimpleDateFormat formatarData = new SimpleDateFormat("dd/MM/yyyy");
    Funcionarios funcionario = VisaoMenu.funcionario;
    Veiculos veiculo = new Veiculos();
    
    //Tem que ser public static, porque será pedido a Km de chegada, que estará e outra classe
    public static Locacao locacao = new Locacao();
    
    Clientes cliente = new Clientes(); 
    PersisteLocacao persisteLocacao = new PersisteLocacao();
    PersisteCliente persisteCliente = new PersisteCliente();
    PersisteMotorista persisteMotorista = new PersisteMotorista();
    PersisteVeiculos persisteVeiculo = new PersisteVeiculos();
    DefaultTableModel modelo = null;
    
    public VisaoFechamentoLocacao() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableLocacoes = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTxtCodigo = new javax.swing.JTextField();
        jBPesquisar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Fechamento de Locação");

        jTableLocacoes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código da Locação", "Cliente", "Motorista", "Veículo", "Quilometragem de Saída", "Data de Saída"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableLocacoes);
        jTableLocacoes.getColumnModel().getColumn(1).setMinWidth(140);
        jTableLocacoes.getColumnModel().getColumn(2).setMinWidth(120);
        jTableLocacoes.getColumnModel().getColumn(3).setMinWidth(80);
        jTableLocacoes.getColumnModel().getColumn(4).setMinWidth(90);
        jTableLocacoes.getColumnModel().getColumn(5).setMinWidth(70);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cliente"));

        jLabel1.setText("Código do Cliente*: ");

        jBPesquisar.setText("Pesquisar");
        jBPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jBPesquisar)
                .addContainerGap(96, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBPesquisar))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("* O campo código é obrigatório!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 797, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(140, 140, 140))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisarActionPerformed
        exibirResultado();
    }//GEN-LAST:event_jBPesquisarActionPerformed

    public static void main(String args[]) {
        PropertyConfigurator.configure("log4j.properties");
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new VisaoFechamentoLocacao().setVisible(true);
            }
        });
    }
    
    /**
     * Pesquisa o cliente e insere na tabela a lista de locações abertas desse determinado cliente
     */
    public void exibirResultado(){
        pegarValor();
        buscarListaLocacoes(cliente);
    }
    
    /**
     * Faz uma busca e todas a locações 
     * @param cliente 
     */
    public void buscarListaLocacoes(Clientes cliente){
        List<Locacao> lista = persisteLocacao.retornarLocacoesEmAbertoPorCliente(cliente);
        inserirNaTabela(lista);
    }
    
    /**
     * Pega o modelo da tabela e insere na mesma a lista de loçações em aberto cliente desejado
     * @param lista 
     */
    public void inserirNaTabela(List<Locacao> lista){
        Object[] objeto = null;
        modelo = (DefaultTableModel)jTableLocacoes.getModel();
        SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");
        
        modelo.setRowCount(0);
        for(Locacao item: lista){
            objeto = new Object[]{item.getId(),
                                  persisteCliente.retornarClienteBD(item.getCliente()),
                                  persisteMotorista.pesquisarMotoristaBD(item.getMotorista()),
                                  persisteVeiculo.pesquisarVeiculoPelaPlacaBD(item.getVeiculo()),
                                  item.getQuilometragemDeSaida(),
                                  formataData.format(item.getDataSaida())};
            
            modelo.addRow(objeto);
        }
    }
    
    /**
     * pega o código do cliente digitado no campo Código do Cliente
     */
    public void pegarValor(){
        if(chamarVerificacoes()){
            cliente = new Clientes();
            cliente.setCodigo(Integer.valueOf(jTxtCodigo.getText().trim()));
        }
    }
    
    /**
     * Verifica se o campo está vazio ou se o dado digitado é inválido
     * @return 
     */
    public boolean chamarVerificacoes(){
        if(jTxtCodigo.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "O campo código é obrigatório!");
            return false;
        }
        else if(!verificarEntrada()){
            JOptionPane.showMessageDialog(null, "O campo código so pode conter números");
            return false;
        }
        else{
            return true;
        }
    }
    
    /**
     * Verifica se a entrada é válida
     * @return 
     */
    
    public boolean verificarEntrada(){
        String codigo = jTxtCodigo.getText().trim();
        for(int i = 0; i < codigo.length();i++){
            if(!Character.isDigit(codigo.charAt(i))){
                return false;
            }
        }
        return true;
    }
    
    /**
     * Fecha locação atualizando o valor e somando o valor no cadastro do veículo
     */
    public void fecharLocacao(){
        locacao = new Locacao();
        
        int linha = jTableLocacoes.getSelectedRow();
        locacao.setId((Long)jTableLocacoes.getValueAt(linha, 0));
        locacao = persisteLocacao.retornarLocacao(locacao);
        locacao.setLocacaoAberta(false);
        persisteLocacao.fecharLocacaoBD(locacao);
        
        veiculo = persisteVeiculo.retornarVeiculoBD(locacao.getVeiculo());
        veiculo.setValorTotalLocacoes(veiculo.getValorTotalLocacoes() + locacao.getValor());
        log.info(formatarData.format(new Date()) + " - Locação do veículo de placa " +
                veiculo.getPlaca() + " finalizada pelo funcionário " + funcionario.getNome());
        
        JOptionPane.showMessageDialog(null, "Locação fechada com sucesso!");
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableLocacoes;
    private javax.swing.JTextField jTxtCodigo;
    // End of variables declaration//GEN-END:variables
}
