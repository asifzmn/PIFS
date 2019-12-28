
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class ProfileChecker extends javax.swing.JFrame {

    private Connection connection = null;
    private PreparedStatement pst = null;
    private ResultSet resultSet = null;
    String UserName;

    public ProfileChecker() {
        initComponents();
        init();
        connection = JavaDbConnect.dbConnect("Educational");
        StudentInfoTb();
        Time();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DeleteUserButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStudentInfo = new javax.swing.JTable();
        Name = new javax.swing.JTextField();
        Pass = new javax.swing.JTextField();
        SearchBox = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        UpdateUserButton = new javax.swing.JButton();
        InsertButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuLogOut = new javax.swing.JMenuItem();
        MenuExit = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        OfflineHelp = new javax.swing.JMenuItem();
        OnlineHelp = new javax.swing.JCheckBoxMenuItem();
        TimeDisplay = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        DeleteUserButton.setText("Delete User");
        DeleteUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteUserButtonActionPerformed(evt);
            }
        });

        tblStudentInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblStudentInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblStudentInfoMouseClicked(evt);
            }
        });
        tblStudentInfo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblStudentInfoKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblStudentInfo);

        SearchBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SearchBoxKeyReleased(evt);
            }
        });

        jLabel1.setText("DisplaY");

        jLabel3.setText("Search");

        UpdateUserButton.setText("Update User");
        UpdateUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateUserButtonActionPerformed(evt);
            }
        });

        InsertButton.setText("Insert User");
        InsertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertButtonActionPerformed(evt);
            }
        });

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jMenuBar1.setBackground(new java.awt.Color(204, 255, 204));

        jMenu1.setText("File");

        MenuLogOut.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.ALT_MASK));
        MenuLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/1492936666__logout.png"))); // NOI18N
        MenuLogOut.setText("Log Out");
        MenuLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuLogOutActionPerformed(evt);
            }
        });
        jMenu1.add(MenuLogOut);

        MenuExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        MenuExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/1492934290_Vector-icons_05.png"))); // NOI18N
        MenuExit.setText("Exit");
        MenuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuExitActionPerformed(evt);
            }
        });
        jMenu1.add(MenuExit);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Help");

        OfflineHelp.setText("Offline Help");
        OfflineHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OfflineHelpActionPerformed(evt);
            }
        });
        jMenu3.add(OfflineHelp);

        OnlineHelp.setSelected(true);
        OnlineHelp.setText("Online Help");
        OnlineHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OnlineHelpActionPerformed(evt);
            }
        });
        jMenu3.add(OnlineHelp);

        jMenuBar1.add(jMenu3);

        TimeDisplay.setText("jMenu2");
        jMenuBar1.add(TimeDisplay);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Name)
                    .addComponent(Pass)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SearchBox, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(UpdateUserButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DeleteUserButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(InsertButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(123, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(UpdateUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(DeleteUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(InsertButton, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(SearchBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DeleteUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteUserButtonActionPerformed

        String Query = "delete from " + "Student" + " where User=" + "?" + "";
        try {
            pst = connection.prepareStatement(Query);
            pst.setString(1, Name.getText());
            pst.execute();
            fetch();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        StudentInfoTb();
    }//GEN-LAST:event_DeleteUserButtonActionPerformed

    private void fetch() {
        Name.setText("");
        Pass.setText("");
    }

    private void MenuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_MenuExitActionPerformed

    private void MenuLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuLogOutActionPerformed
        close();
        SelectionPage ob = null;
        try {
            ob = new SelectionPage();
        } catch (IOException ex) {
            Logger.getLogger(ProfileChecker.class.getName()).log(Level.SEVERE, null, ex);
        }
        ob.setVisible(true);
    }//GEN-LAST:event_MenuLogOutActionPerformed

    private void tblStudentInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblStudentInfoMouseClicked
        select();
    }//GEN-LAST:event_tblStudentInfoMouseClicked

    private void tblStudentInfoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblStudentInfoKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_UP || evt.getKeyCode() == KeyEvent.VK_DOWN) {
            select();
        }
    }//GEN-LAST:event_tblStudentInfoKeyReleased

    private void OfflineHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OfflineHelpActionPerformed
        try {
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + "Files\\BluePrint.PNG");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex + " Help not available");
        }
    }//GEN-LAST:event_OfflineHelpActionPerformed

    private void OnlineHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OnlineHelpActionPerformed
        String url = "http://en.uesp.net/wiki/Main_Page";
        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex + "1");
        }
    }//GEN-LAST:event_OnlineHelpActionPerformed

    private void SearchBoxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchBoxKeyReleased
        String a = SearchBox.getText();
        search(a, "User");
        search(a, "Pass");
    }//GEN-LAST:event_SearchBoxKeyReleased

    private void UpdateUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateUserButtonActionPerformed
        try {
            String sql = "update Student set Pass=? where User=?";
            pst = connection.prepareStatement(sql);
            //pst.setString(1,Name.getText());
            pst.setString(1, Pass.getText());

            pst.setString(2, Name.getText());
            pst.execute();
            resultSet.close();
            pst.close();
            StudentInfoTb();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex + "1");
        }
    }//GEN-LAST:event_UpdateUserButtonActionPerformed

    private void InsertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertButtonActionPerformed
        try {
            String Query = "insert into " + "Student" + "(User,Pass) values(?,?)";
            pst = connection.prepareStatement(Query);
            pst.setString(1, Name.getText());
            pst.setString(2, Pass.getText());
            pst.execute();

            try {
                //resultSet.close();
                pst.close();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex + "123");
            }
            StudentInfoTb();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + "1234");
        }

    }//GEN-LAST:event_InsertButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        close();
        TeacherWindow ob = null;
        //try {
         //   ob = new TeacherWindow();
        //} catch (FileNotFoundException ex) {
         //   Logger.getLogger(StudentChecker.class.getName()).log(Level.SEVERE, null, ex);
        //}
        ob.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void search(String x, String y) {
        try {
            String sql = "select * from Student where " + y + " = '" + x + "'";
            pst = connection.prepareStatement(sql);
            resultSet = pst.executeQuery();
            //JOptionPane.showMessageDialog(null,x);

            if (resultSet.next()) {
                Name.setText(resultSet.getString("User"));
                Pass.setText(resultSet.getString("Pass"));
            }

            resultSet.close();
            pst.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex + "1");
        }
    }

    public void select() {
        int row = tblStudentInfo.getSelectedRow();
        try {
            String TableClick = (tblStudentInfo.getModel().getValueAt(row, 0).toString());
            //JOptionPane.showMessageDialog(null,TableClick);
            String sql = "select * from Student where User = '" + TableClick + "'";
            pst = connection.prepareStatement(sql);
            resultSet = pst.executeQuery();

            if (resultSet.next()) {
                Name.setText(resultSet.getString("User"));
                Pass.setText(resultSet.getString("Pass"));
            }

            resultSet.close();
            pst.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex + "1");
        }
    }

    public void init() {
        setLocationRelativeTo(null);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    public void close() {
        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }

    public void StudentInfoTb() {
        try {
            String sql = "select User from Student";
            pst = connection.prepareStatement(sql);
            resultSet = pst.executeQuery();
            tblStudentInfo.setModel(DbUtils.resultSetToTableModel(resultSet));

            resultSet.close();
            pst.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex + "1234");
        }
    }

    public void Time() {
        Calendar cal = new GregorianCalendar();
        int second = cal.get(Calendar.SECOND);
        int minute = cal.get(Calendar.MINUTE);
        int hour = cal.get(Calendar.HOUR);

        TimeDisplay.setText("Logged in at: " + hour + ":" + minute + ":" + minute);
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProfileChecker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProfileChecker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProfileChecker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProfileChecker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProfileChecker().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteUserButton;
    private javax.swing.JButton InsertButton;
    private javax.swing.JMenuItem MenuExit;
    private javax.swing.JMenuItem MenuLogOut;
    private javax.swing.JTextField Name;
    private javax.swing.JMenuItem OfflineHelp;
    private javax.swing.JCheckBoxMenuItem OnlineHelp;
    private javax.swing.JTextField Pass;
    private javax.swing.JTextField SearchBox;
    private javax.swing.JMenu TimeDisplay;
    private javax.swing.JButton UpdateUserButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblStudentInfo;
    // End of variables declaration//GEN-END:variables
}
