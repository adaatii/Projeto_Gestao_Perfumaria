/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import dao.ItemVendaDao;
import dao.VendasDao;
import java.awt.event.KeyEvent;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ItemVenda;
import model.Vendas;

/**
 *
 * @author adaatii
 */
public class FormHistorico extends javax.swing.JFrame {

    /**
     * Creates new form FormHistorico
     */
    public FormHistorico() {
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
        jLabel1 = new javax.swing.JLabel();
        btnRetornar1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtDataInicial = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        txtDataFinal = new javax.swing.JFormattedTextField();
        btnPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaHistorico = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Histórico de Vendas");

        jPanel1.setBackground(new java.awt.Color(14, 89, 235));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Histórico de Vendas");

        btnRetornar1.setBackground(new java.awt.Color(14, 89, 235));
        btnRetornar1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnRetornar1.setForeground(new java.awt.Color(255, 255, 255));
        btnRetornar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Voltar(small).png"))); // NOI18N
        btnRetornar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetornar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(btnRetornar1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addContainerGap(696, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnRetornar1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Consulta por Data"));

        jLabel9.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel9.setText("Data Inicial:");

        try {
            txtDataInicial.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataInicial.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDataInicial.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtDataInicial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDataInicialKeyPressed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel10.setText("Data Final:");

        try {
            txtDataFinal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataFinal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDataFinal.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtDataFinal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDataFinalKeyPressed(evt);
            }
        });

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(368, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtDataFinal, txtDataInicial});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(txtDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnPesquisar))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(txtDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        tabelaHistorico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Data da Venda", "Cliente", "CPF", "Total", "Observações"
            }
        ));
        tabelaHistorico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaHistoricoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaHistorico);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 26, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        //Botão buscar venda por periodo
        //Receber as datas
        try {
            DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            LocalDate data_inicial = LocalDate.parse(txtDataInicial.getText(), formatar);
            LocalDate data_final = LocalDate.parse(txtDataFinal.getText(), formatar);

            //System.out.println(data_inicial.compareTo(data_final));
            if (data_inicial.compareTo(data_final) <= 0){
                VendasDao dao = new VendasDao();
                List<Vendas> lista = dao.listarVendasPeriodo(data_inicial, data_final);

                DefaultTableModel dados = (DefaultTableModel) tabelaHistorico.getModel();
                dados.setNumRows(0);

                for (Vendas v : lista) {
                    dados.addRow(new Object[]{
                        v.getId(),
                        v.getData_venda(),
                        v.getCliente().getNome(),
                        v.getCliente().getCpf(),
                        v.getTotal_venda(),
                        v.getObs()

                    });
                }

            } else {
                JOptionPane.showMessageDialog(null, "A data final deve ser maior que a data inicial!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Digite a data inicial e final");
        }


    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void tabelaHistoricoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaHistoricoMouseClicked
        //Clicar em uma venda:

        FormDetalhesVenda tela = new FormDetalhesVenda();

        tela.txtCliente.setText(tabelaHistorico.getValueAt(tabelaHistorico.getSelectedRow(), 2).toString());
        tela.txtTotalVenda.setText("R$ " + tabelaHistorico.getValueAt(tabelaHistorico.getSelectedRow(), 4).toString());
        tela.txtData.setText(tabelaHistorico.getValueAt(tabelaHistorico.getSelectedRow(), 1).toString());
        tela.txtObs.setText(tabelaHistorico.getValueAt(tabelaHistorico.getSelectedRow(), 5).toString());
        tela.txtCpf.setText(tabelaHistorico.getValueAt(tabelaHistorico.getSelectedRow(), 3).toString());

        int id_venda = Integer.parseInt(tabelaHistorico.getValueAt(tabelaHistorico.getSelectedRow(), 0).toString());
        //Dados Itens Comprados

        ItemVenda item = new ItemVenda();
        ItemVendaDao dao_itens = new ItemVendaDao();
        List<ItemVenda> litens = dao_itens.listarItensVenda(id_venda);

        DefaultTableModel dado = (DefaultTableModel) tela.tabelaVendidos.getModel();
        dado.setNumRows(0);

        for (ItemVenda cont : litens) {
            dado.addRow(new Object[]{
                cont.getProduto().getDescricao(),
                cont.getQtd(),
                cont.getProduto().getPreco(),
                cont.getSubtotal()

            });
        }

        tela.setVisible(true);
    }//GEN-LAST:event_tabelaHistoricoMouseClicked

    private void btnRetornar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetornar1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnRetornar1ActionPerformed

    private void txtDataFinalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDataFinalKeyPressed
        //Botão buscar venda por periodo
        //Receber as datas
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy");

                LocalDate data_inicial = LocalDate.parse(txtDataInicial.getText(), formatar);
                LocalDate data_final = LocalDate.parse(txtDataFinal.getText(), formatar);

                //System.out.println(data_inicial.compareTo(data_final));
                if (data_inicial.compareTo(data_final) <= 0){
                    VendasDao dao = new VendasDao();
                    List<Vendas> lista = dao.listarVendasPeriodo(data_inicial, data_final);

                    DefaultTableModel dados = (DefaultTableModel) tabelaHistorico.getModel();
                    dados.setNumRows(0);

                    for (Vendas v : lista) {
                        dados.addRow(new Object[]{
                            v.getId(),
                            v.getData_venda(),
                            v.getCliente().getNome(),
                            v.getCliente().getCpf(),
                            v.getTotal_venda(),
                            v.getObs()

                        });
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "A data final deve ser maior que a data inicial!");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Digite a data inicial e final");
            }
        }
    }//GEN-LAST:event_txtDataFinalKeyPressed

    private void txtDataInicialKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDataInicialKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtDataFinal.requestFocus();
        }
    }//GEN-LAST:event_txtDataInicialKeyPressed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnRetornar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaHistorico;
    private javax.swing.JFormattedTextField txtDataFinal;
    private javax.swing.JFormattedTextField txtDataInicial;
    // End of variables declaration//GEN-END:variables
}
