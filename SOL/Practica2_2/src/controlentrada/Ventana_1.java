package controlentrada;

public class Ventana_1 extends javax.swing.JFrame {

    public Ventana_1() {
        initComponents();
        this.setResizable(false);//de esta forma no se redimensiona
        this.setLocationRelativeTo(null);//de esta forma se va a abrir en el centro 

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nombre_usuario = new javax.swing.JTextField();
        label_nombre = new javax.swing.JLabel();
        boton_aceptar = new javax.swing.JButton();
        label_apellido = new javax.swing.JLabel();
        apellido_usuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(null);

        nombre_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre_usuarioActionPerformed(evt);
            }
        });

        label_nombre.setText("Introduce tu nombre :");

        boton_aceptar.setText("Aceptar");
        boton_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_aceptarActionPerformed(evt);
            }
        });

        label_apellido.setText("Ahora introduce tu apellido:");

        apellido_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellido_usuarioActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/saluda.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(139, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_nombre)
                    .addComponent(nombre_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(145, 145, 145))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(boton_aceptar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(apellido_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_apellido)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel1)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_nombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nombre_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(label_apellido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(apellido_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(boton_aceptar)
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_aceptarActionPerformed
        String nombre = nombre_usuario.getText();
        String apellido = apellido_usuario.getText();
        while (nombre.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Debes rellenar el campo Nombre");

            nombre_usuario.setText("");
            return;// salgo del metodo para asi no hacer un bucle infinito 
        }
        while (nombre.length() < 5) {
            javax.swing.JOptionPane.showMessageDialog(this, "El nombre debe tener al menos 5 caracteres");
            nombre_usuario.setText("");
            return;
        }
        while (!nombre.matches("[a-zA-Z]+")) {//con el + lo que hacemos es validar la entrada entera
            javax.swing.JOptionPane.showMessageDialog(this, "El nombre no puede contener caracteres numericos");
            nombre_usuario.setText("");
            return;
        }
        while (apellido.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Debes rellenar el campo apellido.");

            nombre_usuario.setText("");
            return;
        }
        while (apellido.length() < 5) {
            javax.swing.JOptionPane.showMessageDialog(this, "El apellido debe tener al menos 5 caracteres");
            nombre_usuario.setText("");
            return;
        }
        while (!apellido.matches("[a-zA-Z]+")) {//con el + lo que hacemos es validar la entrada entera
            javax.swing.JOptionPane.showMessageDialog(this, "El apellido no puede contener caracteres numericos");
            nombre_usuario.setText("");
            return;
        }
        javax.swing.JOptionPane.showMessageDialog(this, nombre_usuario.getText() + " " + apellido_usuario.getText());
        Ventana_2 entrar = new Ventana_2();//nos instanciamos el objeto que queremos que se ejecute al pulsar

        entrar.setDato(nombre_usuario.getText() + " " + apellido_usuario.getText());/*antes de hacer visible la ventana 2,desde el objeto ventana2 
       hacemos un setdato(metodo creado a mano)y havemos que le entre 
       el nombre de la variable de la que queremos coger el nombre .getText()*/
        entrar.setVisible(true);//hace visible la variable
        this.dispose();//para que no se junten ventanas
    }//GEN-LAST:event_boton_aceptarActionPerformed

    private void nombre_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre_usuarioActionPerformed

    }//GEN-LAST:event_nombre_usuarioActionPerformed

    private void apellido_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellido_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellido_usuarioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(Ventana_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellido_usuario;
    private javax.swing.JButton boton_aceptar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel label_apellido;
    private javax.swing.JLabel label_nombre;
    private javax.swing.JTextField nombre_usuario;
    // End of variables declaration//GEN-END:variables
}
