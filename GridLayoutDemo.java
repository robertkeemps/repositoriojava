
import javax.swing.JFrame;

public class GridLayoutDemo
{
    public static void main(String[] args)
    {
        GridLayoutFrame gridLayoutFrame = new GridLayoutFrame(); // Corrigido para GridLayoutFrame
        gridLayoutFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gridLayoutFrame.setSize(300, 200);
        gridLayoutFrame.setVisible(true); // Corrigido para gridLayoutFrame
    }
}
