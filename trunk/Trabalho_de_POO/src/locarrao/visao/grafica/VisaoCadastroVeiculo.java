package locarrao.visao.grafica;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import modelo.dominio.Funcionarios;
import modelo.dominio.MarcaVeiculo;
import modelo.dominio.ModeloVeiculo;
import modelo.dominio.TipoVeiculo;
import modelo.dominio.Veiculos;
import modelo.persistencia.PersisteMarcaVeiculo;
import modelo.persistencia.PersisteModeloVeiculo;
import modelo.persistencia.PersisteTipoVeiculo;
import modelo.persistencia.PersisteVeiculos;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class VisaoCadastroVeiculo extends javax.swing.JFrame {
    private final static Logger log = Logger.getLogger(VisaoCadastroTipoVeiculo.class);
    SimpleDateFormat formatarData = new SimpleDateFormat("dd/MM/yyyy");
    Funcionarios funcionario = VisaoMenu.funcionario;
    
    
    Veiculos veiculo = new Veiculos();
    TipoVeiculo tipoVeiculo = new TipoVeiculo();
    ModeloVeiculo modelo = new ModeloVeiculo();
    MarcaVeiculo marca = new MarcaVeiculo();
    
    PersisteVeiculos persisteVeiculo = new PersisteVeiculos();
    PersisteTipoVeiculo persisteTipoVeiculo = new PersisteTipoVeiculo();
    PersisteModeloVeiculo persisteModeloVeiculo = new PersisteModeloVeiculo();
    PersisteMarcaVeiculo persisteMarcaVeiculo = new PersisteMarcaVeiculo();
    
    
    public VisaoCadastroVeiculo() {
        initComponents();
        preencherComboTipo();
        preencherComboModelo();
        preencherComboMarca();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTxtPlaca = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTxtCor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTxtAno = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTxtObservacao = new javax.swing.JTextArea();
        jPanelOpcionais = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jBSalvar = new javax.swing.JButton();
        jBSair = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jComboTipo = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jComboModelo = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jComboMarca = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Placa*: ");

        jLabel2.setText("Cor : ");

        jLabel3.setText("Ano *: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTxtAno, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtPlaca, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                    .addComponent(jTxtCor, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTxtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTxtAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTxtCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Observação"));

        jTxtObservacao.setColumns(20);
        jTxtObservacao.setRows(5);
        jScrollPane1.setViewportView(jTxtObservacao);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelOpcionais.setBorder(javax.swing.BorderFactory.createTitledBorder("Opcionais"));

        jCheckBox1.setText("Navegador GPS");

        jCheckBox2.setText("Assento para Bebê");

        jCheckBox3.setText("Assento para Criança");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        jCheckBox4.setText("Direção Hidráulica");

        jCheckBox5.setText("Trava Elétrica");

        jCheckBox6.setText("Suporte de Bagagem");

        jCheckBox7.setText("Ar Condicionado");
        jCheckBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox7ActionPerformed(evt);
            }
        });

        jCheckBox8.setText("Limpador de Parabrisa Traseiro");

        javax.swing.GroupLayout jPanelOpcionaisLayout = new javax.swing.GroupLayout(jPanelOpcionais);
        jPanelOpcionais.setLayout(jPanelOpcionaisLayout);
        jPanelOpcionaisLayout.setHorizontalGroup(
            jPanelOpcionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOpcionaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelOpcionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox3)
                    .addComponent(jCheckBox4))
                .addGap(18, 18, 18)
                .addGroup(jPanelOpcionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox5)
                    .addComponent(jCheckBox6)
                    .addComponent(jCheckBox7)
                    .addComponent(jCheckBox8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelOpcionaisLayout.setVerticalGroup(
            jPanelOpcionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOpcionaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelOpcionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelOpcionaisLayout.createSequentialGroup()
                        .addComponent(jCheckBox5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox8))
                    .addGroup(jPanelOpcionaisLayout.createSequentialGroup()
                        .addComponent(jCheckBox1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jBSalvar.setText("Salvar");

        jBSair.setText("Sair");

        jLabel4.setForeground(new java.awt.Color(255, 51, 0));
        jLabel4.setText("* Campo Obrigatório");

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setText("Tipo*");

        jComboTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione um Tipo" }));

        jLabel6.setText("Modelo*");

        jComboModelo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel7.setText("Marca*");

        jComboMarca.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jComboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel5)))
                .addGap(58, 58, 58)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel6))
                    .addComponent(jComboModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jComboMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(52, 52, 52))))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jComboMarca, jComboModelo, jComboTipo});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jComboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jComboMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jPanelOpcionais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap(621, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBSalvar)
                                .addGap(18, 18, 18)
                                .addComponent(jBSair, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(284, 284, 284))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBSair, jBSalvar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanelOpcionais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSalvar)
                    .addComponent(jBSair))
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox7ActionPerformed

    public static void main(String args[]) {
        PropertyConfigurator.configure("log4j.properties");
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new VisaoCadastroVeiculo().setVisible(true);
            }
        });
    }
    
    
    public void preencherComboTipo(){
        List<TipoVeiculo> lista = persisteTipoVeiculo.retornarListaTipos();
        jComboTipo.removeAllItems();
        jComboTipo.addItem("Selecione um Tipo");
        if(lista == null){
            JOptionPane.showMessageDialog(null, "Não foi possível conectar com o banco de dados!");
        }else{
            for(TipoVeiculo item: lista){
                jComboTipo.addItem(item.getTipo());
            }
        }
        
    }
    
    public void preencherComboModelo(){
        List<ModeloVeiculo> lista = persisteModeloVeiculo.retornarTodosModelosBD();
        jComboModelo.removeAllItems();
        jComboModelo.addItem("Selecione um Modelo");
        
        if(lista == null){
            JOptionPane.showMessageDialog(null, "Não foi possível conectar com o banco de dados!");
        }else{
            for(ModeloVeiculo item: lista){
                jComboModelo.addItem(item.getModelo());
            }
        }
    }
    
    public void preencherComboMarca(){
        List<MarcaVeiculo> lista = persisteMarcaVeiculo.retornarTodosModelosBD();
        jComboMarca.removeAllItems();
        jComboMarca.addItem("Selecione um Tipo");
        
        if(lista == null){
            JOptionPane.showMessageDialog(null, "Não foi possível conectar com o banco de dados!");
        }else{
            for(MarcaVeiculo item: lista){
                jComboMarca.addItem(item.getMarca());
            }
        }
        
    }
    
    
    public boolean verificarCamposObrigatoriosEmBranco(){
        if(jTxtPlaca.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "O campo Placa é obrigatório!");
            jTxtPlaca.setBackground(Color.red);
            jTxtPlaca.requestFocus();
            return false;
        }else if(jTxtAno.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "O campo Placa é obrigatório!");
            jTxtAno.setBackground(Color.red);
            jTxtAno.requestFocus();
            return false;
        }else{ 
            return true;
        }
    }
    
    public boolean verificarCombos(){
        if(jComboTipo.getSelectedIndex()== 0){
            JOptionPane.showMessageDialog(null, "Selecione o Tipo do Veículo!");
            jComboTipo.requestFocus();
            return false;
        }else if(jComboModelo.getSelectedIndex()== 0){
            JOptionPane.showMessageDialog(null, "Selecione o Tipo do Veículo!");
            jComboModelo.requestFocus();
            return false;
        }else if(jComboMarca.getSelectedIndex()== 0){
            JOptionPane.showMessageDialog(null, "Selecione o Tipo do Veículo!");
            jComboMarca.requestFocus();
            return false;
        }else {
            return true;
        }
    }
    
    
    public String retornarChecksMarcados(){
        String opcionais = "";
        for(int i=0; i< jPanelOpcionais.getComponentCount();i++){
            if(jPanelOpcionais.getComponent(i) instanceof JCheckBox){
                JCheckBox aux = (JCheckBox)jPanelOpcionais.getComponent(i);
                
                if(aux.isSelected()){
                    opcionais+=aux.getText() + "\n";
                }
            }
        }
        return opcionais;
    }
    
    public TipoVeiculo retornarTipo(){
        tipoVeiculo = new TipoVeiculo();
        tipoVeiculo.setTipo(jComboTipo.getSelectedItem().toString());
        if(persisteTipoVeiculo.verificarTipoJaCadastrado(tipoVeiculo)){
            return tipoVeiculo;
        }else{
            tipoVeiculo = null;
            return tipoVeiculo;
        }
        
    }
    
    public ModeloVeiculo retornarModelo(){
        modelo = new ModeloVeiculo();
        modelo.setModelo(jComboModelo.getSelectedItem().toString());
        if(persisteModeloVeiculo.verificarModeloJaCadastrado(modelo)){
            return modelo;
        }else{
            modelo = null;
            return modelo;
        }
    }
    
    public MarcaVeiculo retornarMarca(){
        marca = new MarcaVeiculo();
        marca.setMarca(jComboMarca.getSelectedItem().toString());
        if(persisteMarcaVeiculo.verificarMarcaJaCadastrado(marca)){
            return marca;
        }else{
            marca = null;
            return marca;
        }
    }
    
    public void pegarValores(){
        veiculo = new Veiculos();
        
        veiculo.setPlaca(jTxtPlaca.getText().trim().toUpperCase());
        veiculo.setAno(Integer.valueOf(jTxtAno.getText().trim()));
        veiculo.setCor(jTxtCor.getText().trim().toUpperCase());
        veiculo.setObservacao(jTxtObservacao.getText().trim().toUpperCase());
        veiculo.setOpcionais(retornarChecksMarcados());
        veiculo.setTipoVeiculo(retornarTipo());
        veiculo.setModeloVeiculo(retornarModelo());
        veiculo.setMarcaVeiculo(retornarMarca());
    }
    
    public boolean verificarCampoNumerico(){
        String ano = jTxtAno.getText().trim();
        for(int i=0; i < ano.length(); i++){
            if(!Character.isDigit(ano.charAt(i))){
                return false;
            }
        }
        
        return true;
    }
    
    public void salvar(){
        if(verificarCamposObrigatoriosEmBranco() && verificarCampoNumerico() && verificarCombos()){
            pegarValores();
            persisteVeiculo.salvarBD(veiculo);
            
            log.info(formatarData.format(new Date()) + " - Veículo de placa " + veiculo.getPlaca() 
                    + " cadastrado pelo funcionário " + funcionario.getNome());
            JOptionPane.showMessageDialog(null, "Veículo salvo com sucesso!");
        }else{
            JOptionPane.showMessageDialog(null, "Houve um erro ao salvar o veículo. Tente novamente!");
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBSair;
    private javax.swing.JButton jBSalvar;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JComboBox jComboMarca;
    private javax.swing.JComboBox jComboModelo;
    private javax.swing.JComboBox jComboTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelOpcionais;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTxtAno;
    private javax.swing.JTextField jTxtCor;
    private javax.swing.JTextArea jTxtObservacao;
    private javax.swing.JTextField jTxtPlaca;
    // End of variables declaration//GEN-END:variables
}
