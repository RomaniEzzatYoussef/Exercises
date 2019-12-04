package RomaniTests.new_test;

import javax.swing.*;

public class TestObjects {
	
	public static void main(String[] args)
	{
		JButton btnOk = new JButton("OK");
		JButton btnCancel = new JButton("Cancel");
		JLabel lblName = new JLabel("Enter your name: ");
		JTextField jtxtfName = new JTextField("Type name here");
		JCheckBox jchBold =  new JCheckBox("Bold");
		JCheckBox jchItaic =  new JCheckBox("Italic");
		JRadioButton jrbRed = new JRadioButton("Red");
		JRadioButton jrbYellow = new JRadioButton("Yellow");
		JComboBox jcbColor = new JComboBox(new String[] {"Senior", "Junior" , "Freshman" , "Sophomore"});
		
		JPanel panel = new JPanel();
		panel.add(btnOk);
		panel.add(btnCancel);
		panel.add(lblName);
		panel.add(jtxtfName);
		panel.add(jchBold);
		panel.add(jchItaic);
		panel.add(jrbRed);
		panel.add(jrbYellow);
		panel.add(jcbColor);
		
		JFrame frame = new JFrame();
		frame.add(panel);
		frame.setTitle("GUI");
		frame.setSize(400,400);
		frame.setLocation(400, 100);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
