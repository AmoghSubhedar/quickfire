package softwaremanager;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import org.json.simple.parser.ParseException;

public class MainMenu extends javax.swing.JFrame {

    public static boolean isAdd;
    
    public MainMenu() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        AddBtn = new javax.swing.JButton();
        EditBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        PrgDesc = new javax.swing.JLabel();
        StartBtn = new javax.swing.JButton();
        PrgName = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        MenuBar = new javax.swing.JMenuBar();
        MenuFile = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        MenuProfile = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("quickfire");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        AddBtn.setText("Add Profile");
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });

        EditBtn.setText("Edit Profile");
        EditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBtnActionPerformed(evt);
            }
        });

        DeleteBtn.setText("Delete Profile");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(DeleteBtn)
                    .addComponent(EditBtn)
                    .addComponent(AddBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(AddBtn)
                .addGap(28, 28, 28)
                .addComponent(EditBtn)
                .addGap(29, 29, 29)
                .addComponent(DeleteBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PrgDesc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PrgDesc.setText("Profile Description");

        StartBtn.setText("Start");
        StartBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartBtnActionPerformed(evt);
            }
        });

        PrgName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PrgName.setText("Profile Name");

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.setEnabled(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(354, 230));
        jPanel2.setLayout(new java.awt.GridLayout(0, 1, 139, 0));

        MenuFile.setText("File");

        jMenuItem1.setText("Quit Application");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        MenuFile.add(jMenuItem1);

        MenuBar.add(MenuFile);

        MenuProfile.setText("Profiles");
        MenuBar.add(MenuProfile);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PrgName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PrgDesc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(StartBtn)))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PrgDesc, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addComponent(PrgName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(StartBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // Save and quit product
        DatabaseManager.saveDB();
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        ProfileManager profile = new ProfileManager();
        isAdd = true;
        // open profile manager window
        profile.main();
    }//GEN-LAST:event_AddBtnActionPerformed
    private void StartBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartBtnActionPerformed
        try {
            //Launch the corresponding batch file
            SoftwareManager.launchProfile();
        } catch (IOException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_StartBtnActionPerformed

    private void ProfileSelect(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProfileSelect
        // Get the component that was selected
        JMenuItem item = (JMenuItem) evt.getSource();
        // Get the text of the menu item
        SoftwareManager.currentProfile.name = item.getText();
        try {
            // Load the file into the currentProfile
            DatabaseManager.readFromFile();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
         // Update the GUI
         refresh();   
        }
    }//GEN-LAST:event_ProfileSelect

    private void EditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBtnActionPerformed
        isAdd = false;
        ProfileManager profile = new ProfileManager();
        profile.main();
        
    }//GEN-LAST:event_EditBtnActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        // Opens the delete profile window
        DeleteForm.main();

    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // Refreshes GUI of main menu everytime window the window is activated
        refresh();
    }//GEN-LAST:event_formWindowActivated

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // Saves the JSON database just before the product closes
        DatabaseManager.saveDB();
    }//GEN-LAST:event_formWindowClosing
    
    public static void main() {
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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu(){{
                    setVisible(true);
                    refresh();
                }};
            }
        });

    }
    public void refresh()
    {
        // remove all the items of the profile drop-down list
        MenuProfile.removeAll();

//            // Re-instantiate all menu items
            for (int i=0;i<DatabaseManager.profiles.size();i++)
            {
                JMenuItem ProfileBtn = new javax.swing.JMenuItem();
                ProfileBtn.setText(DatabaseManager.profiles.get(i));
                ProfileBtn.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        ProfileSelect(evt);
                    }
                });
            MenuProfile.add(ProfileBtn);
            }
            if (! SoftwareManager.currentProfile.name.isEmpty())
            {
                PrgDesc.setText(SoftwareManager.currentProfile.desc);
                PrgName.setText(SoftwareManager.currentProfile.name);
                StartBtn.setEnabled(true);
                StartBtn.setToolTipText("Launches programs");
                EditBtn.setEnabled(true);
                DeleteBtn.setEnabled(true);
                jPanel2.removeAll();

                jPanel2.revalidate();
                jPanel2.repaint();
                pack();
                revalidate();

                Iterator<Program> programs = SoftwareManager.currentProfile.programs.iterator();
                while(programs.hasNext())
                {
                    JLabel lbl = new JLabel(programs.next().name.toString());
                    jPanel2.add(lbl);
                }
            }
            else{
                // Product is probably run for the first time
                // Appropriate guidelines are shown
                PrgDesc.setText("You need to select a profile first");
                PrgName.setText("");
                StartBtn.setEnabled(false);
                EditBtn.setEnabled(false);
                DeleteBtn.setEnabled(false);
                EditBtn.setToolTipText("Select/create a profile first");
                StartBtn.setToolTipText("Select/create a profile first");
            }
    }

    private ArrayList<JLabel> labelsList = new ArrayList<JLabel>();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton EditBtn;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenu MenuFile;
    private javax.swing.JMenu MenuProfile;
    private javax.swing.JLabel PrgDesc;
    private javax.swing.JLabel PrgName;
    private javax.swing.JButton StartBtn;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
    
}