
package locarrao.visao.grafica;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import modelo.dominio.Endereco;
import modelo.dominio.Funcionarios;
import modelo.dominio.Motorista;
import modelo.dominio.Valida;
import modelo.persistencia.PersisteEndereco;
import modelo.persistencia.PersisteMotorista;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 *
 * @author thais
 */
public class VisaoCadastroMotorista extends javax.swing.JFrame {

    private final static Logger log = Logger.getLogger(VisaoCadastroMotorista.class);
    SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
    Funcionarios funcionario = VisaoMenu.funcionario;
    
    
    
    Motorista motorista = new Motorista();
    Endereco endereco = new Endereco();
    PersisteEndereco persisteEndereco = new PersisteEndereco();
    PersisteMotorista persisteMotorista = new PersisteMotorista();
    
    public VisaoCadastroMotorista() {
        initComponents();
        preencherComboEstados();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        salvar = new javax.swing.JButton();
        cancela = new javax.swing.JButton();
        labelErro = new javax.swing.JLabel();
        jPanelDadosPessoais = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTxtNome = new javax.swing.JTextField();
        jTxtCpf = new javax.swing.JTextField();
        jTxtTelefone = new javax.swing.JTextField();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jTxtCnh = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
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

        jPanelDadosPessoais.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Pessoais"));

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

        javax.swing.GroupLayout jPanelDadosPessoaisLayout = new javax.swing.GroupLayout(jPanelDadosPessoais);
        jPanelDadosPessoais.setLayout(jPanelDadosPessoaisLayout);
        jPanelDadosPessoaisLayout.setHorizontalGroup(
            jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        jPanelDadosPessoaisLayout.setVerticalGroup(
            jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTxtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))))
                .addGap(18, 18, 18)
                .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTxtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        jTxtComplemento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTxtComplementoKeyPressed(evt);
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
                    .addComponent(jTxtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel14.setText("CNH* :");

        jTxtCnh.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTxtCnhKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(jTxtCnh, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(241, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTxtCnh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(131, 131, 131)
                            .addComponent(labelErro, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jPanelDadosPessoais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(63, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(345, Short.MAX_VALUE)
                .addComponent(salvar)
                .addGap(35, 35, 35)
                .addComponent(cancela)
                .addGap(270, 270, 270))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cancela, salvar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelDadosPessoais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addGap(108, 108, 108)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cancela))
                .addGap(25, 25, 25)
                .addComponent(labelErro, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        PropertyConfigurator.configure("log4j.properties");
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new VisaoCadastroMotorista().setVisible(true);
            }
        });
    }
private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed
    chamarVerificacoes();
}//GEN-LAST:event_salvarActionPerformed

private void cancelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelaActionPerformed
    this.dispose();
}//GEN-LAST:event_cancelaActionPerformed

private void jTxtCepKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtCepKeyPressed
       jTxtCep.setBackground(Color.white);
}//GEN-LAST:event_jTxtCepKeyPressed

private void jTxtNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtNomeKeyPressed
   jTxtNome.setBackground(Color.white);
}//GEN-LAST:event_jTxtNomeKeyPressed

private void jTxtCpfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtCpfKeyPressed
   jTxtCpf.setBackground(Color.white);
}//GEN-LAST:event_jTxtCpfKeyPressed

private void jTxtTelefoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtTelefoneKeyPressed
   jTxtTelefone.setBackground(Color.white);
}//GEN-LAST:event_jTxtTelefoneKeyPressed

private void jTxtCnhKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtCnhKeyPressed
   jTxtCnh.setBackground(Color.white);
}//GEN-LAST:event_jTxtCnhKeyPressed

private void jTxtRuaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtRuaKeyPressed
   jTxtRua.setBackground(Color.white);
}//GEN-LAST:event_jTxtRuaKeyPressed

private void jTxtNumeroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtNumeroKeyPressed
   jTxtNumero.setBackground(Color.white);
}//GEN-LAST:event_jTxtNumeroKeyPressed

private void jTxtComplementoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtComplementoKeyPressed
   jTxtComplemento.setBackground(Color.white);
}//GEN-LAST:event_jTxtComplementoKeyPressed

private void jTxtBairroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtBairroKeyPressed
   jTxtBairro.setBackground(Color.white);
}//GEN-LAST:event_jTxtBairroKeyPressed

private void jTxtCidadeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtCidadeKeyPressed
   jTxtCidade.setBackground(Color.white);
}//GEN-LAST:event_jTxtCidadeKeyPressed

    /**
 * Verifica se os campos Nome ou CPF está em branco
 * @return 
 */
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
     * Verifica se o campo CNH está em branco
     * @return 
     */
    public boolean verificarCnhEmBranco(){
        if(jTxtCnh.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "O campo CNH é obrigatório!");
            jTxtCnh.setBackground(Color.red);
            jTxtCnh.requestFocus();
            return false;
        }else{
            return true;
        }
    }
    
    /**
     * Verifica se a cnh é válida
     * @return 
     */
    public boolean verificarContemLetraNaCnh(){
        String cnh = jTxtCnh.getText().trim();
        for(int i=0;i<cnh.length();i++){
            if(!Character.isDigit(cnh.charAt(i))){
                return false;
            }
        }
        return true;
    }
    
    
    /*
     * Método para verificação dos dados de endereço.
     * O for é responsavel por verificar quantos componentes estão contidos dentro do jPanelEndereco
     * A variavel contadorCampos conta a quantidade de campos.
     * é verificado quantos dados ficaram em branco. Se a quantidade de dados que ficaram em branco for igual
     * a quantidade de campos é porque não foi inserido nenhum dado sobre o endereço. Senão, se a quantidade
     * de itens em branco igual ao 1 é porque apenas um campo ficou em branco. Se esse campo
     * for o complemento, então a entrada de dados é aceita, caso contrario é emitida uma mensagem de erro para o 
     * usuário.
     * 
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
        else if(contadorCamposEmBranco == 1 && jTxtComplemento.getText().trim().isEmpty()){
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
     * Pega os dados e insere na variável motorista
     */
    public void pegarDados(){
        motorista = new Motorista();
        endereco = new Endereco();
        
        motorista.setNome(jTxtNome.getText().trim().toUpperCase());
        motorista.setCpf(jTxtCpf.getText().trim());
        motorista.setTefefone(jTxtTelefone.getText().trim());
        motorista.setCnh(jTxtCnh.getText().trim());
        
        if(verificarDadosEndereco()){
            /*
             * O método verificarDadosEndereco retorna true se não foi digitado nada, ou foi digitado tudo, ou tudo
             * menos o complemento. O próximo if verifica se foi digitado tudo ou não. Se o primeiro campo estiver vazio
             * é porque não foi digitado nada, portando não precisamos salvar o endereço
             */
            if(!jTxtRua.getText().isEmpty()){
                endereco.setRua(jTxtRua.getText().trim().toUpperCase());
                endereco.setNumero(Integer.valueOf(jTxtNumero.getText().trim()));
                endereco.setComplemento(jTxtComplemento.getText().trim().toUpperCase());
                endereco.setBairro(jTxtBairro.getText().trim().toUpperCase());
                endereco.setCidade(jTxtCidade.getText().trim().toUpperCase());
                endereco.setCep(jTxtCep.getText().trim());
                endereco.setUf(jComboEstado.getSelectedItem().toString());
                persisteEndereco.salvarBD(endereco);
                motorista.setEndereco(endereco);
            }
            
        }
        
    }
    
    /**
     * Verifica se os dados digitados são válidos
     * @return 
     */
    public boolean validarCampos(){
        Valida validacao = new Valida();
        
        if(!validacao.validarCPF(jTxtCpf.getText())){
            JOptionPane.showMessageDialog(null, "CPF inválido!");
            jTxtCpf.setBackground(Color.red);
            jTxtCpf.requestFocus();
            return false;
        }else if(!jTxtTelefone.getText().trim().isEmpty() && !validacao.validarTelefone(jTxtTelefone.getText())){
            JOptionPane.showMessageDialog(null, "Telefone inválido!");
            jTxtTelefone.setBackground(Color.red);
            jTxtTelefone.requestFocus();
            return false;
        }else if(!jTxtCep.getText().isEmpty() && validacao.validarCEP(jTxtCep.getText())){
            JOptionPane.showMessageDialog(null, "CEP inválido!");
            jTxtCep.setBackground(Color.red);
            jTxtCep.requestFocus();
            return false;
        }else if(!validacao.validarCnh(jTxtCnh.getText())){
            JOptionPane.showMessageDialog(null, "Cnh inválida!");
            jTxtCep.setBackground(Color.red);
            jTxtCep.requestFocus();
            return false;
        }else{
            return true;
        }
    }
    
    /**
     * Faz todas a verificações. Se todos os dados são válido, então eles são salvos no banco de dados
     */
    public void chamarVerificacoes(){
        if(verificarDadosPessoaisEmBranco() && verificarContemLetraNaCnh() && validarCampos()){
            pegarDados();
            if(!persisteMotorista.verificarMotoristaJaCadastrado(motorista)){
                persisteMotorista.salvarBD(motorista);
                limparCamposDadosPessoais();
                limparCnh();
                limparCamposEndereco();
                jTxtNome.requestFocus();
                
                log.info(formatador.format(new Date()) + " - Motorista " + motorista.getNome() + 
                            " cadastrado pelo funcionario " + funcionario.getUsuario());
                
                JOptionPane.showMessageDialog(null, "Motorista cadastrado com sucesso!");
            }
            else{
                JOptionPane.showMessageDialog(null, "Motorista já está cadastrado no sistema!");
            }
        }
    }
    
    /**
     * Limpa os campos referentes ao dados pessoais (nome, cpf, telefone)
     */
    public void limparCamposDadosPessoais(){
        jTxtNome.setText("");
        jTxtCpf.setText("");
        jTxtTelefone.setText("");
    }
    
    /**
     * limpa o campo cnh
     */
     public void limparCnh(){
         jTxtCnh.setText("");
     }
     
     /**
      * Limpa os campos referente ao endereço e o combo box vai pro indice 0.
      * 
      */
     
     public void limparCamposEndereco(){
         for(int i=0; i< jPanelEndereco.getComponentCount();i++){
             if(jPanelEndereco.getComponent(i) instanceof JTextField){
                 JTextField aux = (JTextField)jPanelEndereco.getComponent(i);
                 aux.setText("");
             }else if(jPanelEndereco.getComponent(i) instanceof JComboBox){
                 JComboBox aux = (JComboBox) jPanelEndereco.getComponent(i);
                 aux.setSelectedIndex(0);
             }
         }
     }
     
     /**
      * Preenche o combo referente aos estados
      */
             
     public void preencherComboEstados(){
         persisteEndereco.preencherComboEstados(jComboEstado);
     }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancela;
    public javax.swing.JComboBox jComboEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JPanel jPanelDadosPessoais;
    public javax.swing.JPanel jPanelEndereco;
    public javax.swing.JTextField jTxtBairro;
    public javax.swing.JTextField jTxtCep;
    public javax.swing.JTextField jTxtCidade;
    public javax.swing.JTextField jTxtCnh;
    public javax.swing.JTextField jTxtComplemento;
    public javax.swing.JTextField jTxtCpf;
    public javax.swing.JTextField jTxtNome;
    public javax.swing.JTextField jTxtNumero;
    public javax.swing.JTextField jTxtRua;
    public javax.swing.JTextField jTxtTelefone;
    private javax.swing.JLabel labelErro;
    private javax.swing.JButton salvar;
    // End of variables declaration//GEN-END:variables
}
