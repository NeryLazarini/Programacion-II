package javaapplication1;

import javax.swing.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {
    
    //atributos
    JTextField usuario;
    JPasswordField contrasenia;
    JButton acceder;
    private String contraseniaSec = "Noemi123";
    
    public Login () {
        //configurar ventana de login
        setTitle("Login con Verificación");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //crear panel
        JPanel login = new JPanel();
        add(login);
        
        //crear el label de usuario y contraseña
        JLabel usu = new JLabel("Usuario: ");
        usuario = new JTextField(25);
        
        JLabel contr = new JLabel("Contraseña: ");
        contrasenia = new JPasswordField("", 25);
        contrasenia.setEchoChar('*');
        
        //crear boton
        acceder = new JButton("Acceder");
        acceder.addActionListener(this);
        
        //agregarlos al panel
        login.add(usu);
        login.add(usuario);
        login.add(contr);
        login.add(contrasenia);
        login.add(acceder);
        
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) { //acá va la lógica del botón
        char [] contrasenia1 = contrasenia.getPassword();
        String contraseniaI = new String(contrasenia1);
        
        if (contraseniaI.equals(contraseniaSec)) {
            JOptionPane.showMessageDialog(this, "¡¡¡Acceso exitoso!!!");
        } else {
            JOptionPane.showMessageDialog(this, "Contraseña incorrecta.");
        }
    }
    
    public static void main(String[] args) {
        new Login();
    }
    
}
