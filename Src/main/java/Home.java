import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.LocalTime;
import java.util.Arrays;

public class Home {
    public JTabbedPane tabbedPane1;
    public JPanel Login;
    public JPanel Reisplanner;
    public JPanel Taal;
    public JPanel home;
    private JTextField logintxt;
    private JPasswordField passwordField1;
    private JButton loginButton;
    private JButton registrerenButton;
    private JRadioButton treinRadioButton;
    private JRadioButton tramRadioButton;
    private JRadioButton busRadioButton;
    private JComboBox timeBox;
    private JComboBox comboBox2;
    private JComboBox comboBox3;
    private JButton zoekenButton;
    private JButton engelsButton;
    private JButton nederlandsButton;
    private JLabel loginLbl;
    private JTextField userName;
    private JTextField userPassword;
    private JButton signUp;
    private JPanel signUpScreen;
    private JPanel Account;
    private JLabel reg;
    private JComboBox timeBoxie;


    public Home() {
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
        Arrays.stream(tijden).forEach((tijdenTemp) -> this.timeBoxie.addItem(tijdenTemp));

        ButtonGroup group = new ButtonGroup();
        group.add(tramRadioButton);
        group.add(busRadioButton);
        group.add(treinRadioButton);
        signUpScreen.setVisible(false);
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean matched = false;
                String username = logintxt.getText().toString();
                String password = passwordField1.getPassword().toString();

                try {
                    FileReader fr = new FileReader("login.txt");
                    BufferedReader br = new BufferedReader(fr);
                    String line;
                    while ((line = br.readLine()) != null) {
                        if (line.equals(username + "\t" + password)) {
                            matched = true;
                            break;
                        }
                    }
                    fr.close();
                }catch (Exception exception){}

                if(matched){
                    //opens a new window
                    //dispose();
                    //Login g = new Login();
                    //g.setBounds(400,200,600,300);
                    //g.setVisible(true);
                }else{
                    loginLbl.setText("Verkeerde gebruikersnaam of wachtwoord");
                }

            }
        });
        registrerenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                signUpScreen.setVisible(true);
                Login.setVisible(false);
                signUpScreen.updateUI();
            }
        });
        signUp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    FileWriter fw = new FileWriter("Login.txt", true);
                    fw.write(userName.getText()+"\t"+userPassword.getText()+"\n");
                    fw.close();
                    Frame f = new JFrame();
                    JOptionPane.showMessageDialog(f,"account aangemaakt");
                    signUpScreen.setVisible(false);
                    Login.setVisible(true);
                } catch (Exception exception){}
            }
        });
    }
}

