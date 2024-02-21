import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class LabelFrame extends JFrame
{
	private JLabel label1;
	private JLabel label2;
	private JLabel lavel3;
	
	
	
	public LabelFrame()
	{
		super( "Testing JLabel" );
		setLayout( new FlowLayout() );
		
		label1 = new JLabel( "INSTITUTO FEDERAL DE EDUCAÇÃO, CIÊNCIA E TECNOLOGIA DE MATO GROSSO" );
		label1.setToolTipText( "This is label1" );
		add( label1 );
		
		Icon bug = new ImageIcon( getClass().getResource( "if.png") );
		label2 = new JLabel( "",bug, SwingConstants.LEFT);
		label2.setToolTipText( "This is label2" );
		add( label2 );
		
		lavel3 = new JLabel();
		lavel3.setText( "" );
		lavel3.setHorizontalTextPosition( SwingConstants.CENTER );
		lavel3.setVerticalTextPosition (SwingConstants.BOTTOM );
		lavel3.setToolTipText( "This is lavel3" );
		add ( lavel3);
	}
}
