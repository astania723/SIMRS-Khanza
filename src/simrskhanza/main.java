/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simrskhanza;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.SwingWorker;
import javax.swing.Timer;
import usu.widget.util.WidgetUtilities;

/**
 *
 * @author admin
 */
public class main extends javax.swing.JFrame {
 Timer timer;
 ActionListener action;
 int a = 0;
    /**
     * Creates new form main
     */
    public main() {
     
//        initComponents();
//        setLocationRelativeTo(this);
//        
//         aksipo();
//         timer = new Timer(100, action);
//        timer.start();
        initComponents();
        setLocationRelativeTo(this);
        setIconImage(new ImageIcon(super.getClass().getResource("/picture/logo-icon.png")).getImage());
         BackgroundWorker bw =new BackgroundWorker();
        bw.execute();
        
    }
    private class BackgroundWorker extends SwingWorker<String, Integer>{
        @Override
        protected String doInBackground() throws Exception {
            frmUtama utama=new frmUtama();
            while( a <100){
                    try{
                   Thread.sleep(20);
                    publish(a);
                   a+=6;
                }catch(Exception e){}
                }
                    utama.isWall();
                    utama.setVisible(true);
                    dispose();
            return "finished";
        }
        @Override
        protected void process(List<Integer> chunks) {
            progressBar.setValue(chunks.get(chunks.size()-1));
        }
 }
   

    
    
//     public void aksipo(){
//        action = new ActionListener() {
//            
//          
//            @Override
//            public void actionPerformed(ActionEvent e) {
//              
//                progressBar.setValue(progressBar.getValue() + 2); //persen progress bar bertambah setiap 5 kali
//                
//                 frmUtama utama=frmUtama.getInstance();
//                 progressBar.setStringPainted(true);
//                if (progressBar.getPercentComplete() == 1.0) {
//                    
//                 timer.stop();
//                  
//             utama.isWall();
//           //utama.setIconImage(new javax.swing.ImageIcon( getClass(). getResource("/picture/home.PNG")).getImage());
//          utama.setVisible(true);
//          dispose();
//                 
//                }
//            }
//            
//        };
//        
//      
//    }
 public void main(String args[]) {
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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                 frmUtama utama=frmUtama.getInstance();
//                utama.isWall();
//                utama.setVisible(true);
//                
//             
//                
//            }
//        });
 new SwingWorker<Void, Integer>(){
                @Override
                public Void doInBackground(){
                     frmUtama utama=frmUtama.getInstance();
                    utama.isWall();
                    utama.setVisible(true);
                    dispose();
                    return null;
                }
                @Override
                public void done(){
//                    utama.isWall();
//                    utama.setVisible(true);
//                    dispose();
                }
                @Override
                protected void process(List<Integer> ints){
                    progressBar.setValue(progressBar.getValue() + 3);
                }


            }.execute();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        progressBar = new javax.swing.JProgressBar();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        progressBar.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        progressBar.setForeground(new java.awt.Color(0, 153, 0));
        progressBar.setFocusable(false);
        progressBar.setPreferredSize(new java.awt.Dimension(146, 20));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/up.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(progressBar, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(215, Short.MAX_VALUE)
                .addComponent(progressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        progressBar.getAccessibleContext().setAccessibleParent(progressBar);

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JProgressBar progressBar;
    // End of variables declaration//GEN-END:variables
}
