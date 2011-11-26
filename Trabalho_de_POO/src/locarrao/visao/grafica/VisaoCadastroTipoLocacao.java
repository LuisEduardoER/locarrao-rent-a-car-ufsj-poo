package locarrao.visao.grafica;

import java.awt.Color;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.dominio.Funcionarios;
import modelo.dominio.TipoLocacao;
import modelo.dominio.TipoVeiculo;
import modelo.persistencia.PersisteTipoLocacao;
import modelo.persistencia.PersisteTipoVeiculo;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class VisaoCadastroTipoLocacao extends javax.swing.JFrame {

    private final static Logger log = Logger.getLogger(VisaoLogin.class);
    SimpleDateFormat formatarData = new SimpleDateFormat("dd/MM/yyyy");
    Funcionarios funcionario = VisaoMenu.funcionario;
    
    public VisaoCadastroTipoLocacao() {
        initComponents();
        preencherCombo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboTipoVeiculo = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTxtPrecoPorKm = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTxtTaxaDiarias = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTxtTaxaQuilometragem = new javax.swing.JTextField();
        jBSalvar = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tipo de Locação");
        setResizable(false);

        jLabel1.setText("Tipo de Veículo");

        jLabel3.setText("Preço por Km");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Taxas"));

        jLabel2.setText("Diárias");

        jLabel4.setText("Quilometragem");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTxtTaxaDiarias, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jTxtTaxaQuilometragem, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(29, 29, 29))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTxtTaxaQuilometragem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtTaxaDiarias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jBSalvar.setText("Salvar");
        jBSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalvarActionPerformed(evt);
            }
        });

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboTipoVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel1)))
                        .addGap(30, 30, 30)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtPrecoPorKm, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(jBSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(jBCancelar)))
                .addContainerGap(91, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBCancelar, jBSalvar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboTipoVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtPrecoPorKm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSalvar)
                    .addComponent(jBCancelar))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jBSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalvarActionPerformed
        salvar();
    }//GEN-LAST:event_jBSalvarActionPerformed

    public static void main(String args[]) {
        PropertyConfigurator.configure("log4j.properties");
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new VisaoCadastroTipoLocacao().setVisible(true);
            }
        });
    }
    
    public void preencherCombo(){
        PersisteTipoVeiculo persisteTipoVeiculo = new PersisteTipoVeiculo();
        List lista = persisteTipoVeiculo.retornarListaTipos();
        
        jComboTipoVeiculo.removeAllItems();
        for(Object item: lista){
            TipoVeiculo tipoVeiculo = (TipoVeiculo) item;
            jComboTipoVeiculo.addItem(tipoVeiculo.getTipo());
        }
    }
    
    /*
     * Verifica se tem algum campo em branco
     */
    public boolean validarCamposEmBranco(){
        if(jTxtTaxaDiarias.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "O campo Taxas Diárias não pode ficar vazio!");
            jTxtTaxaDiarias.setBackground(Color.red);
            return false;
        }
        else if(jTxtTaxaQuilometragem.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "O campo Taxas por Quilometragem não pode ficar vazio!");
            jTxtTaxaQuilometragem.setBackground(Color.red);
            return false;
        }
        else if(jTxtPrecoPorKm.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "O campo Preço por Km não pode ficar vazio!");
            jTxtPrecoPorKm.setBackground(Color.red);
            return false;
        }else{
            return true;
        }
        
    }
    
    public boolean verificarDadosIncorretos(TipoLocacao tipoLocacao){
        DecimalFormat formatador = new DecimalFormat("#,###.00");
        Number numero;
        
        try{
            numero  = formatador.parse(jTxtTaxaDiarias.getText().trim());
            tipoLocacao.setTaxaDiarias(numero.doubleValue());
        }catch(ParseException ex){
            JOptionPane.showMessageDialog(null, "O campo Taxas para Diárias so aceito números! Inteiros ou decimais");
            jTxtTaxaDiarias.setBackground(Color.red);
            return false;
            
        }
        
        try{
            numero  = formatador.parse(jTxtTaxaQuilometragem.getText().trim());
            tipoLocacao.setTaxaPorKm(numero.doubleValue());
        }catch(ParseException ex){
            JOptionPane.showMessageDialog(null, "O campo Taxas para locação por "
                    + "quilometragem so aceito números! Inteiros ou decimais");
            jTxtTaxaQuilometragem.setBackground(Color.red);
            return false;
            
        }
        
        try{
            numero  = formatador.parse(jTxtPrecoPorKm.getText().trim());
            tipoLocacao.setPrecoPorQuilometro(numero.doubleValue());
            
        }catch(ParseException ex){
            JOptionPane.showMessageDialog(null, "O campo Preço por Km"
                    + " so aceita números! Inteiros ou decimais");
            jTxtPrecoPorKm.setBackground(Color.red);
            return false;
        }
        
        return true;
    }
    
    public void salvar(){
        TipoLocacao tipoLocacao = new TipoLocacao();
        TipoVeiculo tipoVeiculo = new TipoVeiculo();
        PersisteTipoLocacao persisteTipoLocacao = new PersisteTipoLocacao();
        
        //pega a id do veículo
        tipoVeiculo.setTipo(jComboTipoVeiculo.getSelectedItem().toString());
        tipoVeiculo = persisteTipoLocacao.retornarTipoVeiculoBD(tipoVeiculo);
        JOptionPane.showMessageDialog(null, tipoVeiculo.getId());
        
        
        if(persisteTipoLocacao.verificarSeExisteCadastro(tipoVeiculo)){
            tipoLocacao.setTipoVeiculo(tipoVeiculo);
            tipoLocacao = persisteTipoLocacao.retornarTipoLocacaoPorVeiculo(tipoLocacao);
                
            if(verificarDadosIncorretos(tipoLocacao)){
                persisteTipoLocacao.atualizarBD(tipoLocacao);
                
                log.info(formatarData.format(new Date()) + " - Atualização do Tipo de Locação para o tipo de veículo " 
                        + tipoVeiculo.getTipo() + " feito pelo funcionário " + funcionario.getNome());
                JOptionPane.showMessageDialog(null, "Dados Atualizados com sucesso");
            }
            
        }else{
            if(verificarDadosIncorretos(tipoLocacao)){
                persisteTipoLocacao.salvarBD(tipoLocacao);
                
                log.info(formatarData.format(new Date()) + " - Cadastro do Tipo de Locação para o tipo de veículo " 
                        + tipoVeiculo.getTipo() + " feito pelo funcionário " + funcionario.getNome());
                JOptionPane.showMessageDialog(null, "Dados salvos com sucesso");
            }
            
        }
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBSalvar;
    private javax.swing.JComboBox jComboTipoVeiculo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTxtPrecoPorKm;
    private javax.swing.JTextField jTxtTaxaDiarias;
    private javax.swing.JTextField jTxtTaxaQuilometragem;
    // End of variables declaration//GEN-END:variables
}
