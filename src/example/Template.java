package example;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
@SuppressWarnings("serial")
public class Template extends JFrame {
	private static JPanel contentPane;
	private static MyMenuBar menuBar = new MyMenuBar();
	private static JPanel InternalPanel;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Template frame = new Template();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Template() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		InternalPanel = new JPanel();
		contentPane.add(InternalPanel, BorderLayout.WEST);
		

		/* This is where we define persistent/shared components. 
		 * In this application, it will consist of a menu bar at the top and 
		 * a footnote at the bottom. */
				
		//Footer
		JLabel bottomNote =new JLabel();
		bottomNote.setText("This will only be loaded once.");
		contentPane.add(bottomNote, BorderLayout.SOUTH);
		//Menu Bar
		contentPane.add(menuBar, BorderLayout.NORTH);

	}
	public static void setInternalPanel(Component c){
		InternalPanel.removeAll();
		InternalPanel.add(c);
		InternalPanel.revalidate(); 
		InternalPanel.repaint();
	}
}
