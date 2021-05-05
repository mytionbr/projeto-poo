
package projeto_db.view;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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


public class TelaCadastroItensPedido extends javax.swing.JFrame {

   
    public Map<String,Integer> produtos;
    public List<Pedido> pedidos;
    public PedidoController pedidoController = new PedidoController();
    private ProdutoController produtoController = new ProdutoController();
    private ItensController itensController = new ItensController();
    
    public TelaCadastroItensPedido() {
        initComponents();
        
       
        produtos = new HashMap<String, Integer>();
        pedidos = new ArrayList<Pedido>();
        
        iniciaMap();
        iniciaCampos();
    }
    
    private void iniciaMap(){
        
        List<Produto> produtoList = produtoController.listar();
        
        
        for(Produto produto : produtoList){
            produtos.put(produto.getDescricao(), produto.getCodProd());
        }
        
        pedidos = pedidoController.listar();
    };
    
    private void iniciaCampos(){
        campoCodProd.removeAllItems();
        campoCodPedido.removeAllItems();
        
        for (Map.Entry<String, Integer> entry : produtos.entrySet()) {
             String nome = entry.getKey();
             campoCodProd.addItem(nome);
         }
       for(Pedido entry :  pedidos){
           String id = Integer.toString(entry.getId());
           campoCodPedido.addItem(id);
       }
        
    }
    

    
    private Integer pesquisaProdutos(String descricao){
        return produtos.get(descricao);
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        voltarCliente = new javax.swing.JButton();
        menssagem = new javax.swing.JLabel();
        salvarCliente1 = new javax.swing.JButton();
        campoCodProd = new javax.swing.JComboBox<>();
        campoQtd = new javax.swing.JTextField();
        campoCodPedido = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(147, 69, 179));

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Código do pedido:");

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Código do produto:");

        voltarCliente.setBackground(new java.awt.Color(67, 18, 127));
        voltarCliente.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        voltarCliente.setForeground(new java.awt.Color(255, 255, 255));
        voltarCliente.setText("Voltar");
        voltarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarClienteActionPerformed(evt);
            }
        });

        menssagem.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        menssagem.setForeground(new java.awt.Color(0, 255, 0));
        menssagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        salvarCliente1.setBackground(new java.awt.Color(67, 18, 127));
        salvarCliente1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        salvarCliente1.setForeground(new java.awt.Color(255, 255, 255));
        salvarCliente1.setText("Salvar");
        salvarCliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarCliente1ActionPerformed(evt);
            }
        });

        campoCodProd.setBackground(new java.awt.Color(95, 25, 194));
        campoCodProd.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        campoCodProd.setForeground(new java.awt.Color(255, 255, 255));
        campoCodProd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        campoQtd.setBackground(new java.awt.Color(95, 25, 194));
        campoQtd.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        campoQtd.setForeground(new java.awt.Color(255, 255, 255));
        campoQtd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoQtdActionPerformed(evt);
            }
        });

        campoCodPedido.setBackground(new java.awt.Color(95, 25, 194));
        campoCodPedido.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        campoCodPedido.setForeground(new java.awt.Color(255, 255, 255));
        campoCodPedido.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Quantidade do produto:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(salvarCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(309, 309, 309))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(campoQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(menssagem, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(campoCodPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(272, 272, 272)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoCodProd, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(393, 393, 393)
                        .addComponent(voltarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(138, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoCodProd, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoCodPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(menssagem, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addComponent(voltarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salvarCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void voltarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarClienteActionPerformed
         TelaItensPedidos tp = new TelaItensPedidos();
         tp.setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_voltarClienteActionPerformed

    private void salvarCliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarCliente1ActionPerformed
        ItensPedido ip = new  ItensPedido();

        
        
        String nome = (String) campoCodProd.getSelectedItem();
        ip.setCodProd(pesquisaProdutos(nome));
        String valor = (String) campoCodPedido.getSelectedItem();
        ip.setCodPed(Integer.parseInt(valor));
        ip.setQtde(Integer.parseInt(campoQtd.getText()));
        itensController.cadastra(ip);
        this.menssagem.setText("Sucesso!!!!");
    }//GEN-LAST:event_salvarCliente1ActionPerformed

    private void campoQtdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoQtdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoQtdActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroItensPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroItensPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroItensPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroItensPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroItensPedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> campoCodPedido;
    private javax.swing.JComboBox<String> campoCodProd;
    private javax.swing.JTextField campoQtd;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel menssagem;
    private javax.swing.JButton salvarCliente1;
    private javax.swing.JButton voltarCliente;
    // End of variables declaration//GEN-END:variables
}
