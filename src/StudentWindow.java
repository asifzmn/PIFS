import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

public class StudentWindow extends javax.swing.JFrame {

    String UserName;
    String FileName;
    String[] FilePile = new String[10];
    Socket s;
    DataInputStream din;
    DataOutputStream dout;

    public StudentWindow(Socket s) throws FileNotFoundException, IOException {
        initComponents();
        init();
        this.s=s;
        Client();
        jComboBox1.removeAllItems();
        jComboBox2.removeAllItems();
        Fetch();
        ProfileSet();
    }

    private StudentWindow() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void Client() throws IOException {
        din = new DataInputStream(s.getInputStream());
        dout = new DataOutputStream(s.getOutputStream());
    }

    public void client2server(String str) throws IOException {
        dout.writeUTF(str);
        dout.flush();
    }

    public String GrabInfo() throws IOException {
        String str = din.readUTF();
        dout.flush();
        System.out.println(str);
        return str;
    }
    
    public void ProfileSet() throws IOException {
        client2server("ProfileName");
        ProfileName.setText( GrabInfo() + " -> " + GrabInfo());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        UpdateBTN = new javax.swing.JButton();
        ChngPass = new javax.swing.JButton();
        DelACCBTN = new javax.swing.JButton();
        ProfileName = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        Logoutbtn = new javax.swing.JButton();
        ExitBTn = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuLogOut = new javax.swing.JMenuItem();
        MenuExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/1493734732_run.png"))); // NOI18N
        jButton3.setText("Go to Post");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setText(" And Post");

        jLabel3.setText("Select Teacher");

        UpdateBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/1493744817_edit.png"))); // NOI18N
        UpdateBTN.setText("Update Profile");
        UpdateBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBTNActionPerformed(evt);
            }
        });

        ChngPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Keys.png"))); // NOI18N
        ChngPass.setText("Change Password");
        ChngPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChngPassActionPerformed(evt);
            }
        });

        DelACCBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/1493745045_Line_ui_icons_Svg-03.png"))); // NOI18N
        DelACCBTN.setText("Delete Account");
        DelACCBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DelACCBTNActionPerformed(evt);
            }
        });

        ProfileName.setEditable(false);

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Teacher.png"))); // NOI18N
        jButton1.setText("Select Teacher");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Logoutbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/1492936666__logout.png"))); // NOI18N
        Logoutbtn.setText("LogOut");
        Logoutbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutbtnActionPerformed(evt);
            }
        });

        ExitBTn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/1492934290_Vector-icons_05.png"))); // NOI18N
        ExitBTn.setText("Exit");
        ExitBTn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitBTnActionPerformed(evt);
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

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ProfileName)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(UpdateBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ChngPass, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(DelACCBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(Logoutbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addComponent(ExitBTn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(ProfileName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UpdateBTN)
                    .addComponent(ChngPass)
                    .addComponent(DelACCBTN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Logoutbtn)
                    .addComponent(ExitBTn))
                .addGap(6, 6, 6))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuLogOutActionPerformed
        close();
        try {
            s.close();
        } catch (IOException ex) {
            Logger.getLogger(TeacherWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        SelectionPage ob = null;
        try {
            ob = new SelectionPage();
        } catch (IOException ex) {
            Logger.getLogger(TeacherWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        ob.setVisible(true);
    }//GEN-LAST:event_MenuLogOutActionPerformed

    private void MenuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuExitActionPerformed
        try {
            s.close();
        } catch (IOException ex) {
            Logger.getLogger(TeacherWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.exit(0);
    }//GEN-LAST:event_MenuExitActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        close();
        TeacherFeed ob = null;
        try {
            client2server("GotoTeacherPost");
            client2server("D:\\FeedBacks\\"+jComboBox1.getSelectedItem().toString()+"\\" + jComboBox2.getSelectedItem().toString());
            String x = jComboBox2.getSelectedItem().toString();
            x = x.substring(0,x.length()-4);
            client2server(x);
        } catch (IOException ex) {
            Logger.getLogger(TeacherWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            ob = new TeacherFeed(s);
            
        } catch (IOException ex) {
            Logger.getLogger(TeacherWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        ob.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void UpdateBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBTNActionPerformed
        UpdateProfilePane x = null;
        try {
            x = new UpdateProfilePane(s);
        } catch (IOException ex) {
            Logger.getLogger(TeacherWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        x.setVisible(true);
    }//GEN-LAST:event_UpdateBTNActionPerformed

    private void ChngPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChngPassActionPerformed
        ChangePasswordPane ob = null;
        try {
            ob = new ChangePasswordPane(s);
        } catch (IOException ex) {
            Logger.getLogger(TeacherWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        ob.setVisible(true);
    }//GEN-LAST:event_ChngPassActionPerformed

    private void DelACCBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DelACCBTNActionPerformed
        close();
        StartPage ob = new StartPage();
        ob.setVisible(true);
        try {
            client2server("DeleteUser");
        } catch (IOException ex) {
            Logger.getLogger(TeacherWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_DelACCBTNActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
       //try {
            //jComboBox2.removeAllItems();
           //FetchPost();
        //} catch (IOException ex) {
         //   Logger.getLogger(StudentWindow.class.getName()).log(Level.SEVERE, null, ex);
        //}
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            jComboBox2.removeAllItems();
            FetchPost();
        } catch (IOException ex) {
            Logger.getLogger(StudentWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void LogoutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutbtnActionPerformed
        close();
        try {
            s.close();
        } catch (IOException ex) {
            Logger.getLogger(TeacherWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        SelectionPage ob = null;
        try {
            ob = new SelectionPage();
        } catch (IOException ex) {
            Logger.getLogger(TeacherWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        ob.setVisible(true);
    }//GEN-LAST:event_LogoutbtnActionPerformed

    private void ExitBTnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitBTnActionPerformed
        try {
            s.close();
        } catch (IOException ex) {
            Logger.getLogger(TeacherWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.exit(0);
    }//GEN-LAST:event_ExitBTnActionPerformed

    void Fetch() throws IOException
    {
        client2server("FetchTeacher");
        while(true){
        String x =  GrabInfo();
        if("".equals(x))
            break;
        jComboBox1.addItem(x);
        }
        FetchPost();
        //System.out.println(jComboBox2.getSelectedItem().toString());
        
    }
    
    void FetchPost() throws IOException
    {
        client2server("FetchPost");
        client2server(jComboBox1.getSelectedItem().toString());
        String x;
            do{
                x = GrabInfo(); 
                if((!"".equals(x)) && (!"desktop.ini".equals(x) ))
                    jComboBox2.addItem(x);
            }while(!"".equals(x));
        
    }
    
    private void init() throws FileNotFoundException, IOException {
        setLocationRelativeTo(null);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        
    }

    public void close() {
        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new StudentWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ChngPass;
    private javax.swing.JButton DelACCBTN;
    private javax.swing.JButton ExitBTn;
    private javax.swing.JButton Logoutbtn;
    private javax.swing.JMenuItem MenuExit;
    private javax.swing.JMenuItem MenuLogOut;
    private javax.swing.JTextField ProfileName;
    private javax.swing.JButton UpdateBTN;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
