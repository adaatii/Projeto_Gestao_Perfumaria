/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import dao.ClientesDao;
import dao.ProdutosDao;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Clientes;
import model.Produtos;
import model.Utilitarios;

/**
 *
 * @author adaatii
 */
public class FormVendas extends javax.swing.JFrame {

    Clientes obj = new Clientes();
    double total, preco, subtotal, rem;
    int qtd;

    DefaultTableModel carrinho;

    public FormVendas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnRetornar1 = new javax.swing.JButton();
        btnPagamento = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        painelDadosCLiente = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtDataAtual = new javax.swing.JTextField();
        txtCpf = new javax.swing.JFormattedTextField();
        btnBuscarCliente = new javax.swing.JButton();
        btnLimparCliente = new javax.swing.JButton();
        painelDadosProdutos = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtCodigoProduto = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtQtd = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnBuscarProduto = new javax.swing.JButton();
        btnAdicionarItem = new javax.swing.JButton();
        btnLimparProduto = new javax.swing.JButton();
        txtPreco = new javax.swing.JTextField();
        painelCarrinho = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaItens = new javax.swing.JTable();
        btnExcluir = new javax.swing.JButton();
        txtValorExcluido = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Vendas");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(14, 89, 235));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Vendas");

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
                .addContainerGap(1162, Short.MAX_VALUE))
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

        btnPagamento.setBackground(new java.awt.Color(14, 89, 235));
        btnPagamento.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnPagamento.setForeground(new java.awt.Color(255, 255, 255));
        btnPagamento.setText("PAGAMENTO");
        btnPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagamentoActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(14, 89, 235));
        btnCancelar.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("CANCELAR VENDA");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        painelDadosCLiente.setBackground(new java.awt.Color(255, 255, 255));
        painelDadosCLiente.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Cliente"));

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel5.setText("Nome:");

        txtNome.setEditable(false);
        txtNome.setBackground(new java.awt.Color(204, 204, 204));
        txtNome.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel6.setText("CPF:");

        jLabel7.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel7.setText("Data:");

        txtDataAtual.setEditable(false);
        txtDataAtual.setBackground(new java.awt.Color(204, 204, 204));
        txtDataAtual.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpf.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtCpf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCpfKeyPressed(evt);
            }
        });

        btnBuscarCliente.setText("Pesquisar");
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });

        btnLimparCliente.setText("Limpar");
        btnLimparCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelDadosCLienteLayout = new javax.swing.GroupLayout(painelDadosCLiente);
        painelDadosCLiente.setLayout(painelDadosCLienteLayout);
        painelDadosCLienteLayout.setHorizontalGroup(
            painelDadosCLienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosCLienteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelDadosCLienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelDadosCLienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDadosCLienteLayout.createSequentialGroup()
                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelDadosCLienteLayout.createSequentialGroup()
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelDadosCLienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDataAtual, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimparCliente, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(70, 70, 70))
        );

        painelDadosCLienteLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnBuscarCliente, btnLimparCliente});

        painelDadosCLienteLayout.setVerticalGroup(
            painelDadosCLienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosCLienteLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(painelDadosCLienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDadosCLienteLayout.createSequentialGroup()
                        .addComponent(btnLimparCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDataAtual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelDadosCLienteLayout.createSequentialGroup()
                        .addGroup(painelDadosCLienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBuscarCliente)
                            .addGroup(painelDadosCLienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painelDadosCLienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(painelDadosCLienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5)))))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        painelDadosCLienteLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnBuscarCliente, btnLimparCliente});

        painelDadosProdutos.setBackground(new java.awt.Color(255, 255, 255));
        painelDadosProdutos.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Produto"));

        jLabel8.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel8.setText("Código:");

        txtCodigoProduto.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtCodigoProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigoProdutoKeyPressed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel9.setText("Produto:");

        txtDescricao.setEditable(false);
        txtDescricao.setBackground(new java.awt.Color(204, 204, 204));
        txtDescricao.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel10.setText("Qtd:");

        txtQtd.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel11.setText("Preço:");

        btnBuscarProduto.setText("Pesquisar");
        btnBuscarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProdutoActionPerformed(evt);
            }
        });

        btnAdicionarItem.setBackground(new java.awt.Color(14, 89, 235));
        btnAdicionarItem.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        btnAdicionarItem.setForeground(new java.awt.Color(255, 255, 255));
        btnAdicionarItem.setText("Adicionar Item");
        btnAdicionarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarItemActionPerformed(evt);
            }
        });

        btnLimparProduto.setText("Limpar");
        btnLimparProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparProdutoActionPerformed(evt);
            }
        });

        txtPreco.setEditable(false);
        txtPreco.setBackground(new java.awt.Color(204, 204, 204));
        txtPreco.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        javax.swing.GroupLayout painelDadosProdutosLayout = new javax.swing.GroupLayout(painelDadosProdutos);
        painelDadosProdutos.setLayout(painelDadosProdutosLayout);
        painelDadosProdutosLayout.setHorizontalGroup(
            painelDadosProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosProdutosLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(painelDadosProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelDadosProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(painelDadosProdutosLayout.createSequentialGroup()
                        .addComponent(txtCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(btnBuscarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnLimparProduto))
                    .addComponent(txtDescricao)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelDadosProdutosLayout.createSequentialGroup()
                        .addGroup(painelDadosProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAdicionarItem)
                            .addGroup(painelDadosProdutosLayout.createSequentialGroup()
                                .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelDadosProdutosLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnBuscarProduto, btnLimparProduto});

        painelDadosProdutosLayout.setVerticalGroup(
            painelDadosProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosProdutosLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(painelDadosProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarProduto)
                    .addComponent(btnLimparProduto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelDadosProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelDadosProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10)
                    .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAdicionarItem, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        painelDadosProdutosLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnBuscarProduto, btnLimparProduto});

        painelCarrinho.setBackground(new java.awt.Color(255, 255, 255));
        painelCarrinho.setBorder(javax.swing.BorderFactory.createTitledBorder("Carrinho de Compras"));

        tabelaItens.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Produto", "Qtd", "Preço", "Subtotal"
            }
        ));
        tabelaItens.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaItensMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaItens);

        btnExcluir.setBackground(new java.awt.Color(14, 89, 235));
        btnExcluir.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluir.setText("Excluir Item");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        txtValorExcluido.setEditable(false);

        javax.swing.GroupLayout painelCarrinhoLayout = new javax.swing.GroupLayout(painelCarrinho);
        painelCarrinho.setLayout(painelCarrinhoLayout);
        painelCarrinhoLayout.setHorizontalGroup(
            painelCarrinhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCarrinhoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCarrinhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCarrinhoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(268, 268, 268)
                        .addComponent(txtValorExcluido, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 704, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelCarrinhoLayout.setVerticalGroup(
            painelCarrinhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCarrinhoLayout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelCarrinhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtValorExcluido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCarrinhoLayout.createSequentialGroup()
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        txtValorExcluido.setVisible(false);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Total da Venda"));

        jLabel12.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        jLabel12.setText("Valor Total:");

        txtTotal.setEditable(false);
        txtTotal.setBackground(new java.awt.Color(204, 204, 204));
        txtTotal.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(144, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(painelDadosCLiente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelDadosProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(painelCarrinho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(btnPagamento)
                        .addGap(71, 71, 71)
                        .addComponent(btnCancelar)))
                .addGap(13, 13, 13))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCancelar, btnPagamento});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(painelDadosCLiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(painelDadosProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(painelCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCancelar, btnPagamento});

        pack();
        setLocationRelativeTo(null);
    }

    private void formWindowActivated(java.awt.event.WindowEvent evt) {
        //Carrega a data atual do Sistema

        Date data = new Date();
        SimpleDateFormat dataBrasil = new SimpleDateFormat("dd/MM/yyyy");
        String dataformat = dataBrasil.format(data);
        txtDataAtual.setText(dataformat);
    }

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {
        // Botão Cancelar Venda
        this.dispose();
    }

    private void btnPagamentoActionPerformed(java.awt.event.ActionEvent evt) {
        //Botão Pagamento

        if (txtCpf.getText().equals("   .   .   -  ")) {
            JOptionPane.showMessageDialog(null, "Preencham o CPF para realiza a venda.");
            txtCpf.requestFocus();
        } else {
            if (txtTotal.getText().equals("") || txtTotal.getText().equals("R$ 0.0")) {
                JOptionPane.showMessageDialog(null, "Adicione produtos ao carrinho");
                txtCodigoProduto.requestFocus();
            } else {
                FormPagamentos telap = new FormPagamentos();
                telap.txtTotal.setText(String.valueOf(total));
                telap.cliente = obj; // ID do cliente
                telap.carrinho = carrinho;
                telap.setVisible(true);
                this.dispose();
            }
        }
    }

    private void txtCpfKeyPressed(java.awt.event.KeyEvent evt) {
        //busca CLiente por CPF
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            ClientesDao dao = new ClientesDao();

            obj = dao.buscaClienteCpf(txtCpf.getText());
            if (obj.getNome() == null) {
                JOptionPane.showMessageDialog(null, "CPF não encontrado");
            } else {
                txtNome.setText(obj.getNome());
                txtCodigoProduto.requestFocus();
            }
        }
    }

    private void txtCodigoProdutoKeyPressed(java.awt.event.KeyEvent evt) {
        //Busca Produto por código.
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Produtos obj = new Produtos();
            ProdutosDao dao = new ProdutosDao();

            obj = dao.buscaProdutosCodigo(Integer.parseInt(txtCodigoProduto.getText()));

            txtDescricao.setText(obj.getDescricao());
            txtPreco.setText(String.valueOf(obj.getPreco()));
        }
    }

    private void btnBuscarProdutoActionPerformed(java.awt.event.ActionEvent evt) {
        //Busca Produto por código.
        Produtos obj = new Produtos();
        ProdutosDao dao = new ProdutosDao();

        obj = dao.buscaProdutosCodigo(Integer.parseInt(txtCodigoProduto.getText()));

        txtDescricao.setText(obj.getDescricao());
        txtPreco.setText(String.valueOf(obj.getPreco()));
    }

    private void btnLimparClienteActionPerformed(java.awt.event.ActionEvent evt) {
        txtCpf.setText("");
        txtNome.setText("");
    }

    private void btnLimparProdutoActionPerformed(java.awt.event.ActionEvent evt) {
        new Utilitarios().LimparTela(painelDadosProdutos);
    }

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {
        //busca CLiente por CPF:

        ClientesDao dao = new ClientesDao();

        obj = dao.buscaClienteCpf(txtCpf.getText());
        if (obj.getNome() == null) {
            JOptionPane.showMessageDialog(null, "CPF não encontrado");
        } else {
            txtNome.setText(obj.getNome());
            txtCodigoProduto.requestFocus();
        }
    }

    private void btnAdicionarItemActionPerformed(java.awt.event.ActionEvent evt) {
        // Adicionar item:
        Produtos obj = new Produtos();
        ProdutosDao dao = new ProdutosDao();

        obj = dao.buscaProdutosCodigo(Integer.parseInt(txtCodigoProduto.getText()));

        qtd = Integer.parseInt(txtQtd.getText());
        if (qtd > 0) {
            if (obj.getQtd_estoque() > 0 && obj.getQtd_estoque() >= qtd) {
                preco = Double.parseDouble(txtPreco.getText());

                subtotal = qtd * preco;

                total += subtotal;
                txtTotal.setText("R$ " + String.valueOf(total));

                //Adicionar o produto no carrinho
                carrinho = (DefaultTableModel) tabelaItens.getModel();

                carrinho.addRow(new Object[]{
                    txtCodigoProduto.getText(),
                    txtDescricao.getText(),
                    txtQtd.getText(),
                    txtPreco.getText(),
                    subtotal

                });

                new Utilitarios().LimparTela(painelDadosProdutos);
            } else {
                JOptionPane.showMessageDialog(null, "Quantidade maior que disponivel no estoque. O estoque é: " + obj.getQtd_estoque());
                txtQtd.setText("");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Quantidade deve ser maior que 0 ");
                txtQtd.setText("");
        }
    }

    private void tabelaItensMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:

        txtValorExcluido.setText(tabelaItens.getValueAt(tabelaItens.getSelectedRow(), 4).toString());

    }

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        carrinho = (DefaultTableModel) tabelaItens.getModel();

        carrinho.removeRow(tabelaItens.getSelectedRow());
        tabelaItens.setModel(carrinho);

        rem = Double.parseDouble(txtValorExcluido.getText());

        total = total - rem;
        txtTotal.setText("R$ " + String.valueOf(total));
        txtValorExcluido.setText("");
    }

    private void btnRetornar1ActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarItem;
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnBuscarProduto;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimparCliente;
    private javax.swing.JButton btnLimparProduto;
    private javax.swing.JButton btnPagamento;
    private javax.swing.JButton btnRetornar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel painelCarrinho;
    private javax.swing.JPanel painelDadosCLiente;
    private javax.swing.JPanel painelDadosProdutos;
    private javax.swing.JTable tabelaItens;
    private javax.swing.JTextField txtCodigoProduto;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JTextField txtDataAtual;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtQtd;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtValorExcluido;
}
