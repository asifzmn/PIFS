import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class StartPage extends javax.swing.JFrame {

    public StartPage() {
        setTitle("Welcome to PIFS");
        initComponents();
        init();
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
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        BeginButton = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel1KeyPressed(evt);
            }
        });
        jPanel1.setLayout(null);

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/1493735207_profle.png"))); // NOI18N
        jButton1.setText("About Us");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(80, 370, 121, 50);

        BeginButton.setBackground(new java.awt.Color(204, 204, 204));
        BeginButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/1493734732_run.png"))); // NOI18N
        BeginButton.setText("Lets Begin");
        BeginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BeginButtonActionPerformed(evt);
            }
        });
        jPanel1.add(BeginButton);
        BeginButton.setBounds(300, 370, 135, 50);

        jButton3.setBackground(new java.awt.Color(153, 153, 153));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/1493735029_question_enquiry_button_feedback_help_support.png"))); // NOI18N
        jButton3.setText("Need Help?");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(590, 370, 107, 50);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel4.setText("Feedback System");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(80, 260, 380, 58);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel3.setText("And");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(230, 200, 130, 58);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel2.setText("Personnel Interaction ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 150, 470, 50);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setText("Welcome to ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(110, 90, 270, 72);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Ques.png"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(590, 160, 40, 40);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ChatCloud.png"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(620, 310, 50, 50);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Star.png"))); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(500, 100, 50, 50);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Doc2.png"))); // NOI18N
        jPanel1.add(jLabel10);
        jLabel10.setBounds(530, 250, 60, 60);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Monitor.png"))); // NOI18N
        jPanel1.add(jLabel9);
        jLabel9.setBounds(650, 40, 50, 60);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/5157322-hexagon-wallpaper1.jpg"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(0, 0, 720, 460);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 722, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        close();
        AboutUs ob = new AboutUs();
        ob.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BeginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BeginButtonActionPerformed
        close();
        SelectionPage ob = null;
        try {
            ob = new SelectionPage();
        } catch (IOException ex) {
            Logger.getLogger(StartPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        ob.setVisible(true);
    }//GEN-LAST:event_BeginButtonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try 
    {
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+"Files\\Welcome-to-Personnel-Interaction-and-Feedback-System.pptx");
    }
    catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex );
    }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        
    }//GEN-LAST:event_formKeyPressed

    private void jPanel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel1KeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_F1)
        { try {
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + "Files\\BluePrint.PNG");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex + " Help not available");
        }}
    }//GEN-LAST:event_jPanel1KeyPressed

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
            java.util.logging.Logger.getLogger(StartPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BeginButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
