package RomaniTests.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Rectangle;
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

public class MyNewApplet extends JApplet
{
	private JButton loginBTN = new JButton();
	private JLabel jlabel1 = new JLabel();
	private JLabel jlabel2 = new JLabel();
	private JPasswordField passwordTXT = new JPasswordField();
	private JTextField emailTXT = new JTextField();
	private JLabel messageLBL = new JLabel();
	
	String first_name = "Romani";
	String last_name = "Ezzat";
	
	public MyNewApplet()
	{
		
	}
	
	public void init() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	
	private void jbInit() throws Exception
	{
		this.getContentPane().setLayout(null);
        this.setSize(new Dimension(476, 309));
        this.setBackground(Color.black);
        this.setForeground(Color.cyan);
        loginBTN.setText("login");
        loginBTN.setBounds(new Rectangle(150, 185, 90, 35));
        loginBTN.setForeground(Color.blue);
        loginBTN.setBackground(Color.cyan);
        loginBTN.setFont(new Font("Microsoft JhengHei UI", 1, 13));
        loginBTN.setDebugGraphicsOptions(DebugGraphics.LOG_OPTION);
        loginBTN.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jButton1_actionPerformed(e);
                }
            });
        jlabel1.setText("Email");
        jlabel1.setBounds(new Rectangle(60, 60, 75, 20));
        jlabel1.setForeground(Color.blue);
        jlabel1.setFont(new Font("Tahoma", 0, 14));
        jlabel2.setText("Password");
        jlabel2.setBounds(new Rectangle(60, 110, 75, 20));
        jlabel2.setForeground(Color.blue);
        jlabel2.setFont(new Font("Tahoma", 0, 14));
        passwordTXT.setBounds(new Rectangle(165, 110, 120, 20));
        emailTXT.setBounds(new Rectangle(165, 60, 120, 20));
        messageLBL.setBounds(new Rectangle(80, 255, 225, 30));
        messageLBL.setForeground(Color.red);
        this.getContentPane().add(messageLBL, null);
        this.getContentPane().add(emailTXT, null);
        this.getContentPane().add(passwordTXT, null);
        this.getContentPane().add(jlabel2, null);
        this.getContentPane().add(jlabel1, null);
        this.getContentPane().add(loginBTN, null);
	}
	
	public static void main(String[] args)
	{
		MyNewApplet applet = new MyNewApplet();
		JFrame frame = new JFrame();
		frame.setVisible(true);
		applet.init();
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setSize(d.width , d.height);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.getContentPane().add(applet, BorderLayout.CENTER);
		//frame.setBackground(new Color(0 , 0 ,0));
		//frame.setTitle("Login Into My System");
	}
	
	private void jButton1_actionPerformed(ActionEvent e) {
        
        String email = emailTXT.getText();
        String password = passwordTXT.getText();
        
        
        if (email.equals("abc") && password.equals("abc"))
            messageLBL.setText("Welcome " + first_name + " " + last_name);
        
        else
        	messageLBL.setText("");
    }
}
