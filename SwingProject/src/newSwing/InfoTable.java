package newSwing;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

public class InfoTable {

	Border border;
	public JPanel createInfoTable() {
		border=BorderFactory.createLineBorder(Color.black);
		JPanel infoPanel =new JPanel();
		infoPanel.setBackground(Color.white);
		
	    String data[][]={ {"01","aaa","9976797989"},    
            {"02","bbb","9988776655"},    
            {"01","ccc","8877665544"},
            {"01","ccc","8877665544"},
            {"01","ccc","8877665544"},
            {"01","ccc","8877665544"},
            {"01","ccc","8877665544"},
            {"01","ccc","8877665544"},
            {"01","ccc","8877665544"},
            {"01","ccc","8877665544"},
            {"01","ccc","8877665544"},
            {"01","ccc","8877665544"},
            {"01","ccc","8877665544"},
            {"01","ccc","8877665544"}};    
        String column[]={"ID","NAME","PHONE NO"};
        JTable table=new JTable(data,column);
        table.setBorder(border);
        table.setSize(50, 50);
        table.setGridColor(Color.orange);
        table.setCellSelectionEnabled(true);
        JScrollPane scrollPane=new JScrollPane(table); 
        scrollPane.setPreferredSize(new Dimension(290,230));
        infoPanel.add(scrollPane);
        
        
         return infoPanel;  
         }
}
