package view;

import javax.swing.*;
import java.awt.*;

public class RegisterView extends JFrame {
    private JPanel inputPanel;
    private JLabel usernameLabel;
    private JLabel firstnameLabel;
    private JLabel lastnameLabel;
    private JLabel passwordLabel;
    private JLabel emailLabel;
    private JLabel numberLabel;
    private JLabel dateLabel;
    private JTextField emailInput;
    private JTextField numberInput;
    private JTextField firstnameInput;
    private JTextField lastnameInput;
    private JTextField dateInput;

    private JTextField usernameInput;
    private JPasswordField passwordInput;
    private JButton register;

    public RegisterView(){
        super();
        this.setSize(400, 600);
        this.setLayout(new FlowLayout(-1));
        initInputPanel();
        register = new JButton("Register");
        this.add(register);
        this.setVisible(true);
        register.addActionListener(e -> {
            this.setVisible(false);
        });

    }

    private void initInputPanel(){
        inputPanel = new JPanel();
        inputPanel.setLayout(new BoxLayout(inputPanel, BoxLayout.PAGE_AXIS));
        usernameLabel = new JLabel("Username: ");
        passwordLabel = new JLabel("Password: ");
        firstnameLabel = new JLabel("Firstname: ");
        lastnameLabel = new JLabel("Lastname: ");
        dateLabel = new JLabel("Date of birth: ");
        emailLabel = new JLabel("Email: ");
        numberLabel = new JLabel("Phone number:");

        usernameInput = new JTextField(20);
        passwordInput = new JPasswordField(20);
        firstnameInput = new JTextField(20);
        lastnameInput = new JTextField(20);
        emailInput = new JTextField(20);
        numberInput = new JTextField(20);
        dateInput = new JTextField(20);

        inputPanel.add(usernameLabel);
        inputPanel.add(usernameInput);

        inputPanel.add(passwordLabel);
        inputPanel.add(passwordInput);

        inputPanel.add(firstnameLabel);
        inputPanel.add(firstnameInput);

        inputPanel.add(lastnameLabel);
        inputPanel.add(lastnameInput);

        inputPanel.add(emailLabel);
        inputPanel.add(emailInput);

        inputPanel.add(numberLabel);
        inputPanel.add(numberInput);

        inputPanel.add(dateLabel);
        inputPanel.add(dateInput);

        this.add(inputPanel);
    }
}
