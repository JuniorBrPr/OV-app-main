import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeGui extends JFrame {

    ImageIcon logo;
    JLabel logoLabel;
    JButton Account, Reisplanner, Taal;

    HomeGui() {
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);

<<<<<<< HEAD
=======

       


>>>>>>> origin/Developer
        Account = new JButton("Account");
        add(Account, BorderLayout.NORTH);

        Reisplanner = new JButton("Reisplanner");
        add(Reisplanner, BorderLayout.SOUTH);

        Taal = new JButton("Taal");
        add(Taal, BorderLayout.EAST);

<<<<<<< HEAD
=======

>>>>>>> origin/Developer
        Account.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent d) {
                dispose();
                Login l = new Login();
                l.setBounds(400,200,600,300);
                l.setVisible(true);

            }
        });

        Reisplanner.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
<<<<<<< HEAD
                dispose();
                Reisplanner g = new Reisplanner();
=======

                Reisplanner g = new Reisplanner();
                dispose();
>>>>>>> origin/Developer
            }
        });

        Taal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });

<<<<<<< HEAD
    }

=======

    }


>>>>>>> origin/Developer
    public void actionPerformed(ActionEvent e) {

    }
}

