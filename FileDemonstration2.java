import javax.swing.*;
import java.io.File;

public class FileDemonstration2 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("File Demonstration");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JLabel label = new JLabel("Enter directory name:");
        panel.add(label);

        JTextField textField = new JTextField(15); // reduziu o tamanho da caixa de texto
        panel.add(textField);

        JButton button = new JButton("Analyze");
        button.addActionListener(e -> {
            String path = textField.getText();
            analyzePath(path);
        });
        panel.add(button);

        frame.getContentPane().add(panel);
        frame.pack();

        // centraliza a janela na tela
        frame.setLocationRelativeTo(null);

        frame.setVisible(true);
    }

    public static void analyzePath(String path) {
        File name = new File(path);
        if (name.exists()) {
            String message = String.format("%s exists\n%s\n%s\nLast modified: %s\nLength: %s\nPath: %s\nParent: %s",
                    name.getName(), (name.isFile() ? "is a file" : "is not a file"),
                    (name.isDirectory() ? "is a directory" : "is not absolute path"), name.lastModified(),
                    name.length(), name.getPath(), name.getParent());

            if (name.isDirectory()) {
                String[] directory = name.list();
                message += "\n\nDirectory contents:\n";
                for (String directoryName : directory) {
                    message += directoryName + "\n";
                }
            }

            JOptionPane.showMessageDialog(null, message, "File Information", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, path + " does not exist.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}