package locarrao.visao.grafica;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import modelo.dominio.Funcionarios;
import modelo.persistencia.PersisteFuncionarios;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class VisaoLogin extends javax.swing.JFrame {
    private final static Logger log = Logger.getLogger(VisaoLogin.class);
    SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
    PersisteFuncionarios persisteFuncionario = new PersisteFuncionarios();    
    public Funcionarios funcionario = new Funcionarios(); 
    
    VisaoMenu visao = new VisaoMenu();
        
    
    public VisaoLogin() {
        initComponents();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTxtUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jBAcessar = new javax.swing.JButton();
        jTxtSenha = new javax.swing.JPasswordField();
        jBSair = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setIconImage(getToolkit().getImage("locarrao.ico"));
        setResizable(false);

        jLabel1.setText("Usuário: ");

        jLabel2.setText("Senha:");

        jBAcessar.setText("Acessar");
        jBAcessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAcessarActionPerformed(evt);
            }
        });
        jBAcessar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBAcessarKeyPressed(evt);
            }
        });

        jBSair.setText("Sair");
        jBSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSairActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/locarrao/visao/grafica/locarrao2.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTxtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(10, 10, 10)
                .addComponent(jTxtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(136, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(157, 157, 157))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(97, Short.MAX_VALUE)
                .addComponent(jBAcessar)
                .addGap(76, 76, 76)
                .addComponent(jBSair)
                .addGap(80, 80, 80))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTxtSenha, jTxtUsuario});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBAcessar, jBSair});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTxtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jTxtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBAcessar)
                    .addComponent(jBSair))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBAcessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAcessarActionPerformed
        fazerLogin();
    }//GEN-LAST:event_jBAcessarActionPerformed
    
    private void jBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSairActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jBSairActionPerformed

    private void jBAcessarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBAcessarKeyPressed
       fazerLogin();
    }//GEN-LAST:event_jBAcessarKeyPressed

    public static void main(String args[]) {
        PropertyConfigurator.configure("log4j.properties");
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                
                new VisaoLogin().setVisible(true);
            }
        });
    }
    
    
    /**
     * Verifica se o login foi feito corretamente
     */
    public boolean verificarLogin(){
        if(!persisteFuncionario.verificarLogin(funcionario)){
            JOptionPane.showMessageDialog(null, "Dados incorretos! Verifique o usuário e a senha.");
            return false;
        }
        else{
            return true;
        }
      
        
    }
    
    /**
     * Abre o Frame com a tela principal
     */
    public void chamarFrameMenu(){
        funcionario = persisteFuncionario.retornarFuncionarioPeloUsuario(funcionario);
        determinarMenu();
        VisaoMenu.funcionario = funcionario;
        visao.jLabelUsuario.setText(funcionario.getUsuario());
        visao.setVisible(true);
        
    }
    /**
     * Chama o frame menu após fazer as verificações de login.
     */
    public void fazerLogin(){
        funcionario.setUsuario(jTxtUsuario.getText().toUpperCase());
        funcionario.setSenha(String.valueOf(jTxtSenha.getPassword()));
        
        funcionario = persisteFuncionario.retornarFuncionarioPeloUsuario(funcionario);
        if(verificarLogin()){
            log.info(formatador.format(new Date()) + " " + funcionario.getCpf() + 
                    " logou-se como "+ funcionario.getCargo() );
            
            chamarFrameMenu();
            this.dispose();
        }
    }
    
    /**
     * Determina o menu de acordo com seu cargo
     */
    public void determinarMenu(){
        if(funcionario.getCargo().equals("VENDEDOR")){
            visao.jMenuFuncionario.setVisible(false);
        }else if(funcionario.getCargo().equals("AUXILIAR")){
            visao.locacao.setVisible(false);
            visao.jMenuFuncionario.setVisible(false);
        }
    }
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAcessar;
    private javax.swing.JButton jBSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jTxtSenha;
    private javax.swing.JTextField jTxtUsuario;
    // End of variables declaration//GEN-END:variables
}
