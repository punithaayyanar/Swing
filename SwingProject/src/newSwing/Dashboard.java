package newSwing;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;



public class Dashboard implements ActionListener  {
	JColorChooser chooser;
	JPanel dashboard,colorChooser,feedback;
	JButton colorSelector,submit;
	JTextArea comments;
	JTabbedPane tab;
	public JPanel createDashboard() {
	    dashboard=new JPanel();
	    dashboard.setPreferredSize(new Dimension(400,350));
	    dashboard.setBackground(Color.white);
	    tab=new JTabbedPane();
		tab.setBackground(Color.white);
		tab.setPreferredSize(new Dimension(350,390));
		
		colorChooser=new JPanel();//1st tab
		colorSelector=new JButton("ColorSector");
		colorChooser.add(colorSelector);
		colorSelector.setBackground(Color.white);
		colorSelector.addActionListener(this);
		tab.add("chooser",colorChooser);
	    
	    feedback = new JPanel();//2nd tab
	    feedback.setBackground(Color.white);
	    JLabel label=new JLabel("Type your comments here");
	    feedback.add(label);
	    comments = new JTextArea();
	    comments.setLineWrap(true);
		comments.setSize(300,400);
	    JScrollPane scroll=new JScrollPane(comments);
	    scroll.setPreferredSize(new Dimension(300,230));
		feedback.add(scroll);
		submit=new JButton("Submit");
		submit.setBackground(Color.LIGHT_GRAY);
		submit.addActionListener(this);
		
     	feedback.add(submit);
	    tab.add("feedback",feedback);
	    
	
		dashboard.add(tab);
		return dashboard;
	}

	

	@Override
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==colorSelector) {    
		Color color=JColorChooser.showDialog(chooser, "select a color", Color.RED);
		colorChooser.setBackground(color);}
		if(e.getSource()==submit) {
			JOptionPane.showMessageDialog(tab, "Thank you for your comments");	
		}
		}

}
