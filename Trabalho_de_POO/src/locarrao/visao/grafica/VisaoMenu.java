package locarrao.visao.grafica;

import modelo.dominio.Funcionarios;

public class VisaoMenu extends javax.swing.JFrame {
    
    public static Funcionarios funcionario;
    
    
    public VisaoMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        cadastro = new javax.swing.JMenu();
        jMenuClientes = new javax.swing.JMenuItem();
        cadastroVeiculo = new javax.swing.JMenuItem();
        cadastroMotorista = new javax.swing.JMenuItem();
        tipoVeiculo = new javax.swing.JMenuItem();
        marcaVeiculo = new javax.swing.JMenuItem();
        modeloVeiculo = new javax.swing.JMenuItem();
        tipoLocacao = new javax.swing.JMenuItem();
        locacao = new javax.swing.JMenu();
        cadastroLocacao = new javax.swing.JMenuItem();
        finalizaLocacao = new javax.swing.JMenuItem();
        relatorios = new javax.swing.JMenu();
        locacoesAberto = new javax.swing.JMenuItem();
        locacaoFinalizadas = new javax.swing.JMenuItem();
        veiculosDisponiveis = new javax.swing.JMenuItem();
        veiculosMaisProcurados = new javax.swing.JMenuItem();
        veiculosMaisRentaveis = new javax.swing.JMenuItem();
        buscaClientePorNome = new javax.swing.JMenuItem();
        disponibilidadePorTipoDeVeiculo = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("OCR A Extended", 0, 48));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LOCARRÃO RENT A CAR");

        cadastro.setText("Cadastro");

        jMenuClientes.setText("Clientes");
        jMenuClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuClientesActionPerformed(evt);
            }
        });
        cadastro.add(jMenuClientes);

        cadastroVeiculo.setText("Veículo");
        cadastroVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroVeiculoActionPerformed(evt);
            }
        });
        cadastro.add(cadastroVeiculo);

        cadastroMotorista.setText("Motorista");
        cadastroMotorista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroMotoristaActionPerformed(evt);
            }
        });
        cadastro.add(cadastroMotorista);

        tipoVeiculo.setText("Tipo de veículo");
        tipoVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoVeiculoActionPerformed(evt);
            }
        });
        cadastro.add(tipoVeiculo);

        marcaVeiculo.setText("Marca de veículo");
        marcaVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marcaVeiculoActionPerformed(evt);
            }
        });
        cadastro.add(marcaVeiculo);

        modeloVeiculo.setText("Modelo de veículo");
        modeloVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modeloVeiculoActionPerformed(evt);
            }
        });
        cadastro.add(modeloVeiculo);

        tipoLocacao.setText("Tipo de locação");
        tipoLocacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoLocacaoActionPerformed(evt);
            }
        });
        cadastro.add(tipoLocacao);

        jMenuBar1.add(cadastro);

        locacao.setText("Locação");

        cadastroLocacao.setText("Cadastrar");
        cadastroLocacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroLocacaoActionPerformed(evt);
            }
        });
        locacao.add(cadastroLocacao);

        finalizaLocacao.setText("Finalizar");
        finalizaLocacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalizaLocacaoActionPerformed(evt);
            }
        });
        locacao.add(finalizaLocacao);

        jMenuBar1.add(locacao);

        relatorios.setText("Relatórios");
        relatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relatoriosActionPerformed(evt);
            }
        });

        locacoesAberto.setText("Locações em aberto");
        locacoesAberto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locacoesAbertoActionPerformed(evt);
            }
        });
        relatorios.add(locacoesAberto);

        locacaoFinalizadas.setText("Locações finalizadas");
        locacaoFinalizadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locacaoFinalizadasActionPerformed(evt);
            }
        });
        relatorios.add(locacaoFinalizadas);

        veiculosDisponiveis.setText("Veículos disponiveis");
        veiculosDisponiveis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                veiculosDisponiveisActionPerformed(evt);
            }
        });
        relatorios.add(veiculosDisponiveis);

        veiculosMaisProcurados.setText("Veículos mais procurados");
        veiculosMaisProcurados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                veiculosMaisProcuradosActionPerformed(evt);
            }
        });
        relatorios.add(veiculosMaisProcurados);

        veiculosMaisRentaveis.setText("Veículos mais rentáveis");
        veiculosMaisRentaveis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                veiculosMaisRentaveisActionPerformed(evt);
            }
        });
        relatorios.add(veiculosMaisRentaveis);

        buscaClientePorNome.setText("Busca de clientes por nome");
        buscaClientePorNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscaClientePorNomeActionPerformed(evt);
            }
        });
        relatorios.add(buscaClientePorNome);

        disponibilidadePorTipoDeVeiculo.setText("Disponibilidade por tipo de veículo");
        disponibilidadePorTipoDeVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disponibilidadePorTipoDeVeiculoActionPerformed(evt);
            }
        });
        relatorios.add(disponibilidadePorTipoDeVeiculo);

        jMenuBar1.add(relatorios);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(124, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(238, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuClientesActionPerformed
        VisaoCadastroCliente visao = new VisaoCadastroCliente();
        visao.setVisible(true);
    }//GEN-LAST:event_jMenuClientesActionPerformed

    private void cadastroVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroVeiculoActionPerformed
        VisaoCadastroVeiculo visao = new VisaoCadastroVeiculo();
        visao.setVisible(true);
    }//GEN-LAST:event_cadastroVeiculoActionPerformed

    private void cadastroMotoristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroMotoristaActionPerformed
        VisaoCadastroMotorista visao = new VisaoCadastroMotorista();
        visao.setVisible(true);
    }//GEN-LAST:event_cadastroMotoristaActionPerformed

    private void tipoVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoVeiculoActionPerformed
        VisaoCadastroTipoVeiculo visao = new VisaoCadastroTipoVeiculo();
        visao.setVisible(true);
    }//GEN-LAST:event_tipoVeiculoActionPerformed

    private void marcaVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marcaVeiculoActionPerformed
        VisaoCadastroMarcaVeiculo visao = new VisaoCadastroMarcaVeiculo();
        visao.setVisible(true);
    }//GEN-LAST:event_marcaVeiculoActionPerformed

    private void modeloVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modeloVeiculoActionPerformed
        VisaoCadastroModeloVeiculo visao = new VisaoCadastroModeloVeiculo();
        visao.setVisible(true);
    }//GEN-LAST:event_modeloVeiculoActionPerformed

    private void tipoLocacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoLocacaoActionPerformed
        VisaoCadastroTipoLocacao visao = new VisaoCadastroTipoLocacao();
        visao.setVisible(true);
    }//GEN-LAST:event_tipoLocacaoActionPerformed

    private void cadastroLocacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroLocacaoActionPerformed
        VisaoCadastroLocacao visao = new VisaoCadastroLocacao();
        visao.setVisible(true);
    }//GEN-LAST:event_cadastroLocacaoActionPerformed

    private void finalizaLocacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalizaLocacaoActionPerformed
        VisaoFechamentoLocacao visao = new VisaoFechamentoLocacao();
        visao.setVisible(true);
    }//GEN-LAST:event_finalizaLocacaoActionPerformed

    private void relatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relatoriosActionPerformed
        
    }//GEN-LAST:event_relatoriosActionPerformed

    private void locacaoFinalizadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locacaoFinalizadasActionPerformed
       VisaoRelatorioLocacaoesFinalizadas visao = new VisaoRelatorioLocacaoesFinalizadas();
       visao.setVisible(true);
    }//GEN-LAST:event_locacaoFinalizadasActionPerformed

    private void locacoesAbertoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locacoesAbertoActionPerformed
        VisaoRelatorioLocacaoesAbertas visao = new VisaoRelatorioLocacaoesAbertas();
        visao.setVisible(true);
    }//GEN-LAST:event_locacoesAbertoActionPerformed

    private void veiculosDisponiveisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_veiculosDisponiveisActionPerformed
        VisaoRelatorioVeiculosDisponiveis visao = new VisaoRelatorioVeiculosDisponiveis();
        visao.setVisible(true);
    }//GEN-LAST:event_veiculosDisponiveisActionPerformed

    private void veiculosMaisProcuradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_veiculosMaisProcuradosActionPerformed
        VisaoRelatorioVeiculosMaisLocados visao = new VisaoRelatorioVeiculosMaisLocados();
        visao.setVisible(true);
    }//GEN-LAST:event_veiculosMaisProcuradosActionPerformed

    private void veiculosMaisRentaveisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_veiculosMaisRentaveisActionPerformed
       VisaoRelatorioVeiculosMaisRentaveis visao = new VisaoRelatorioVeiculosMaisRentaveis();
       visao.setVisible(true);
    }//GEN-LAST:event_veiculosMaisRentaveisActionPerformed

    private void buscaClientePorNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscaClientePorNomeActionPerformed
       VisaoRelatorioBuscarClientePorNome visao = new VisaoRelatorioBuscarClientePorNome();
       visao.setVisible(true);
    }//GEN-LAST:event_buscaClientePorNomeActionPerformed

    private void disponibilidadePorTipoDeVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disponibilidadePorTipoDeVeiculoActionPerformed
       VisaoRalatorioDisponibilidadePorTipo visao = new VisaoRalatorioDisponibilidadePorTipo();
       visao.setVisible(true);
    }//GEN-LAST:event_disponibilidadePorTipoDeVeiculoActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new VisaoMenu().setVisible(true);
              
            }
        });
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem buscaClientePorNome;
    private javax.swing.JMenu cadastro;
    private javax.swing.JMenuItem cadastroLocacao;
    private javax.swing.JMenuItem cadastroMotorista;
    private javax.swing.JMenuItem cadastroVeiculo;
    private javax.swing.JMenuItem disponibilidadePorTipoDeVeiculo;
    private javax.swing.JMenuItem finalizaLocacao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuClientes;
    private javax.swing.JMenu locacao;
    private javax.swing.JMenuItem locacaoFinalizadas;
    private javax.swing.JMenuItem locacoesAberto;
    private javax.swing.JMenuItem marcaVeiculo;
    private javax.swing.JMenuItem modeloVeiculo;
    private javax.swing.JMenu relatorios;
    private javax.swing.JMenuItem tipoLocacao;
    private javax.swing.JMenuItem tipoVeiculo;
    private javax.swing.JMenuItem veiculosDisponiveis;
    private javax.swing.JMenuItem veiculosMaisProcurados;
    private javax.swing.JMenuItem veiculosMaisRentaveis;
    // End of variables declaration//GEN-END:variables
}