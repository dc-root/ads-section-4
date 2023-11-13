/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package br.edu.iftm.pay.views.updatescreen;

import br.edu.iftm.pay.templates.Product;
import br.edu.iftm.pay.views.Pay;
import javax.swing.text.JTextComponent;

/**
 *
 * @author Formato
 */
public class UpdateProductInternalFrame extends javax.swing.JInternalFrame {
    private int selectedRow;

    /**
     * Creates new form CreateProductInternalFrame
     */
    public UpdateProductInternalFrame() {
        initComponents();
    }
    
    public UpdateProductInternalFrame(Product product, int selected) {
        initComponents();
        
        Product uProduct = (Product) product;
        
        jInputProductName.setText(uProduct.getName());
        jInputProductUnitPrice.setText(Double.toString(uProduct.getUnitPrice()));
        jTextProductDescription.setText(uProduct.getDescription());
        
        this.selectedRow = selected;
    }
    
    private void clearInputFields(JTextComponent... fields) {
        for (JTextComponent field : fields) {
            field.setText("");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBtnUpdate = new javax.swing.JButton();
        jBtnCancel = new javax.swing.JButton();
        jInputProductName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextProductDescription = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jInputProductUnitPrice = new javax.swing.JTextField();

        setClosable(true);
        setTitle("Cadastro de produto");
        setPreferredSize(new java.awt.Dimension(564, 336));

        jBtnUpdate.setText("Atualizar");
        jBtnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnUpdateActionPerformed(evt);
            }
        });

        jBtnCancel.setText("Cancelar");
        jBtnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Atualizar produto");

        jLabel1.setText("Nome");

        jLabel2.setText("Preço da unidade");

        jTextProductDescription.setColumns(20);
        jTextProductDescription.setRows(5);
        jScrollPane1.setViewportView(jTextProductDescription);

        jLabel3.setText("Descrição");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBtnCancel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtnUpdate)))
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jInputProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jInputProductUnitPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                .addGap(30, 30, 30))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel6)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jInputProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jInputProductUnitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(7, 7, 7)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnUpdate)
                    .addComponent(jBtnCancel))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelActionPerformed
        // TODO add your handling code here:
        Pay.dlCardLayout.show(Pay.jContainerScreens, "ProductRegisterScreen");
        clearInputFields(jInputProductName, jInputProductUnitPrice, jTextProductDescription);
        
        this.dispose();
    }//GEN-LAST:event_jBtnCancelActionPerformed

    private void jBtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnUpdateActionPerformed
        // TODO add your handling code here:
        
        Pay.productTableModel.setValueAt(jInputProductName.getText(), selectedRow,  1);
        Pay.productTableModel.setValueAt(jInputProductUnitPrice.getText(), selectedRow,  2);
        Pay.productTableModel.setValueAt(jTextProductDescription.getText(), selectedRow,  3);
        
        clearInputFields(jInputProductName, jInputProductUnitPrice, jTextProductDescription);
        
        Pay.dlCardLayout.show(Pay.jContainerScreens, "ProductRegisterScreen");
        this.dispose();
    }//GEN-LAST:event_jBtnUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnCancel;
    private javax.swing.JButton jBtnUpdate;
    private javax.swing.JTextField jInputProductName;
    private javax.swing.JTextField jInputProductUnitPrice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextProductDescription;
    // End of variables declaration//GEN-END:variables
}
