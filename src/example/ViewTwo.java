package example;


import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class ViewTwo extends JPanel{

	public ViewTwo(){
		this.setLayout(new BorderLayout(0,0));
		JLabel title = new JLabel();
		title.setText("This is a more complicated view.");
		String[] columnNames = {"First Name","Last Name","Sport","# of Years","Vegetarian"};

		Object[][] data = {
				{"Mary", "Campione","Snowboarding", new Integer(5), new Boolean(false)},
				{"Alison", "Huml","Rowing", new Integer(3), new Boolean(true)},
				{"Kathy", "Walrath","Knitting", new Integer(2), new Boolean(false)},
				{"Sharon", "Zakhour","Speed reading", new Integer(20), new Boolean(true)},
				{"Philip", "Milne","Pool", new Integer(10), new Boolean(false)}
		};

		JTable table = new JTable(data, columnNames);
	
		this.add(title, BorderLayout.NORTH);
		this.add(table, BorderLayout.CENTER);
		
		//We need to go deeper...
		JPanel internalpanel = new JPanel();
		internalpanel.setLayout(new BorderLayout(0,0));
		
		JLabel nameL = new JLabel();
		nameL.setText("Name: ");
		internalpanel.add(nameL, BorderLayout.WEST);
		JTextField input = new JTextField(25); 
		internalpanel.add(input, BorderLayout.EAST);
		this.add(internalpanel, BorderLayout.SOUTH);

	}
}
