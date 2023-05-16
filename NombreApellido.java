import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
import javax.swing.text.JTextComponent;

import java.awt.*;

public class NombreApellido extends JFrame implements ActionListener {

    JTextField nombre;
    JTextField apellido;
    JButton btn;

    public NombreApellido() {

        JLabel lbNombre = new JLabel("Nombre");
        nombre = new JTextField(20);
        add(lbNombre);
        add(nombre);

        JLabel lbApellido = new JLabel("Apellido");
        apellido = new JTextField(20);
        add(lbApellido);
        add(apellido);

        btn = new JButton("Mostrar");
        btn.addActionListener(this);
        add(btn);

        setLayout(new FlowLayout());
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Practica Nombre y Apellido");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String nombre = this.nombre.getText();
        String apellido = this.apellido.getText();
        String mensaje = "Nombre: " + nombre + "\nApellido: " + apellido;
        JOptionPane.showMessageDialog(this, mensaje);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                NombreApellido ventana = new NombreApellido();
                ventana.setVisible(true);
            }
        });
    }
}
