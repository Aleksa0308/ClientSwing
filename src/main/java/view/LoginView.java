package view;

import com.fasterxml.jackson.databind.ObjectMapper;
import restClient.UserServiceRestClient;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class LoginView extends JPanel {
    private JPanel inputPanel;
    private JLabel usernameLabel;
    private JLabel passwordLabel;
    private JTextField usernameInput;
    private JPasswordField passwordInput;
    private JButton loginButton;
    private JButton forgotPass;
    private JButton register;
    private RegisterView registerView;
    private ChangeView changeView;

    private UserServiceRestClient userServiceRestClient = new UserServiceRestClient();

    private ObjectMapper objectMapper = new ObjectMapper();

    public LoginView(){
        super();
        this.setSize(1000,400);
        this.setLayout(new FlowLayout());
        initInputPanel();
        loginButton = new JButton("Login");
        this.add(loginButton);
        forgotPass = new JButton("Forgot Password?");
        this.add(forgotPass);
        register = new JButton("Register");
        this.add(register);
        register.addActionListener(e -> {
            registerView = new RegisterView();

        });
        forgotPass.addActionListener(e -> {
            changeView = new ChangeView();
        });


        loginButton.addActionListener((event) -> {

            try {
                String token = userServiceRestClient
                        .login(usernameInput.getText(), String.valueOf(passwordInput.getPassword()));
                this.setVisible(false);
                ClientApplication.getInstance().setToken(token);
                System.out.println(token);
                ClientApplication.getInstance().getMoviesView().init();

            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    private void initInputPanel(){
        inputPanel = new JPanel();
        inputPanel.setLayout(new BoxLayout(inputPanel, BoxLayout.PAGE_AXIS));
        usernameLabel = new JLabel("Username: ");
        passwordLabel = new JLabel("Password: ");
        usernameInput = new JTextField(20);
        passwordInput = new JPasswordField(20);

        inputPanel.add(usernameLabel);
        inputPanel.add(usernameInput);

        inputPanel.add(passwordLabel);
        inputPanel.add(passwordInput);

        this.add(inputPanel);
    }


}
