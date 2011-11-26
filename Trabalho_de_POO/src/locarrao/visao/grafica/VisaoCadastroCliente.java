
package locarrao.visao.grafica;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import modelo.persistencia.PersisteCliente;
import modelo.dominio.Clientes;
import modelo.dominio.Endereco;
import modelo.dominio.Funcionarios;
import modelo.dominio.Valida;
import modelo.persistencia.PersisteEndereco;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 *
 * @author thais
 */
public class VisaoCadastroCliente extends javax.swing.JFrame {
    private final static Logger log = Logger.getLogger(VisaoCadastroCliente.class);
    SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
    Funcionarios funcionario = VisaoMenu.funcionario;
    
    Clientes cliente = new Clientes();
    Endereco endereco = new Endereco();
    PersisteEndereco persisteEndereco = new PersisteEndereco();
    PersisteCliente persisteCliente = new PersisteCliente();
    public VisaoCadastroCliente() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        salvar = new javax.swing.JButton();
        cancela = new javax.swing.JButton();
        labelErro = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTxtNome = new javax.swing.JTextField();
        jTxtCpf = new javax.swing.JTextField();
        jTxtTelefone = new javax.swing.JFormattedTextField();
        jPanelEndereco = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTxtRua = new javax.swing.JTextField();
        jTxtNumero = new javax.swing.JTextField();
        jTxtComplemento = new javax.swing.JTextField();
        jTxtBairro = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTxtCidade = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jComboEstado = new javax.swing.JComboBox();
        jTxtCep = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Clientes");

        salvar.setText("Salvar");
        salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarActionPerformed(evt);
            }
        });

        cancela.setText("Cancelar");
        cancela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelaActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Pessoais"));

        jLabel1.setText("Nome* :");

        jLabel2.setText("CPF* :");

        jLabel3.setText("Telefone :");

        jTxtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTxtNomeKeyPressed(evt);
            }
        });

        jTxtCpf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTxtCpfKeyPressed(evt);
            }
        });

        jTxtTelefone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTxtTelefoneKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTxtTelefone, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTxtCpf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTxtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jTxtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanelEndereco.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereco**"));

        jLabel4.setText("Rua :");

        jLabel5.setText("Número:");

        jLabel6.setText("Complemento :");

        jTxtRua.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTxtRuaKeyPressed(evt);
            }
        });

        jTxtNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTxtNumeroKeyPressed(evt);
            }
        });

        jTxtBairro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTxtBairroKeyPressed(evt);
            }
        });

        jLabel7.setText("Bairro:");

        jTxtCidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTxtCidadeKeyPressed(evt);
            }
        });

        jLabel8.setText("Cidade:");

        jLabel9.setText("Estado:");

        jComboEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MG", "SP", "RJ" }));

        jTxtCep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTxtCepKeyPressed(evt);
            }
        });

        jLabel12.setText("Cep: ");

        javax.swing.GroupLayout jPanelEnderecoLayout = new javax.swing.GroupLayout(jPanelEndereco);
        jPanelEndereco.setLayout(jPanelEnderecoLayout);
        jPanelEnderecoLayout.setHorizontalGroup(
            jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEnderecoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(jLabel12))
                .addGap(17, 17, 17)
                .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTxtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtRua, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEnderecoLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(jComboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelEnderecoLayout.createSequentialGroup()
                        .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTxtCidade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEnderecoLayout.createSequentialGroup()
                                .addComponent(jTxtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTxtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(20, 20, 20))
        );

        jPanelEnderecoLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTxtComplemento, jTxtNumero});

        jPanelEnderecoLayout.setVerticalGroup(
            jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEnderecoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEnderecoLayout.createSequentialGroup()
                        .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTxtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTxtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addGroup(jPanelEnderecoLayout.createSequentialGroup()
                        .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTxtRua, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTxtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jComboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jTxtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("* Campo obrigatório");

        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setText("** Caso seja inserido algum dado sobre o endereço, todos os dados deverão ser preenchido, com excessão do campo Complemento");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(labelErro, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jPanelEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(91, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(310, Short.MAX_VALUE)
                .addComponent(salvar)
                .addGap(35, 35, 35)
                .addComponent(cancela)
                .addGap(333, 333, 333))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap(183, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cancela, salvar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanelEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cancela))
                .addGap(11, 11, 11)
                .addComponent(labelErro, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        PropertyConfigurator.configure("log4j.properties");
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new VisaoCadastroCliente().setVisible(true);
            }
        });
    }
private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed
     chamarVerificacoes();
}//GEN-LAST:event_salvarActionPerformed

private void cancelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelaActionPerformed
   this.dispose();
}//GEN-LAST:event_cancelaActionPerformed
    
    /**
 * Verifica se tem algum campo obrigatório em branco
 * @return 
 */
private void jTxtCepKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtCepKeyPressed
    jTxtCep.setBackground(Color.white);
}//GEN-LAST:event_jTxtCepKeyPressed

private void jTxtNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtNomeKeyPressed
   jTxtNome.setBackground(Color.white);
}//GEN-LAST:event_jTxtNomeKeyPressed

private void jTxtTelefoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtTelefoneKeyPressed
   jTxtTelefone.setBackground(Color.white);
}//GEN-LAST:event_jTxtTelefoneKeyPressed

private void jTxtRuaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtRuaKeyPressed
   jTxtRua.setBackground(Color.white);
}//GEN-LAST:event_jTxtRuaKeyPressed

private void jTxtNumeroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtNumeroKeyPressed
   jTxtNumero.setBackground(Color.white);
}//GEN-LAST:event_jTxtNumeroKeyPressed

private void jTxtBairroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtBairroKeyPressed
   jTxtBairro.setBackground(Color.white);
}//GEN-LAST:event_jTxtBairroKeyPressed

private void jTxtCidadeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtCidadeKeyPressed
   jTxtCidade.setBackground(Color.white);
}//GEN-LAST:event_jTxtCidadeKeyPressed

private void jTxtCpfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtCpfKeyPressed
   jTxtCpf.setBackground(Color.white);
}//GEN-LAST:event_jTxtCpfKeyPressed

    public boolean verificarDadosPessoaisEmBranco(){
        if(jTxtNome.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "O campo Nome é obrigatório!");
            jTxtNome.setBackground(Color.red);
            jTxtNome.requestFocus();
            return false;
        }else if(jTxtCpf.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "O campo CPF é obrigatório!");
            jTxtCpf.setBackground(Color.red);
            jTxtCpf.requestFocus();
            return false;
        }else{
            return true;
        }
    }
    
    /**
     * Método para verificação dos dados de endereço.
     * O for é responsavel por verificar quantos componentes estão contidos dentro do jPanelEndereco.
     * A variavel contadorCampos conta a quantidade de campos.
     * É verificado quantos dados ficaram em branco. Se a quantidade de dados que ficaram em branco for igual
     * a quantidade de campos é porque não foi inserido nenhum dado sobre o endereço. Senão, se a quantidade
     * de itens em branco igual ao 1 é porque apenas um campo ficou em branco. Se esse campo
     * for o complemento, então a entrada de dados é aceita, caso contrario é emitida uma mensagem de erro para o 
     * usuário.
     * 
     * Qualquer dúvida é so entrar em contato.
     */
    
    /**
     * Verifica se foi digitado o endereço ou não. Se todos 
     * @return 
     */
    public boolean verificarDadosEndereco(){
        int contadorCampos = 0, contadorCamposEmBranco = 0;
        
        for(int i=0;i<jPanelEndereco.getComponentCount();i++){
            if(jPanelEndereco.getComponent(i) instanceof JTextField){
                contadorCampos++;
                JTextField text = (JTextField)jPanelEndereco.getComponent(i);
                if(text.getText().trim().isEmpty()){
                    contadorCamposEmBranco++;
                }
            }
        }
        
        if(contadorCamposEmBranco == contadorCampos || contadorCamposEmBranco == 0){
            return true;
        }
        else if(contadorCamposEmBranco == 1 && jTxtComplemento.getText().isEmpty()){
            return true;
        }
        else{
            JOptionPane.showMessageDialog(null, "Ao ser inserido algum dado sobre o endereço é necessário que todos "
                    + "os outros dados sejam também inserido, com exceção do campo Complemento."+"\n"+ "Por favor, entre com "
                    + "os dados que faltam, ou remova os dados com relação ao endereço inserido e clique em Salvar");
            return false;
        }
    }
    
    /**
     * Insere no atributo cliente os dados digitados
     */
    public void pegarDados(){
        cliente = new Clientes();
        endereco = new Endereco();
        
        cliente.setNome(jTxtNome.getText().trim().toUpperCase());
        cliente.setCpf(jTxtCpf.getText().trim().toUpperCase());
        cliente.setTefefone(jTxtTelefone.getText().trim().toUpperCase());
        if(verificarDadosEndereco()){
            /*
             * O método verificarDadosEndereco retorna true se não foi digitado nada, ou foi digitado tudo, ou tudo
             * menos o complemento. O próximo if verifica se foi digitado tudo ou não. Se o primeiro campo estiver vazio
             * é porque não foi digitado nada, portando não precisamos salvar o endereço
             */
            if(!jTxtRua.getText().trim().isEmpty()){
                endereco.setRua(jTxtRua.getText().trim().toUpperCase());
                endereco.setNumero(Integer.valueOf(jTxtNumero.getText().trim()));
                endereco.setComplemento(jTxtComplemento.getText().trim().toUpperCase());
                endereco.setBairro(jTxtBairro.getText().trim().toUpperCase());
                endereco.setCidade(jTxtCidade.getText().trim().toUpperCase());
                endereco.setCep(jTxtCep.getText().trim());
                endereco.setUf(jComboEstado.getSelectedItem().toString());
                persisteEndereco.salvarBD(endereco);
                cliente.setEndereco(endereco);
            }
            
        }
        
    }
    
    /**
     * Verifica se não foi digitado valores incorreto.
     * @return 
     */
    public boolean validarCampos(){
        Valida validacao = new Valida();
        
        if(validacao.validarCPF(jTxtCpf.getText())){
            JOptionPane.showMessageDialog(null, "CPF inválido!");
            jTxtCpf.setBackground(Color.red);
            jTxtCpf.requestFocus();
            return false;
        }else if(validacao.validarTelefone(jTxtTelefone.getText())){
            JOptionPane.showMessageDialog(null, "Telefone inválido!");
            jTxtTelefone.setBackground(Color.red);
            jTxtTelefone.requestFocus();
            return false;
        }else if(!jTxtCep.getText().isEmpty() && validacao.validarCEP(jTxtCep.getText())){
            JOptionPane.showMessageDialog(null, "CEP inválido!");
            jTxtCep.setBackground(Color.red);
            jTxtCep.requestFocus();
            return false;
        }else{
            return true;
        }
    }
    
    /**
     * chama os métodos de verificação para determinar se vai ser salvo ou não no banco de dados. 
     */
    public void chamarVerificacoes(){
        if(verificarDadosPessoaisEmBranco() && validarCampos()){
            pegarDados();
            if(!persisteCliente.verificarClienteJaCadastrado(cliente)){
                persisteCliente.salvarBD(cliente);
                log.info(formatador.format(new Date()) + " Cliente " + cliente.getNome() + " cadastrado por " + 
                        funcionario.getUsuario());
                JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
            }
            else{
                JOptionPane.showMessageDialog(null, "Cliente ja está cadastrado no sistema!");
            }
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancela;
    private javax.swing.JComboBox jComboEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelEndereco;
    private javax.swing.JTextField jTxtBairro;
    private javax.swing.JTextField jTxtCep;
    private javax.swing.JTextField jTxtCidade;
    private javax.swing.JTextField jTxtComplemento;
    private javax.swing.JTextField jTxtCpf;
    private javax.swing.JTextField jTxtNome;
    private javax.swing.JTextField jTxtNumero;
    private javax.swing.JTextField jTxtRua;
    private javax.swing.JFormattedTextField jTxtTelefone;
    private javax.swing.JLabel labelErro;
    private javax.swing.JButton salvar;
    // End of variables declaration//GEN-END:variables
}
