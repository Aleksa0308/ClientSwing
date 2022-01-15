package view;

import javax.swing.*;
import java.awt.*;

public class ChangeView extends JFrame{

    private JPanel inputPanel;
    private JButton submit;
    private JLabel oldPassLabel;
    private JLabel newPass;
    private JPasswordField oldPassInput;
    private JPasswordField newPassInput;

    public ChangeView(){
        super();
        this.setSize(400, 250);
        this.setLayout(new FlowLayout(-1));
        initInputPanel();
        submit = new JButton("Submit");
        this.add(submit);
        this.setVisible(true);
        submit.addActionListener(e -> {
            this.setVisible(false);
        });
    }
    private void initInputPanel(){
        inputPanel = new JPanel();
        inputPanel.setLayout(new BoxLayout(inputPanel, BoxLayout.Y_AXIS));
        oldPassLabel = new JLabel("Old password: ");
        newPass = new JLabel("New password:");
        oldPassInput = new JPasswordField(20);
        newPassInput = new JPasswordField(20);
        inputPanel.add(oldPassLabel);
        inputPanel.add(oldPassInput);
        inputPanel.add(newPass);
        inputPanel.add(newPassInput);

        this.add(inputPanel);
    }
}
