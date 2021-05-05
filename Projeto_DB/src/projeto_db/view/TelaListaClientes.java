package projeto_db.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import projeto_db.controller.ClienteController;
import projeto_db.model.Cliente;
import projeto_db.model.Funcionario;

public class TelaListaClientes extends javax.swing.JFrame {

   
    private List<Cliente> clientes;
    private ClienteController cc = new ClienteController();
    private int index;
    private Cliente cliente;

    public TelaListaClientes() {
        initComponents();
        index = 0;
       
        listar();
    }
    
    public void puxarDados(){
          
        this.clientes = cc.listar();

    }

    public void listar() {
     if(this.campoBusca.getText().length() == 0){
//        System.out.println(this.campoBusca.getText().length());
        puxarDados();
     }
        setarCampos();
        this.posicao.setText((index + 1) + "/" + clientes.size());
    }

    public void setarCampos() {

        cliente = clientes.get(index);

        this.campoNome.setText(cliente.getNome());
        this.campoBairro.setText(cliente.getBairro());
        this.campoCelular.setText(cliente.getCelular());
        this.campoCep.setText(cliente.getCep());
        this.campoCidade.setText(cliente.getCidade());
        this.campoEmail.setText(cliente.getEmail());
        this.campoEndereco.setText(cliente.getEndereco());
        this.campoTelefone.setText(cliente.getTelefone());
        this.campoUF.setText(cliente.getUf());
        this.campoCod.setText(Integer.toString(cliente.getCodCli()));

    }
    
    public void anterior(){
        if (index > 0) {
            this.index -= 1;
          
            listar();
        }
    }
    
    public void proximo(){
        if((this.clientes.size() - 1) > index){
            this.index += 1;
        }
        
        listar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        campoNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        salvarCliente = new javax.swing.JButton();
        posicao = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        campoEndereco = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        campoBairro = new javax.swing.JTextField();
        campoCidade = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        campoCep = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        campoUF = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        campoEmail = new javax.swing.JTextField();
        campoTelefone = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        campoCelular = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        proximo = new javax.swing.JButton();
        voltar = new javax.swing.JButton();
        salvarCliente3 = new javax.swing.JButton();
        anterior1 = new javax.swing.JButton();
        campoBusca = new javax.swing.JTextField();
        anterior2 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        campoCod = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(147, 69, 179));

        campoNome.setBackground(new java.awt.Color(95, 25, 194));
        campoNome.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        campoNome.setForeground(new java.awt.Color(255, 255, 255));
        campoNome.setSelectionColor(new java.awt.Color(67, 18, 127));
        campoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nome:");

        salvarCliente.setBackground(new java.awt.Color(67, 18, 127));
        salvarCliente.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        salvarCliente.setForeground(new java.awt.Color(255, 255, 255));
        salvarCliente.setText("Salvar");
        salvarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarClienteActionPerformed(evt);
            }
        });

        posicao.setFont(new java.awt.Font("SansSerif", 0, 48)); // NOI18N
        posicao.setForeground(new java.awt.Color(0, 255, 0));
        posicao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        posicao.setText("0/0");

        jLabel11.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Endereço:");

        campoEndereco.setBackground(new java.awt.Color(95, 25, 194));
        campoEndereco.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        campoEndereco.setForeground(new java.awt.Color(255, 255, 255));
        campoEndereco.setSelectionColor(new java.awt.Color(67, 18, 127));

        jLabel12.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Bairro:");

        campoBairro.setBackground(new java.awt.Color(95, 25, 194));
        campoBairro.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        campoBairro.setForeground(new java.awt.Color(255, 255, 255));
        campoBairro.setSelectionColor(new java.awt.Color(67, 18, 127));
        campoBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoBairroActionPerformed(evt);
            }
        });

        campoCidade.setBackground(new java.awt.Color(95, 25, 194));
        campoCidade.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        campoCidade.setForeground(new java.awt.Color(255, 255, 255));
        campoCidade.setSelectionColor(new java.awt.Color(67, 18, 127));

        jLabel13.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Cidade:");

        campoCep.setBackground(new java.awt.Color(95, 25, 194));
        campoCep.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        campoCep.setForeground(new java.awt.Color(255, 255, 255));
        campoCep.setSelectionColor(new java.awt.Color(67, 18, 127));
        campoCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCepActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("CEP:");

        jLabel15.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("UF:");

        campoUF.setBackground(new java.awt.Color(95, 25, 194));
        campoUF.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        campoUF.setForeground(new java.awt.Color(255, 255, 255));
        campoUF.setSelectionColor(new java.awt.Color(67, 18, 127));

        jLabel16.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Email:");

        campoEmail.setBackground(new java.awt.Color(95, 25, 194));
        campoEmail.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        campoEmail.setForeground(new java.awt.Color(255, 255, 255));
        campoEmail.setSelectionColor(new java.awt.Color(67, 18, 127));

        campoTelefone.setBackground(new java.awt.Color(95, 25, 194));
        campoTelefone.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        campoTelefone.setForeground(new java.awt.Color(255, 255, 255));
        campoTelefone.setSelectionColor(new java.awt.Color(67, 18, 127));

        jLabel17.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Telefone:");

        campoCelular.setBackground(new java.awt.Color(95, 25, 194));
        campoCelular.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        campoCelular.setForeground(new java.awt.Color(255, 255, 255));
        campoCelular.setSelectionColor(new java.awt.Color(67, 18, 127));

        jLabel18.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Código do cliente:");

        proximo.setBackground(new java.awt.Color(67, 18, 127));
        proximo.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        proximo.setForeground(new java.awt.Color(255, 255, 255));
        proximo.setText("Próximo");
        proximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proximoActionPerformed(evt);
            }
        });

        voltar.setBackground(new java.awt.Color(67, 18, 127));
        voltar.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        voltar.setForeground(new java.awt.Color(255, 255, 255));
        voltar.setText("Voltar");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });

        salvarCliente3.setBackground(new java.awt.Color(67, 18, 127));
        salvarCliente3.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        salvarCliente3.setForeground(new java.awt.Color(255, 255, 255));
        salvarCliente3.setText("Excluir");
        salvarCliente3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarCliente3ActionPerformed(evt);
            }
        });

        anterior1.setBackground(new java.awt.Color(67, 18, 127));
        anterior1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        anterior1.setForeground(new java.awt.Color(255, 255, 255));
        anterior1.setText("Anterior");
        anterior1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anterior1ActionPerformed(evt);
            }
        });

        campoBusca.setBackground(new java.awt.Color(95, 25, 194));
        campoBusca.setForeground(new java.awt.Color(255, 255, 255));

        anterior2.setBackground(new java.awt.Color(67, 18, 127));
        anterior2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        anterior2.setForeground(new java.awt.Color(255, 255, 255));
        anterior2.setText("Buscar");
        anterior2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anterior2ActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Celular:");

        campoCod.setBackground(new java.awt.Color(95, 25, 194));
        campoCod.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        campoCod.setForeground(new java.awt.Color(255, 255, 255));
        campoCod.setSelectionColor(new java.awt.Color(67, 18, 127));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoUF, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoCep, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(campoBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(anterior2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(anterior1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(proximo, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(campoCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(salvarCliente3, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(posicao, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(salvarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(84, 84, 84))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(voltar)
                            .addGap(129, 129, 129))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(campoCod, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addContainerGap()))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(719, Short.MAX_VALUE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(172, 172, 172)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(campoCep, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(campoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(campoUF, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(15, 15, 15)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(campoBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 24, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(campoCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoCod, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(salvarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(salvarCliente3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(posicao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(voltar)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anterior2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anterior1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(proximo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(504, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void salvarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarClienteActionPerformed
        ClienteController cc = new ClienteController();

       
        cliente.setNome(this.campoNome.getText());
        cliente.setEndereco(this.campoEndereco.getText());
        cliente.setBairro(this.campoBairro.getText());
        cliente.setCidade(this.campoCidade.getText());
        cliente.setEmail(this.campoEmail.getText());
        cliente.setCep(this.campoCep.getText());
        cliente.setTelefone(this.campoTelefone.getText());
        cliente.setCelular(this.campoCelular.getText());
        cliente.setUf(this.campoUF.getText());

        cc.alterar(cliente);

        
    }//GEN-LAST:event_salvarClienteActionPerformed

    private void campoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNomeActionPerformed

    private void campoBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoBairroActionPerformed

    private void campoCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCepActionPerformed

    private void proximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proximoActionPerformed
        proximo();
    }//GEN-LAST:event_proximoActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
         TelaClientes tc = new TelaClientes();
                tc.setVisible(true);
                this.setVisible(false);

    }//GEN-LAST:event_voltarActionPerformed

    private void salvarCliente3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarCliente3ActionPerformed
      cc.deletar(cliente);
      if(index > 0){
          index -= 1;
           anterior();
      }
     
        
         proximo();
     
      
    }//GEN-LAST:event_salvarCliente3ActionPerformed

    private void anterior1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anterior1ActionPerformed
         anterior();
    }//GEN-LAST:event_anterior1ActionPerformed

    private void anterior2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anterior2ActionPerformed
        String campo = this.campoBusca.getText();
        
        String aux = campo;
        if(campo.equals("")){
           clientes = cc.listar();
        }else
          if(aux.contains("@")){
            clientes = cc.buscarPor("email",campo);
        }else
        if(aux.matches("[A-Z][a-z]*")){
            clientes =  cc.buscarNome(campo);
        }else
        if(aux.contains("-") && aux.substring(0).contains("9")){
                System.out.println("celular");
            clientes = cc.buscarPor("celular", campo);
        }
        else{
            clientes.clear();
            int id = Integer.parseInt(campo);
            clientes.add(cc.buscarId(id));
        }
        
        
       System.out.println(clientes);
       index = 0;
       setarCampos();
       this.posicao.setText((index + 1) + "/" + clientes.size());
    }//GEN-LAST:event_anterior2ActionPerformed
    
    private void pesquisaNome(String nome){
     
    }
    
       /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaListaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaListaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaListaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaListaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaListaClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anterior1;
    private javax.swing.JButton anterior2;
    private javax.swing.JTextField campoBairro;
    private javax.swing.JTextField campoBusca;
    private javax.swing.JTextField campoCelular;
    private javax.swing.JTextField campoCep;
    private javax.swing.JTextField campoCidade;
    private javax.swing.JTextField campoCod;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoEndereco;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoTelefone;
    private javax.swing.JTextField campoUF;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel posicao;
    private javax.swing.JButton proximo;
    private javax.swing.JButton salvarCliente;
    private javax.swing.JButton salvarCliente3;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
