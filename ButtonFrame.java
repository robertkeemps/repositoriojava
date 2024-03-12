package buttonframetest;


import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

  public class ButtonFrame extends JFrame{

    private final JButton plainJButton;
    private final JButton fancyJButton;

  

  public ButtonFrame(){

      super("Testando teu botão");
      setLayout(new FlowLayout());

      plainJButton = new JButton("Botão para realizar seu cadastro na empresa");
      add(plainJButton);

      Icon bug1 = new ImageIcon(getClass().getResource("foto1.jpg"));
     
      fancyJButton = new JButton("Botão para confirmar seu cadastro", bug1);
      add(fancyJButton);

      ButtonHandler handler = new ButtonHandler();
      fancyJButton.addActionListener(handler);
      plainJButton.addActionListener(handler);

  }


  private class ButtonHandler implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent event){
        JOptionPane.showMessageDialog(ButtonFrame.this,String.format("Voce apertou: %s", event.getActionCommand()));
    }
  }
}

