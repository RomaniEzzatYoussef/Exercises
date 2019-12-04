package RomaniTests;

import javax.swing.*;

public class GUIComponents {

	public static void main(String[] args)
	{
		JButton btOK = new JButton("OK");
		
		JButton btCancel = new JButton("Cancel");
		
		JLabel lblName = new JLabel("Enter your name: ");
		
		JTextField jtfName = new JTextField("Type Name here...");
		
		JCheckBox jchBold = new JCheckBox("Bold");
		
		JCheckBox jchItalic = new JCheckBox("Italic");
		
		JRadioButton jrbRed = new JRadioButton("Red");
		
		JRadioButton jrbYellow = new JRadioButton("Yellow");
		
		JComboBox jcboColor = new JComboBox(new String[] {"Freshman", "Sophomore", "Junior" , "Senior"});
		
		JPanel panel = new JPanel();
		
		panel.add(btOK);
		panel.add(btCancel);
		panel.add(lblName);
		panel.add(jtfName);
		panel.add(jchBold);
		panel.add(jchItalic);
		panel.add(jrbRed);
		panel.add(jrbYellow);
		panel.add(jcboColor);
		
		JFrame frame = new JFrame();
		
		frame.add(panel);
		frame.setTitle("Show GUI Components");
		frame.setSize(400, 150);
		frame.setLocation(200, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
		
		
		
	}

}
