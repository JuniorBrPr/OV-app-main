import javax.swing.*;
public class   OvApp
{
        public static void main(String[] args)
        {
            JFrame frame = new JFrame("Home");
            frame.setContentPane(new Home().home);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
        }
}


