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
import modelo.dominio.Valida;
import modelo.dominio.Veiculos;
import modelo.persistencia.PersisteMarcaVeiculo;
import modelo.persistencia.PersisteModeloVeiculo;
import modelo.persistencia.PersisteTipoVeiculo;
import modelo.persistencia.PersisteVeiculos;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class VisaoCadastroVeiculo extends javax.swing.JFrame {
    private final static Logger log = Logger.getLogger(VisaoCadastroVeiculo.class);
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
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTxtObservacao = new javax.swing.JTextArea();
        jLabelRestante = new javax.swing.JLabel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Placa*: ");

        jTxtPlaca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTxtPlacaKeyPressed(evt);
            }
        });

        jLabel2.setText("Cor : ");

        jLabel3.setText("Ano *: ");

        jTxtAno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTxtAnoKeyPressed(evt);
            }
        });

        jLabel8.setText("Ex.: aaa1111");

        jLabel9.setText("Ex.: 2011");

        jLabel10.setText("Ex.: Branco");

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
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTxtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTxtAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTxtCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Observação"));

        jTxtObservacao.setColumns(20);
        jTxtObservacao.setLineWrap(true);
        jTxtObservacao.setRows(5);
        jTxtObservacao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTxtObservacaoKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTxtObservacao);

        jLabelRestante.setText("255 caracteres restantes");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
                    .addComponent(jLabelRestante))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                .addGap(8, 8, 8)
                .addComponent(jLabelRestante))
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
        jBSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalvarActionPerformed(evt);
            }
        });

        jBSair.setText("Sair");
        jBSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSairActionPerformed(evt);
            }
        });

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
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboModelo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(61, 61, 61)))
                .addContainerGap())
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jComboMarca, jComboModelo, jComboTipo});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(26, 26, 26))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(jComboModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanelOpcionais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(226, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap(691, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 346, Short.MAX_VALUE)
                                .addComponent(jBSalvar)
                                .addGap(18, 18, 18)
                                .addComponent(jBSair, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(284, 284, 284))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBSair, jBSalvar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelOpcionais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(13, 13, 13)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSalvar)
                    .addComponent(jBSair))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox7ActionPerformed

    private void jBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBSairActionPerformed

    private void jTxtPlacaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtPlacaKeyPressed
        jTxtPlaca.setBackground(Color.white);
    }//GEN-LAST:event_jTxtPlacaKeyPressed

    private void jTxtAnoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtAnoKeyPressed
        jTxtAno.setBackground(Color.white);
    }//GEN-LAST:event_jTxtAnoKeyPressed

    private void jBSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalvarActionPerformed
        salvar();
    }//GEN-LAST:event_jBSalvarActionPerformed

    private void jTxtObservacaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtObservacaoKeyPressed
        calcularRestanteCaracteres();
    }//GEN-LAST:event_jTxtObservacaoKeyPressed

    public static void main(String args[]) {
        PropertyConfigurator.configure("log4j.properties");
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new VisaoCadastroVeiculo().setVisible(true);
            }
        });
    }
    
    /**
     * Pega todos os tipos de veículo cadastrado no banco de dados e exibe no Combo Box
     */
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
    
    /**
     * Pega todos os modelos de veículo cadastrado no banco de dados e insere Combo Box
     */
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
    
      /**
     * Pega todas as marcas de veículo cadastrado no banco de dados e insere Combo Box
     */
  
    public void preencherComboMarca(){
        List<MarcaVeiculo> lista = persisteMarcaVeiculo.retornarTodasMarcasBD();
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
    
    /**
     * Verifica se nenhum campo obrigatório está em branco
     * @return 
     */
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
    
    /**
     * Verifica se foi selecionado algum tipo, modelo e marca. Se quando for feita a verificação o item selecionado do
     * for o de índice 0, será mostrada uma mensagem para o usuário.
     * @return 
     */
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
    
    /**
     * Concatena todos os checks marcados 
     * @return 
     */
    
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
    
    /**
     * Retorna o tipo de veículo selecionado no combo
     * @return 
     */
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
    
    /**
     * Retorna o modelo  selecionado no combo
     * @return 
     */
    
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
    
    /**
     * Retorna a marca selecionada no combo
     * @return 
     */
    
    public MarcaVeiculo retornarMarca(){
        marca = new MarcaVeiculo();
        marca.setMarca(jComboMarca.getSelectedItem().toString());
        if(persisteMarcaVeiculo.verificarMarcaJaCadastrada(marca)){
            return marca;
        }else{
            marca = null;
            return marca;
        }
    }
    
    /**
     * pega os valores dos campos e insere na variável veiculo
     */
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
        veiculo.setValorTotalLocacoes(0);
        veiculo.setTotalLocacoes(0);
    }
    
    /**
     * Verifica se nos campos numéricos não foi inserido letras
     * @return 
     */
    public boolean verificarCampoNumerico(){
        String ano = jTxtAno.getText().trim();
        for(int i=0; i < ano.length(); i++){
            if(!Character.isDigit(ano.charAt(i))){
                return false;
            }
        }
        
        return true;
    }
    
    
    /**
     * verifica se a placa digitada é valida!
     */
    
    public boolean verificarPlaca(){
        Valida valida = new Valida();
        if(valida.validarPlaca(jTxtPlaca.getText().trim())){
            return true;
        }else{
            JOptionPane.showMessageDialog(null, "Placa digitada é inválida!");
            jTxtPlaca.setBackground(Color.red);
            jTxtPlaca.requestFocus();
            return false;
        }
    }
    
    /**
     * Verifica se a mensagem contida na observação nãp ultrapassou o limite maximo de 255 caracteres
     */
    
    public boolean verificarObservacao(){
        if(jTxtObservacao.getText().trim().length() > 255){
            JOptionPane.showMessageDialog(null, "A observação não pode conter mais que 255 caracteres");
            jTxtObservacao.requestFocus();
            return false;
        }else{
            return true;
        }
    }
    
    /**
     * Calcula a quantidade de caracteres que falta para atingir o limite, que é de 255 caracteres.
     */
    public void calcularRestanteCaracteres(){
        if(jTxtObservacao.getText().trim().length() < 255){
            jLabelRestante.setForeground(Color.BLACK);
            jLabelRestante.setText(String.valueOf(255 - jTxtObservacao.getText().trim().length())
                    + " caracteres restantes");
        }else{
            jLabelRestante.setForeground(Color.red);
            jLabelRestante.setText("Chegou no limite de caracteres!");
        }
    }
    
    /**
     * Salva o veículo no banco de dados, verificando antes se os campos obrigatórios não estão em branco, se não foi
     * inserido letra nos campos numéricos e se foi selecionado algum valor válido nos combo box
     */
    
    public void salvar(){
        if(verificarCamposObrigatoriosEmBranco() && verificarCampoNumerico() && verificarPlaca() && verificarCombos()){
            pegarValores();
            persisteVeiculo.salvarBD(veiculo);
            
            log.info(formatarData.format(new Date()) + " - Veículo de placa " + veiculo.getPlaca() 
                    + " cadastrado pelo funcionário " + funcionario.getUsuario());
            JOptionPane.showMessageDialog(null, "Veículo salvo com sucesso!");
            limparCampos();
        }
        
    }
    
    /**
     * Limpa os campos tipo texto, volta o indice dos combos pra 0 e desmarca todos as caixas de texto
     */
    
    public void limparCampos(){
        jTxtPlaca.setText("");
        jTxtAno.setText("");
        jTxtCor.setText("");
        jTxtObservacao.setText("");
        
        jComboTipo.setSelectedIndex(0);
        jComboModelo.setSelectedIndex(0);
        jComboMarca.setSelectedIndex(0);
        
        desmarcarChecksMarcados();
    }
    
    /**
     * desmarca todos os check box
     */
    public void desmarcarChecksMarcados(){
        
        for(int i=0; i< jPanelOpcionais.getComponentCount();i++){
            if(jPanelOpcionais.getComponent(i) instanceof JCheckBox){
                JCheckBox aux = (JCheckBox)jPanelOpcionais.getComponent(i);
                aux.setSelected(false);
            }
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
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelRestante;
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
