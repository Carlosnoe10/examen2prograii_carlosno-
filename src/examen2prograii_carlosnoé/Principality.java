package examen2prograii_carlosnoé;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.DefaultListModel;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

public class Principality extends javax.swing.JFrame {

    static ArrayList<Deporte> Sport;
    static Object objetoS;

    public void ORdenar(){
        Collections.sort(equipos, new Comparator<Equipo>() {
    public int compare(Equipo e1, Equipo e2) {
        return e1.getPosicion() - e2.getPosicion();
    }
});

// Crear un modelo de lista con los elementos ordenados
DefaultListModel<Equipo> model = new DefaultListModel<>();
for (Equipo equipo : equipos) {
    model.addElement(equipo);
}
    } 
    
    public void ArActu() {
        javax.swing.tree.DefaultMutableTreeNode treeNode0 = new javax.swing.tree.DefaultMutableTreeNode("Torneos");
        JtreeDPs.setModel(new javax.swing.tree.DefaultTreeModel(treeNode0));
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Q1");
        treeNode0.add(treeNode1);
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Q2");
        treeNode0.add(treeNode2);
        javax.swing.tree.DefaultMutableTreeNode treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Q4");
        treeNode0.add(treeNode4);
        javax.swing.tree.DefaultMutableTreeNode treeNode5 = new javax.swing.tree.DefaultMutableTreeNode("Q5");
        treeNode0.add(treeNode5);

        for (Deporte MODS : Sport) {
            for (int i = 0; i < MODS.getQQDP().size(); i++) {
                if (MODS.getQQDP().get(i).getPeriodoRZ().equalsIgnoreCase("Q1")) {
                    javax.swing.tree.DefaultMutableTreeNode treeNode = new javax.swing.tree.DefaultMutableTreeNode(MODS.getNombre());
                    treeNode1.add(treeNode);
                    javax.swing.tree.DefaultMutableTreeNode treeNode6 = new javax.swing.tree.DefaultMutableTreeNode(MODS.getQQDP().get(i).getNombre());
                    treeNode.add(treeNode6);
                } else if (MODS.getQQDP().get(i).getPeriodoRZ().equalsIgnoreCase("Q2")) {
                    javax.swing.tree.DefaultMutableTreeNode treeNode = new javax.swing.tree.DefaultMutableTreeNode(MODS.getNombre());
                    treeNode2.add(treeNode);
                    javax.swing.tree.DefaultMutableTreeNode treeNode6 = new javax.swing.tree.DefaultMutableTreeNode(MODS.getQQDP().get(i).getNombre());
                    treeNode.add(treeNode6);
                } else if (MODS.getQQDP().get(i).getPeriodoRZ().equalsIgnoreCase("Q4")) {
                    javax.swing.tree.DefaultMutableTreeNode treeNode = new javax.swing.tree.DefaultMutableTreeNode(MODS.getNombre());
                    treeNode4.add(treeNode);
                    javax.swing.tree.DefaultMutableTreeNode treeNode6 = new javax.swing.tree.DefaultMutableTreeNode(MODS.getQQDP().get(i).getNombre());
                    treeNode.add(treeNode6);
                } else if (MODS.getQQDP().get(i).getPeriodoRZ().equalsIgnoreCase("Q5")) {
                    javax.swing.tree.DefaultMutableTreeNode treeNode = new javax.swing.tree.DefaultMutableTreeNode(MODS.getNombre());
                    treeNode5.add(treeNode);
                    javax.swing.tree.DefaultMutableTreeNode treeNode6 = new javax.swing.tree.DefaultMutableTreeNode(MODS.getQQDP().get(i).getNombre());
                    treeNode.add(treeNode6);
                }
            }
        }
    }

    public void DelayyBar() {
        if (objetoS instanceof Torneo) {
            Torneo man = (Torneo) objetoS;
            int cont = 0;
            for (int i = 0; i < man.getEquipos().size(); i++) {
                cont++;
            }
            for (int i = 0; i <= 100; i++) {
                jProgressBar1.setValue(i);
                try {
                    Thread.sleep(cont * 7); // Agregar un pequeño retraso para que la barra de progreso se mueva más lento
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public Principality() {
        initComponents();
        FramePPrincipality.setVisible(true);
        FramePPrincipality.setLocationRelativeTo(BB);
        FramePPrincipality.setSize(1250, 680);
        ArActu();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FramePPrincipality = new javax.swing.JFrame();
        BB = new javax.swing.JPanel();
        TablasDeDeporte = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JtreeDPs = new javax.swing.JTree();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jFileChooser1 = new javax.swing.JFileChooser();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        LISTARS = new javax.swing.JMenuItem();
        ShowTABLASPOS = new javax.swing.JMenuItem();
        Save = new javax.swing.JMenuItem();
        jDialog1 = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();

        BB.setBackground(new java.awt.Color(255, 255, 255));
        BB.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TablasDeDeporte.setBackground(new java.awt.Color(0, 0, 0));

        JtreeDPs.setBackground(new java.awt.Color(255, 255, 255));
        JtreeDPs.setForeground(new java.awt.Color(0, 0, 0));
        JtreeDPs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JtreeDPsMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JtreeDPsMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(JtreeDPs);

        javax.swing.GroupLayout TablasDeDeporteLayout = new javax.swing.GroupLayout(TablasDeDeporte);
        TablasDeDeporte.setLayout(TablasDeDeporteLayout);
        TablasDeDeporteLayout.setHorizontalGroup(
            TablasDeDeporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TablasDeDeporteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );
        TablasDeDeporteLayout.setVerticalGroup(
            TablasDeDeporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TablasDeDeporteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(189, Short.MAX_VALUE))
        );

        BB.add(TablasDeDeporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 650));

        jButton3.setBackground(new java.awt.Color(255, 51, 51));
        jButton3.setText("PRESS");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        BB.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 60, 420, 140));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ADMIN TORNEOS UNITEC");
        BB.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 400, 70));

        jProgressBar1.setBackground(new java.awt.Color(255, 0, 51));
        BB.add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 560, 420, 40));

        javax.swing.GroupLayout FramePPrincipalityLayout = new javax.swing.GroupLayout(FramePPrincipality.getContentPane());
        FramePPrincipality.getContentPane().setLayout(FramePPrincipalityLayout);
        FramePPrincipalityLayout.setHorizontalGroup(
            FramePPrincipalityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BB, javax.swing.GroupLayout.DEFAULT_SIZE, 1250, Short.MAX_VALUE)
        );
        FramePPrincipalityLayout.setVerticalGroup(
            FramePPrincipalityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        LISTARS.setText("ListarEquipos");
        jPopupMenu1.add(LISTARS);

        ShowTABLASPOS.setText("Mostrar Tabla de posiciones");
        jPopupMenu1.add(ShowTABLASPOS);

        Save.setText("Guardar");
        jPopupMenu1.add(Save);

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 378, Short.MAX_VALUE))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1213, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jFileChooser1.setFileFilter(new FileNameExtensionFilter("Archivos binarios (*.bin)", "bin"));
        int seleccion = jFileChooser1.showOpenDialog(BB);
        if (seleccion == jFileChooser1.APPROVE_OPTION) {
            File archivoSeleccionado = jFileChooser1.getSelectedFile();
            String rutaArchivo = archivoSeleccionado.getAbsolutePath();
            
            AdminTorneos tour = new AdminTorneos(rutaArchivo);
            tour.cargarArchivo();
            try ( FileInputStream fis = new FileInputStream(rutaArchivo)) {
               
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void JtreeDPsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JtreeDPsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_JtreeDPsMouseClicked

    private void JtreeDPsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JtreeDPsMousePressed
        if (SwingUtilities.isRightMouseButton(evt)) {
            // Seleccionar el nodo que se encuentra en la posición del clic
            int row = JtreeDPs.getClosestRowForLocation(evt.getX(), evt.getY());
            JtreeDPs.setSelectionRow(row);
            TreePath path = JtreeDPs.getPathForLocation(evt.getX(), evt.getY());
            if (path != null) {
                DefaultMutableTreeNode node = (DefaultMutableTreeNode) path.getLastPathComponent();
                // Obtener el objeto que representa al nodo
                objetoS = node.getUserObjectPath();

            }

            // Mostrar el JPopupMenu en la posición del clic
            jPopupMenu1.show(JtreeDPs, evt.getX(), evt.getY());

        }
    }//GEN-LAST:event_JtreeDPsMousePressed

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
            java.util.logging.Logger.getLogger(Principality.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principality.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principality.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principality.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principality();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BB;
    private javax.swing.JFrame FramePPrincipality;
    private javax.swing.JTree JtreeDPs;
    private javax.swing.JMenuItem LISTARS;
    private javax.swing.JMenuItem Save;
    private javax.swing.JMenuItem ShowTABLASPOS;
    private javax.swing.JPanel TablasDeDeporte;
    private javax.swing.JButton jButton3;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
