/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package supermarket.layerd.view;

import java.util.Locale;

/**
 *
 * @author Vihanga
 */
public class LayoutView extends javax.swing.JFrame {

    /**
     * Creates new form LayoutView
     */
    public LayoutView() {
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

        supermarketPanel = new javax.swing.JPanel();
        supermarketLabel = new javax.swing.JLabel();
        SidenavPanel = new javax.swing.JPanel();
        manageCustomerButton = new javax.swing.JButton();
        manageItemButton = new javax.swing.JButton();
        orderItemButton = new javax.swing.JButton();
        bodyPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        supermarketPanel.setBackground(new java.awt.Color(102, 102, 255));

        supermarketLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        supermarketLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        supermarketLabel.setText("Super Market");

        javax.swing.GroupLayout supermarketPanelLayout = new javax.swing.GroupLayout(supermarketPanel);
        supermarketPanel.setLayout(supermarketPanelLayout);
        supermarketPanelLayout.setHorizontalGroup(
            supermarketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(supermarketLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        supermarketPanelLayout.setVerticalGroup(
            supermarketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(supermarketLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        SidenavPanel.setBackground(new java.awt.Color(204, 204, 255));

        manageCustomerButton.setBackground(new java.awt.Color(102, 102, 255));
        manageCustomerButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        manageCustomerButton.setText("Manage Customer");
        manageCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageCustomerButtonActionPerformed(evt);
            }
        });

        manageItemButton.setBackground(new java.awt.Color(102, 102, 255));
        manageItemButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        manageItemButton.setText("Manage Item");
        manageItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageItemButtonActionPerformed(evt);
            }
        });

        orderItemButton.setBackground(new java.awt.Color(102, 102, 255));
        orderItemButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        orderItemButton.setText("Order");
        orderItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderItemButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SidenavPanelLayout = new javax.swing.GroupLayout(SidenavPanel);
        SidenavPanel.setLayout(SidenavPanelLayout);
        SidenavPanelLayout.setHorizontalGroup(
            SidenavPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SidenavPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SidenavPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(manageCustomerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(manageItemButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(orderItemButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        SidenavPanelLayout.setVerticalGroup(
            SidenavPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SidenavPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(manageCustomerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(manageItemButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(orderItemButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout bodyPanelLayout = new javax.swing.GroupLayout(bodyPanel);
        bodyPanel.setLayout(bodyPanelLayout);
        bodyPanelLayout.setHorizontalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 704, Short.MAX_VALUE)
        );
        bodyPanelLayout.setVerticalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 481, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(supermarketPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(SidenavPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(supermarketPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(SidenavPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(bodyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void manageCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageCustomerButtonActionPerformed
       loadCustomerPanel();
    }//GEN-LAST:event_manageCustomerButtonActionPerformed

    private void manageItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageItemButtonActionPerformed
         loadItemPanel();
    }//GEN-LAST:event_manageItemButtonActionPerformed

    private void orderItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderItemButtonActionPerformed
        loadOrderPanel();
    }//GEN-LAST:event_orderItemButtonActionPerformed

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
            java.util.logging.Logger.getLogger(LayoutView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LayoutView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LayoutView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LayoutView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LayoutView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel SidenavPanel;
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JButton manageCustomerButton;
    private javax.swing.JButton manageItemButton;
    private javax.swing.JButton orderItemButton;
    private javax.swing.JLabel supermarketLabel;
    private javax.swing.JPanel supermarketPanel;
    // End of variables declaration//GEN-END:variables

    private void loadCustomerPanel() {
       bodyPanel.removeAll();
       CustomerPanel customerPanel = new CustomerPanel();
       customerPanel.setSize(bodyPanel.getWidth(), bodyPanel.getHeight());
       bodyPanel.add(customerPanel);
       bodyPanel.revalidate();
    }

    private void loadItemPanel() {
       bodyPanel.removeAll();
       ItemPanel itemPanel = new ItemPanel();
       itemPanel.setSize(bodyPanel.getWidth(), bodyPanel.getHeight());
       bodyPanel.add(itemPanel);
       bodyPanel.revalidate();
    }

    private void loadOrderPanel() {
       bodyPanel.removeAll();
       OrderPanel orderPanel = new OrderPanel();
       orderPanel.setSize(bodyPanel.getWidth(), bodyPanel.getHeight());
       bodyPanel.add(orderPanel);
       bodyPanel.revalidate();
    }
}
