/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Akram
 */
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;
import java.text.*;
import java.awt.print.*;
public class Etudiant extends javax.swing.JFrame {
    Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    /**
     * Creates new form home
     */
    public Etudiant() {
        initComponents();
        setLocationRelativeTo(null);
        conn= connect.ConnecrDb();
        Update_table();
        Fillcombo();
    }
 
        private void Update_table(){
            try{
            String sql = "select Jour,Section,Matiere,Salle,Heure from Exam";
            pst = conn.prepareStatement(sql);
            rs= pst.executeQuery();
            Table_exam.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        }
        public void close(){
    WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
    Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
}
        private void Fillcombo() {
        try{
            String sql = "select * from enseignant ";
            pst = conn.prepareStatement(sql);
            rs= pst.executeQuery();
            while(rs.next()){
            String name=rs.getString("Nom");
            Ens.addItem(name);
            }
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        Table_exam = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txt_jour = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_matiere = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_section = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_salle = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_heure = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btn_ajouter = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        bnt_suppr = new javax.swing.JButton();
        btn_print = new javax.swing.JButton();
        Sessions = new javax.swing.JComboBox<>();
        Ens = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Table_exam.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(Table_exam);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, 495, 395));

        jLabel2.setText("Jour:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, -1));

        txt_jour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_jourActionPerformed(evt);
            }
        });
        getContentPane().add(txt_jour, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 176, -1));

        jLabel3.setText("Matiere:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));

        txt_matiere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_matiereActionPerformed(evt);
            }
        });
        getContentPane().add(txt_matiere, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 176, -1));

        jLabel4.setText("Section:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, -1, -1));

        txt_section.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_sectionActionPerformed(evt);
            }
        });
        getContentPane().add(txt_section, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 176, -1));

        jLabel5.setText("Salle:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, -1, -1));
        getContentPane().add(txt_salle, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, 176, -1));

        jLabel6.setText("Heure:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, -1, -1));

        txt_heure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_heureActionPerformed(evt);
            }
        });
        getContentPane().add(txt_heure, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, 176, -1));

        jLabel7.setText("Enseignant:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, -1, -1));

        btn_ajouter.setText("Ajouter");
        btn_ajouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ajouterActionPerformed(evt);
            }
        });
        getContentPane().add(btn_ajouter, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 520, 110, -1));

        jLabel8.setText("Id:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });
        getContentPane().add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 176, -1));

        bnt_suppr.setText("Supprimer");
        bnt_suppr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt_supprActionPerformed(evt);
            }
        });
        getContentPane().add(bnt_suppr, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 520, -1, -1));

        btn_print.setText("Imprimer");
        btn_print.setToolTipText("Imprimer et Enregistrer ");
        btn_print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_printActionPerformed(evt);
            }
        });
        getContentPane().add(btn_print, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 580, 107, -1));

        Sessions.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Principale ", "Controle" }));
        getContentPane().add(Sessions, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 580, -1, -1));

        getContentPane().add(Ens, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 460, 168, -1));

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Akram\\Desktop\\homebtn.jpg")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 70, 40));

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Akram\\Desktop\\backyess.jpg")); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_jourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_jourActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_jourActionPerformed

    private void txt_matiereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_matiereActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_matiereActionPerformed

    private void txt_sectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_sectionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_sectionActionPerformed

    private void txt_heureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_heureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_heureActionPerformed

    private void txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idActionPerformed

    private void btn_ajouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ajouterActionPerformed
        // TODO add your handling code here:
        try{
         String sql ="Insert into Exam (id_exam,Matiere,Jour,Salle,heure,Enseignant,Section) values(?,?,?,?,?,?,?)";
         pst=conn.prepareStatement(sql); 
         pst.setString(1,txt_id.getText());
         pst.setString(2,txt_matiere.getText());
         pst.setString(3,txt_jour.getText());
         pst.setString(4,txt_salle.getText());
         pst.setString(5,txt_heure.getText());
         pst.setObject(6,Ens.getSelectedItem());
         pst.setString(7,txt_section.getText());
         
         
         pst.execute();
                 JOptionPane.showMessageDialog(null, "Examen Ajouter"); 
                 rs.close();
                pst.close();

        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Salle indisponnible");   
            JOptionPane.showMessageDialog(null, e);        
        }
        Update_table();
    }//GEN-LAST:event_btn_ajouterActionPerformed

    private void bnt_supprActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt_supprActionPerformed
        // TODO add your handling code here
       int p =JOptionPane.showConfirmDialog(null, "Est ce que vous etes sur de supprimer?","Supprimer",JOptionPane.YES_NO_OPTION); 
       if(p==0){
       try{
         String sql ="Delete from Exam where matiere=? ";
         pst=conn.prepareStatement(sql); 
         pst.setString(1,txt_matiere.getText());
         
         pst.execute();
                 JOptionPane.showMessageDialog(null, "Examen supprimer");        

        }catch(Exception e)
        {
        JOptionPane.showMessageDialog(null, e);        
        }
        Update_table();
       }
    }//GEN-LAST:event_bnt_supprActionPerformed

    private void btn_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_printActionPerformed
         MessageFormat header = new MessageFormat("Calendrier des Examens Session:"+Sessions.getSelectedItem());
         MessageFormat footer = new MessageFormat("Page{0,number,integer}");
        try{
           Table_exam.print(JTable.PrintMode.NORMAL,header,footer);
        }catch (java.awt.print.PrinterException e){
        System.err.format("Impression impossible",e.getMessage());
        }
    }//GEN-LAST:event_btn_printActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        choix ch=new choix();
        ch.setVisible(true);
        close();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Etudiant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Etudiant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Etudiant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Etudiant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Etudiant().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Ens;
    private javax.swing.JComboBox<String> Sessions;
    private javax.swing.JTable Table_exam;
    private javax.swing.JButton bnt_suppr;
    private javax.swing.JButton btn_ajouter;
    private javax.swing.JButton btn_print;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_heure;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_jour;
    private javax.swing.JTextField txt_matiere;
    private javax.swing.JTextField txt_salle;
    private javax.swing.JTextField txt_section;
    // End of variables declaration//GEN-END:variables
}
