package RomaniTests.databaseProgramming;
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

import java.sql.*;

import java.sql.DriverManager;

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
    private JTextField usernameTXT = new JTextField();
    private JLabel messageLBL = new JLabel();
    static Dimension d = Toolkit.getDefaultToolkit().getScreenSize();

    String first_name = "Romani";
    String last_name = "Ezzat";
    private JLabel email_messageLBL = new JLabel();
    private JLabel password_messageLBL = new JLabel();
    private JLabel jLabel3 = new JLabel();
    private static JButton exitBTNe = new JButton();

    public LoginGUI() {
    }

    private void jbInit() throws Exception {
        this.getContentPane().setLayout(null);
        this.setSize(new Dimension(727, 451));
        this.setBackground(Color.black);
        this.setForeground(Color.cyan);
        loginBTN.setText("login");
        loginBTN.setBounds(new Rectangle(115, 215, 90, 35));
        loginBTN.setForeground(new Color(49, 49, 255));
        loginBTN.setBackground(Color.cyan);
        loginBTN.setFont(new Font("Microsoft JhengHei UI", 1, 17));
        loginBTN.setDebugGraphicsOptions(DebugGraphics.LOG_OPTION);
        loginBTN.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jButton1_actionPerformed(e);
            }
        });
        jLabel1.setText("usernmae");
        jLabel1.setBounds(new Rectangle(90, 100, 75, 20));
        jLabel1.setForeground(Color.blue);
        jLabel1.setFont(new Font("Tahoma", 0, 14));
        jLabel2.setText("Password");
        jLabel2.setBounds(new Rectangle(90, 150, 75, 20));
        jLabel2.setForeground(Color.blue);
        jLabel2.setFont(new Font("Tahoma", 0, 14));
        passwordTXt.setBounds(new Rectangle(195, 150, 160, 20));
        usernameTXT.setBounds(new Rectangle(195, 100, 160, 20));
        messageLBL.setBounds(new Rectangle(115, 305, 305, 30));
        messageLBL.setForeground(Color.red);
        email_messageLBL.setForeground(Color.red);
        email_messageLBL.setBounds(new Rectangle(370, 95, 305, 30));
        password_messageLBL.setForeground(Color.red);
        password_messageLBL.setBounds(new Rectangle(370, 140, 305, 30));
        jLabel3.setText("Welcome");
        jLabel3.setBounds(new Rectangle(150, 35, 135, 40));
        jLabel3.setForeground(new Color(255, 66, 165));
        jLabel3.setFont(new Font("Tahoma", 2, 30));
        exitBTNe.setText("Exit");
        exitBTNe.setBounds(new Rectangle(255, 215, 80, 35));
        exitBTNe.setBackground(new Color(255, 0, 132));
        exitBTNe.setFont(new Font("Tahoma", 0, 20));
        exitBTNe.setForeground(Color.white);
        exitBTNe.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                exitBTNe_actionPerformed(e);
            }
        });
        this.getContentPane().add(exitBTNe, null);
        this.getContentPane().add(jLabel3, null);
        this.getContentPane().add(password_messageLBL, null);
        this.getContentPane().add(email_messageLBL, null);
        this.getContentPane().add(messageLBL, null);
        this.getContentPane().add(usernameTXT, null);
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
        frame.setBackground(new Color(0, 255, 0));
        frame.setTitle("Login Into My System");
        frame.setForeground(Color.blue);
        applet.init();
        applet.start();
        frame.setSize(d.width, d.height);
        Dimension frameSize = frame.getSize();
        frame.setLocation((d.width - frameSize.width) / 2, (d.height - frameSize.height) / 2);
        frame.setVisible(true);

    }

    public void start() {
    }

    public void destroy() {
    }
    static {
        try {
        } catch (Exception e) {
        }
    }

    private void jButton1_actionPerformed(ActionEvent e) {

        String username = usernameTXT.getText();
        String password = passwordTXt.getText();

        try {
            // Define database driver to JDBC
            Class.forName("sun.jdbc.odbc.JdbcOdbc");
            
            // Create connection between JDBC and Database
            Connection con = DriverManager.getConnection("jdbc:odbc:roma");
            
            // Create statement
            Statement st = con.createStatement();
            
            String sql = "select first_name , last_name from users where username = '" + username + "' and password = '" + password + "'";
            
            ResultSet rs = st.executeQuery(sql);
            
            if (rs.next()) {
                messageLBL.setText("Welcome " + rs.getString("first_name") + " " + rs.getString("last_name"));
            }
            
            else{
                messageLBL.setText("Invalid email and password");
            }
            
            rs.close();
            st.close();
            con.close();
            
        } catch (ClassNotFoundException f) {
            messageLBL.setText("Database not installed");
        } catch (SQLException f) {
            
           f.getStackTrace();
            
            messageLBL.setText("Connection failed");
        }
        
    }
    
    private void exitBTNe_actionPerformed(ActionEvent e) {
        
        System.exit(1);
    
    }    
}
