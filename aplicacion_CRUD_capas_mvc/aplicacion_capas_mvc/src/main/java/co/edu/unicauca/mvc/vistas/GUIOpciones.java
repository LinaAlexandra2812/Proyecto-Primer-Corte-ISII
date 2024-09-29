package co.edu.unicauca.mvc.vistas;

import co.edu.unicauca.mvc.vistas.evaluar.panelConferenciasAsignadas;
import co.edu.unicauca.mvc.vistas.postular.panelSubirArticulo;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialLighterIJTheme;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author earea
 */
public class GUIOpciones extends javax.swing.JFrame {
    private boolean barraVisible = true; // Inicialmente la barra es visible
    // Declaración de Timer para las animaciones
    private Timer timer;
    /**
     * Creates new form GUIOpcioness
     */
    public GUIOpciones() {
        initComponents();
        barraVisible = true;
    }
    
//    private void initStyles(){
//        lConferencias.putClientProperty( "FlatLaf.styleClass", "h1" );
//        lConferencias.putClientProperty("FlatLaf.style", "front:18 $light.font");
//        lConferencias.setForeground(Color.black);
//    }
    
    public void mostrarPanel(JPanel p) {
    p.setSize(620, 400);  // Asegúrate de que el tamaño sea correcto para tu layout
    p.setLocation(0, 0);

    contenido.removeAll();  // Limpia el área "contenido"
    contenido.add(p, BorderLayout.CENTER);  // Añade el panel en el centro
    contenido.revalidate();  // Valida nuevamente el contenedor
    contenido.repaint();  // Redibuja para que se vea el nuevo contenido
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        barraMenu = new javax.swing.JPanel();
        btnEvaluar = new javax.swing.JButton();
        btnPostular1 = new javax.swing.JButton();
        panelBusqueda = new javax.swing.JPanel();
        btnDesplegar = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        baseContenido = new javax.swing.JPanel();
        contenido = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(236, 236, 236));

        barraMenu.setBackground(new java.awt.Color(145, 173, 180));

        btnEvaluar.setBackground(new java.awt.Color(236, 236, 236));
        btnEvaluar.setText("Evaluar");
        btnEvaluar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        btnEvaluar.setBorderPainted(false);
        btnEvaluar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEvaluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEvaluarActionPerformed(evt);
            }
        });

        btnPostular1.setBackground(new java.awt.Color(236, 236, 236));
        btnPostular1.setText("Postular");
        btnPostular1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        btnPostular1.setBorderPainted(false);
        btnPostular1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPostular1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPostular1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout barraMenuLayout = new javax.swing.GroupLayout(barraMenu);
        barraMenu.setLayout(barraMenuLayout);
        barraMenuLayout.setHorizontalGroup(
            barraMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnPostular1, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
            .addComponent(btnEvaluar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        barraMenuLayout.setVerticalGroup(
            barraMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraMenuLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(btnPostular1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEvaluar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(324, Short.MAX_VALUE))
        );

        panelBusqueda.setBackground(new java.awt.Color(145, 173, 180));

        btnDesplegar.setBackground(new java.awt.Color(236, 236, 236));
        btnDesplegar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/3rayitas.png"))); // NOI18N
        btnDesplegar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        btnDesplegar.setBorderPainted(false);
        btnDesplegar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDesplegar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesplegarActionPerformed(evt);
            }
        });

        jTextField1.setPreferredSize(new java.awt.Dimension(180, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/download (3).jpeg"))); // NOI18N

        javax.swing.GroupLayout panelBusquedaLayout = new javax.swing.GroupLayout(panelBusqueda);
        panelBusqueda.setLayout(panelBusquedaLayout);
        panelBusquedaLayout.setHorizontalGroup(
            panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBusquedaLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnDesplegar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 568, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel3)
                .addContainerGap())
        );
        panelBusquedaLayout.setVerticalGroup(
            panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBusquedaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelBusquedaLayout.createSequentialGroup()
                        .addGroup(panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDesplegar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(19, 19, 19))
        );

        baseContenido.setBackground(new java.awt.Color(236, 236, 236));
        baseContenido.setPreferredSize(new java.awt.Dimension(620, 400));

        contenido.setBackground(new java.awt.Color(236, 236, 236));
        contenido.setLayout(new java.awt.GridLayout(1, 0));

        javax.swing.GroupLayout baseContenidoLayout = new javax.swing.GroupLayout(baseContenido);
        baseContenido.setLayout(baseContenidoLayout);
        baseContenidoLayout.setHorizontalGroup(
            baseContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(baseContenidoLayout.createSequentialGroup()
                .addComponent(contenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        baseContenidoLayout.setVerticalGroup(
            baseContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(baseContenidoLayout.createSequentialGroup()
                .addComponent(contenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 427, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(barraMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(baseContenido, javax.swing.GroupLayout.DEFAULT_SIZE, 683, Short.MAX_VALUE)
                .addContainerGap())
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(panelBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(baseContenido, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(barraMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDesplegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesplegarActionPerformed
       if (barraVisible) {
            ocultarBarraMenu(); // Si la barra está visible, la oculta
        } else {
            mostrarBarraMenu(); // Si la barra está oculta, la muestra
        }
    }//GEN-LAST:event_btnDesplegarActionPerformed

    private void ocultarBarraMenu() {
        Timer timer = new Timer(5, new ActionListener() {
            int x = barraMenu.getX(); // Posición inicial X de la barra

            @Override
            public void actionPerformed(ActionEvent e) {
                if (x > -barraMenu.getWidth()) { // Mueve la barra hacia la izquierda
                    x -= 5;
                    barraMenu.setLocation(x, barraMenu.getY());
                } else {
                    ((Timer) e.getSource()).stop(); // Detiene la animación
                    barraMenu.setVisible(false); // Oculta la barra después de la animación
                    barraVisible = false;
                }
            }
        });
        timer.start(); // Inicia el Timer
    }
    
    private void mostrarBarraMenu() {
        barraMenu.setLocation(-barraMenu.getWidth(), barraMenu.getY()); // Colocamos la barra fuera de la vista, a la izquierda
        barraMenu.setVisible(false); // Primero hacemos visible la barra aaah
        
        Timer timer = new Timer(5, new ActionListener() {
            int x = barraMenu.getX(); // Posición inicial X de la barra (fuera de la pantalla)

            @Override
            public void actionPerformed(ActionEvent e) {
                if (x < 0) { // Mueve la barra hacia la derecha hasta llegar a la posición 0
                    x += 5; // Incrementa la posición en 5 píxeles hacia la derecha
                    barraMenu.setLocation(x, barraMenu.getY());
                } else {
                    ((Timer) e.getSource()).stop(); // Detiene la animación cuando llega a la posición final
                     barraMenu.setVisible(true);
                     barraVisible = true; // Marca la barra como visible
                }
            }
        });
        timer.start(); // Inicia el Timer para la animación
    }


    
    private void btnPostular1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPostular1ActionPerformed

        mostrarPanel(new panelSubirArticulo());
    }//GEN-LAST:event_btnPostular1ActionPerformed

    private void btnEvaluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEvaluarActionPerformed
        // TODO add your handling code here:
        mostrarPanel(new panelConferenciasAsignadas());
    }//GEN-LAST:event_btnEvaluarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        FlatMaterialLighterIJTheme.setup();
        //</editor-fold>
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JPanel barraMenu;
    private javax.swing.JPanel baseContenido;
    private javax.swing.JButton btnDesplegar;
    private javax.swing.JButton btnEvaluar;
    private javax.swing.JButton btnPostular1;
    private javax.swing.JPanel contenido;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel panelBusqueda;
    // End of variables declaration//GEN-END:variables
}
