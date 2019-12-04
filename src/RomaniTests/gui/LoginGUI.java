package RomaniTests.gui;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.SystemColor;
import java.awt.Toolkit;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DebugGraphics;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class LoginGUI extends JApplet {

    private JButton loginBTN = new JButton();
    private JLabel jLabel1 = new JLabel();
    private JLabel jLabel2 = new JLabel();
    private JPasswordField passwordTXt = new JPasswordField();
    private JTextField emailTXT = new JTextField();
    private JLabel messageLBL = new JLabel();
    static Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    
    String first_name = "Romani";
    String last_name = "Ezzat";
    
    private void jbInit() throws Exception 
    {
        this.getContentPane().setLayout(null);
        this.setSize(new Dimension(d.width, d.height));
        this.setBackground(Color.black);
        this.setForeground(Color.cyan);
        loginBTN.setText("login");
        loginBTN.setBounds(new Rectangle(150, 185, 90, 35));
        loginBTN.setForeground(Color.blue);
        loginBTN.setBackground(Color.cyan);
        loginBTN.setFont(new Font("Microsoft JhengHei UI", 1, 13));
        loginBTN.setDebugGraphicsOptions(DebugGraphics.LOG_OPTION);
        
        loginBTN.addActionListener(new ActionListener() 
        {
                public void actionPerformed(ActionEvent e) 
                {
                    jButton1_actionPerformed(e);
                }
        });
        
        jLabel1.setText("Email");
        jLabel1.setBounds(new Rectangle(60, 60, 75, 20));
        jLabel1.setForeground(Color.blue);
        jLabel1.setFont(new Font("Tahoma", 0, 14));
        jLabel2.setText("Password");
        jLabel2.setBounds(new Rectangle(60, 110, 75, 20));
        jLabel2.setForeground(Color.blue);
        jLabel2.setFont(new Font("Tahoma", 0, 14));
        passwordTXt.setBounds(new Rectangle(165, 110, 120, 20));
        emailTXT.setBounds(new Rectangle(165, 60, 120, 20));
        messageLBL.setBounds(new Rectangle(80, 255, 305, 30));
        messageLBL.setForeground(Color.red);
        this.getContentPane().add(messageLBL, null);
        this.getContentPane().add(emailTXT, null);
        this.getContentPane().add(passwordTXt, null);
        this.getContentPane().add(jLabel2, null);
        this.getContentPane().add(jLabel1, null);
        this.getContentPane().add(loginBTN, null);
    }

    public void init() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        LoginGUI applet = new LoginGUI();
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(applet, BorderLayout.CENTER);
        frame.setBackground(Color.blue);
        frame.setTitle("Login Into My System");
        frame.setForeground(Color.RED);
        applet.init();
        frame.setSize(d.width , d.height);
        Dimension frameSize = frame.getSize();
        frame.setLocation((d.width - frameSize.width) / 2, (d.height - frameSize.height) / 2);
        frame.setVisible(true);
        
    }

    private void jButton1_actionPerformed(ActionEvent e) {
        
        String email = emailTXT.getText();
        String password = passwordTXt.getText();
        
        
        if (email.equals("romaniezzat@hotmail.com") && password.equals("abc"))
        {   
            jLabel1.setVisible(false);
            jLabel2.setVisible(false);
            emailTXT.setVisible(false);
            passwordTXt.setVisible(false);
            loginBTN.setVisible(false);
            messageLBL.setText("Welcome " + first_name + " " + last_name);
            messageLBL.setForeground(Color.BLUE);
            messageLBL.setFont(new Font("Tahoma", 0, 18));
            messageLBL.setLocation(100, 20);
            
        }
        
        else {
            messageLBL.setText("Email or Password is wrong , please try again!");
            messageLBL.setFont(new Font("Tahoma", 0, 14));
            messageLBL.setForeground(Color.red);
            passwordTXt.setText("");
        }
    }
}

