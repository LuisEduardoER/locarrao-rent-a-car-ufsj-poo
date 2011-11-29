/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * VisaoCadastroLocacao.java
 *
 * Created on 22/11/2011, 23:29:47
 */
package locarrao.visao.grafica;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import modelo.dominio.Clientes;
import modelo.dominio.Funcionarios;
import modelo.dominio.Locacao;
import modelo.dominio.Motorista;
import modelo.dominio.TipoLocacao;
import modelo.dominio.Valida;
import modelo.dominio.Veiculos;
import modelo.persistencia.PersisteCliente;
import modelo.persistencia.PersisteLocacao;
import modelo.persistencia.PersisteMotorista;
import modelo.persistencia.PersisteVeiculos;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 *
 * @author Magelinha
 */
public class VisaoCadastroLocacao extends javax.swing.JFrame {
    
    private final static Logger log = Logger.getLogger(VisaoCadastroLocacao.class);
    SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
    Funcionarios funcionario = VisaoMenu.funcionario;
    
    PersisteMotorista persisteMotorista = new PersisteMotorista();
    PersisteCliente persisteCliente = new PersisteCliente();
    PersisteLocacao persisteLocacao = new PersisteLocacao();
    PersisteVeiculos persisteVeiculo = new PersisteVeiculos();
    
    Clientes cliente = new Clientes();
    Locacao locacao = new Locacao();
    Veiculos veiculo = new Veiculos();
    Motorista motorista = new Motorista();
    TipoLocacao tipoLocacao =  new TipoLocacao();
    
    VisaoCadastroMotorista visao = new VisaoCadastroMotorista();    
    
    public VisaoCadastroLocacao() {
        initComponents();
        preencherComboTipo();
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTxtCodigoCliente = new javax.swing.JTextField();
        jBPesquisarCliente = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jTxtCliente = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTxtCnh = new javax.swing.JTextField();
        jBPesquisarMotorista = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jTxtMotorista = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTxtPlaca = new javax.swing.JTextField();
        jBPesquisarVeiculo = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jCTipoLocacao = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jTxtPrevisao = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTxtKmSaida = new javax.swing.JTextField();
        jBCadastrarLocacao = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jBCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cliente"));

        jLabel1.setText("Código* :");

        jTxtCodigoCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTxtCodigoClienteKeyPressed(evt);
            }
        });

        jBPesquisarCliente.setText("Pesquisar");
        jBPesquisarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesquisarClienteActionPerformed(evt);
            }
        });

        jLabel2.setText("Cliente :");

        jTxtCliente.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBPesquisarCliente)
                .addContainerGap(173, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jBPesquisarCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Motorista"));

        jLabel3.setText("CNH* :");

        jTxtCnh.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTxtCnhKeyPressed(evt);
            }
        });

        jBPesquisarMotorista.setText("Pesquisar");
        jBPesquisarMotorista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesquisarMotoristaActionPerformed(evt);
            }
        });

        jLabel4.setText("Motorista :");

        jTxtMotorista.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtMotorista, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTxtCnh, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jBPesquisarMotorista)
                .addContainerGap(185, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jBPesquisarMotorista)
                    .addComponent(jTxtCnh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtMotorista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Veiculo"));

        jLabel5.setText("Placa* : ");

        jTxtPlaca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTxtPlacaKeyPressed(evt);
            }
        });

        jBPesquisarVeiculo.setText("Pesquisar");
        jBPesquisarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesquisarVeiculoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBPesquisarVeiculo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTxtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBPesquisarVeiculo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Outros Dados"));

        jLabel6.setText("Tipo de Locação");

        jCTipoLocacao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Por Quilômetro", "Quilometragem Livre" }));

        jLabel7.setText("Previsão de Dias:");

        jTxtPrevisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtPrevisaoActionPerformed(evt);
            }
        });
        jTxtPrevisao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTxtPrevisaoKeyPressed(evt);
            }
        });

        jLabel8.setText("Quilometragem de Saída* :");

        jTxtKmSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtKmSaidaActionPerformed(evt);
            }
        });
        jTxtKmSaida.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTxtKmSaidaKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCTipoLocacao, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(4, 4, 4)
                .addComponent(jTxtKmSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtPrevisao, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel6)
                .addContainerGap(673, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCTipoLocacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jTxtPrevisao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jTxtKmSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jBCadastrarLocacao.setText("Cadastrar");
        jBCadastrarLocacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastrarLocacaoActionPerformed(evt);
            }
        });

        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("Os itens marcados com * são obrigatórios");

        jBCancelar.setText("Cancelar");
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(444, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(690, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(579, 579, 579))
            .addGroup(layout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addComponent(jBCadastrarLocacao)
                .addGap(18, 18, 18)
                .addComponent(jBCancelar)
                .addContainerGap(395, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(6, 6, 6)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBCadastrarLocacao)
                    .addComponent(jBCancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtPrevisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtPrevisaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtPrevisaoActionPerformed

    private void jTxtKmSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtKmSaidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtKmSaidaActionPerformed

    private void jBCadastrarLocacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastrarLocacaoActionPerformed
        chamarVerificacoes();
    }//GEN-LAST:event_jBCadastrarLocacaoActionPerformed

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jTxtPlacaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtPlacaKeyPressed
        jTxtPlaca.setBackground(Color.white);
    }//GEN-LAST:event_jTxtPlacaKeyPressed

    private void jTxtKmSaidaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtKmSaidaKeyPressed
        jTxtKmSaida.setBackground(Color.white);
    }//GEN-LAST:event_jTxtKmSaidaKeyPressed

    private void jTxtPrevisaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtPrevisaoKeyPressed
        jTxtPrevisao.setBackground(Color.white);
    }//GEN-LAST:event_jTxtPrevisaoKeyPressed

    private void jTxtCnhKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtCnhKeyPressed
        jTxtCnh.setBackground(Color.white);
    }//GEN-LAST:event_jTxtCnhKeyPressed

    private void jTxtCodigoClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtCodigoClienteKeyPressed
        jTxtCodigoCliente.setBackground(Color.white);
    }//GEN-LAST:event_jTxtCodigoClienteKeyPressed

    private void jBPesquisarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisarClienteActionPerformed
        if(verificarCliente()){
            jTxtCliente.setText(cliente.getNome());
            determinarMotoristaDaLocacao();
        }
    }//GEN-LAST:event_jBPesquisarClienteActionPerformed

    private void jBPesquisarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisarVeiculoActionPerformed
        if(verificarVeiculo()){
            jCTipoLocacao.requestFocus();
        }
    }//GEN-LAST:event_jBPesquisarVeiculoActionPerformed

    private void jBPesquisarMotoristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisarMotoristaActionPerformed
        
    }//GEN-LAST:event_jBPesquisarMotoristaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        PropertyConfigurator.configure("log4j.properties");
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new VisaoCadastroLocacao().setVisible(true);
            }
        });
    }
    
    /**
     * Inicia o combo box com os valores POR QUILOMETRO e QUILOMETRAGEM LIVRE
     */
    public void preencherComboTipo(){
        Object[] objeto = new Object[]{
            "POR QUILOMETRO","QUILOMETRAGEM LIVRE"
        };
        
        jCTipoLocacao.removeAllItems();
        for(int i=0; i< objeto.length; i++){
            jCTipoLocacao.addItem(objeto[i]);
        }
    }
    
    /**
     * Pergunta ao usuário se o cliente é o motorista do veículo alugado. Se for, será verificado se a cnh do cliente ja
     * consta no banco de dados. Se não constar, então será feito o cadastro
     */
    public void determinarMotoristaDaLocacao(){
        Object[] opcoes = new Object[]{"Sim","Não"};
        
        int n = JOptionPane.showOptionDialog(null, "O cliente será o motorista do veículo a ser alugado?", 
                "Pergunta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
        
        if(n==0){
            motorista = persisteMotorista.retornarMotoristaPeloCpf(cliente.getCpf());
            if(motorista != null){
                jTxtCnh.setText(motorista.getCnh());
                jTxtMotorista.setText(motorista.getNome());
                
            }else{
                clienteSeraOMotorista();
            }
            locacao.setMotorista(motorista);
        }
    }
    
    /**
     * Insere os valores do cliente no frame de cadastro de motorista.
     */
    public void clienteSeraOMotorista(){
        visao.jTxtNome.setText(cliente.getNome());
        visao.jTxtCpf.setText(cliente.getCpf());
        
        if(cliente.getTefefone() != null){
            visao.jTxtTelefone.setText(cliente.getTefefone());
        }
        
        visao.jTxtCnh.requestFocus();
        
        if(cliente.getEndereco() != null){
            visao.jTxtRua.setText(cliente.getEndereco().getRua());
            visao.jTxtNumero.setText(String.valueOf(cliente.getEndereco().getNumero()));
            visao.jTxtComplemento.setText(cliente.getEndereco().getComplemento());
            visao.jTxtBairro.setText(cliente.getEndereco().getBairro());
            visao.jTxtCidade.setText(cliente.getEndereco().getCidade());
            visao.jComboEstado.setSelectedItem(cliente.getEndereco().getUf());
        }
        
        //Desabilitando os campos onde foram inseridos os dados
        visao.jPanelDadosPessoais.setVisible(false);
        visao.jPanelEndereco.setVisible(false);
        
        //Alterando o texto do botão e dando a acão de fechar a janela e inserir o dado no campo CNH
        visao.jBCancelar.setVisible(false);
        
        visao.jBSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtCnh.setText(visao.jTxtCnh.getText());
                jTxtMotorista.setText(cliente.getNome());
                jTxtPlaca.requestFocus();
            }
        });
        
        
        
        visao.setSize(800, 400);
        visao.setVisible(true);
    }
    
    
    /**
     * Verifica se foram inseridos números nos campos numéricos
     * @param campo
     * @return 
     */
    public boolean verificarCamposNumericos(String campo){
        for(int i=0;i<campo.length();i++){
            if(!Character.isDigit(campo.charAt(i))){
                return false;
            }
        }
        return true;
    }
    
    /**
     * Verifica se o dado referente ao cliente foi inserido corretamente
     * @return 
     */
    public boolean verificarCliente(){
        cliente.setCodigo(Integer.valueOf(jTxtCodigoCliente.getText()));
        
        if(jTxtCodigoCliente.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "O campo Cliente é obrigatório");
            jTxtCodigoCliente.setBackground(Color.red);
            jTxtCodigoCliente.requestFocus();
            return false;
        }
        else if(!verificarCamposNumericos(jTxtCodigoCliente.getText())){
            JOptionPane.showMessageDialog(null, "O Campo Código do Cliente so aceita números e inteiros");
            jTxtCodigoCliente.setBackground(Color.red);
            jTxtCodigoCliente.requestFocus();
            return false;
        }
        else if((cliente = persisteCliente.retornarClienteBD(cliente)) != null){
            jTxtCliente.setText(cliente.getNome());
            locacao.setCliente(cliente);
            return true;
        }
        else{
            JOptionPane.showMessageDialog(null, "Cliente não cadastrado");
            return false;
        }
    }
    
    /**
     * Verifica se o dado referente ao motorista foi inserido corretamente
     * @return 
     */
    
    public boolean verificarMotorista(){
        motorista.setCnh(jTxtCnh.getText().trim().toUpperCase());
        
        if(jTxtCnh.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "O campo CNH é obrigatório!");
            jTxtCnh.setBackground(Color.red);
            jTxtCnh.requestFocus();
            return false;
        }
        else if(!verificarCamposNumericos(jTxtCnh.getText().trim())){
            JOptionPane.showMessageDialog(null, "O Campo CNH so aceita números!");
            jTxtCnh.setBackground(Color.red);
            jTxtCnh.requestFocus();
            return false;
        }
        else if(!persisteLocacao.verificarMotoristaLocacaoAberta(motorista)){
            JOptionPane.showMessageDialog(null, "Motorista ja está cadastrado em outra locação em aberto");
            return false;
        }
        else if(persisteMotorista.pesquisarMotoristaPelaCnh(motorista)){
            jTxtMotorista.setText(motorista.getNome());
            locacao.setMotorista(motorista);
            return true;
        }
        else{
            JOptionPane.showMessageDialog(null, "Motorista não cadastrado!");
            return false;
        }
    }
    
    /**
     * Verifica se o dado referente ao veículo foi inserido corretamente
     * @return 
     */
    
    public boolean verificarVeiculo(){
        Valida valida = new Valida();
        veiculo = new Veiculos();
        veiculo.setPlaca(jTxtPlaca.getText().trim().toUpperCase());
        veiculo = persisteVeiculo.pesquisarVeiculoPelaPlacaBD(veiculo);
        
        
        if(jTxtPlaca.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "O campo Placa é obrigatório!");
            jTxtPlaca.setBackground(Color.red);
            jTxtPlaca.requestFocus();
            return false;
        }
        else if(!valida.validarPlaca(jTxtPlaca.getText())){
            JOptionPane.showMessageDialog(null, "Placa digitada é inválida!");
            return false;
        }
        else if(veiculo == null){
            JOptionPane.showMessageDialog(null, "Veículo não cadastrado!");
            return false;
        }
        else if(!verificarVeiculoDisponivel()){
            JOptionPane.showMessageDialog(null, "Veículo já está alugado!");
            return false;
        }
        else{
            tipoLocacao = persisteLocacao.retornarTipoLocacao(veiculo);
            locacao.setVeiculo(veiculo);
            locacao.setTipoLocacao(tipoLocacao);
            
            return true;
        }
    }
    
    /**
     * Verifica se o veiculo está disponivel
     */
    public boolean verificarVeiculoDisponivel(){
        if(veiculo == null){
            return false;
        }else{
            return persisteLocacao.verificarVeiculoDisponivel(veiculo);
        }
        
    }
    
    /**
     * Verifica se os dados referente a previsão e km de saída foram digitados corretamente.
     * @return 
     */
    
    public boolean verificarOutrosDados(){
        if(jTxtKmSaida.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "O campo Quilometragem de Saída é obrigatório!");
            jTxtKmSaida.setBackground(Color.red);
            jTxtKmSaida.requestFocus();
            return false;
        }
        else if(!verificarCamposNumericos(jTxtKmSaida.getText().trim())){
            JOptionPane.showMessageDialog(null, "O Campo Quilometragem de Saída é só aceita números");
            jTxtKmSaida.setBackground(Color.red);
            jTxtKmSaida.requestFocus();
            return false;
        }
        else if(!jTxtPrevisao.getText().trim().isEmpty() && !verificarCamposNumericos(jTxtPrevisao.getText())){
            JOptionPane.showMessageDialog(null, "O campo Previsão é só aceita números");
            jTxtPrevisao.setBackground(Color.red);
            jTxtPrevisao.requestFocus();
            return false;
        }
        else{
            if(jTxtPrevisao.getText().trim().isEmpty()){
                locacao.setPrevisao(0);
            }else{
                locacao.setPrevisao(Integer.valueOf(jTxtPrevisao.getText()));
            }
            locacao.setQuilometragemDeSaida(Integer.valueOf(jTxtKmSaida.getText().trim()));
            locacao.setTipo(jCTipoLocacao.getSelectedItem().toString());
        }
        
        return true;
    }
    
    /**
     * chama os métodos de verificação para determinar se vai ser salvo ou não no banco de dados. 
     */
    
    public void chamarVerificacoes(){
        if(verificarCliente() && verificarMotorista() && verificarVeiculo() && verificarOutrosDados()){
            salvar();
            incrementarQuantidadeLocacoes();
        }
    }
    
    
    /**
     * Insere no atributo locacao os dados digitados
     */
    
    public void salvar(){
        locacao.setDataSaida(new GregorianCalendar().getTimeInMillis());
        locacao.setValor(0);
        locacao.setLocacaoAberta(true);
        
        persisteLocacao.salvarBD(locacao);
        
        log.info(formatador.format(new Date()) + " - Locação do veiculo " + veiculo.getPlaca() 
                + " aberta pelo funcionário " + funcionario.getUsuario());
        
        JOptionPane.showMessageDialog(null, "Locação cadastrada com sucesso");
    }
    
    public void incrementarQuantidadeLocacoes(){
        veiculo = persisteVeiculo.retornarVeiculoBD(locacao.getVeiculo());
        veiculo.setTotalLocacoes(veiculo.getTotalLocacoes()+1);
        persisteVeiculo.atualizarVeiculoBD(veiculo);
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCadastrarLocacao;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBPesquisarCliente;
    private javax.swing.JButton jBPesquisarMotorista;
    private javax.swing.JButton jBPesquisarVeiculo;
    private javax.swing.JComboBox jCTipoLocacao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTxtCliente;
    private javax.swing.JTextField jTxtCnh;
    private javax.swing.JTextField jTxtCodigoCliente;
    private javax.swing.JTextField jTxtKmSaida;
    private javax.swing.JTextField jTxtMotorista;
    private javax.swing.JTextField jTxtPlaca;
    private javax.swing.JTextField jTxtPrevisao;
    // End of variables declaration//GEN-END:variables
}
