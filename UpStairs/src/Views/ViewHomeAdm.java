/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

/**
 *
 * @author thaia
 */
public class ViewHomeAdm extends javax.swing.JFrame {

    /**
     * Creates new form ViewHomeAdm
     */
    public ViewHomeAdm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pHome = new javax.swing.JPanel();
        lLogoP = new javax.swing.JLabel();
        lProfessores = new javax.swing.JLabel();
        lProfessores1 = new javax.swing.JLabel();
        lImgPerfil = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pStudents = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lImgAlunos = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pStudents1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lImgAlunos1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pHome.setBackground(new java.awt.Color(0, 51, 153));

        lLogoP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/logo PP.png"))); // NOI18N

        lProfessores.setBackground(new java.awt.Color(0, 51, 153));
        lProfessores.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        lProfessores.setForeground(new java.awt.Color(255, 255, 255));
        lProfessores.setText("NEW USER ");

        lProfessores1.setBackground(new java.awt.Color(0, 51, 153));
        lProfessores1.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        lProfessores1.setForeground(new java.awt.Color(255, 255, 255));
        lProfessores1.setText("TEACHERS");

        lImgPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/PERFIL.png"))); // NOI18N

        jLabel1.setBackground(new java.awt.Color(0, 51, 153));
        jLabel1.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("User");

        javax.swing.GroupLayout pHomeLayout = new javax.swing.GroupLayout(pHome);
        pHome.setLayout(pHomeLayout);
        pHomeLayout.setHorizontalGroup(
            pHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pHomeLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(lLogoP)
                .addGap(220, 220, 220)
                .addComponent(lProfessores1)
                .addGap(49, 49, 49)
                .addComponent(lProfessores)
                .addGap(219, 219, 219)
                .addGroup(pHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lImgPerfil))
                .addGap(81, 81, 81))
        );
        pHomeLayout.setVerticalGroup(
            pHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pHomeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pHomeLayout.createSequentialGroup()
                        .addComponent(lImgPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addGap(22, 22, 22))
                    .addGroup(pHomeLayout.createSequentialGroup()
                        .addComponent(lLogoP)
                        .addGap(8, 8, 8))))
            .addGroup(pHomeLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(pHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lProfessores1)
                    .addComponent(lProfessores)))
        );

        pStudents.setBackground(new java.awt.Color(255, 255, 255));
        pStudents.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, null, null));

        lImgAlunos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/STUDENTS.png"))); // NOI18N

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("STUDENTS");

        javax.swing.GroupLayout pStudentsLayout = new javax.swing.GroupLayout(pStudents);
        pStudents.setLayout(pStudentsLayout);
        pStudentsLayout.setHorizontalGroup(
            pStudentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pStudentsLayout.createSequentialGroup()
                .addGroup(pStudentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pStudentsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lImgAlunos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pStudentsLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pStudentsLayout.setVerticalGroup(
            pStudentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pStudentsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pStudentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lImgAlunos)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pStudents1.setBackground(new java.awt.Color(255, 255, 255));
        pStudents1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, null, null));

        lImgAlunos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CLASSES.png"))); // NOI18N

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("CLASSES");

        javax.swing.GroupLayout pStudents1Layout = new javax.swing.GroupLayout(pStudents1);
        pStudents1.setLayout(pStudents1Layout);
        pStudents1Layout.setHorizontalGroup(
            pStudents1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pStudents1Layout.createSequentialGroup()
                .addGroup(pStudents1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pStudents1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lImgAlunos1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pStudents1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pStudents1Layout.setVerticalGroup(
            pStudents1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pStudents1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pStudents1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lImgAlunos1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pStudents, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(pStudents1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(210, 210, 210))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pHome, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pStudents, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pStudents1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 146, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ViewHomeAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewHomeAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewHomeAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewHomeAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewHomeAdm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lImgAlunos;
    private javax.swing.JLabel lImgAlunos1;
    private javax.swing.JLabel lImgPerfil;
    private javax.swing.JLabel lLogoP;
    private javax.swing.JLabel lProfessores;
    private javax.swing.JLabel lProfessores1;
    private javax.swing.JPanel pHome;
    private javax.swing.JPanel pStudents;
    private javax.swing.JPanel pStudents1;
    // End of variables declaration//GEN-END:variables
}
