package locarrao.visao.grafica;

import java.awt.Color;
import javax.swing.JOptionPane;
import modelo.dominio.MarcaVeiculo;
import modelo.persistencia.PersisteMarcaVeiculo;

public class VisaoCadastroMarcaVeiculo extends javax.swing.JFrame {

    MarcaVeiculo marca = new MarcaVeiculo();
    PersisteMarcaVeiculo persisteMarcaVeiculo = new PersisteMarcaVeiculo();
    
    public VisaoCadastroMarcaVeiculo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTxtMarca = new javax.swing.JTextField();
        jBCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Marca* :");

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
                        .addComponent(jTxtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(jBCadastrar)
                        .addGap(41, 41, 41))
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
                    .addComponent(jTxtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new VisaoCadastroMarcaVeiculo().setVisible(true);
            }
        });
    }
    
    public boolean verificarCampoEmBranco(){
        if(jTxtMarca.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "O Campo Marca é obrigatório!");
            jTxtMarca.setBackground(Color.red);
            jTxtMarca.requestFocus();
            return false;
        }else{
            return true;
        }
    }
    
    public void pegarValores(){
        marca.setMarca(jTxtMarca.getText().trim().toUpperCase());
    }
    public void salvar(){
        pegarValores();
        if(verificarCampoEmBranco() && !persisteMarcaVeiculo.verificarMarcaJaCadastrado(marca)){
            persisteMarcaVeiculo.salvarBD(marca);
            JOptionPane.showMessageDialog(null, "Marca Cadastrada com sucesso!");
        }else if(persisteMarcaVeiculo.verificarMarcaJaCadastrado(marca)){
            JOptionPane.showMessageDialog(null, "Marca já está cadastrado!");
        }
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCadastrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTxtMarca;
    // End of variables declaration//GEN-END:variables
}
