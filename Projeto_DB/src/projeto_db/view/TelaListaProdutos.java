package projeto_db.view;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import projeto_db.controller.ClienteController;
import projeto_db.controller.ProdutoController;
import projeto_db.model.Cliente;
import projeto_db.model.Funcionario;
import projeto_db.model.Produto;

public class TelaListaProdutos extends javax.swing.JFrame {

   
    private List<Produto> produtos;
    private ProdutoController pc = new ProdutoController();
    private int index;
    private Produto produto;

    public TelaListaProdutos() {
        initComponents();
        index = 0;
       
        listar();
    }
    
    public void puxarDados(){
          
        this.produtos = pc.listar();

    }

    public void listar() {
     if(this.campoBusca.getText().length() == 0){
//        System.out.println(this.campoBusca.getText().length());
        puxarDados();
     }
        setarCampos();
        this.posicao.setText((index + 1) + "/" + produtos.size());
    }

    public void setarCampos() {

        produto = produtos.get(index);

        this.campoDescricao.setText(produto.getDescricao());
        this.campoCod.setText(Integer.toString(produto.getCodProd()));
        this.campoPreco.setText(Double.toString(produto.getPreco()));
        this.campoQtdeAtual.setText(Integer.toString(produto.getQtde_atual()));
        this.campoQtdeInicial.setText(Integer.toString(produto.getQtde_inicial()));
        this.campoUnidade.setText(produto.getUnidade());
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = dateFormat.format(produto.getData_cad());
        
        this.campoDataCad.setText(dataFormatada);
        

    }
    
    public void anterior(){
        if (index > 0) {
            this.index -= 1;
          
            listar();
        }
    }
    
    public void proximo(){
        if((this.produtos.size() - 1) > index){
            this.index += 1;
        }
        
        listar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        campoDescricao = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        salvarCliente = new javax.swing.JButton();
        posicao = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        campoQtdeAtual = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        campoPreco = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        campoQtdeInicial = new javax.swing.JTextField();
        campoDataCad = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        proximo = new javax.swing.JButton();
        voltar = new javax.swing.JButton();
        salvarCliente3 = new javax.swing.JButton();
        anterior1 = new javax.swing.JButton();
        campoBusca = new javax.swing.JTextField();
        anterior2 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        campoCod = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        campoUnidade = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(147, 69, 179));

        campoDescricao.setBackground(new java.awt.Color(95, 25, 194));
        campoDescricao.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        campoDescricao.setForeground(new java.awt.Color(255, 255, 255));
        campoDescricao.setSelectionColor(new java.awt.Color(67, 18, 127));
        campoDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDescricaoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Descrição:");

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
        jLabel11.setText("Qtde_atual:");

        campoQtdeAtual.setBackground(new java.awt.Color(95, 25, 194));
        campoQtdeAtual.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        campoQtdeAtual.setForeground(new java.awt.Color(255, 255, 255));
        campoQtdeAtual.setSelectionColor(new java.awt.Color(67, 18, 127));

        jLabel13.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));

        campoPreco.setBackground(new java.awt.Color(95, 25, 194));
        campoPreco.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        campoPreco.setForeground(new java.awt.Color(255, 255, 255));
        campoPreco.setSelectionColor(new java.awt.Color(67, 18, 127));
        campoPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPrecoActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Preço:");

        jLabel15.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Qtde_inicial:");

        campoQtdeInicial.setBackground(new java.awt.Color(95, 25, 194));
        campoQtdeInicial.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        campoQtdeInicial.setForeground(new java.awt.Color(255, 255, 255));
        campoQtdeInicial.setSelectionColor(new java.awt.Color(67, 18, 127));

        campoDataCad.setBackground(new java.awt.Color(95, 25, 194));
        campoDataCad.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        campoDataCad.setForeground(new java.awt.Color(255, 255, 255));
        campoDataCad.setSelectionColor(new java.awt.Color(67, 18, 127));

        jLabel18.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Código do produto:");

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
        jLabel19.setText("Data_cad:");

        campoCod.setBackground(new java.awt.Color(95, 25, 194));
        campoCod.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        campoCod.setForeground(new java.awt.Color(255, 255, 255));
        campoCod.setSelectionColor(new java.awt.Color(67, 18, 127));

        jLabel12.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Unidade:");

        campoUnidade.setBackground(new java.awt.Color(95, 25, 194));
        campoUnidade.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        campoUnidade.setForeground(new java.awt.Color(255, 255, 255));
        campoUnidade.setSelectionColor(new java.awt.Color(67, 18, 127));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoQtdeAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoQtdeInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(campoBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(anterior2))
                    .addComponent(campoUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(anterior1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(proximo, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(campoDataCad, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(campoDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(campoPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(campoQtdeAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(campoQtdeInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(anterior2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(campoDataCad, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoCod, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(salvarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(salvarCliente3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(posicao)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(voltar)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(anterior1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(proximo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
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

       
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
        Date data = null;
        try {
            data = formato.parse(this.campoDataCad.getText());
           
        } catch (ParseException ex) {
            Logger.getLogger(TelaCadastroProdutos.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
        produto.setDescricao(this.campoDescricao.getText());
        produto.setPreco(Double.parseDouble(this.campoQtdeInicial.getText()));
        produto.setQtde_atual(Integer.parseInt(this.campoQtdeAtual.getText()));
        produto.setQtde_inicial(Integer.parseInt(this.campoQtdeInicial.getText()));
        produto.setUnidade(this.campoUnidade.getText());
        produto.setCodProd(Integer.parseInt(this.campoCod.getText()));
        produto.setData_cad(data);

        pc.alterar(produto);

        
    }//GEN-LAST:event_salvarClienteActionPerformed

    private void campoDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDescricaoActionPerformed

    private void campoPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoPrecoActionPerformed

    private void proximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proximoActionPerformed
        proximo();
    }//GEN-LAST:event_proximoActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
          TelaProdutos tp = new TelaProdutos();
                tp.setVisible(true);
                this.setVisible(false);

    }//GEN-LAST:event_voltarActionPerformed

    private void salvarCliente3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarCliente3ActionPerformed
      pc.deletar(produto);
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
           produtos = pc.listar();
        }else
        if(aux.matches("[A-Z][a-z]*")){
            produtos =  pc.buscarNome(campo);
        }else{
            produtos.clear();
            int id = Integer.parseInt(campo);
            produtos.add(pc.buscarId(id));
        }
        
        
       System.out.println(produtos);
       index = 0;
       setarCampos();
       this.posicao.setText((index + 1) + "/" + produtos.size());
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
            java.util.logging.Logger.getLogger(TelaListaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaListaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaListaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaListaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaListaProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anterior1;
    private javax.swing.JButton anterior2;
    private javax.swing.JTextField campoBusca;
    private javax.swing.JTextField campoCod;
    private javax.swing.JTextField campoDataCad;
    private javax.swing.JTextField campoDescricao;
    private javax.swing.JTextField campoPreco;
    private javax.swing.JTextField campoQtdeAtual;
    private javax.swing.JTextField campoQtdeInicial;
    private javax.swing.JTextField campoUnidade;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
