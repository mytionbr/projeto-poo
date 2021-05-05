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
import projeto_db.controller.PedidoController;
import projeto_db.controller.ProdutoController;
import projeto_db.model.Cliente;
import projeto_db.model.Funcionario;
import projeto_db.model.Pedido;
import projeto_db.model.Produto;

public class TelaListaPedidos extends javax.swing.JFrame {

   
    private List<Pedido> pedidos;
    private PedidoController pc = new PedidoController();
    private int index;
    private Pedido pedido;

    public TelaListaPedidos() {
        initComponents();
        index = 0;
       
        listar();
    }
    
    public void puxarDados(){
          
        this.pedidos = pc.listar();

    }

    public void listar() {
     if(this.campoBusca.getText().length() == 0){

        puxarDados();
     }
        setarCampos();
        this.posicao.setText((index + 1) + "/" + pedidos.size());
    }

    public void setarCampos() {

        pedido = pedidos.get(index);

        this.campoCliente.setText(Integer.toString(pedido.getCodCli()));
        this.campoCodPedido.setText(Integer.toString(pedido.getId()));
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = dateFormat.format(pedido.getData());
        
        this.campoData.setText(dataFormatada);
        

    }
    
    public void anterior(){
        if (index > 0) {
            this.index -= 1;
          
            listar();
        }
    }
    
    public void proximo(){
        if((this.pedidos.size() - 1) > index){
            this.index += 1;
        }
        
        listar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        campoCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        salvarCliente = new javax.swing.JButton();
        posicao = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        campoData = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        campoCodPedido = new javax.swing.JTextField();
        proximo = new javax.swing.JButton();
        voltar = new javax.swing.JButton();
        salvarCliente3 = new javax.swing.JButton();
        anterior1 = new javax.swing.JButton();
        campoBusca = new javax.swing.JTextField();
        anterior2 = new javax.swing.JButton();
        jLa = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(147, 69, 179));

        campoCliente.setBackground(new java.awt.Color(95, 25, 194));
        campoCliente.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        campoCliente.setForeground(new java.awt.Color(255, 255, 255));
        campoCliente.setSelectionColor(new java.awt.Color(67, 18, 127));
        campoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoClienteActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Código do cliente:");

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

        jLabel13.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));

        campoData.setBackground(new java.awt.Color(95, 25, 194));
        campoData.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        campoData.setForeground(new java.awt.Color(255, 255, 255));
        campoData.setSelectionColor(new java.awt.Color(67, 18, 127));
        campoData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDataActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Data do pedido:");

        campoCodPedido.setBackground(new java.awt.Color(95, 25, 194));
        campoCodPedido.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        campoCodPedido.setForeground(new java.awt.Color(255, 255, 255));
        campoCodPedido.setSelectionColor(new java.awt.Color(67, 18, 127));

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
        campoBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoBuscaActionPerformed(evt);
            }
        });

        anterior2.setBackground(new java.awt.Color(67, 18, 127));
        anterior2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        anterior2.setForeground(new java.awt.Color(255, 255, 255));
        anterior2.setText("Buscar");
        anterior2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anterior2ActionPerformed(evt);
            }
        });

        jLa.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLa.setForeground(new java.awt.Color(255, 255, 255));
        jLa.setText("Código do pedido:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoData, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(campoBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(anterior2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(campoCodPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(salvarCliente3, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(posicao, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(salvarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(84, 84, 84))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(voltar)
                            .addGap(129, 129, 129)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(anterior1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(proximo, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLa))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(campoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(campoData, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLa, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoCodPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(salvarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(anterior2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        PedidoController pc = new PedidoController();

       
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
        Date data = null;
        try {
            data = formato.parse(this.campoData.getText());
           
        } catch (ParseException ex) {
            Logger.getLogger(TelaCadastroProdutos.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
        pedido.setCodCli(Integer.parseInt(campoCliente.getText()));
        pedido.setId(Integer.parseInt(campoCodPedido.getText()));
        pedido.setData(data);

        pc.alterar(pedido);

        
    }//GEN-LAST:event_salvarClienteActionPerformed

    private void proximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proximoActionPerformed
        proximo();
    }//GEN-LAST:event_proximoActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
          TelaPedidos tp = new TelaPedidos();
                tp.setVisible(true);
                this.setVisible(false);

    }//GEN-LAST:event_voltarActionPerformed

    private void salvarCliente3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarCliente3ActionPerformed
      pc.deletar(pedido);
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
        
       if(!campo.equals("")){
           pedidos.clear();
            int id = Integer.parseInt(campo);
            System.out.println(id);
            pedidos.add(pc.buscarId(id));
       }
            
        
        
        
       System.out.println(pedidos);
       index = 0;
       setarCampos();
       this.posicao.setText((index + 1) + "/" + pedidos.size());
    }//GEN-LAST:event_anterior2ActionPerformed

    private void campoDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDataActionPerformed

    private void campoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoClienteActionPerformed

    private void campoBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoBuscaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoBuscaActionPerformed
    
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
            java.util.logging.Logger.getLogger(TelaListaPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaListaPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaListaPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaListaPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaListaPedidos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anterior1;
    private javax.swing.JButton anterior2;
    private javax.swing.JTextField campoBusca;
    private javax.swing.JTextField campoCliente;
    private javax.swing.JTextField campoCodPedido;
    private javax.swing.JTextField campoData;
    private javax.swing.JLabel jLa;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel posicao;
    private javax.swing.JButton proximo;
    private javax.swing.JButton salvarCliente;
    private javax.swing.JButton salvarCliente3;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
