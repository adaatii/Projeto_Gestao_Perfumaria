/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.JOptionPane;

/**
 *
 * @author adaatii
 */
public class FormMenu extends javax.swing.JFrame {

    public String usuarioLogado;
    
    public FormMenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu7 = new javax.swing.JMenu();
        mnCliente = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        mnFuncionario = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        mnFornecedor = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnEstoque = new javax.swing.JMenuItem();
        mnProduto = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnVenda = new javax.swing.JMenuItem();
        mnPosicaoDia = new javax.swing.JMenuItem();
        mnHistoricoVenda = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        menuTrocarUsuario = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        lblUsuario.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(0, 0, 204));
        lblUsuario.setText("Usuario");

        jLabel2.setText("Usuário Logado:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(924, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblUsuario)
                .addGap(51, 51, 51))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuario)
                    .addComponent(jLabel2))
                .addContainerGap())
        );

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/customer(small).png"))); // NOI18N
        jMenu7.setText("Clientes");

        mnCliente.setText("Controle de Clientes");
        mnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnClienteActionPerformed(evt);
            }
        });
        jMenu7.add(mnCliente);

        jMenuBar2.add(jMenu7);

        jMenu9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/employee(small).png"))); // NOI18N
        jMenu9.setText("Funcionários");

        mnFuncionario.setText("Controle de Funcionários");
        jMenu9.add(mnFuncionario);

        jMenuBar2.add(jMenu9);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/supplier(small).png"))); // NOI18N
        jMenu1.setText("Fornecedores");

        mnFornecedor.setText("Controle de Fornecedores");
        jMenu1.add(mnFornecedor);

        jMenuBar2.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/boxes(small).png"))); // NOI18N
        jMenu2.setText("Produtos");

        mnEstoque.setText("Controle de Estoque");
        jMenu2.add(mnEstoque);

        mnProduto.setText("Consulta de Produtos");
        jMenu2.add(mnProduto);

        jMenuBar2.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/trade(small).png"))); // NOI18N
        jMenu3.setText("Vendas");

        mnVenda.setText("Abrir Ponto de Venda");
        jMenu3.add(mnVenda);

        mnPosicaoDia.setText("Posição do Dia");
        jMenu3.add(mnPosicaoDia);

        mnHistoricoVenda.setText("Histórico de Vendas");
        jMenu3.add(mnHistoricoVenda);

        jMenuBar2.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/settings(small).png"))); // NOI18N
        jMenu4.setText("Configurações");

        menuTrocarUsuario.setText("Trocar de Usuário");
        menuTrocarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTrocarUsuarioActionPerformed(evt);
            }
        });
        jMenu4.add(menuTrocarUsuario);

        jMenuBar2.add(jMenu4);

        menuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logout(small).png"))); // NOI18N
        menuSair.setText("Sair");
        menuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuSairMousePressed(evt);
            }
        });
        menuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSairActionPerformed(evt);
            }
        });
        jMenuBar2.add(menuSair);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 303, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
       //Deixar a tela maximizada
//       this.setExtendedState(this.MAXIMIZED_BOTH);
//       this.setVisible(true);
        lblUsuario.setText(usuarioLogado);
    }//GEN-LAST:event_formWindowActivated

    private void menuTrocarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTrocarUsuarioActionPerformed
       FormLogin login = new FormLogin();
       this.dispose();
       login.setVisible(true);
              
    }//GEN-LAST:event_menuTrocarUsuarioActionPerformed

    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairActionPerformed
    }//GEN-LAST:event_menuSairActionPerformed

    private void menuSairMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSairMousePressed
        // TODO add your handling code here:
        int op;
        Object[] options = { "Cancelar", "Confirmar" };
        op = JOptionPane.showOptionDialog(null, "Clique Confirmar para Sair", "Informação", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[1]);
        if(op == 1){

            System.exit(0);
        }
    }//GEN-LAST:event_menuSairMousePressed

    private void mnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnClienteActionPerformed
        // TODO add your handling code here:
        FormClientes tela = new FormClientes();
        tela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mnClienteActionPerformed

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JMenu menuSair;
    private javax.swing.JMenuItem menuTrocarUsuario;
    private javax.swing.JMenuItem mnCliente;
    private javax.swing.JMenuItem mnEstoque;
    private javax.swing.JMenuItem mnFornecedor;
    private javax.swing.JMenuItem mnFuncionario;
    public javax.swing.JMenuItem mnHistoricoVenda;
    public javax.swing.JMenuItem mnPosicaoDia;
    private javax.swing.JMenuItem mnProduto;
    private javax.swing.JMenuItem mnVenda;
    // End of variables declaration//GEN-END:variables
}
