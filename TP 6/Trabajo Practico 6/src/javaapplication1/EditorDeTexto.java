package javaapplication1;

import java.awt.event.*;
import javax.swing.*;


public class EditorDeTexto extends JFrame implements ActionListener{
    
    //se declaran los componentes como atributos
    JTextArea texto;
    JMenuItem limpiar;
    JMenuItem salir;
    
    public EditorDeTexto() {
        //configuracion de la ventana
        setTitle("Editor de Texto Básico");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //instanciar el area de textp
        texto = new JTextArea();
        
        //barra para deslizar
        JScrollPane scr = new JScrollPane(texto);
        
        add(scr);
        
        JMenuBar barra = new JMenuBar();//se crea la barra del menu
        
        JMenu archivo = new JMenu("Archivo");//se crea e menu archivo
        
        //items
        limpiar = new JMenuItem("Limpiar");
        salir = new JMenuItem("Salir del menú");
        
        //implementar el ActionListener a los items
        limpiar.addActionListener(this);
        salir.addActionListener(this);
        
        //acá se agregan los items al menu
        archivo.add(limpiar);
        archivo.add(salir);
        
        barra.add(archivo);//acá se agrega el menu a la barra
        
        setJMenuBar(barra);//acá fijamos la barra a la ventana
       
        setVisible(true);//con esto se muestra la ventana en pantalla
    }
    
    @Override 
    public void actionPerformed(ActionEvent e) {
        //condicionales para limpiar y salir al clickear
        if (e.getSource() == limpiar) {
            texto.setText("");
        }
        if (e.getSource() == salir) {
            System.exit(0);
        }
    }
    
    //acá de ejecuta el menu
    public static void main(String [] args) {
        new EditorDeTexto();
    }
    
}
