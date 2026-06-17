package javaapplication1;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;

public class JavaApplication1 {
    public static void main(String[] args) throws Exception {

        // Crear la interfaz gráfica en el hilo de eventos de Swing
        SwingUtilities.invokeLater(() -> {

            // Crear el marco de la aplicación
            JFrame frame = new JFrame("ReDoo");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(500, 500);
            frame.setVisible(true);
            frame.setLayout(new BorderLayout());
             JPanel panelCentral = new JPanel();
             panelCentral.add(new JButton("Botón central"));
             frame.add(panelCentral, BorderLayout.CENTER);

            // Agregar un panel al marco
            JPanel panel = new JPanel();
            JPanel panel2 = new JPanel();
            panel2.setBounds(0, 0, 500, 100);
            panel.setBounds(0, 100, 500, 400);  
            JLabel label2 = new JLabel("ReDoo");
            panel2.add(label2);
            JLabel label = new JLabel("Inserte su nombre");
            panel.add(label);
            frame.add(panel);
            JLabel etiquetaInferior = new JLabel("Texto en la parte inferior", SwingConstants.CENTER);
            frame.add(etiquetaInferior, BorderLayout.SOUTH);

            // Agregar un campo de texto
            JTextField textField = new JTextField(20);
            panel.add(textField);
            frame.add(panel);

            JButton Saludar = new JButton("Saludar");
            panel.add(Saludar); 
            frame.add(panel);
            Saludar.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    String nombre = textField.getText();
                    JOptionPane.showMessageDialog(frame, "¡Hola, " + nombre + "!");
                }
            });

        });

    }
    
}
