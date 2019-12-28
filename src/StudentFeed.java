
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

public class StudentFeed extends javax.swing.JFrame {

    String UserName;
    String FileName;
    String line;
    Socket s;
    DataInputStream din;
    DataOutputStream dout;
    String str;

    public StudentFeed(Socket s) throws FileNotFoundException, IOException {

        initComponents();
        init();
        this.s = s;
        Client();
        TextBox.requestFocusInWindow();
        retrieve();
        ProfileNPostSet();
    }

    private StudentFeed() {
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

    public void ProfileNPostSet() throws IOException {
        client2server("ProfileNPost");
        ProfileName.setText(GrabInfo() + " -> " + GrabInfo() + " -> " + GrabInfo());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TextBox = new javax.swing.JTextField();
        SendBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        ReloadBTN = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        ProfileName = new javax.swing.JTextField();
        BackBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SendBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Send.png"))); // NOI18N
        SendBtn.setText("Send");
        SendBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendBtnActionPerformed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        ReloadBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Recycle.png"))); // NOI18N
        ReloadBTN.setText("Refresh");
        ReloadBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReloadBTNActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Hidden.png"))); // NOI18N
        jButton1.setText("Stealth Send");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        ProfileName.setEditable(false);

        BackBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Back2.png"))); // NOI18N
        BackBTN.setText("Back");
        BackBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ProfileName, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BackBTN)
                        .addGap(18, 18, 18)
                        .addComponent(ReloadBTN))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SendBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ReloadBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BackBTN))
                    .addComponent(ProfileName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SendBtn)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SendBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SendBtnActionPerformed
        if (!"".equals(TextBox.getText())) {
            try {
                client2server("Send");
                client2server(TextBox.getText());
                jTextArea1.append(GrabInfo());
            } catch (IOException ex) {
                Logger.getLogger(TeacherFeed.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        TextBox.setText(null);
        TextBox.requestFocusInWindow();
    }//GEN-LAST:event_SendBtnActionPerformed

    private void ReloadBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReloadBTNActionPerformed
        try {
            jTextArea1.setText(null);
            client2server("Reload");
            retrieve();
        } catch (IOException ex) {
            Logger.getLogger(TeacherFeed.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ReloadBTNActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (!"".equals(TextBox.getText())) {
            try {
                client2server("Stealth Send");
                client2server(TextBox.getText());
                jTextArea1.append(GrabInfo());
            } catch (IOException ex) {
                Logger.getLogger(TeacherFeed.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        TextBox.setText(null);
        TextBox.requestFocusInWindow();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BackBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBTNActionPerformed
        StudentWindow ob = null;
        try {
            ob = new StudentWindow(s);
        } catch (IOException ex) {
            Logger.getLogger(LogInPane.class.getName()).log(Level.SEVERE, null, ex);
        }
        //ob.UserName = TextUser.getText();
        ob.setVisible(true);
        close();
    }//GEN-LAST:event_BackBTNActionPerformed

    public void init() throws FileNotFoundException {
        setLocationRelativeTo(null);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    public void retrieve() throws FileNotFoundException, IOException {

        do {
            line = GrabInfo();
            //System.out.println(line);
            if (!"".equals(line)) {
                jTextArea1.append(line + "\n");
            }
            //jTextArea1.append("0000000000");
        } while (!"".equals(line));
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
            public void run() {
                new StudentFeed().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBTN;
    private javax.swing.JTextField ProfileName;
    private javax.swing.JButton ReloadBTN;
    private javax.swing.JButton SendBtn;
    private javax.swing.JTextField TextBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
