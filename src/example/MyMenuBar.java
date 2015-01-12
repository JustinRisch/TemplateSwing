package example;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

@SuppressWarnings("serial")
public class MyMenuBar extends JMenuBar {
	public MyMenuBar(){
		//Options under File
		JMenu menu = new JMenu("File");
		//SAVE 
		JMenuItem item = new JMenuItem("Save");
		item.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JDialog JD = new JDialog();
				JD.setBounds(200, 200, 200, 10);
				JD.setTitle("Saved!");
				JD.setVisible(true);
			}
		} );
		menu.add(item);

		//EXIT
		item = new JMenuItem("Exit");
		item.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		} );
		menu.add(item);
		this.add(menu);
		//View 
		menu = new JMenu("Views");
		item = new JMenuItem("Page 1"); 
		item.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Template.setInternalPanel(new ViewOne());

			}
		});
		menu.add(item);
		item = new JMenuItem("Page 2"); 
		item.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Template.setInternalPanel(new ViewTwo());

			}
		});
		menu.add(item);
		item = new JMenuItem("Page 3"); 
		item.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Template.setInternalPanel(new ViewThree());

			}
		});
		menu.add(item);
		this.add(menu);
		
				
	}
}
