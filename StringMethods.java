import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StringMethods extends JFrame implements ActionListener {

    private JButton btnLength;
    private JButton btnSubstring;
    private JButton btnIndexOf;
    private JButton btnToUpper;
    private JButton btnToLower;
    private JButton btnReplace;
    private JButton btnTrim;
    private JButton btnStartsWith;
    private JButton btnEndsWith;

    public StringMethods() {
        setTitle("String Methods");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        btnLength = new JButton("Length");
        btnLength.addActionListener(this);

        btnSubstring = new JButton("Substring");
        btnSubstring.addActionListener(this);

        btnIndexOf = new JButton("IndexOf");
        btnIndexOf.addActionListener(this);

        btnToUpper = new JButton("ToUpper");
        btnToUpper.addActionListener(this);

        btnToLower = new JButton("ToLower");
        btnToLower.addActionListener(this);

        btnReplace = new JButton("Replace");
        btnReplace.addActionListener(this);

        btnTrim = new JButton("Trim");
        btnTrim.addActionListener(this);

        btnStartsWith = new JButton("StartsWith");
        btnStartsWith.addActionListener(this);

        btnEndsWith = new JButton("EndsWith");
        btnEndsWith.addActionListener(this);

        add(btnLength);
        add(btnSubstring);
        add(btnIndexOf);
        add(btnToUpper);
        add(btnToLower);
        add(btnReplace);
        add(btnTrim);
        add(btnStartsWith);
        add(btnEndsWith);

        // Aumentar el tamaño de la ventana en un 10%
        int width = (int) (getWidth() * 1.1);
        int height = (int) (getHeight() * 1.1);
        setPreferredSize(new Dimension(width, height));

        pack();
        setLocationRelativeTo(null); // Centrar la ventana en la pantalla
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnLength) {
            String input = JOptionPane.showInputDialog("Ingrese una cadena:");
            int length = input.length();
            JOptionPane.showMessageDialog(null, "La longitud de la cadena es: " + length);
        } else if (e.getSource() == btnSubstring) {
            String input = JOptionPane.showInputDialog("Ingrese una cadena:");
            int startIndex = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el índice de inicio:"));
            int endIndex = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el índice de fin:"));
            String substring = input.substring(startIndex, endIndex);
            JOptionPane.showMessageDialog(null, "La subcadena es: " + substring);
        } else if (e.getSource() == btnIndexOf) {
            String input = JOptionPane.showInputDialog("Ingrese una cadena:");
            String search = JOptionPane.showInputDialog("Ingrese la cadena a buscar:");
            int index = input.indexOf(search);
            if (index != -1) {
                JOptionPane.showMessageDialog(null, "La cadena \"" + search + "\" se encuentra en el índice: " + index);
            } else {
                JOptionPane.showMessageDialog(null, "La cadena \"" + search + "\" no se encontró.");
            }
        } else if (e.getSource() == btnToUpper) {
            String input = JOptionPane.showInputDialog("Ingrese una cadena:");
            String upperCase = input.toUpperCase();
            JOptionPane.showMessageDialog(null, "La cadena en mayúsculas es: " + upperCase);
        } else if (e.getSource() == btnToLower) {
            String input = JOptionPane.showInputDialog("Ingrese una cadena:");
            String lowerCase = input.toLowerCase();
            JOptionPane.showMessageDialog(null, "La cadena en minúsculas es: " + lowerCase);
        } else if (e.getSource() == btnReplace) {
            String input = JOptionPane.showInputDialog("Ingrese una cadena:");
            String oldText = JOptionPane.showInputDialog("Ingrese el texto a reemplazar:");
            String newText = JOptionPane.showInputDialog("Ingrese el nuevo texto:");
            String replacedText = input.replace(oldText, newText);
            JOptionPane.showMessageDialog(null, "La cadena modificada es: " + replacedText);
        } else if (e.getSource() == btnTrim) {
            String input = JOptionPane.showInputDialog("Ingrese una cadena:");
            String trimmedText = input.trim();
            JOptionPane.showMessageDialog(null, "La cadena sin espacios en blanco al inicio o al final es: " + trimmedText);
        } else if (e.getSource() == btnStartsWith) {
            String input = JOptionPane.showInputDialog("Ingrese una cadena:");
            String prefix = JOptionPane.showInputDialog("Ingrese el prefijo a verificar:");
            boolean startsWith = input.startsWith(prefix);
            JOptionPane.showMessageDialog(null, "¿La cadena comienza con \"" + prefix + "\"? " + startsWith);
        } else if (e.getSource() == btnEndsWith) {
            String input = JOptionPane.showInputDialog("Ingrese una cadena:");
            String suffix = JOptionPane.showInputDialog("Ingrese el sufijo a verificar:");
            boolean endsWith = input.endsWith(suffix);
            JOptionPane.showMessageDialog(null, "¿La cadena termina con \"" + suffix + "\"? " + endsWith);
        }

}

    public static void main(String[] args) {
        StringMethods s = new StringMethods();
		s.setBounds(0,0,350,350);
	}
}

