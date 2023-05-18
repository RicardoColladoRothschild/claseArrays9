import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.*;

public class ventanaBotones extends JFrame implements ActionListener {

    JTextField botones;
    JButton btn1;
    JButton btn2;
    JButton btn3;
    JButton btn4;
    JButton btn5;
    JButton btn6;
    JButton btn7;
    JButton btn8;
    JButton btn9;
    JButton btn10;
    JButton btn11;
    JButton btn12;
    JButton btn13;
    JButton btn14;
    JButton btn15;
    JButton btn16;
    JButton btn17;
    JButton btn18;
    JButton btn19;
    JButton btn20;

    public ventanaBotones() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setTitle("VentanaBoton");

        btn1 = new JButton("Boton 1");
        btn1.setBounds(10, 10, 100, 30);
        btn1.addActionListener(this);
        add(btn1);

        btn2 = new JButton("Boton 2");
        btn2.setBounds(120, 10, 100, 30);
        btn2.addActionListener(this);
        add(btn2);

        btn3 = new JButton("Boton 3");
        btn3.setBounds(230, 10, 100, 30);
        btn3.addActionListener(this);
        add(btn3);

        btn4 = new JButton("Boton 4");
        btn4.setBounds(340, 10, 100, 30);
        btn4.addActionListener(this);
        add(btn4);

        btn5 = new JButton("Boton 5");
        btn5.setBounds(450, 10, 100, 30);
        btn5.addActionListener(this);
        add(btn5);

        btn6 = new JButton("Boton 6");
        btn6.setBounds(10, 50, 100, 30);
        btn6.addActionListener(this);
        add(btn6);

        btn7 = new JButton("Boton 7");
        btn7.setBounds(120, 50, 100, 30);
        btn7.addActionListener(this);
        add(btn7);

        btn8 = new JButton("Boton 8");
        btn8.setBounds(230, 50, 100, 30);
        btn8.addActionListener(this);
        add(btn8);

        btn9 = new JButton("Boton 9");
        btn9.setBounds(340, 50, 100, 30);
        btn9.addActionListener(this);
        add(btn9);

        btn10 = new JButton("Boton 10");
        btn10.setBounds(450, 50, 100, 30);
        btn10.addActionListener(this);
        add(btn10);

        btn11 = new JButton("Boton 11");
        btn11.setBounds(10, 90, 100, 30);
        btn11.addActionListener(this);
        add(btn11);

        btn12 = new JButton("Boton 12");
        btn12.setBounds(120, 90, 100, 30);
        btn12.addActionListener(this);
        add(btn12);

        btn13 = new JButton("Boton 13");
        btn13.setBounds(230, 90, 100, 30);
        btn13.addActionListener(this);
        add(btn13);

        btn14 = new JButton("Boton 14");
        btn14.setBounds(340, 90, 100, 30);
        btn14.addActionListener(this);
        add(btn14);

        btn15 = new JButton("Boton 15");
        btn15.setBounds(450, 90, 100, 30);
        btn15.addActionListener(this);
        add(btn15);

        btn16 = new JButton("Boton 16");
        btn16.setBounds(10, 130, 100, 30);
        btn16.addActionListener(this);
        add(btn16);

        btn17 = new JButton("Boton 17");
        btn17.setBounds(120, 130, 100, 30);
        btn17.addActionListener(this);
        add(btn17);

        btn18 = new JButton("Boton 18");
        btn18.setBounds(230, 130, 100, 30);
        btn18.addActionListener(this);
        add(btn18);

        btn19 = new JButton("Boton 19");
        btn19.setBounds(340, 130, 100, 30);
        btn19.addActionListener(this);
        add(btn19);

        btn20 = new JButton("Boton 20");
        btn20.setBounds(450, 130, 100, 30);
        btn20.addActionListener(this);
        add(btn20);
    }

@Override

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn1) {
            JOptionPane.showMessageDialog(null, "HAS PRESIONADO EL BOTON 1");
        } else if (e.getSource() == btn2) {
            JOptionPane.showMessageDialog(null, "HAS PRESIONADO EL BOTON 2");
        } else if (e.getSource() == btn3) {
            JOptionPane.showMessageDialog(null, "HAS PRESIONADO EL BOTON 3");
        } else if (e.getSource() == btn4) {
            JOptionPane.showMessageDialog(null, "HAS PRESIONADO EL BOTON 4");
        } else if (e.getSource() == btn5) {
            JOptionPane.showMessageDialog(null, "HAS PRESIONADO EL BOTON 5");
        } else if (e.getSource() == btn6) {
            JOptionPane.showMessageDialog(null, "HAS PRESIONADO EL BOTON 6");
        } else if (e.getSource() == btn7) {
            JOptionPane.showMessageDialog(null, "HAS PRESIONADO EL BOTON 7");
        } else if (e.getSource() == btn8) {
            JOptionPane.showMessageDialog(null, "HAS PRESIONADO EL BOTON 8");
        } else if (e.getSource() == btn9) {
            JOptionPane.showMessageDialog(null, "HAS PRESIONADO EL BOTON 9");
        } else if (e.getSource() == btn10) {
            JOptionPane.showMessageDialog(null, "HAS PRESIONADO EL BOTON 10");
        } else if (e.getSource() == btn11) {
            JOptionPane.showMessageDialog(null, "HAS PRESIONADO EL BOTON 11");
        } else if (e.getSource() == btn12) {
            JOptionPane.showMessageDialog(null, "HAS PRESIONADO EL BOTON 12");
        } else if (e.getSource() == btn13) {
            JOptionPane.showMessageDialog(null, "HAS PRESIONADO EL BOTON 13");
        } else if (e.getSource() == btn14) {
            JOptionPane.showMessageDialog(null, "HAS PRESIONADO EL BOTON 14");
        } else if (e.getSource() == btn15) {
            JOptionPane.showMessageDialog(null, "HAS PRESIONADO EL BOTON 15");
        } else if (e.getSource() == btn16) {
            JOptionPane.showMessageDialog(null, "HAS PRESIONADO EL BOTON 16");
        } else if (e.getSource() == btn17) {
            JOptionPane.showMessageDialog(null, "HAS PRESIONADO EL BOTON 17");
        } else if (e.getSource() == btn18) {
            JOptionPane.showMessageDialog(null, "HAS PRESIONADO EL BOTON 18");
        } else if (e.getSource() == btn19) {
            JOptionPane.showMessageDialog(null, "HAS PRESIONADO EL BOTON 19");
        } else if (e.getSource() == btn20) {
            JOptionPane.showMessageDialog(null, "HAS PRESIONADO EL BOTON 20");
        }
    }

    public static void main(String[] args) {
        ventanaBotones v = new ventanaBotones();
        v.setVisible(true);
        v.setBounds(0, 0, 600, 400);
        v.setResizable(true);
        v.setLocationRelativeTo(null);
    }
}
