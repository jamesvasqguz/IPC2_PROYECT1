package UI;

/**
 *
 * @author jara
 */
public class Operador extends javax.swing.JFrame {

    /**
     * Creates new form Operador
     */
    public Operador() {
        initComponents();
        setSize(800, 650);
        setResizable(false);
        setTitle("Operador");
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnProcesarPA = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(129, 216, 37));
        jPanel1.setLayout(null);

        btnProcesarPA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/editar.png"))); // NOI18N
        btnProcesarPA.setPreferredSize(new java.awt.Dimension(120, 100));
        btnProcesarPA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcesarPAActionPerformed(evt);
            }
        });
        jPanel1.add(btnProcesarPA);
        btnProcesarPA.setBounds(70, 110, 120, 100);

        jLabel1.setText("<html>Administrar Punto de Control<html>");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(70, 220, 130, 50);

        jLabel3.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(170, 20, 420, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-1, 0, 650, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcesarPAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesarPAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProcesarPAActionPerformed

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProcesarPA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}