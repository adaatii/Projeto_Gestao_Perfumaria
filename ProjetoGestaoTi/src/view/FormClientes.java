/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import br.com.parg.viacep.ViaCEP;
import br.com.parg.viacep.ViaCEPException;
import dao.ClientesDao;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import jdbc.TestaConexao;
import model.Clientes;
import model.Utilitarios;

/**
 *
 * @author adaatii
 */
public class FormClientes extends javax.swing.JFrame {

	public void listar() {

		ClientesDao dao = new ClientesDao();
		List<Clientes> lista = dao.listarCliente();
		DefaultTableModel dado = (DefaultTableModel) tabelaCliente.getModel();
		dado.setNumRows(0);

		for (Clientes cont : lista) {
			dado.addRow(new Object[] { cont.getId(), cont.getNome(), cont.getRg(), cont.getCpf(), cont.getTelefone(),
					cont.getCelular(), cont.getEmail(), cont.getCep(), cont.getEndereco(), cont.getNumero(),
					cont.getBairro(), cont.getCidade(), cont.getComplemento(), cont.getUf() });
		}
	}

	public FormClientes() {
		initComponents();
	}
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnRetornar = new javax.swing.JButton();
        painelCadastro = new javax.swing.JTabbedPane();
        painelDadosCadastro = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCelular = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        txtCep = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtComplemento = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        cbUf = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        txtRg = new javax.swing.JFormattedTextField();
        txtCpf = new javax.swing.JFormattedTextField();
        jLabel17 = new javax.swing.JLabel();
        btnPesquisar = new javax.swing.JButton();
        painelDadosConsulta = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        txtPesquisa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaCliente = new javax.swing.JTable();
        btnSalvar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Clientes");
        setMaximumSize(new java.awt.Dimension(1215, 621));
        setPreferredSize(new java.awt.Dimension(1185, 593));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(14, 89, 235));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Clientes");

        btnRetornar.setBackground(new java.awt.Color(14, 89, 235));
        btnRetornar.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnRetornar.setForeground(new java.awt.Color(255, 255, 255));
        btnRetornar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Voltar(small).png"))); // NOI18N
        btnRetornar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetornarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(btnRetornar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(1036, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnRetornar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        painelCadastro.setBackground(new java.awt.Color(255, 255, 255));
        painelCadastro.setPreferredSize(new java.awt.Dimension(1209, 442));

        painelDadosCadastro.setBackground(new java.awt.Color(255, 255, 255));
        painelDadosCadastro.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        painelDadosCadastro.setPreferredSize(new java.awt.Dimension(1209, 616));

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel4.setText("Código:");

        txtCodigo.setEditable(false);
        txtCodigo.setBackground(new java.awt.Color(204, 204, 204));
        txtCodigo.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel5.setText("* Nome:");

        txtNome.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel6.setText("E-mail:");

        txtEmail.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel7.setText("Celular:");

        try {
            txtCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) # #### - ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCelular.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel8.setText("Telefone:");

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #### - ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefone.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel9.setText("* CEP:");

        try {
            txtCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##### - ###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCep.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtCep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCepKeyPressed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel10.setText("* Endereço:");

        txtEndereco.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel11.setText("* N°:");

        txtNumero.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel12.setText("* Bairro:");

        txtBairro.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        jLabel13.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel13.setText("* Cidade:");

        txtCidade.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        jLabel14.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel14.setText("Complemento:");

        txtComplemento.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        jLabel15.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel15.setText("UF:");

        cbUf.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        cbUf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "RO", "AC", "AM", "RR", "PA", "AP", "TO", "MA", "PI", "CE", "RN", "PB", "PE", "AL", "SE", "BA", "MG", "ES", "RJ", "SP", "PR", "SC", "RS", "MS ", "MT", "GO", "DF" }));

        jLabel16.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel16.setText("* RG:");

        try {
            txtRg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtRg.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpf.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        jLabel17.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel17.setText("* CPF:");

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelDadosCadastroLayout = new javax.swing.GroupLayout(painelDadosCadastro);
        painelDadosCadastro.setLayout(painelDadosCadastroLayout);
        painelDadosCadastroLayout.setHorizontalGroup(
            painelDadosCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosCadastroLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(painelDadosCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(10, 10, 10)
                .addGroup(painelDadosCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDadosCadastroLayout.createSequentialGroup()
                        .addGroup(painelDadosCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(painelDadosCadastroLayout.createSequentialGroup()
                                .addGroup(painelDadosCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(painelDadosCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(painelDadosCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(painelDadosCadastroLayout.createSequentialGroup()
                                        .addGroup(painelDadosCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(24, 24, 24)
                                        .addGroup(painelDadosCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(painelDadosCadastroLayout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(btnPesquisar)))
                                    .addGroup(painelDadosCadastroLayout.createSequentialGroup()
                                        .addGroup(painelDadosCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(painelDadosCadastroLayout.createSequentialGroup()
                                                .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel12))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelDadosCadastroLayout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jLabel15)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(painelDadosCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbUf, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(painelDadosCadastroLayout.createSequentialGroup()
                                .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(226, 226, 226)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(painelDadosCadastroLayout.createSequentialGroup()
                        .addGroup(painelDadosCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRg, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(painelDadosCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelDadosCadastroLayout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelDadosCadastroLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel14)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        painelDadosCadastroLayout.setVerticalGroup(
            painelDadosCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosCadastroLayout.createSequentialGroup()
                .addGroup(painelDadosCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDadosCadastroLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(painelDadosCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(painelDadosCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(painelDadosCadastroLayout.createSequentialGroup()
                                .addGroup(painelDadosCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(jLabel5)
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)
                                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)
                                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addGroup(painelDadosCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(jLabel6)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(painelDadosCadastroLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(painelDadosCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnPesquisar)
                                    .addComponent(jLabel9))
                                .addGap(3, 3, 3)))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(painelDadosCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel10)
                            .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(painelDadosCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel12)
                                .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11)))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(painelDadosCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(cbUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(jLabel16))
                    .addGroup(painelDadosCadastroLayout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addGroup(painelDadosCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)))
                    .addGroup(painelDadosCadastroLayout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addComponent(txtRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(91, 91, 91))
        );

        painelCadastro.addTab("Cadastro", painelDadosCadastro);

        painelDadosConsulta.setBackground(new java.awt.Color(255, 255, 255));

        jLabel18.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel18.setText("Nome:");

        txtPesquisa.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPesquisaKeyPressed(evt);
            }
        });

        tabelaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "RG", "CPF", "Telefone", "Celular", "E-mail", "CEP", "Endereço", "N°", "Bairro", "Cidade", "Comp", "UF"
            }
        ));
        tabelaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaCliente);

        javax.swing.GroupLayout painelDadosConsultaLayout = new javax.swing.GroupLayout(painelDadosConsulta);
        painelDadosConsulta.setLayout(painelDadosConsultaLayout);
        painelDadosConsultaLayout.setHorizontalGroup(
            painelDadosConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosConsultaLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(painelDadosConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelDadosConsultaLayout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelDadosConsultaLayout.setVerticalGroup(
            painelDadosConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosConsultaLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(painelDadosConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelCadastro.addTab("Consulta ", painelDadosConsulta);

        btnSalvar.setBackground(new java.awt.Color(14, 89, 235));
        btnSalvar.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar.setText("CADASTRAR");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(14, 89, 235));
        btnEditar.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("EDITAR");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnLimpar.setBackground(new java.awt.Color(14, 89, 235));
        btnLimpar.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnLimpar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpar.setText("LIMPAR");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnExcluir.setBackground(new java.awt.Color(14, 89, 235));
        btnExcluir.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluir.setText("EXCLUIR");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        jLabel2.setText("* Campos Obrigatórios");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(287, 287, 287)
                .addComponent(btnSalvar)
                .addGap(43, 43, 43)
                .addComponent(btnEditar)
                .addGap(43, 43, 43)
                .addComponent(btnLimpar)
                .addGap(44, 44, 44)
                .addComponent(btnExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(36, 36, 36))
            .addComponent(painelCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnEditar, btnExcluir, btnLimpar, btnSalvar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(painelCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSalvar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnLimpar)
                                .addComponent(btnExcluir)
                                .addComponent(btnEditar)))
                        .addContainerGap(21, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(17, 17, 17))))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnEditar, btnExcluir, btnLimpar, btnSalvar});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

	private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnSalvarActionPerformed
		/**
		 * Botão Salvar :
		 * 
		 */
		if (txtNome.getText().isEmpty() || txtEndereco.getText().isEmpty() || txtBairro.getText().isEmpty()
				|| txtCidade.getText().isEmpty() || txtNumero.getText().equals("")
				|| txtRg.getText().equals("  .   .   - ") || txtCpf.getText().equals("   .   .   -  ")
				|| txtCep.getText().equals("      -    ")) {
			JOptionPane.showMessageDialog(null, "Preencha os campos Obrigatórios");
		} else {

			Clientes obj = new Clientes();
			obj.setNome(txtNome.getText());
			obj.setRg(txtRg.getText());
			obj.setCpf(txtCpf.getText());
			obj.setEmail(txtEmail.getText());
			obj.setTelefone(txtTelefone.getText());
			obj.setCelular(txtCelular.getText());
			obj.setCep(txtCep.getText());
			obj.setEndereco(txtEndereco.getText());
			obj.setNumero(Integer.parseInt(txtNumero.getText()));
			obj.setComplemento(txtComplemento.getText());
			obj.setBairro(txtBairro.getText());
			obj.setCidade(txtCidade.getText());
			obj.setUf(cbUf.getSelectedItem().toString());

			if (obj.getEmail().equals("")) {
				obj.setEmail("Não informado");
			}

			ClientesDao dao = new ClientesDao();
			dao.cadastrarCliente(obj);
			new Utilitarios().LimparTela(painelDadosCadastro);

		}

	}// GEN-LAST:event_btnSalvarActionPerformed

	private void formWindowActivated(java.awt.event.WindowEvent evt) {// GEN-FIRST:event_formWindowActivated
		/**
		 * Carrega a lista
		 */
		listar();
	}// GEN-LAST:event_formWindowActivated

	private void tabelaClienteMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_tabelaClienteMouseClicked
		/**
		 * Pega os dados e envia para aba Cadastro
		 */
		painelCadastro.setSelectedIndex(0);
		txtCodigo.setText(tabelaCliente.getValueAt(tabelaCliente.getSelectedRow(), 0).toString());
		txtNome.setText(tabelaCliente.getValueAt(tabelaCliente.getSelectedRow(), 1).toString());
		txtRg.setText(tabelaCliente.getValueAt(tabelaCliente.getSelectedRow(), 2).toString());
		txtCpf.setText(tabelaCliente.getValueAt(tabelaCliente.getSelectedRow(), 3).toString());
		txtTelefone.setText(tabelaCliente.getValueAt(tabelaCliente.getSelectedRow(), 4).toString());
		txtCelular.setText(tabelaCliente.getValueAt(tabelaCliente.getSelectedRow(), 5).toString());
		txtEmail.setText(tabelaCliente.getValueAt(tabelaCliente.getSelectedRow(), 6).toString());
		txtCep.setText(tabelaCliente.getValueAt(tabelaCliente.getSelectedRow(), 7).toString());
		txtEndereco.setText(tabelaCliente.getValueAt(tabelaCliente.getSelectedRow(), 8).toString());
		txtNumero.setText(tabelaCliente.getValueAt(tabelaCliente.getSelectedRow(), 9).toString());
		txtBairro.setText(tabelaCliente.getValueAt(tabelaCliente.getSelectedRow(), 10).toString());
		txtCidade.setText(tabelaCliente.getValueAt(tabelaCliente.getSelectedRow(), 11).toString());
		txtComplemento.setText(tabelaCliente.getValueAt(tabelaCliente.getSelectedRow(), 12).toString());
		cbUf.setSelectedItem(tabelaCliente.getValueAt(tabelaCliente.getSelectedRow(), 13).toString());

	}// GEN-LAST:event_tabelaClienteMouseClicked

	private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnEditarActionPerformed
		/**
		 * Botão editar
		 */
		if (txtNumero.getText().equals("") || txtNome.getText().isEmpty() || txtEndereco.getText().isEmpty()
				|| txtBairro.getText().isEmpty() || txtCidade.getText().isEmpty()
				|| txtRg.getText().equals("  .   .   - ") || txtCpf.getText().equals("   .   .   -  ")) {
			JOptionPane.showMessageDialog(null, "Preencha os campos Obrigatórios");
		} else {
			int op;
			Object[] options = { "Cancelar", "Confirmar" };
			op = JOptionPane.showOptionDialog(null, "Deseja realmente editar?", "Informação",
					JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[1]);
			if (op == 1) {

				Clientes obj = new Clientes();
				obj.setNome(txtNome.getText());
				obj.setRg(txtRg.getText());
				obj.setCpf(txtCpf.getText());
				obj.setEmail(txtEmail.getText());
				obj.setTelefone(txtTelefone.getText());
				obj.setCelular(txtCelular.getText());
				obj.setCep(txtCep.getText());
				obj.setEndereco(txtEndereco.getText());
				obj.setNumero(Integer.parseInt(txtNumero.getText()));
				obj.setComplemento(txtComplemento.getText());
				obj.setBairro(txtBairro.getText());
				obj.setCidade(txtCidade.getText());
				obj.setUf(cbUf.getSelectedItem().toString());

				obj.setId(Integer.parseInt(txtCodigo.getText()));
				if (obj.getEmail().equals("")) {
					obj.setEmail("Não informado");
				}

				ClientesDao dao = new ClientesDao();
				dao.alterarCliente(obj);

				new Utilitarios().LimparTela(painelDadosCadastro);
			}
		}
	}// GEN-LAST:event_btnEditarActionPerformed

	private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnExcluirActionPerformed
		/**
		 * Botão Excluir
		 */
		if (txtCodigo.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Não há Cliente selecionado para exclusão");
		} else {
			int op;
			Object[] options = { "Cancelar", "Confirmar" };
			op = JOptionPane.showOptionDialog(null, "Deseja realmente excluir?", "Informação",
					JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[1]);
			if (op == 1) {

				Clientes obj = new Clientes();
				obj.setId(Integer.parseInt(txtCodigo.getText()));

				ClientesDao dao = new ClientesDao();
				dao.excluirCliente(obj);

				new Utilitarios().LimparTela(painelDadosCadastro);
			}
		}

	}// GEN-LAST:event_btnExcluirActionPerformed

	private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnLimparActionPerformed
		/**
		 * Limpa todos os campos:
		 */

		new Utilitarios().LimparTela(painelDadosCadastro);
		new Utilitarios().LimparTela(painelDadosConsulta);
	}// GEN-LAST:event_btnLimparActionPerformed

	private void txtPesquisaKeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_txtPesquisaKeyPressed
		/**
		 * Pesquisar Cliente apenas digitando no campo txtPesquisa.
		 */

		String nome = "%" + txtPesquisa.getText() + "%";

		ClientesDao dao = new ClientesDao();
		List<Clientes> lista = dao.buscaClienteNome(nome);
		DefaultTableModel dado = (DefaultTableModel) tabelaCliente.getModel();
		dado.setNumRows(0);

		for (Clientes cont : lista) {
			dado.addRow(new Object[] { cont.getId(), cont.getNome(), cont.getRg(), cont.getCpf(), cont.getTelefone(),
					cont.getCelular(), cont.getEmail(), cont.getCep(), cont.getEndereco(), cont.getNumero(),
					cont.getBairro(), cont.getCidade(), cont.getComplemento(), cont.getUf() });

		}

	}// GEN-LAST:event_txtPesquisaKeyPressed

	private void btnRetornarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnRetornarActionPerformed
		this.dispose();
	}// GEN-LAST:event_btnRetornarActionPerformed

	private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnPesquisarActionPerformed
		TestaConexao obj = new TestaConexao();
		if (obj.testarInternet("http://www.google.com.br")) {
			ViaCEP viaCep = new ViaCEP();
			try {
				viaCep.buscar(txtCep.getText().replace(" - ", ""));
				txtBairro.setText(viaCep.getBairro());
				txtEndereco.setText(viaCep.getLogradouro());
				txtCidade.setText(viaCep.getLocalidade());
				String uf = viaCep.getUf();
				cbUf.setSelectedItem(uf);

			} catch (ViaCEPException ex) {
				JOptionPane.showMessageDialog(null, "Cep não encontrado");
				Logger.getLogger(FormClientes.class.getName()).log(Level.SEVERE, null, ex);
			}
		} else {
			JOptionPane.showMessageDialog(null, "Sem Conexão com a internet");
		}

	}// GEN-LAST:event_btnPesquisarActionPerformed

	private void txtCepKeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_txtCepKeyPressed
		if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
			TestaConexao obj = new TestaConexao();
			if (obj.testarInternet("http://www.google.com.br")) {
				ViaCEP viaCep = new ViaCEP();
				try {
					viaCep.buscar(txtCep.getText().replace(" - ", ""));
					txtBairro.setText(viaCep.getBairro());
					txtEndereco.setText(viaCep.getLogradouro());
					txtCidade.setText(viaCep.getLocalidade());
					String uf = viaCep.getUf();
					cbUf.setSelectedItem(uf);

				} catch (ViaCEPException ex) {
					JOptionPane.showMessageDialog(null, "Cep não encontrado");
					Logger.getLogger(FormClientes.class.getName()).log(Level.SEVERE, null, ex);
				}
			} else {
				JOptionPane.showMessageDialog(null, "Sem Conexão com a internet");
			}
		}
	}// GEN-LAST:event_txtCepKeyPressed

	

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnRetornar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cbUf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane painelCadastro;
    private javax.swing.JPanel painelDadosCadastro;
    private javax.swing.JPanel painelDadosConsulta;
    private javax.swing.JTable tabelaCliente;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JFormattedTextField txtCelular;
    public javax.swing.JFormattedTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JFormattedTextField txtRg;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
