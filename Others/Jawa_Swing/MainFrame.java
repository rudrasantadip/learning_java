import javax.swing.ImageIcon;
import javax.swing.JFrame;

import java.awt.Color;

public class MainFrame
{
    /*
     * A Jframe is a GUI window to add components to, like buttons spinners, e.t.c
     *
     */
    public static JFrame createFrame()
    {
        JFrame frame = new JFrame(); // Creates a new jframe
        frame.setTitle("Notepad +="); // Sets the title of the frame
        frame.setVisible(true); // sets the visibility of the frame to true
        frame.setSize(420,420); // sets the dimensions
        frame.setResizable(false); // Prevent frame from being resized
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Closes  the program execution when the cross is pressed
        return frame;
    }

    //Method to change image
    public static  void setImage(JFrame frame,String path)
    {
        ImageIcon logo = new ImageIcon(path); // Creates an image icon by using and image from the path provided
        frame.setIconImage(logo.getImage()); // Sets the image on the frame
    }

    public static void setBackGround(JFrame jFrame, Color color)
    {
        jFrame.getContentPane().setBackground(color);
    }

     public static void main(String[] args) 
     {

       JFrame mainFrame = createFrame();
       setImage(mainFrame, "pikachu.jpg");
       setBackGround(mainFrame, new Color(0xFFCDD2));

     }
}