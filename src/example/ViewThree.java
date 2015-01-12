package example;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class ViewThree extends JPanel {

	public ViewThree(){
		this.setLayout(new GridBagLayout());
		
		GridBagConstraints gc = new GridBagConstraints();
		String[] names = {"Name:", "Username: ","Password: ","Email: "};

		int i=0;
	
		gc.weighty=1;
		for (String x : names){
			gc.gridy=i;
			gc.gridx=0; 
			gc.weightx=1;
			gc.anchor=GridBagConstraints.LINE_END;
			JLabel name = new JLabel();
			name.setText(x);
			this.add(name, gc);
			gc.gridx=1; 
			gc.anchor=GridBagConstraints.LINE_START;
			gc.weightx=2;
			this.add(new JTextField(25), gc);
			i++;

		}
		i++;
		gc.gridy=i;
		gc.gridx=1; 
		JButton sub = new JButton();
		sub.setText("Submit");

		sub.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JDialog JD = new JDialog();
				JD.setBounds(300, 300, 200, 200);
				JPanel JP = new JPanel();
				JD.setContentPane(JP);
				JLabel tm = new JLabel();
				tm.setText("Submitted!");
				JP.add(tm);
				JD.setVisible(true);
			}
		});
		this.add(sub, gc);
		
		gc.gridx=0;
		JComboBox<String> JCBS = new JComboBox<String>();
		
		JCBS.addItem("This");
		JCBS.addItem("That");
		JCBS.addItem("Other Thing");
		
		this.add(JCBS, gc);
	}


}
