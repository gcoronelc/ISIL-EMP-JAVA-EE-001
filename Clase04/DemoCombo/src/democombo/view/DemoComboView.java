package democombo.view;

import democombo.dto.ProductoDto;
import java.util.ArrayList;
import java.util.List;

public class DemoComboView extends javax.swing.JFrame {

  private List<ProductoDto> lista = new ArrayList<>();
  private boolean  llenandoCombo;

  public DemoComboView() {
    initComponents();
    initLista();
    llenarCombo();
  }
  
  private void llenarCombo(){
    llenandoCombo = true;
    cboProducto.removeAllItems();
    for (ProductoDto dto : lista) {
      cboProducto.addItem(dto);
    }
    cboProducto.setSelectedIndex(-1);
    llenandoCombo = false;
  }

  private void initLista() {

    lista.add(new ProductoDto(1, "Producto A", 456.78));
    lista.add(new ProductoDto(2, "Producto B", 789.78));
    lista.add(new ProductoDto(3, "Producto C", 256.34));
    lista.add(new ProductoDto(4, "Producto R", 645.89));
    lista.add(new ProductoDto(5, "Producto Z", 789.35));

  }

  /**
   * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    cboProducto = new javax.swing.JComboBox<>();
    jScrollPane1 = new javax.swing.JScrollPane();
    txtRepo = new javax.swing.JTextArea();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("DEMO COMBO");

    jLabel1.setText("Seleccionar producto:");

    cboProducto.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        cboProductoActionPerformed(evt);
      }
    });

    txtRepo.setColumns(20);
    txtRepo.setRows(5);
    jScrollPane1.setViewportView(txtRepo);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(31, 31, 31)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jScrollPane1)
          .addGroup(layout.createSequentialGroup()
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(cboProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap(35, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(45, 45, 45)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel1)
          .addComponent(cboProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(36, 36, 36)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(58, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void cboProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboProductoActionPerformed
    int index = cboProducto.getSelectedIndex();
    if(llenandoCombo || index == -1 ){
      return;
    }
    ProductoDto dto = (ProductoDto) cboProducto.getSelectedItem();
    String repo = "";
    repo += "ID: " + dto.getId() + "\n";
    repo += "NOMBRE: " + dto.getNombre()+ "\n";
    repo += "PRECIO: " + dto.getPrecio()+ "\n";
    txtRepo.setText(repo);
  }//GEN-LAST:event_cboProductoActionPerformed

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
      java.util.logging.Logger.getLogger(DemoComboView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(DemoComboView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(DemoComboView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(DemoComboView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new DemoComboView().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JComboBox<ProductoDto> cboProducto;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTextArea txtRepo;
  // End of variables declaration//GEN-END:variables
}
