package softwaremanager;

import java.awt.GridLayout;
import java.io.File;
import java.lang.String;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

public class ProfileManager extends javax.swing.JFrame {

    public ArrayList<String> paths = new ArrayList<String>();
    public ArrayList<String> progNames= new ArrayList<String>();
    int count=0;
    public Profile prof = new Profile();
    public ProfileManager() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FileChooser = new javax.swing.JFileChooser();
        CancelBtn = new javax.swing.JButton();
        SaveBtn = new javax.swing.JButton();
        AddPanel = new javax.swing.JPanel();
        ErrorLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ChooseProgramBtn = new javax.swing.JButton();
        ProfileName = new javax.swing.JTextField();
        ProfileDescription = new javax.swing.JTextField();
        ListPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Profile Manager");
        setResizable(false);

        CancelBtn.setText("Cancel");
        CancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelBtnActionPerformed(evt);
            }
        });

        SaveBtn.setText("Save");
        SaveBtn.setToolTipText("Save profile");
        SaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBtnActionPerformed(evt);
            }
        });

        ErrorLabel.setForeground(new java.awt.Color(255, 0, 0));

        jLabel1.setText("Name:");

        jLabel2.setText("Description:");

        ChooseProgramBtn.setText("Choose Program");
        ChooseProgramBtn.setToolTipText("Select the program that you want to add to this profile");
        ChooseProgramBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChooseProgramBtnActionPerformed(evt);
            }
        });

        ProfileName.setToolTipText("Enter the name of your profile");

        ProfileDescription.setToolTipText("Enter short description");

        javax.swing.GroupLayout ListPanelLayout = new javax.swing.GroupLayout(ListPanel);
        ListPanel.setLayout(ListPanelLayout);
        ListPanelLayout.setHorizontalGroup(
            ListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 223, Short.MAX_VALUE)
        );
        ListPanelLayout.setVerticalGroup(
            ListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 129, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout AddPanelLayout = new javax.swing.GroupLayout(AddPanel);
        AddPanel.setLayout(AddPanelLayout);
        AddPanelLayout.setHorizontalGroup(
            AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(ChooseProgramBtn)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(ErrorLabel))
                .addGap(18, 18, 18)
                .addGroup(AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ProfileDescription, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                    .addComponent(ProfileName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ListPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AddPanelLayout.setVerticalGroup(
            AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ProfileName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ProfileDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(ListPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(28, Short.MAX_VALUE))
                    .addGroup(AddPanelLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(ChooseProgramBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ErrorLabel)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(302, Short.MAX_VALUE)
                .addComponent(SaveBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CancelBtn)
                .addGap(19, 19, 19))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AddPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AddPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CancelBtn)
                    .addComponent(SaveBtn))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnActionPerformed
        //Save the profile
        if (ProfileName.getText().isEmpty() || ProfileName.getText().indexOf(32) > -1){
            ErrorLabel.setText("Enter a name without spaces");
        }
        else if(ProfileDescription.getText().isEmpty()){
            ErrorLabel.setText("Please enter a description");
        }
        else if(count==0){
            ErrorLabel.setText("Select a program");
        }
        else{
        prof.name = ProfileName.getText();
        prof.desc = ProfileDescription.getText();
        try {
            // to check if it is add or edit action
            if(!MainMenu.isAdd)
            DatabaseManager.deleteProfile(SoftwareManager.currentProfile.name);
            SoftwareManager.currentProfile = prof;
            DatabaseManager.SaveProfile(prof);
        } catch (IOException ex) {
            Logger.getLogger(ProfileManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Closes the profile manager window
        super.dispose();
        }
    }//GEN-LAST:event_SaveBtnActionPerformed

    private void CancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBtnActionPerformed
        super.dispose();
    }//GEN-LAST:event_CancelBtnActionPerformed

    private void ChooseProgramBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChooseProgramBtnActionPerformed
        int returnVal = FileChooser.showOpenDialog(this);
        // To check if a file is chosen by the user
        if (returnVal == FileChooser.APPROVE_OPTION) {
            File file = FileChooser.getSelectedFile();
            progNames.add(file.getName());
            paths.add(file.getAbsolutePath());
            ListPanel.setLayout(new GridLayout(0,1));
            JLabel lbl = new JLabel(file.getName());
            ListPanel.add(lbl);
            ListPanel.revalidate();
            ListPanel.repaint();
            prof.programs.add(new Program(file.getName(),file.getAbsolutePath()));
            count++;
        } else {
            System.out.println("File access cancelled by user.");
        }
    }//GEN-LAST:event_ChooseProgramBtnActionPerformed
    public static void main() {
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
            java.util.logging.Logger.getLogger(ProfileManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProfileManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProfileManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProfileManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                if (MainMenu.isAdd)
                new ProfileManager().setVisible(true);
                else
                new ProfileManager(){{
                    setVisible(true);
                    editEnabled();
                }};    
            }
        });
    }
    public void editEnabled(){
        // pre-load data into text fields if user is editing a profile
        ProfileName.setText(SoftwareManager.currentProfile.name);
        ProfileDescription.setText(SoftwareManager.currentProfile.desc);
        ListPanel.setLayout(new GridLayout(0,1));
        for(int i=0;i<SoftwareManager.currentProfile.programs.size();i++){
        JLabel lbl = new JLabel(SoftwareManager.currentProfile.programs.get(i).name);
        ListPanel.add(lbl);
        count++;
        }
        ListPanel.revalidate();
        ListPanel.repaint();
        prof.programs = SoftwareManager.currentProfile.programs;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddPanel;
    private javax.swing.JButton CancelBtn;
    private javax.swing.JButton ChooseProgramBtn;
    private javax.swing.JLabel ErrorLabel;
    private javax.swing.JFileChooser FileChooser;
    private javax.swing.JPanel ListPanel;
    private javax.swing.JTextField ProfileDescription;
    private javax.swing.JTextField ProfileName;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
