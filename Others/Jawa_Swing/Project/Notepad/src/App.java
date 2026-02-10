


import Models.MainFrame;

public class App {
    public static void main(String[] args) throws Exception 
    {
        /*
         * The MainFrame class extends the Jframe which is an inbuilt class in the java swing
         * It creates a JFrame which is a GUI interface, where we add things like labels, buttons, spinners etc
         */
        MainFrame frame = new MainFrame("Notepad", 420, 420);
        frame.setBgColor(0xF06292);
        frame.setImage("src/resources/pikachu.jpg");

        /*
         * A label is an area where we can display text, image or both
         * to create labels we use the Jlabels, which is a class in Java Swing 
         */
    }
}
