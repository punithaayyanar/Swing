package newSwing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class EmployeeRegistration {
	JTextField firstname, lastname,email,username,phoneno;
    JPasswordField passwordField;
    JButton register;
    JLabel firstnamelabel,lastnamelabel,emaillabel,usernamelabel,phonenolabel,gender,passwordlabel;
    JRadioButton genderMale,genderFemale;
    JPanel registerPanel;
    Border border;
	 JPanel createEmployee() {
		
		 registerPanel =new JPanel();
		
		 registerPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 20));
		 registerPanel.setBackground(Color.white);
		 registerPanel.setPreferredSize(new Dimension(300,350));
		
		
			firstnamelabel =new JLabel("First Name");
			registerPanel.add(firstnamelabel);
		
			firstname = new JTextField(15);
			registerPanel.add(firstname);
			lastnamelabel=new JLabel("Last Name");
			registerPanel.add(lastnamelabel);
			lastname=new JTextField(15);
			registerPanel.add(lastname);
			emaillabel=new JLabel("Email Id      ");
			registerPanel.add(emaillabel);
			email=new JTextField(15);
			registerPanel.add(email);
			usernamelabel=new JLabel("User Name");
			registerPanel.add(usernamelabel);
			username=new  JTextField(15);
			registerPanel.add(username);
			passwordlabel=new JLabel("Password  ");
			registerPanel.add(passwordlabel);
			passwordField=new JPasswordField(15);
			registerPanel.add(passwordField);
			gender=new JLabel("Gender  ");
			registerPanel.add(gender);
			genderMale=new JRadioButton("Male");
			registerPanel.add(genderMale);
			genderFemale=new JRadioButton("Female");
			registerPanel.add(genderFemale);
			ButtonGroup bg=new ButtonGroup();
			bg.add(genderMale);bg.add(genderFemale);
			register=new JButton("Register");
			registerPanel.add(register);
			border= BorderFactory.createTitledBorder(border, "Registeration");
			registerPanel.setBorder(border);
			register.setBackground(Color.LIGHT_GRAY);
			register.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(email, "Thank you");
					
				}
			});
		
		return registerPanel;
		
	}
}
