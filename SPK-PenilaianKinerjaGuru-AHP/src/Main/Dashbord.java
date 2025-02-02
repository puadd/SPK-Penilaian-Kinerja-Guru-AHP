/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Form.Form_Guru;
import Form.Form_HasilAkhir;
import Form.Form_Kriteria;
import Form.Form_Rangking;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import Form.Form_User;
import Form.Form_hasilAlternatif;
import Form.Form_hasilKriteria;
import Form.Form_penilaianAlternatif;
import Form.Form_penilaianKriteria;
import Form.Report;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Dashbord extends javax.swing.JFrame {

    private String jabatan;
    /**
     * Creates new form Dashbord
     */
    public Dashbord(String jabatan) {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.jabatan = jabatan;
        execute();
    }

    public Dashbord() throws HeadlessException {
    }
    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_navbar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pn_sidebar = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        pn_menu = new javax.swing.JPanel();
        pn_content = new javax.swing.JPanel();
        pn_utama = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pn_navbar.setBackground(new java.awt.Color(26, 83, 25));
        pn_navbar.setPreferredSize(new java.awt.Dimension(1060, 165));

        jLabel1.setFont(new java.awt.Font("Lucida Fax", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(214, 239, 216));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/Logo dashboard.png"))); // NOI18N
        jLabel1.setText("SMK YAPPA DEPOK");

        javax.swing.GroupLayout pn_navbarLayout = new javax.swing.GroupLayout(pn_navbar);
        pn_navbar.setLayout(pn_navbarLayout);
        pn_navbarLayout.setHorizontalGroup(
            pn_navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_navbarLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 965, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        pn_navbarLayout.setVerticalGroup(
            pn_navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_navbarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(pn_navbar, java.awt.BorderLayout.PAGE_START);

        pn_sidebar.setBackground(new java.awt.Color(128, 175, 129));
        pn_sidebar.setPreferredSize(new java.awt.Dimension(390, 0));

        jScrollPane2.setBackground(new java.awt.Color(128, 175, 129));
        jScrollPane2.setBorder(null);

        pn_menu.setBackground(new java.awt.Color(214, 239, 216));
        pn_menu.setLayout(new javax.swing.BoxLayout(pn_menu, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane2.setViewportView(pn_menu);

        javax.swing.GroupLayout pn_sidebarLayout = new javax.swing.GroupLayout(pn_sidebar);
        pn_sidebar.setLayout(pn_sidebarLayout);
        pn_sidebarLayout.setHorizontalGroup(
            pn_sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
        );
        pn_sidebarLayout.setVerticalGroup(
            pn_sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );

        getContentPane().add(pn_sidebar, java.awt.BorderLayout.WEST);

        pn_content.setBackground(new java.awt.Color(255, 255, 255));

        pn_utama.setBackground(new java.awt.Color(255, 255, 255));
        pn_utama.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout pn_contentLayout = new javax.swing.GroupLayout(pn_content);
        pn_content.setLayout(pn_contentLayout);
        pn_contentLayout.setHorizontalGroup(
            pn_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_utama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pn_contentLayout.setVerticalGroup(
            pn_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_utama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(pn_content, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        pn_utama.add(new content_bg());
        pn_utama.repaint();
        pn_utama.revalidate();
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(Dashbord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashbord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashbord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashbord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashbord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pn_content;
    private javax.swing.JPanel pn_menu;
    private javax.swing.JPanel pn_navbar;
    private javax.swing.JPanel pn_sidebar;
    private javax.swing.JPanel pn_utama;
    // End of variables declaration//GEN-END:variables

    private void execute() {
        ImageIcon iconHome = new ImageIcon(getClass().getResource("/Gambar/iHome.png"));
        ImageIcon iconMaster = new ImageIcon(getClass().getResource("/Gambar/iMaster.png"));
        ImageIcon iconTransaksi = new ImageIcon(getClass().getResource("/Gambar/iPenilaian32.png"));
        ImageIcon iconRanking = new ImageIcon(getClass().getResource("/Gambar/iRank.png"));
        ImageIcon iconReport = new ImageIcon(getClass().getResource("/Gambar/iReport32.png"));
        ImageIcon iconLogout = new ImageIcon(getClass().getResource("/Gambar/Logout.png"));
        ImageIcon iconUser = new ImageIcon(getClass().getResource("/Gambar/iUser.png"));
        ImageIcon iconGuru = new ImageIcon(getClass().getResource("/Gambar/iGuru.png"));
        ImageIcon iconKriteria = new ImageIcon(getClass().getResource("/Gambar/iKriteria.png"));
        ImageIcon iconHasilKriteria = new ImageIcon(getClass().getResource("/Gambar/iHasilKriteria.png"));
        ImageIcon iconHasilAlternatif = new ImageIcon(getClass().getResource("/Gambar/iHasilAlt.png"));
        ImageIcon iconHasilPerhitungan = new ImageIcon(getClass().getResource("/Gambar/iNilaihasil.png"));
        
        
        MenuItem masterUser = new MenuItem (null, true, iconUser, "Data User", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                pn_utama.removeAll();
                pn_utama.add(new Form_User());
                pn_utama.repaint();
                pn_utama.revalidate();
            }
        });
        
        MenuItem masterGuru = new MenuItem (null, true, iconGuru, "Data Guru", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                pn_utama.removeAll();
                pn_utama.add(new Form_Guru());
                pn_utama.repaint();
                pn_utama.revalidate();
            }
        });
        
        MenuItem masterKriteria = new MenuItem (null, true, iconKriteria, "Data Kriteria", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                pn_utama.removeAll();
                pn_utama.add(new Form_Kriteria());
                pn_utama.repaint();
                pn_utama.revalidate();
            }
        });
        
        MenuItem masterPkriteria = new MenuItem (null, true, iconKriteria, "Penilaian Kriteria", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                pn_utama.removeAll();
                pn_utama.add(new Form_penilaianKriteria());
                pn_utama.repaint();
                pn_utama.revalidate();
            }
        });
        
        MenuItem masterHasilkriteria = new MenuItem (null, true, iconHasilKriteria, "Hasil Nilai Kriteria", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                pn_utama.removeAll();
                pn_utama.add(new Form_hasilKriteria());
                pn_utama.repaint();
                pn_utama.revalidate();
            }
        });
        
        MenuItem masterPKG = new MenuItem (null, true, iconKriteria, "Penilaian Kinerja Guru", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
               pn_utama.removeAll();
               pn_utama.add(new Form_penilaianAlternatif());
               pn_utama.repaint();
               pn_utama.revalidate();
            }
        });
        
        MenuItem masterHslalter = new MenuItem (null, true, iconHasilAlternatif, "Hasil Nilai Alternatif", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
               pn_utama.removeAll();
               pn_utama.add(new Form_hasilAlternatif());
               pn_utama.repaint();
               pn_utama.revalidate();
            }
        });
        
        if (jabatan.equals("Admin")){
        MenuItem menuHome = new MenuItem(iconHome, false, null, "Home", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                pn_utama.removeAll();
                pn_utama.add(new content_bg());
                pn_utama.repaint();
                pn_utama.revalidate();
            }
        });
        MenuItem menuMaster = new MenuItem(iconMaster, false, null, "master", null, masterUser, masterGuru, masterKriteria);
        MenuItem menuTransaksi = new MenuItem(iconTransaksi, false, null, "Penilaian", null, masterPkriteria, masterHasilkriteria, masterPKG, masterHslalter);
        MenuItem menuReport = new MenuItem(iconReport, false, null, "Report", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                pn_utama.removeAll();
                pn_utama.add(new Report());
                pn_utama.repaint();
                pn_utama.revalidate();
            }
        });
        MenuItem menuHasil = new MenuItem(iconHasilPerhitungan, false, null, "Hasil", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                pn_utama.removeAll();
                pn_utama.add(new Form_Rangking());
                pn_utama.repaint();
                pn_utama.revalidate();
            }
        });
        MenuItem menuRangking = new MenuItem(iconRanking, false, null, "Rangking", new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                pn_utama.removeAll();
                pn_utama.add(new Form_HasilAkhir());
                pn_utama.repaint();
                pn_utama.revalidate();
            }
        });
        MenuItem menuLogout = new MenuItem(iconLogout, false, null, "Logout", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                int dialogBtn = JOptionPane.YES_NO_OPTION;
                int dialogResult = JOptionPane.showConfirmDialog(null, "Anda yakin akan keluar?", null, dialogBtn);
                
                if (dialogResult == 0){
                dispose();
                new Form_login().setVisible(true);
                }else{}
            }
        });
        
        addMenu(menuHome, menuMaster, menuTransaksi, menuHasil, menuRangking,menuReport, menuLogout); 
        }
        else if(jabatan.equals("Kepala Sekolah")){
         MenuItem menuHome = new MenuItem(iconHome, false, null, "Home", new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent ae) {
                pn_utama.removeAll();
                pn_utama.add(new content_bg());
                pn_utama.repaint();
                pn_utama.revalidate();
             }
         });
         MenuItem menuReport = new MenuItem(iconReport, false, null, "Report", new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent ae) {
                pn_utama.removeAll();
                pn_utama.add(new Report());
                pn_utama.repaint();
                pn_utama.revalidate();
             }
         });
         MenuItem menuLogout = new MenuItem(iconLogout, false, null, "Logout", new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent ae) {
                 int dialogBtn = JOptionPane.YES_NO_OPTION;
                int dialogResult = JOptionPane.showConfirmDialog(null, "Anda yakin akan keluar?", null, dialogBtn);
                
                if (dialogResult == 0){
                dispose();
                new Form_login().setVisible(true);
                }else{}
             }
        });
        addMenu(menuHome, menuReport, menuLogout);
        }
    }
    private void addMenu(MenuItem... menu){
        for (int i = 0; i<menu.length; i++){
            pn_menu.add(menu[i]);
            ArrayList<MenuItem> subMenu = menu[i].getSubMenu();
            for (MenuItem m : subMenu){
                addMenu(m);
            }
        }
        pn_menu.revalidate();
    }
}
