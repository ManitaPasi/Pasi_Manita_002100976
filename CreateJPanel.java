/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.Image;
import javax.swing.ImageIcon;

import java.awt.Toolkit;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import model.Profile;

/**
 *
 * @author dell
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
    Profile profile;
    ImageIcon ii;
    public static String path;
    
    
    public CreateJPanel(Profile profile) {
        initComponents();
        this.profile = profile;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        llblTitle = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblDob = new javax.swing.JLabel();
        lblTel = new javax.swing.JLabel();
        lblFax = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblSSN = new javax.swing.JLabel();
        lblMedicalRecord = new javax.swing.JLabel();
        lblBankAcc = new javax.swing.JLabel();
        lblLicense = new javax.swing.JLabel();
        lblLicensePlateNo = new javax.swing.JLabel();
        lblLinkedin = new javax.swing.JLabel();
        lblIpAddress = new javax.swing.JLabel();
        lblUniqueIdentifier = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtDob = new javax.swing.JTextField();
        txtTel = new javax.swing.JTextField();
        txtFax = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtSSN = new javax.swing.JTextField();
        txtMedicalRecord = new javax.swing.JTextField();
        txtBankAcc = new javax.swing.JTextField();
        txtLicense = new javax.swing.JTextField();
        txtLicensePlateNo = new javax.swing.JTextField();
        txtLinkedin = new javax.swing.JTextField();
        txtIpAddress = new javax.swing.JTextField();
        txtUniqueIdentifier = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        browse = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        llblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        llblTitle.setText("Create Profile");

        lblName.setText("Name:");

        lblAddress.setText("Address:");

        lblDob.setText("Date of Birth:");

        lblTel.setText("Telephone No.:");

        lblFax.setText("Fax No.:");

        lblEmail.setText("Email Id:");

        lblSSN.setText("SSN:");

        lblMedicalRecord.setText("Medical Record No.:");

        lblBankAcc.setText("Bank Account No.:");

        lblLicense.setText("License/Certificate No.:");

        lblLicensePlateNo.setText("Vehicle Identifier:");

        lblLinkedin.setText("LinkedIn:");

        lblIpAddress.setText("IP Address:");

        lblUniqueIdentifier.setText("Unique Identifier:");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameKeyTyped(evt);
            }
        });

        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });
        txtAddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAddressKeyTyped(evt);
            }
        });

        txtDob.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDobKeyTyped(evt);
            }
        });

        txtTel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelKeyTyped(evt);
            }
        });

        txtFax.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFaxKeyTyped(evt);
            }
        });

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmailKeyTyped(evt);
            }
        });

        txtSSN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSSNActionPerformed(evt);
            }
        });
        txtSSN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSSNKeyTyped(evt);
            }
        });

        txtMedicalRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMedicalRecordActionPerformed(evt);
            }
        });
        txtMedicalRecord.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMedicalRecordKeyTyped(evt);
            }
        });

        txtBankAcc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBankAccKeyTyped(evt);
            }
        });

        txtLicense.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLicenseKeyTyped(evt);
            }
        });

        txtLinkedin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLinkedinActionPerformed(evt);
            }
        });

        txtIpAddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIpAddressKeyTyped(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        btnSave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnSaveKeyPressed(evt);
            }
        });

        jLabel1.setText("Upload Picture:");

        browse.setText("Browse..");
        browse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseActionPerformed(evt);
            }
        });

        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(llblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblName)
                    .addComponent(lblUniqueIdentifier)
                    .addComponent(lblIpAddress)
                    .addComponent(lblLinkedin)
                    .addComponent(lblLicensePlateNo)
                    .addComponent(lblLicense)
                    .addComponent(lblBankAcc)
                    .addComponent(lblMedicalRecord)
                    .addComponent(lblSSN)
                    .addComponent(lblEmail)
                    .addComponent(lblFax)
                    .addComponent(lblTel)
                    .addComponent(lblDob)
                    .addComponent(lblAddress)
                    .addComponent(jLabel1))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(browse)
                        .addContainerGap(368, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtName)
                                    .addComponent(txtAddress)
                                    .addComponent(txtDob)
                                    .addComponent(txtTel)
                                    .addComponent(txtFax)
                                    .addComponent(txtEmail)
                                    .addComponent(txtSSN)
                                    .addComponent(txtMedicalRecord)
                                    .addComponent(txtBankAcc)
                                    .addComponent(txtLicense)
                                    .addComponent(txtLicensePlateNo)
                                    .addComponent(txtLinkedin)
                                    .addComponent(txtIpAddress)
                                    .addComponent(txtUniqueIdentifier, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSave)))
                        .addGap(75, 75, 75))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(llblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblAddress)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDob)
                            .addComponent(txtDob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btnSave)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTel)
                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblFax)
                    .addComponent(txtFax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblSSN)
                    .addComponent(txtSSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblMedicalRecord)
                    .addComponent(txtMedicalRecord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblBankAcc)
                    .addComponent(txtBankAcc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblLicense)
                    .addComponent(txtLicense, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLicensePlateNo)
                    .addComponent(txtLicensePlateNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLinkedin)
                    .addComponent(txtLinkedin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIpAddress)
                    .addComponent(txtIpAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUniqueIdentifier)
                    .addComponent(txtUniqueIdentifier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(browse))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(146, Short.MAX_VALUE))
        );

        jLabel1.getAccessibleContext().setAccessibleName("Upload Picture:");
        browse.getAccessibleContext().setAccessibleParent(jLabel1);
    }// </editor-fold>//GEN-END:initComponents

    private void txtLinkedinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLinkedinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLinkedinActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
//         TODO add your handling code here:
        profile.setName(txtName.getText());
//        JOptionPane.showMessageDialog(null, txtAddress.getText());
//        JOptionPane.showMessageDialog(null, txtDob.getText());
//        JOptionPane.showMessageDialog(null, txtTel.getText());
//        JOptionPane.showMessageDialog(null, txtEmail.getText());

        profile.setAddress(txtAddress.getText());
        profile.setDob(txtDob.getText());
        profile.setTel(txtTel.getText());
        profile.setFax(txtFax.getText());
        profile.setEmail(txtEmail.getText());
        profile.setSsn(txtSSN.getText());
        profile.setMedicalrecord(txtMedicalRecord.getText());
        profile.setBankacc(txtBankAcc.getText());
        profile.setLicence(txtLicense.getText());
        profile.setLicenseplateno(txtLicensePlateNo.getText());
        profile.setLinkedin(txtLinkedin.getText());
        profile.setIpaddress(txtIpAddress.getText());
        profile.setUniqueidentifier(txtUniqueIdentifier.getText());
        
        String Name=txtName.getText().toString();
        String Address=txtAddress.getText().toString();
        String Dob=txtDob.getText().toString();
        String Tel=txtTel.getText().toString();
        String Fax=txtFax.getText().toString();
        String Email=txtEmail.getText().toString();
        String SSN=txtSSN.getText().toString();
        String MedicalRecord=txtMedicalRecord.getText().toString();
        String BankAcc=txtBankAcc.getText().toString();
        String License=txtLicense.getText().toString();
        String LicensePlateNo=txtLicensePlateNo.getText().toString();
        String Linkedin=txtLinkedin.getText().toString();
        String IpAddress=txtIpAddress.getText().toString();
        String UniqueIdentifier=txtUniqueIdentifier.getText().toString();
        if(Name.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Name Incomplete");
        }
        if(Address.equals("")){
            JOptionPane.showMessageDialog(null, "Address Incomplete");
        }
        if(Dob.equals("")){
            JOptionPane.showMessageDialog(null, "DOB Incomplete");
        }
        if(Tel.equals("")){
            JOptionPane.showMessageDialog(null, "Telephone No. Incomplete");
        }
        if(Fax.equals("")){
            JOptionPane.showMessageDialog(null, "Fax Incomplete");
        }
        if(Email.equals("")){
            JOptionPane.showMessageDialog(null, "Email Incomplete");
        }
        if(SSN.equals("")){
            JOptionPane.showMessageDialog(null, "SSN Incomplete");
        }
        if(MedicalRecord.equals("")){
            JOptionPane.showMessageDialog(null, "Medical Record No. Incomplete");
        }
        if(BankAcc.equals("")){
            JOptionPane.showMessageDialog(null, "Bank Account No. Incomplete");
        }
        if(License.equals("")){
            JOptionPane.showMessageDialog(null, "License No. Incomplete");
        }
        if(LicensePlateNo.equals("")){
            JOptionPane.showMessageDialog(null, "License Plate No. Incomplete");
        }
        if(Linkedin.equals("")){
            JOptionPane.showMessageDialog(null, "Linkedin Incomplete");
        }
        if(IpAddress.equals("")){
            JOptionPane.showMessageDialog(null, "IpAddress Incomplete");
        }
        if(UniqueIdentifier.equals("")){
            JOptionPane.showMessageDialog(null, "Unique Identifier Incomplete");
        }     
        
        JOptionPane.showMessageDialog(this, "Profile Information Saved");
       
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void txtMedicalRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMedicalRecordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMedicalRecordActionPerformed

    private void browseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseActionPerformed
    JFileChooser chooser = new JFileChooser();
    chooser.showOpenDialog(null);  
    File file = chooser.getSelectedFile();
    path = file.getAbsolutePath();
    //inserting picture into the jlabel
    
    
    
    ii = new ImageIcon(path);
    
    
    
    Image image = ii.getImage().getScaledInstance(jLabel2.getWidth(), jLabel2.getHeight(), WIDTH);
    jLabel2.setIcon(ii);
//    Image im = Toolkit.getDefaultToolkit().createImage(path);
//    im = im.getScaledInstance(image.getWidth(),image.getHeight(),Image.SCALE_SMOOTH);
//    ImageIcon ii = new ImageIcon(im);
//    image.setIcon(ii);
//    
    
// TODO add your handling code here:
    }//GEN-LAST:event_browseActionPerformed

    private void txtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyTyped
        char k = evt.getKeyChar();
        if(k>='0' && k<='9')
        evt.consume();
                // TODO add your handling code here:
    }//GEN-LAST:event_txtNameKeyTyped

    private void txtAddressKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddressKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressKeyTyped

    private void txtDobKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDobKeyTyped
        char k = evt.getKeyChar();
        if(!(k>='0' && k<='9'))
        evt.consume();        // TODO add your handling code here:
    }//GEN-LAST:event_txtDobKeyTyped

    private void txtTelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelKeyTyped
        char k = evt.getKeyChar();
        if(!(k>='0' && k<='9'))
        evt.consume();        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelKeyTyped

    private void txtFaxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFaxKeyTyped
        char k = evt.getKeyChar();
        if(!(k>='0' && k<='9'))
        evt.consume();         // TODO add your handling code here:
    }//GEN-LAST:event_txtFaxKeyTyped

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyTyped
       // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailKeyTyped

    private void txtSSNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSSNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSSNActionPerformed

    private void txtSSNKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSSNKeyTyped
        char k = evt.getKeyChar();
        if(!(k>='0' && k<='9'))
        evt.consume();         // TODO add your handling code here:
    }//GEN-LAST:event_txtSSNKeyTyped

    private void txtMedicalRecordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMedicalRecordKeyTyped
        char k = evt.getKeyChar();
        if(!(k>='0' && k<='9'))
        evt.consume();         // TODO add your handling code here:
    }//GEN-LAST:event_txtMedicalRecordKeyTyped

    private void txtBankAccKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBankAccKeyTyped
        char k = evt.getKeyChar();
        if(!(k>='0' && k<='9'))
        evt.consume();         // TODO add your handling code here:
    }//GEN-LAST:event_txtBankAccKeyTyped

    private void txtLicenseKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLicenseKeyTyped
        char k = evt.getKeyChar();
        if(!(k>='0' && k<='9'))
        evt.consume();         // TODO add your handling code here:
    }//GEN-LAST:event_txtLicenseKeyTyped

    private void txtIpAddressKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIpAddressKeyTyped
        char k = evt.getKeyChar();
        if(!(k>='0' && k<='9'))
        evt.consume();         // TODO add your handling code here:
    }//GEN-LAST:event_txtIpAddressKeyTyped

    private void btnSaveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSaveKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSaveKeyPressed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton browse;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblBankAcc;
    private javax.swing.JLabel lblDob;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFax;
    private javax.swing.JLabel lblIpAddress;
    private javax.swing.JLabel lblLicense;
    private javax.swing.JLabel lblLicensePlateNo;
    private javax.swing.JLabel lblLinkedin;
    private javax.swing.JLabel lblMedicalRecord;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblSSN;
    private javax.swing.JLabel lblTel;
    private javax.swing.JLabel lblUniqueIdentifier;
    private javax.swing.JLabel llblTitle;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtBankAcc;
    private javax.swing.JTextField txtDob;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFax;
    private javax.swing.JTextField txtIpAddress;
    private javax.swing.JTextField txtLicense;
    private javax.swing.JTextField txtLicensePlateNo;
    private javax.swing.JTextField txtLinkedin;
    private javax.swing.JTextField txtMedicalRecord;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSSN;
    private javax.swing.JTextField txtTel;
    private javax.swing.JTextField txtUniqueIdentifier;
    // End of variables declaration//GEN-END:variables
}