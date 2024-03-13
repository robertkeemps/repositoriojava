import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class LoginFrame extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;

    public LoginFrame() {
        super("Usuario e Senha e Logo");
        setLayout(new FlowLayout());

        
        JLabel welcomeLabel = new JLabel("Ola, insira seu usuário e senha:");
        add(welcomeLabel);

        // Adicionando ícone à esquerda do campo de texto do usuário
        ImageIcon userIcon = new ImageIcon(getClass().getResource("ifmt.png"));
        JLabel userLabel = new JLabel();
        userLabel.setIcon(userIcon);
        add(userLabel);

        usernameField = new JTextField("Insira o Usuário", 20);
        add(usernameField);
        usernameField.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                usernameField.setText("");
            }
            public void focusLost(FocusEvent e) {
                // Não é necessário fazer nada quando perde o foco
            }
        });

        // Adicionando ícone à esquerda do campo de senha
        ImageIcon passwordIcon = new ImageIcon("password_icon.png"); // Ícone para a senha
        JLabel passwordLabel = new JLabel(passwordIcon);
        add(passwordLabel);

        passwordField = new JPasswordField("Ta seguro papai", 20);
        add(passwordField);
        passwordField.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                passwordField.setText("");
            }
            public void focusLost(FocusEvent e) {
                
            }
        });

        // Botão para exibir a mensagem
        JButton mostrarMensagemButton = new JButton("OK");
        add(mostrarMensagemButton);

        // Event listener para o botão
        mostrarMensagemButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());
                showMessage(username, password);
            }
        });
    }

    private void showMessage(String username, String password) {
        JOptionPane.showMessageDialog(null, "Olá " + username + ", seja bem vindo (a). \nsua senha  é: " + password);
    }

    public static void main(String[] args) {
        LoginFrame frame = new LoginFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 900); 
        frame.setVisible(true);
    }
}