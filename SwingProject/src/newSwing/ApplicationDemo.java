package newSwing;

import java.awt.BorderLayout;
import java.awt.Color;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import java.awt.Image;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;


public class ApplicationDemo {
	JPanel totalGUI,headerPanel,leftPanel,rightPanel, footerPanel,centerPanel,loginPanel,aboutUsPanel, successPanel;
	JLabel welcomeLabel,footerlabel,userNameLabel,passwordLabel,aboutUsLabel,paralabel;
 ;
	JTextField userNameField;
	JPasswordField passwordField;
	JButton loginButton, aboutUsButton;
	JFrame frame;
	JMenuBar mb;
	JMenu file,edit,help;    
	JMenuItem cut,copy,paste,selectAll;
	Border raisedetched;
	Login log= new Login();
	SideMenu sideMenu=new SideMenu();
	public ApplicationDemo(){
		frame=new JFrame("Demo");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setContentPane(createcontentPane());
		frame.setSize(600, 600);
		frame.setVisible(true);
		frame.setJMenuBar(mb);
		}
	
	private JPanel createcontentPane() {
		raisedetched = BorderFactory.createEtchedBorder(EtchedBorder.RAISED);
		totalGUI = new JPanel();//overall panel
		totalGUI.setLayout(new BorderLayout(10,10));
		totalGUI.setBackground(Color.white);
		
		headerPanel = new JPanel();
		headerPanel.setBackground(Color.LIGHT_GRAY);
		headerPanel.setPreferredSize(new Dimension(600,60));
		headerPanel.setBorder(raisedetched);

		
		leftPanel = new JPanel(); //left panel
		leftPanel.setBackground(Color.white);
		leftPanel.setPreferredSize(new Dimension(100,300));
		leftPanel.setVisible(false);
		
		rightPanel = new JPanel(); //right panel
		rightPanel.setBackground(Color.white);
		rightPanel.setPreferredSize(new Dimension(100,300));
	    rightPanel.setVisible(false);
		
		centerPanel = new JPanel(); //center panel
		centerPanel.setBackground(Color.white);
		centerPanel.setPreferredSize(new Dimension(400,440));
	    centerPanel.setOpaque(true);
		
	    
		footerPanel= new JPanel(); //footer panel
		footerPanel.setBackground(Color.LIGHT_GRAY);
		footerPanel.setPreferredSize(new Dimension(600,60));
		footerPanel.setBorder(raisedetched);
		
		
		welcomeLabel= new JLabel("WELCOME");
		welcomeLabel.setFont(new Font("Serif", Font.BOLD, 30));
		headerPanel.add(welcomeLabel);
		
		footerlabel = new JLabel("All Rights Received");
		footerlabel.setFont(new Font("Serif", Font.CENTER_BASELINE, 15));
		footerPanel.add(footerlabel);
		
		
		  cut=new JMenuItem("cut");
		  copy=new JMenuItem("copy");
		  paste=new JMenuItem("paste");
		  selectAll=new JMenuItem("selectAll"); 
		  mb=new JMenuBar();
		  file=new JMenu("File");
		  edit=new JMenu("Edit");
		  help=new JMenu("Help");
		  mb.add(file);mb.add(edit);mb.add(help);
		 

		  totalGUI.add(headerPanel, new BorderLayout().PAGE_START);
		  totalGUI.add(footerPanel, new BorderLayout().PAGE_END);
		  totalGUI.add(rightPanel, new BorderLayout().LINE_END);
		  totalGUI.add(log.createLoginPanel(centerPanel, totalGUI, leftPanel,rightPanel),new BorderLayout().CENTER);
		  totalGUI.add(sideMenu.createsidePanel(leftPanel,centerPanel), new BorderLayout().LINE_START);
		
		return totalGUI;
	}

		
	public static void main(String[] args) {
		
		new ApplicationDemo();
		
		}
}
