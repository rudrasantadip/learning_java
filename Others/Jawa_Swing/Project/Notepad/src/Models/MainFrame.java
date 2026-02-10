package Models;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;

public class MainFrame extends JFrame
{
    public MainFrame(String title, int width, int height)
    {
        this.setTitle(title);
        this.setVisible(true);
        this.setSize(width,height); 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void setBgColor(int hexCode)
    {
        this.getContentPane().setBackground(new Color(hexCode));
    }

    public void setImage(String path)
    {
        ImageIcon icon = new ImageIcon(path);
        this.setIconImage(icon.getImage());
    }
}
