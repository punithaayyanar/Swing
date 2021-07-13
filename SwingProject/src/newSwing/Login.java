package newSwing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;



public class Login {
	JTextField userNameField;
	JPasswordField passwordField;
	JButton loginButton, aboutUsButton;
	JPanel loginPanel,centerPanel,totalGUI,leftPanel,successPanel;
	JLabel userNameLabel,passwordLabel,messageUserNameLabel,messagePasswordLabel;
	SucessPanel success=new SucessPanel();
	Border border;
	public JPanel createLoginPanel(JPanel centerPanel,JPanel totalGUI,JPanel leftPanel,JPanel rightPanel){
	loginPanel = new JPanel();
	loginPanel.setLayout(new GridBagLayout());
	loginPanel.setBackground(Color.white);
	loginPanel.setPreferredSize(new Dimension(390,390));
	
	GridBagConstraints c=new GridBagConstraints();
	c.gridx=0;
	c.gridy=0;
	c.insets=new Insets(5, 5, 5, 5);
	userNameLabel =new JLabel("Username");
	loginPanel.add(userNameLabel,c);
	
	c.gridx=1;
	c.gridy=0;
	userNameField = new JTextField(8);
	loginPanel.add(userNameField,c);
	
	c.gridx=2;
	c.gridy=0;
	messageUserNameLabel=new JLabel();
	loginPanel.add(messageUserNameLabel,c);
	
	c.gridx=0;
	c.gridy=1;
	passwordLabel=new JLabel("Password");
	loginPanel.add(passwordLabel,c);
	
	c.gridx=1;
	passwordField = new JPasswordField(8);
	loginPanel.add(passwordField,c);
	
	c.gridx=2;
	c.gridy=1;
	messagePasswordLabel=new JLabel();
	loginPanel.add(messagePasswordLabel,c);
	
	c.gridx=1;
	c.gridy=2;
	loginButton=new JButton("Login");
	loginButton.setBackground(Color.LIGHT_GRAY);
	loginButton.addActionListener(new ActionListener() {
		
		
		public void actionPerformed(ActionEvent e) {
			if(userNameField.getText().trim().compareTo("punitha")==0) {
					messageUserNameLabel.setText("Correct!");
					messageUserNameLabel.setForeground(Color.green);
				}else {
					messageUserNameLabel.setText("Invalid!");
					messageUserNameLabel.setForeground(Color.red);
				}if(new String(passwordField.getPassword()).trim().compareTo("puni")==0) {
					messagePasswordLabel.setText("Correct!");
					messagePasswordLabel.setForeground(Color.green);
				}else {
					messagePasswordLabel.setText("Invalid!");
					messagePasswordLabel.setForeground(Color.red);
					}if((messageUserNameLabel.getForeground()==Color.green)&&(messagePasswordLabel.getForeground()==Color.green)){
						centerPanel.removeAll();
						centerPanel.add(success.createSuccessPanel());
						leftPanel.setVisible(true);
						rightPanel.setVisible(true);
						//centerPanel.repaint();
						//centerPanel.revalidate();
						JOptionPane.showMessageDialog(centerPanel, "Logged in successfully");
					}
				}
	});
	border= BorderFactory.createLineBorder(Color.LIGHT_GRAY);
	loginPanel.add(loginButton,c);
	loginPanel.setBorder(border);
	centerPanel.add(loginPanel);
	return centerPanel;
	}
	
	
}
