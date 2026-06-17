package javaapplication1;

import java.awt.event.*;
import javax.swing.*;

public class VentanaPrincipal extends JFrame implements ActionListener {
    
    JLabel opcionesSelec;
    JButton configPrefe;
    
    public VentanaPrincipal (){
        //configurar la ventana
        setTitle("Ventana Principal");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //JPanel
        JPanel panelP = new JPanel();
        add(panelP);
        //JLabel 
        opcionesSelec = new JLabel("Opciones selecionadas: Ninguna");
        //botón
        configPrefe  = new JButton("Configurar Preferencias");
        configPrefe.addActionListener(this);
        
        //agregar label y botón al panel
        panelP.add(opcionesSelec);
        panelP.add(configPrefe);
        
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        VentanaSecundaria dialogo = new VentanaSecundaria(this);
        dialogo.setVisible(true);
    }
    
    public static void main(String[] args) {
        new VentanaPrincipal();
    }
}
