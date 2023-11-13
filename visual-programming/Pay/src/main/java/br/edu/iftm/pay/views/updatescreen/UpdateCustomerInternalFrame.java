/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package br.edu.iftm.pay.views.updatescreen;

import br.edu.iftm.pay.views.createscreen.*;
import br.edu.iftm.pay.templates.Customer;
import br.edu.iftm.pay.utils.enumerations.EntityType;
import br.edu.iftm.pay.views.Pay;
import javax.swing.JOptionPane;
import javax.swing.text.JTextComponent;

/**
 *
 * @author Formato
 */
public class UpdateCustomerInternalFrame extends javax.swing.JInternalFrame {
    private int selectedRow;

    /**
     * Creates new form CreateCustomerInternalFrame
     */
    public UpdateCustomerInternalFrame() {
        initComponents();
    }
    
    public UpdateCustomerInternalFrame(Customer customer, int selected) {
        initComponents();
        
        Customer uCustomer = (Customer) customer;
        
        jInputCustomerName.setText(uCustomer.getName());
        jInputCustomerDoc.setText(uCustomer.getCpfOrCnpj());
        jInputCustomerPhoneNumber.setText(uCustomer.getPhoneNumber());
        jSelectCustomerType.setSelectedItem(uCustomer.getCustomerType().toString());
        
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

        jInputCustomerPhoneNumber = new javax.swing.JTextField();
        jInputCustomerName = new javax.swing.JTextField();
        jInputCustomerDoc = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSelectCustomerType = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jBtnUpdate = new javax.swing.JButton();
        jBtnCancel = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Cadastro de cliente");
        setMinimumSize(new java.awt.Dimension(90, 50));

        jLabel1.setText("Nome");

        jLabel2.setText("CPF ou CNPJ");

        jLabel3.setText("Telefone");

        jSelectCustomerType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FISICA", "JURIDICA" }));

        jLabel4.setText("Tipo de Cliente");

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
        jLabel6.setText("Atualizar cliente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jInputCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jInputCustomerDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jInputCustomerPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSelectCustomerType, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jBtnCancel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addComponent(jBtnUpdate))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel6)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jInputCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jInputCustomerDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jInputCustomerPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSelectCustomerType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnUpdate)
                    .addComponent(jBtnCancel))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelActionPerformed
        // TODO add your handling code here:
        Pay.dlCardLayout.show(Pay.jContainerScreens, "CustomerRegisterScreen");
        clearInputFields(jInputCustomerName, jInputCustomerDoc, jInputCustomerPhoneNumber);
        
        this.dispose();
    }//GEN-LAST:event_jBtnCancelActionPerformed

    private void jBtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnUpdateActionPerformed
        // TODO add your handling code here:
        
        Pay.customerTableModel.setValueAt(jInputCustomerName.getText(), selectedRow, 1);
        Pay.customerTableModel.setValueAt(jInputCustomerDoc.getText(), selectedRow, 2);
        Pay.customerTableModel.setValueAt(jInputCustomerPhoneNumber.getText(), selectedRow, 3);
        Pay.customerTableModel.setValueAt(jSelectCustomerType.getSelectedItem().toString(), selectedRow, 4);

        clearInputFields(jInputCustomerName, jInputCustomerDoc, jInputCustomerPhoneNumber);

        Pay.dlCardLayout.show(Pay.jContainerScreens, "CustomerRegisterScreen");
        this.dispose();
    }//GEN-LAST:event_jBtnUpdateActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnCancel;
    private javax.swing.JButton jBtnUpdate;
    private javax.swing.JTextField jInputCustomerDoc;
    private javax.swing.JTextField jInputCustomerName;
    private javax.swing.JTextField jInputCustomerPhoneNumber;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JComboBox<String> jSelectCustomerType;
    // End of variables declaration//GEN-END:variables
}