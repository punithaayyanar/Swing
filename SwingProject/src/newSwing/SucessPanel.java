package newSwing;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SucessPanel {
	JPanel successPanel;
	JLabel paraLabel;
	public JPanel createSuccessPanel() {
	successPanel =new JPanel();
	successPanel.setBackground(Color.white);
	successPanel.setPreferredSize(new Dimension(400,390));
	paraLabel =new JLabel(new ImageIcon("E:\\wel.jpg"));
	successPanel.add(paraLabel);
	return successPanel;
	}
}
