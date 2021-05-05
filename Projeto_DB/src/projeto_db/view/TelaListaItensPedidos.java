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
import projeto_db.controller.ItensController;
import projeto_db.controller.PedidoController;
import projeto_db.controller.ProdutoController;
import projeto_db.model.Cliente;
import projeto_db.model.Funcionario;
import projeto_db.model.ItensPedido;
import projeto_db.model.Pedido;
import projeto_db.model.Produto;

public class TelaListaItensPedidos extends javax.swing.JFrame {

   
    private List<ItensPedido> itensPedidos;
    private ItensController pc = new ItensController();
    private int index;
    private ItensPedido item;

    public TelaListaItensPedidos() {
        initComponents();
        index = 0;
       
        listar();
    }
    
    public void puxarDados(){
          
        this.itensPedidos = pc.listar();

    }

    public void listar() {
        puxarDados();
  
        setarCampos();
        this.posicao.setText((index + 1) + "/" + itensPedidos.size());
    }

    public void setarCampos() {

        item = itensPedidos.get(index);

        this.campoCodPed.setText(Integer.toString(item.getCodPed()));
        this.campoCodProd.setText(Integer.toString(item.getCodProd()));
        this.campoCodQdt.setText(Integer.toString(item.getQtde()));

    }
    
    public void anterior(){
        if (index > 0) {
            this.index -= 1;
          
            listar();
        }
    }
    
    public void proximo(){
        if((this.itensPedidos.size() - 1) > index){
            this.index += 1;
        }
        
        listar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        campoCodProd = new javax.swing.JTextField();
        salvarCliente = new javax.swing.JButton();
        posicao = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        campoCodPed = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        campoCodQdt = new javax.swing.JTextField();
        proximo = new javax.swing.JButton();
        voltar = new javax.swing.JButton();
        salvarCliente3 = new javax.swing.JButton();
        anterior1 = new javax.swing.JButton();
        jLa = new javax.swing.JLabel();
        campoBusca = new javax.swing.JTextField();
        anterior2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(147, 69, 179));

        campoCodProd.setBackground(new java.awt.Color(95, 25, 194));
        campoCodProd.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        campoCodProd.setForeground(new java.awt.Color(255, 255, 255));
        campoCodProd.setSelectionColor(new java.awt.Color(67, 18, 127));
        campoCodProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCodProdActionPerformed(evt);
            }
        });

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
        jLabel13.setText("Código do Produto:");

        campoCodPed.setBackground(new java.awt.Color(95, 25, 194));
        campoCodPed.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        campoCodPed.setForeground(new java.awt.Color(255, 255, 255));
        campoCodPed.setSelectionColor(new java.awt.Color(67, 18, 127));
        campoCodPed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCodPedActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Código do pedido:");

        campoCodQdt.setBackground(new java.awt.Color(95, 25, 194));
        campoCodQdt.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        campoCodQdt.setForeground(new java.awt.Color(255, 255, 255));
        campoCodQdt.setSelectionColor(new java.awt.Color(67, 18, 127));

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

        jLa.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLa.setForeground(new java.awt.Color(255, 255, 255));
        jLa.setText("QDT:");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoCodProd, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoCodPed, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(campoCodQdt, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(anterior1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(proximo, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLa))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(voltar)
                        .addGap(45, 45, 45))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(campoBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(anterior2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(salvarCliente3, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(posicao, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(salvarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(54, 54, 54))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(campoCodProd, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoCodPed, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLa, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoCodQdt, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                        .addComponent(salvarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(salvarCliente3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(anterior2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)))
                .addComponent(posicao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(voltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(anterior1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(proximo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void salvarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarClienteActionPerformed
        ItensController ip = new ItensController();

                    
        item.setCodPed(Integer.parseInt(campoCodPed.getText()));
        item.setCodProd(Integer.parseInt(campoCodProd.getText()));
        item.setQtde(Integer.parseInt(campoCodQdt.getText()));

        ip.alterar(item);

        
    }//GEN-LAST:event_salvarClienteActionPerformed

    private void proximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proximoActionPerformed
        proximo();
    }//GEN-LAST:event_proximoActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
          TelaItensPedidos tp = new TelaItensPedidos();
                tp.setVisible(true);
                this.setVisible(false);

    }//GEN-LAST:event_voltarActionPerformed

    private void salvarCliente3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarCliente3ActionPerformed
      pc.deletar(item);
      if(index > 0){
          index -= 1;
           anterior();
      }
     
        
         proximo();
     
      
    }//GEN-LAST:event_salvarCliente3ActionPerformed

    private void anterior1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anterior1ActionPerformed
         anterior();
    }//GEN-LAST:event_anterior1ActionPerformed

    private void campoCodPedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCodPedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCodPedActionPerformed

    private void campoCodProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCodProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCodProdActionPerformed

    private void campoBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoBuscaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoBuscaActionPerformed

    private void anterior2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anterior2ActionPerformed
        String campo = this.campoBusca.getText();
        ItensController ic = new ItensController();
        if(!campo.equals("")){
            itensPedidos.clear();
            int id = Integer.parseInt(campo);
            System.out.println(id);
            itensPedidos.add(ic.buscarId(id));
        }else{
            listar();
        }

        System.out.println(itensPedidos);
        index = 0;
        setarCampos();
        this.posicao.setText((index + 1) + "/" + itensPedidos.size());
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
            java.util.logging.Logger.getLogger(TelaListaItensPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaListaItensPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaListaItensPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaListaItensPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaListaItensPedidos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anterior1;
    private javax.swing.JButton anterior2;
    private javax.swing.JTextField campoBusca;
    private javax.swing.JTextField campoCodPed;
    private javax.swing.JTextField campoCodProd;
    private javax.swing.JTextField campoCodQdt;
    private javax.swing.JLabel jLa;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel posicao;
    private javax.swing.JButton proximo;
    private javax.swing.JButton salvarCliente;
    private javax.swing.JButton salvarCliente3;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
