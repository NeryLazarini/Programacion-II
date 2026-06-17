package javaapplication1;

import javax.swing.*;
import java.awt.event.*;

public class VentanaSecundaria extends JDialog implements ActionListener {
    
    JCheckBox notificaciones;
    JCheckBox modoOscuro;
    JCheckBox autoguardado;
    JButton aceptar;
    VentanaPrincipal princ;
    
    //constructor que recibe el parámetro de ventanaPrincipal
    public VentanaSecundaria(VentanaPrincipal princ){
        super(princ, true);
        this.princ = princ;
        
        //configurar ventana de diálogo
        setTitle("Preferencias");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        //JPanel
        JPanel panel2 = new JPanel();
        add(panel2);
        
        //JCheckBox
        notificaciones = new JCheckBox("Notificaciones");
        modoOscuro = new JCheckBox("Modo Oscuro");
        autoguardado = new JCheckBox("Autoguardado");
        //JButton
        aceptar = new JButton ("Aceptar");
        aceptar.addActionListener(this);
        
        //agregar todo al panel
        panel2.add(notificaciones);
        panel2.add(modoOscuro);
        panel2.add(autoguardado);
        panel2.add(aceptar);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String resultado = "";
        if (notificaciones.isSelected()) {
            resultado = resultado + "Notificaciones - ";
        }
        if  (modoOscuro.isSelected()) {
            resultado = resultado + "Modo Oscuro - ";
        }
        if (autoguardado.isSelected()) {
            resultado = resultado + "Autoguardado - ";
        }
        if (resultado.isEmpty()) {
            resultado = "Ninguna";
        }
         
        princ.opcionesSelec.setText("Opciones seleccionadas: " + resultado);
        dispose();
    }
}
