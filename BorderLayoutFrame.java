import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import java.swing.JButton;

public class BorderLayoutFrame extends JFrame implements ActionListener
{
    private JButton[] buttons;
    private static final String[] names = { "Hide North", "Hide South", "Hide East", "Hide west", "Hide Center"};
    private BorderLayout layout;

    public BorderLayoutFrame()
    {
        super ("BorderLayout Demo ");
        layout = new BorderLayout( 5, 5);
        setLayout(layout);
        buttons = new JButton [ names.length ];
        for (int count = 0; count < names.lenght; count++)
        {
            buttons [ count ] = new JButton( names[count]);
        }
        add( buttons[0], BorderLayout.NORTH);
        add( buttons[1], BorderLayout.SOUTH);
        add( buttons[2], BorderLayout.EAST);
        add( buttons[3], BorderLayout.WEST);
        add( buttons[4], BorderLayout.CENTER);
    }
    public void actionPerformed(ActionEvent event)
    {
        for (JButton button : buttons)
        {
            if (event.getSource() == button)
                button.setVisible(false);
            else
                button.setVisible(true);

        }
        layout.layoutContainer(getContentPane());
    }
}
