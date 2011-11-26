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

        jMenuBar1 = new javax.swing.JMenuBar();
        cadastro = new javax.swing.JMenu();
        jMenuClientes = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cadastro.setText("Cadastro");

        jMenuClientes.setText("Clientes");
        jMenuClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuClientesActionPerformed(evt);
            }
        });
        cadastro.add(jMenuClientes);

        jMenuItem2.setText("Veículo");
        cadastro.add(jMenuItem2);

        jMenuItem3.setText("Motorista");
        cadastro.add(jMenuItem3);

        jMenuItem4.setText("Tipo de veículo");
        cadastro.add(jMenuItem4);

        jMenuItem5.setText("Marca de veículo");
        cadastro.add(jMenuItem5);

        jMenuItem6.setText("Modelo de veículo");
        cadastro.add(jMenuItem6);

        jMenuItem7.setText("Tipo de locação");
        cadastro.add(jMenuItem7);

        jMenuBar1.add(cadastro);

        jMenu2.setText("Locação");

        jMenuItem8.setText("Cadastrar");
        jMenu2.add(jMenuItem8);

        jMenuItem9.setText("Alterar");
        jMenu2.add(jMenuItem9);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Relatórios");

        jMenuItem10.setText("Locações em aberto");
        jMenu3.add(jMenuItem10);

        jMenuItem11.setText("Locações finalizadas");
        jMenu3.add(jMenuItem11);

        jMenuItem12.setText("Veículos disponiveis");
        jMenu3.add(jMenuItem12);

        jMenuItem13.setText("Veículos mais procurados");
        jMenu3.add(jMenuItem13);

        jMenuItem14.setText("Veículos mais rentáveis");
        jMenu3.add(jMenuItem14);

        jMenuItem15.setText("Busca de clientes por nome");
        jMenu3.add(jMenuItem15);

        jMenuItem16.setText("Disponibilidade por tipo de veículo");
        jMenu3.add(jMenuItem16);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 579, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuClientesActionPerformed
        VisaoCadastroCliente visao = new VisaoCadastroCliente();
        visao.setVisible(true);
    }//GEN-LAST:event_jMenuClientesActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new VisaoMenu().setVisible(true);
              
            }
        });
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu cadastro;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuClientes;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration//GEN-END:variables
}
