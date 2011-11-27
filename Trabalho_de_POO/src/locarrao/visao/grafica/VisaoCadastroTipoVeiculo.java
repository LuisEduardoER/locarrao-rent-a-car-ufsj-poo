package locarrao.visao.grafica;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import modelo.dominio.Funcionarios;
import modelo.dominio.TipoVeiculo;
import modelo.persistencia.PersisteTipoVeiculo;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class VisaoCadastroTipoVeiculo extends javax.swing.JFrame {
    private final static Logger log = Logger.getLogger(VisaoCadastroTipoVeiculo.class);
    SimpleDateFormat formatarData = new SimpleDateFormat("dd/MM/yyyy");
    Funcionarios funcionario = VisaoMenu.funcionario;
    
    
    TipoVeiculo tipo = new TipoVeiculo();
    PersisteTipoVeiculo persisteTipo = new PersisteTipoVeiculo();
    
    public VisaoCadastroTipoVeiculo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTxtTipo = new javax.swing.JTextField();
        jBCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Tipo* :");

        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("* Campo Obrigatório");

        jTxtTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtTipoActionPerformed(evt);
            }
        });

        jBCadastrar.setText("Cadastrar");
        jBCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jTxtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(jBCadastrar)
                        .addGap(50, 50, 50))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(281, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTxtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBCadastrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastrarActionPerformed
        salvar();
    }//GEN-LAST:event_jBCadastrarActionPerformed

private void jTxtTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtTipoActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jTxtTipoActionPerformed

    public static void main(String args[]) {
        PropertyConfigurator.configure("log4j.properties");
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new VisaoCadastroTipoVeiculo().setVisible(true);
            }
        });
    }
    
    /**
     * Verifica se o campo Tipo está vazio
     * @return 
     */
    public boolean verificarCampoEmBranco(){
        if(jTxtTipo.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "O Campo Tipo é obrigatório!");
            jTxtTipo.setBackground(Color.red);
            jTxtTipo.requestFocus();
            return false;
        }else{
            return true;
        }
    }
    
    /**
     * Pega o valor digitado no campo Tipo e insere na variavel tipo
     */
    public void pegarValores(){
        tipo = new TipoVeiculo();
        tipo.setTipo(jTxtTipo.getText().trim());
    }
    
    /**
     * Verifica se o campos está vazio e se o tipo ja está cadastro. Caso contrário, é salvo no banco de dados
     */
    public void salvar(){
        pegarValores();
        if(verificarCampoEmBranco() && !persisteTipo.verificarTipoJaCadastrado(tipo)){
            persisteTipo.salvarBD(tipo);
            
            log.info(formatarData.format(new Date()) + " - Tipo de veículo " + tipo.getTipo() 
                    + " cadastrado pelo funcinário " + funcionario.getUsuario());
            JOptionPane.showMessageDialog(null, "Tipo Cadastrado com sucesso!");
        }else if(persisteTipo.verificarTipoJaCadastrado(tipo)){
            JOptionPane.showMessageDialog(null, "Tipo já está cadastrado!");
        }
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCadastrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTxtTipo;
    // End of variables declaration//GEN-END:variables
}
