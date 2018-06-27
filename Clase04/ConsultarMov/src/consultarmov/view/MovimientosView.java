package consultarmov.view;

import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pe.egcc.eureka.service.CuentaService;

public class MovimientosView extends javax.swing.JFrame {

  public MovimientosView() {
    initComponents();
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    txtCuenta = new javax.swing.JTextField();
    btnConsultar = new javax.swing.JButton();
    jScrollPane1 = new javax.swing.JScrollPane();
    tblRepo = new javax.swing.JTable();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("MOVIMIENTOS");

    jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jLabel1.setText("CUENTA:");

    txtCuenta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

    btnConsultar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    btnConsultar.setText("Consultar");
    btnConsultar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnConsultarActionPerformed(evt);
      }
    });

    tblRepo.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null}
      },
      new String [] {
        "NRO", "TIPO", "FECHA", "IMPORTE"
      }
    ) {
      Class[] types = new Class [] {
        java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
      };
      boolean[] canEdit = new boolean [] {
        false, false, false, false
      };

      public Class getColumnClass(int columnIndex) {
        return types [columnIndex];
      }

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
      }
    });
    jScrollPane1.setViewportView(tblRepo);
    if (tblRepo.getColumnModel().getColumnCount() > 0) {
      tblRepo.getColumnModel().getColumn(0).setResizable(false);
      tblRepo.getColumnModel().getColumn(1).setResizable(false);
      tblRepo.getColumnModel().getColumn(2).setResizable(false);
      tblRepo.getColumnModel().getColumn(3).setResizable(false);
    }

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(32, 32, 32)
        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(txtCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(43, 43, 43)
        .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(111, Short.MAX_VALUE))
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jScrollPane1)
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(txtCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
      // Data
      String cuenta = txtCuenta.getText();
      // Proceso
      CuentaService service = new CuentaService();
      List<Map<String,?>> lista;
      lista = service.traerMovimientos(cuenta);
      // Verificar exito
      if( service.getCode() == -1){
        JOptionPane.showMessageDialog(rootPane, service.getError(),
                "ERROR", JOptionPane.ERROR_MESSAGE);
        return;
      }
      // Mostrar lista
      DefaultTableModel tabla;
      tabla = (DefaultTableModel) tblRepo.getModel();
      tabla.setRowCount(0);
      for (Map<String, ?> map : lista) {
        Object[] rowData = {
          map.get("MOVINUMERO"), 
          map.get("TIPONOMBRE"), 
          map.get("MOVIFECHA"), 
          map.get("MOVIIMPORTE"), 
        };
        tabla.addRow(rowData);
      }
      
  }//GEN-LAST:event_btnConsultarActionPerformed

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
      java.util.logging.Logger.getLogger(MovimientosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(MovimientosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(MovimientosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(MovimientosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new MovimientosView().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnConsultar;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTable tblRepo;
  private javax.swing.JTextField txtCuenta;
  // End of variables declaration//GEN-END:variables
}
