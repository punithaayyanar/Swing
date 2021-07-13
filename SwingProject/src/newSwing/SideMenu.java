package newSwing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class SideMenu  {
	JButton aboutUsButton,employeeDetails,addEmployee,dashBoard;  
	JPanel sidePanel;
	Border border;
	InfoTable infoTable = new InfoTable();
	EmployeeRegistration register=new EmployeeRegistration();
	Dashboard board=new Dashboard();
	public JPanel createsidePanel(JPanel leftPanel,JPanel centerPanel) {
		sidePanel = new JPanel();
		sidePanel.setLayout(new GridLayout(10,1,0,10));
		
		sidePanel.setBackground(Color.white);
		sidePanel.setPreferredSize(new Dimension(90,300));
		aboutUsButton = new JButton("AboutUs");
		aboutUsButton.setToolTipText("Details about About Us");
		employeeDetails = new JButton("Details"); 
		dashBoard=new JButton("Dashbord");
		aboutUsButton.setBackground(Color.LIGHT_GRAY);
		employeeDetails.setBackground(Color.LIGHT_GRAY);
		dashBoard.setBackground(Color.LIGHT_GRAY);
		JLabel aboutUslabel=new JLabel("hai hello");
		aboutUsButton.addActionListener(new ActionListener() {
		
			@Override
			public void actionPerformed(ActionEvent e) {
					centerPanel.removeAll();
					centerPanel.add(aboutUslabel);
					centerPanel.repaint();
					centerPanel.revalidate();
				}
		});
		
		employeeDetails.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
					centerPanel.removeAll();
					centerPanel.add(infoTable.createInfoTable());
					centerPanel.repaint();
					centerPanel.revalidate();
				
			}
		});
		employeeDetails.setToolTipText("All Employee Details");
		addEmployee=new JButton("AddEmployee");
		addEmployee.setBackground(Color.LIGHT_GRAY);
		addEmployee.setToolTipText("Registration form");
		addEmployee.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				centerPanel.removeAll();
				centerPanel.add(register.createEmployee());
				centerPanel.repaint();
				centerPanel.revalidate();
				
			}
		});
		dashBoard.setToolTipText("Dashboard");
		dashBoard.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				centerPanel.removeAll();
				centerPanel.add(board.createDashboard());
				centerPanel.repaint();
				centerPanel.revalidate();
			}
		});
		sidePanel.add(aboutUsButton);
		sidePanel.add(employeeDetails);
		sidePanel.add(addEmployee);
		sidePanel.add(dashBoard);
		leftPanel.add(sidePanel);
		return leftPanel;
		
	}
	

}
