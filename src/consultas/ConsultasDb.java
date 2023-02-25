package consultas;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;

public class ConsultasDb extends javax.swing.JFrame {

    public ConsultasDb() {
        initComponents();
        this.setTitle("Base de datos CustomSoft");
        Image img = Toolkit.getDefaultToolkit().createImage(getClass().getResource("/Imagenes/logo03.jpg"));
        this.setIconImage(img);
        lblogo.setIcon(new ImageIcon(img.getScaledInstance(lblogo.getWidth(), lblogo.getHeight(), Image.SCALE_SMOOTH)));
        this.setLocationRelativeTo(null);

        cargarDriver();
    }

    private void cargarDriver() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
                setTitle(ex.toString());
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

        jPanel1 = new javax.swing.JPanel();
        Lbldescripcion = new javax.swing.JLabel();
        Lblprecio = new javax.swing.JLabel();
        Lblresultado = new javax.swing.JLabel();
        Tf1 = new javax.swing.JTextField();
        Tf2 = new javax.swing.JTextField();
        BtnAlta = new javax.swing.JButton();
        lblogo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        LblVendedor = new javax.swing.JLabel();
        Tf3 = new javax.swing.JTextField();
        LblComision = new javax.swing.JLabel();
        Tf4 = new javax.swing.JTextField();
        BtnAlta1 = new javax.swing.JButton();
        Lblresultado1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(java.awt.SystemColor.inactiveCaption);
        jPanel1.setMaximumSize(new java.awt.Dimension(600, 400));
        jPanel1.setMinimumSize(new java.awt.Dimension(600, 400));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 400));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Lbldescripcion.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        Lbldescripcion.setForeground(new java.awt.Color(102, 102, 102));
        Lbldescripcion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbldescripcion.setText("Descripcion");
        Lbldescripcion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Lbldescripcion.setMaximumSize(new java.awt.Dimension(90, 25));
        Lbldescripcion.setMinimumSize(new java.awt.Dimension(90, 25));
        Lbldescripcion.setPreferredSize(new java.awt.Dimension(90, 25));
        jPanel1.add(Lbldescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 130, 110, 30));

        Lblprecio.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        Lblprecio.setForeground(new java.awt.Color(102, 102, 102));
        Lblprecio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lblprecio.setText("Precio");
        Lblprecio.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Lblprecio.setMaximumSize(new java.awt.Dimension(90, 25));
        Lblprecio.setMinimumSize(new java.awt.Dimension(90, 25));
        Lblprecio.setPreferredSize(new java.awt.Dimension(90, 25));
        jPanel1.add(Lblprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 180, 110, 30));

        Lblresultado.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        Lblresultado.setForeground(new java.awt.Color(102, 102, 102));
        Lblresultado.setText("Resultado");
        jPanel1.add(Lblresultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 607, 40));

        Tf1.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        Tf1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Tf1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(Tf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 131, 150, 31));

        Tf2.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        Tf2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Tf2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(Tf2, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 181, 150, 30));

        BtnAlta.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        BtnAlta.setForeground(new java.awt.Color(102, 102, 102));
        BtnAlta.setText("Alta Productos");
        BtnAlta.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnAlta.setMaximumSize(new java.awt.Dimension(125, 25));
        BtnAlta.setMinimumSize(new java.awt.Dimension(125, 25));
        BtnAlta.setPreferredSize(new java.awt.Dimension(125, 25));
        BtnAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAltaActionPerformed(evt);
            }
        });
        jPanel1.add(BtnAlta, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 140, 40));

        lblogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo03.jpg"))); // NOI18N
        lblogo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(lblogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 0, 140, 80));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Conexion a bases de datos");
        jLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 461, 80));

        LblVendedor.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        LblVendedor.setForeground(new java.awt.Color(102, 102, 102));
        LblVendedor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblVendedor.setText("Vendedor");
        LblVendedor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        LblVendedor.setMaximumSize(new java.awt.Dimension(90, 25));
        LblVendedor.setMinimumSize(new java.awt.Dimension(90, 25));
        LblVendedor.setPreferredSize(new java.awt.Dimension(90, 25));
        jPanel1.add(LblVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 131, 106, 31));

        Tf3.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        Tf3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Tf3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(Tf3, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 131, 168, 31));

        LblComision.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        LblComision.setForeground(new java.awt.Color(102, 102, 102));
        LblComision.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblComision.setText("Comision");
        LblComision.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        LblComision.setMaximumSize(new java.awt.Dimension(90, 25));
        LblComision.setMinimumSize(new java.awt.Dimension(90, 25));
        LblComision.setPreferredSize(new java.awt.Dimension(90, 25));
        jPanel1.add(LblComision, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 180, 110, 30));

        Tf4.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        Tf4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Tf4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(Tf4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 170, 30));

        BtnAlta1.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        BtnAlta1.setForeground(new java.awt.Color(102, 102, 102));
        BtnAlta1.setText("Alta Vendedores");
        BtnAlta1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnAlta1.setMaximumSize(new java.awt.Dimension(125, 25));
        BtnAlta1.setMinimumSize(new java.awt.Dimension(125, 25));
        BtnAlta1.setPreferredSize(new java.awt.Dimension(125, 25));
        BtnAlta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAlta1ActionPerformed(evt);
            }
        });
        jPanel1.add(BtnAlta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 140, 40));

        Lblresultado1.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        Lblresultado1.setForeground(new java.awt.Color(102, 102, 102));
        Lblresultado1.setText("Resultado");
        jPanel1.add(Lblresultado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 607, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAltaActionPerformed
        
        BtnAlta.addActionListener((ActionEvent arg) -> {
            Lblresultado.setText("");
            try{
                try (Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/basedesarrollo", "root", "")){
                    Statement comando = conexion.createStatement();
                    comando.executeUpdate("insert into articulos (descripcion, precio) values ('" +Tf1.getText() + " '," +Tf2.getText()+ ")");
                    
                    conexion.close();
                }
                
                Lblresultado.setText("se registraron los datos del producto ingresado");
                
                Tf1.setText("");
                Tf2.setText("");
            } catch (SQLException ex){
                setTitle(ex.toString());            
            }
        });
        
    }//GEN-LAST:event_BtnAltaActionPerformed

    private void BtnAlta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAlta1ActionPerformed
        BtnAlta1.addActionListener((ActionEvent arg) -> {
            Lblresultado1.setText("");
            try{
                try (Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/basedesarrollo", "root", "")){
                    Statement comando = conexion.createStatement();
                    comando.executeUpdate("insert into vendedores (nombre, comision) values ('" +Tf3.getText() + " '," +Tf4.getText()+ ")");
                    
                    conexion.close();
                }
                
                Lblresultado1.setText("se registraron los datos del vendedor ingresado");
                
                Tf3.setText("");
                Tf4.setText("");
            } catch (SQLException ex){
                setTitle(ex.toString());            
            }
        });
        
    }//GEN-LAST:event_BtnAlta1ActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultasDb.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);

} catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultasDb.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);

} catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultasDb.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);

} catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultasDb.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultasDb().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAlta;
    private javax.swing.JButton BtnAlta1;
    private javax.swing.JLabel LblComision;
    private javax.swing.JLabel LblVendedor;
    private javax.swing.JLabel Lbldescripcion;
    private javax.swing.JLabel Lblprecio;
    private javax.swing.JLabel Lblresultado;
    private javax.swing.JLabel Lblresultado1;
    private javax.swing.JTextField Tf1;
    private javax.swing.JTextField Tf2;
    private javax.swing.JTextField Tf3;
    private javax.swing.JTextField Tf4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblogo;
    // End of variables declaration//GEN-END:variables
}
