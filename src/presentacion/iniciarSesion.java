/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import java.awt.event.KeyEvent;
import java.util.Random;
import javax.swing.JOptionPane;
import negocio.inicioSesion;
import util.Funciones;

/**
 *
 * @author laboratorio_computo
 */
public class iniciarSesion extends javax.swing.JFrame {

    private int cantidadIntentos = 0;
    //Random r = new Random();
    private int suma = 0;

    public iniciarSesion() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Autenticación de Usuario");
        //operacion();
        operacion2();
    }

    /*
    private void operacion() {
        inicioSesion obj = new inicioSesion();
        //lblOperacion.setText(obj.getOperacion());
        obj.setNumero1(r.nextInt(10));
        obj.setNumero2(r.nextInt(10));
        obj.setNumero3(r.nextInt(10));
        obj.setNumero4(0);
        if (cantidadIntentos < 3) {
            lblOperacion.setText(String.valueOf(obj.getNumero1()) + "*" + String.valueOf(obj.getNumero2()) + "+" + String.valueOf(obj.getNumero3()));
        } else {

            obj.setNumero4(r.nextInt(10));
            lblOperacion.setText(String.valueOf(obj.getNumero1()) + "*" + String.valueOf(obj.getNumero2()) + "+" + String.valueOf(obj.getNumero3()) + "-" + String.valueOf(obj.getNumero4()));
        }

        suma = obj.getNumero1() * obj.getNumero2() + obj.getNumero3() - obj.getNumero4();
    }
    */
    
    
    private void operacion2(){
    Random r = new Random();
    int numero1,numero2,numero3,numero4;
    numero1=r.nextInt(10);
    numero2=r.nextInt(10);
    numero3=r.nextInt(10);
    numero4=0;
        if (cantidadIntentos<3) {
            lblOperacion.setText(String.valueOf(numero1)+"*"+String.valueOf(numero2)+"+"+String.valueOf(numero3));
        }else{
            lblOperacion.setText(String.valueOf(numero1)+"*"+String.valueOf(numero2)+"+"+String.valueOf(numero3)+"-"+String.valueOf(numero4));
        }
        
        suma = numero1*numero2+numero3-numero4;
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtContrasena = new javax.swing.JPasswordField();
        txtDni = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        lblOperacion = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtOperacion = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setForeground(new java.awt.Color(153, 255, 255));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        jLabel1.setText("INICIO DE SESIÓN");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/inicion_sesion2.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Dni");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Contraseña");

        txtContrasena.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtContrasena.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtContrasenaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtContrasenaFocusLost(evt);
            }
        });
        txtContrasena.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtContrasenaKeyPressed(evt);
            }
        });

        txtDni.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDni.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDniFocusLost(evt);
            }
        });
        txtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDniKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniKeyTyped(evt);
            }
        });

        btnIngresar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ok.png"))); // NOI18N
        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir2.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Operación");

        lblOperacion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblOperacion.setText("jLabel6");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Resultado de la Operación");

        txtOperacion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtOperacion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtOperacionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtOperacionFocusLost(evt);
            }
        });
        txtOperacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtOperacionKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtOperacionKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(btnIngresar)
                        .addGap(94, 94, 94)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblOperacion))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIngresar)
                    .addComponent(btnSalir))
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void iniciarSesion() {
        inicioSesion obj = new inicioSesion();
        obj.setDni(txtDni.getText());
        obj.setClave(txtContrasena.getText());

        if (txtOperacion.getText().isEmpty()) {
            Funciones.mensajeError("Resultado de la Operacion esta vacio", Funciones.NOMBRE_SOFTWARE);
            return;
        }else{            
            obj.setResultado(Integer.parseInt(txtOperacion.getText()));
        }
        
        try {
            //int respuesta = obj.iniciarSesion();
            int respuesta = obj.iniciarSesionSP();

            switch (respuesta) {
                case 1:
                    if (suma == Integer.parseInt(txtOperacion.getText())) {
                        new frmMain().setVisible(true);
                        this.dispose();
                    } else {
                        Funciones.mensajeError("La suma no coincide", Funciones.NOMBRE_SOFTWARE);
                        cantidadIntentos++;
                        operacion2();
                        txtOperacion.setText("");
                        txtOperacion.requestFocus();
                        
                        return;
                    }
                    break;
                case 2:
                    Funciones.mensajeError("El usuario se encuentra inactivo", Funciones.NOMBRE_SOFTWARE);
                    cantidadIntentos++;
                    operacion2();
                    break;
                case -1:
                    Funciones.mensajeError("No se encontro al usuario", Funciones.NOMBRE_SOFTWARE);
                    cantidadIntentos++;
                    operacion2();
                    break;
            }

        } catch (Exception e) {
            Funciones.mensajeError(e.getMessage(), Funciones.NOMBRE_SOFTWARE);
        }
    }

    ;
    
    
    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        iniciarSesion();
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtDniKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_TAB) {
            this.txtContrasena.requestFocus();
        }
    }//GEN-LAST:event_txtDniKeyPressed

    private void txtContrasenaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContrasenaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_TAB) {
            this.txtOperacion.requestFocus();
        }
    }//GEN-LAST:event_txtContrasenaKeyPressed

    private void txtOperacionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtOperacionFocusLost
      
    }//GEN-LAST:event_txtOperacionFocusLost

    private void txtOperacionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOperacionKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.btnIngresar.doClick();
        }
    }//GEN-LAST:event_txtOperacionKeyPressed

    private void txtDniFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDniFocusLost
        
    }//GEN-LAST:event_txtDniFocusLost

    private void txtContrasenaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContrasenaFocusLost
        
    }//GEN-LAST:event_txtContrasenaFocusLost

    private void txtContrasenaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContrasenaFocusGained
        if (txtDni.getText().isEmpty()) {
            txtDni.requestFocus();
            Funciones.mensajeError("Dni Vacio", Funciones.NOMBRE_SOFTWARE);            
            return;
        }
    }//GEN-LAST:event_txtContrasenaFocusGained

    private void txtOperacionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtOperacionFocusGained
        if (txtDni.getText().isEmpty()) {
            txtDni.requestFocus();
            Funciones.mensajeError("Dni Vacio", Funciones.NOMBRE_SOFTWARE);            
            return;
        }else if (txtContrasena.getText().isEmpty()) {            
            txtContrasena.requestFocus();
            Funciones.mensajeError("Contraseña Vacio", Funciones.NOMBRE_SOFTWARE);
            return;
        }
    }//GEN-LAST:event_txtOperacionFocusGained

    private void txtOperacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOperacionKeyTyped
        Funciones.soloNumeros(evt, txtOperacion, 10);
    }//GEN-LAST:event_txtOperacionKeyTyped

    private void txtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyTyped
        // TODO add your handling code here:
        Funciones.soloNumeros(evt, txtDni, 10);
    }//GEN-LAST:event_txtDniKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblOperacion;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtOperacion;
    // End of variables declaration//GEN-END:variables
}
