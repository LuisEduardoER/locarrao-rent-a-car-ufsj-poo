package locarrao.visao.grafica;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import modelo.dominio.Funcionarios;
import modelo.dominio.ModeloVeiculo;
import modelo.persistencia.PersisteModeloVeiculo;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class VisaoCadastroModeloVeiculo extends javax.swing.JFrame {
    private final static Logger log = Logger.getLogger(VisaoCadastroModeloVeiculo.class);
    SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
    Funcionarios funcionario = VisaoMenu.funcionario;
    
    ModeloVeiculo modelo = new ModeloVeiculo();
    PersisteModeloVeiculo persisteModeloVeiculo = new PersisteModeloVeiculo();
    
    public VisaoCadastroModeloVeiculo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTxtModelo = new javax.swing.JTextField();
        jBCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Modelo* :");

        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("* Campo Obrigatório");

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
                        .addComponent(jTxtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(jBCadastrar)
                        .addGap(36, 36, 36))
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
                    .addComponent(jTxtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    public static void main(String args[]) {
        PropertyConfigurator.configure("log4j.properties");
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new VisaoCadastroModeloVeiculo().setVisible(true);
            }
        });
    }
    
    public boolean verificarCampoEmBranco(){
        if(jTxtModelo.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "O campo Modelo é obrigatório!");
            jTxtModelo.setBackground(Color.red);
            jTxtModelo.requestFocus();
            return false;
        }else{
            return true;
        }
    }
    
    public void pegarValores(){
        modelo.setModelo(jTxtModelo.getText().trim().toUpperCase());
    }
    public void salvar(){
        pegarValores();
        if(verificarCampoEmBranco() && !persisteModeloVeiculo.verificarModeloJaCadastrado(modelo)){
            persisteModeloVeiculo.salvarBD(modelo);
            
            log.info(formatador.format(new Date()) + " - Modelo " + modelo.getModelo() + 
                    " cadastrado pelo funcionário " + funcionario.getUsuario());
            JOptionPane.showMessageDialog(null, "Modelo cadastrado com sucesso!");
        }else if(persisteModeloVeiculo.verificarModeloJaCadastrado(modelo)){
            JOptionPane.showMessageDialog(null, "Modelo já está cadastrado!");
        }
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCadastrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTxtModelo;
    // End of variables declaration//GEN-END:variables
}
