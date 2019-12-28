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

public class TeacherWindow extends javax.swing.JFrame {

    String UserName;
    String FileName;
    String[] FilePile = new String[10];
    Socket s;
    DataInputStream din;
    DataOutputStream dout;

    public TeacherWindow(Socket s) throws FileNotFoundException, IOException {
        initComponents();
        init();
        this.s=s;
        Client();
        Fetch();
        ProfileSet();
    }

    private TeacherWindow() {
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
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Create = new javax.swing.JTextField();
        CreateBTN = new javax.swing.JButton();
        DelBTN = new javax.swing.JButton();
        UpdateBTN = new javax.swing.JButton();
        ChngPass = new javax.swing.JButton();
        DelACCBTN = new javax.swing.JButton();
        ProfileName = new javax.swing.JTextField();
        Logoutbtn = new javax.swing.JButton();
        ExitBTn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/1493734732_run.png"))); // NOI18N
        jButton3.setText("Go to Post");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setText("Current Posts");

        jLabel3.setText("Create Post");

        Create.setText("Random Post");

        CreateBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Plus.png"))); // NOI18N
        CreateBTN.setText("Create Post");
        CreateBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateBTNActionPerformed(evt);
            }
        });

        DelBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Cross.png"))); // NOI18N
        DelBTN.setText("Delete");
        DelBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DelBTNActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(UpdateBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(ChngPass, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ProfileName)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Create, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DelBTN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                            .addComponent(CreateBTN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DelACCBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(Logoutbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(ExitBTn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(ProfileName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Create, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CreateBTN))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DelBTN)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChngPass)
                    .addComponent(UpdateBTN)
                    .addComponent(DelACCBTN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Logoutbtn)
                    .addComponent(ExitBTn))
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if("".equals(jComboBox1.getSelectedItem().toString()))
            return;
        close();
        TeacherFeed ob = null;
        try {
            client2server("GotoPost");
            String x = jComboBox1.getSelectedItem().toString();
            client2server("D:\\FeedBacks\\"+ GrabInfo()+"\\" + x);
            
            x = jComboBox1.getSelectedItem().toString();
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

    private void CreateBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateBTNActionPerformed
        
        try {
            client2server("CreatePost");
            client2server("D:\\FeedBacks\\"+ GrabInfo()+"\\" + Create.getText());
        } catch (IOException ex) {
            Logger.getLogger(TeacherWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            jComboBox1.removeAllItems();
            Fetch();
        } catch (IOException ex) {
            Logger.getLogger(TeacherWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_CreateBTNActionPerformed

    private void DelBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DelBTNActionPerformed
        try {
            client2server("DeletePost");
            client2server("D:\\FeedBacks\\" + jComboBox1.getSelectedItem().toString());
        } catch (IOException ex) {
            Logger.getLogger(TeacherWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            jComboBox1.removeAllItems();
            Fetch();
        } catch (IOException ex) {
            Logger.getLogger(TeacherWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_DelBTNActionPerformed

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
        client2server("Fetch");
        String x;
            do{
                x = GrabInfo(); 
                if((!"".equals(x)) && (!"desktop.ini".equals(x) ))
                    jComboBox1.addItem(x);
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
                new TeacherWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ChngPass;
    private javax.swing.JTextField Create;
    private javax.swing.JButton CreateBTN;
    private javax.swing.JButton DelACCBTN;
    private javax.swing.JButton DelBTN;
    private javax.swing.JButton ExitBTn;
    private javax.swing.JButton Logoutbtn;
    private javax.swing.JTextField ProfileName;
    private javax.swing.JButton UpdateBTN;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
