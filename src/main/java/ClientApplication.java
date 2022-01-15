import view.LoginView;

import javax.swing.*;
import java.awt.*;

public class ClientApplication extends JFrame {
    private String token;
    private LoginView loginView;


    private ClientApplication() throws IllegalAccessException, NoSuchMethodException {
        this.setTitle("Client Application");
        this.setSize(400, 400);
        this.setLayout(new BorderLayout());

        loginView = new LoginView();
        this.add(loginView, BorderLayout.NORTH);

        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private static class InstanceHolder{
        private static ClientApplication instance;

        static {
            try {
                instance = new ClientApplication();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        }
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public LoginView getLoginView() {
        return loginView;
    }

    public void setLoginView(LoginView loginView) {
        this.loginView = loginView;
    }
}
