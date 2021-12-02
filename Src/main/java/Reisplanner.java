import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;

public class Reisplanner extends JFrame implements ActionListener
{

        // De data die nodig is om een GUI te maken
        private JLabel label;
        private JFrame frame;
        private JPanel panel;
        private JButton button;
        private JComboBox combobox;
        private JComboBox combobox1;
        private JTextField text;
        private JLabel routegevonden;
        private JLabel vertrekLocatie;
        private JLabel aankomstLocatie;
        private JButton Home;


        @Override
        public void actionPerformed(ActionEvent e) {
            button.setText("test");
        }

        Reisplanner() {
            frame = new JFrame();
            button = new JButton("Zoeken");
            label = new JLabel();

            JButton Login;

            Login = new JButton("Login");


            Login.setBounds(10, 100, 80, 25);
            Login.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    Login l = new Login();
                    l.setVisible(true);
                    l.setBounds(400, 200, 600, 300);
                }
            });


            {
                // comboboxen DOOR: Niels van Gortel
                JPanel comboBoxPanel = new JPanel();
                comboBoxPanel.setBounds(50, 100, 394, 25);
                comboBoxPanel.setLayout(new GridLayout(0, 1, 10, 0));
                comboBoxPanel.setBackground(Color.white);

                JPanel Transport = new JPanel();
                Transport.setBounds(10, 3, 10, 25);


                // vertrektijden combobox
                LocalTime tijden[] = {
                        LocalTime.of(0, 00),
                        LocalTime.of(8, 00), LocalTime.of(8, 30), LocalTime.of(9, 00),
                        LocalTime.of(9, 30), LocalTime.of(10, 00), LocalTime.of(10, 30),
                        LocalTime.of(11, 00),
                        LocalTime.of(11, 30), LocalTime.of(12, 00), LocalTime.of(12, 30),
                        LocalTime.of(13, 00), LocalTime.of(13, 30), LocalTime.of(14, 00),
                        LocalTime.of(14, 30), LocalTime.of(15, 00), LocalTime.of(15, 30),
                        LocalTime.of(16, 00), LocalTime.of(16, 30), LocalTime.of(17, 00),
                        LocalTime.of(17, 30), LocalTime.of(17, 30), LocalTime.of(18, 30),
                        LocalTime.of(19, 00), LocalTime.of(19, 30), LocalTime.of(20, 00),
                        LocalTime.of(20, 30), LocalTime.of(21, 00), LocalTime.of(21, 30),
                        LocalTime.of(22, 30)
                };
                JComboBox<Object> timeBox = new JComboBox<Object>(tijden);
                timeBox.setBounds(100, 200, 100, 25);

                frame.add(comboBoxPanel);

                // Zet het keuze menu van de vertreklocaties
                combobox = new JComboBox(new Object[]{"Vertreklocatie", "Amsterdam", "Rotterdam", "Utrecht", "Den haag", "Amersfoort"});
                combobox1 = new JComboBox(new Object[]{"Aankomstlocatie", "Amsterdam", "Rotterdam", "Utrecht", "Den haag", "Amersfoort"});


                // maakt het panel aan
                panel = new JPanel();
                panel.setBorder(BorderFactory.createEmptyBorder(10, 0, 30, 30));
                panel.setLayout(new GridLayout(6, 0));
                frame.setSize(400, 400);
                frame.setLocationRelativeTo(null);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLayout(new FlowLayout());


                //sets the choice menu of the transportation
                JRadioButton train = new JRadioButton("Trein");
                JRadioButton Tram = new JRadioButton("Tram");
                JRadioButton Bus = new JRadioButton("Bus");


                // makes sure that one of the buttons can be selected
                ButtonGroup group = new ButtonGroup();
                group.add(train);
                group.add(Bus);
                group.add(Tram);

                // sets the button to go back to the main screen
                Home = new JButton("Home");
                Home.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        HomeGui l = new HomeGui();
                        l.setBounds(400,200,600,300);
                        l.setVisible(true);
                        dispose();
                    }

                });




                // Voegt attributen toe aan het panel.
                Transport.add(train);
                Transport.add(Tram);
                Transport.add(Bus);
                frame.add(Transport);
                frame.add(timeBox);
                frame.add(combobox);
                frame.add(combobox1);
                frame.add(button);
                panel.add(Home);
                panel.add(label);
                frame.add(panel, BorderLayout.CENTER);



                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setTitle("OvApp");
                frame.pack();


                frame.setVisible(true);
            }

            // Zorgt ervoor dat er een response komt als de zoek button ingedrukt wordt.


        }
    }

