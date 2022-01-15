package view;

import javax.swing.*;
import java.awt.*;

public class ClientApplication extends JFrame {

	private String token;
	private LogInView loginView;


	private ClientApplication() throws IllegalAccessException, NoSuchMethodException {
		this.setTitle("Client Application");
		this.setSize(1000, 400);
		this.setLayout(new BorderLayout());

		loginView = new LogInView();
		this.add(loginView, BorderLayout.NORTH);


		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private static class InstanceHolder {
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

	public LogInView getLoginView() {
		return loginView;
	}

	public void setLoginView(LogInView loginView) {
		this.loginView = loginView;
	}


	public static ClientApplication getInstance() {
		return InstanceHolder.instance;
	}
}
