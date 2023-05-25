import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListaActividades extends JFrame implements ActionListener {
    private JTextField textField;
    private JTextArea textArea;
    private JButton addButton;
    private StringBuilder actividadesBuilder;

    public ListaActividades() {
        setTitle("Lista de Actividades");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textField = new JTextField(20);

        textArea = new JTextArea(10, 30);
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);

        addButton = new JButton("Agregar");
        addButton.addActionListener(this);

        actividadesBuilder = new StringBuilder();

        setLayout(new FlowLayout());
        add(textField);
        add(addButton);
        add(scrollPane);

        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {
            String nuevaActividad = textField.getText();
            actividadesBuilder.append(nuevaActividad).append("\n");
            textArea.setText(actividadesBuilder.toString());
            textField.setText("");
        }
    }

    public static void main(String[] args) {
        ListaActividades la = new ListaActividades();
        la.setBounds(0,0,400,400);
        la.setVisible(true);
        la.setResizable(true);

    }
}
