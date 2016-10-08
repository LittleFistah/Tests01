
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextPane;

public class Main {

	private static JFrame frame01;
	private static JTextPane text01;
	private static JButton button01;
	
	public static void main(String[] args) {
		init();		
	}
	
	private static void init(){
		frame01 = new JFrame("Bestes Fenster 4 eva");
		frame01.setSize(1280, 720);
		frame01.setResizable(false);
		
		frame01.getContentPane().setLayout(null);
		
		text01 = new JTextPane();
		text01.setEditable(false);
		text01.setText("Jan ist cool!");
		text01.setBounds(10, 10, 200, 20);
		
		button01 = new JButton("Klick mich");
		button01.setBounds(10, 50, 200, 20);
		button01.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {				
				switch (text01.getText()) {
				case "Jan ist cool!":
					text01.setText("Haha, Jan ist kacke!");					
					break;
				default:
					text01.setText("Jan ist cool!");
					break;
				}				
			}
		});
		
		frame01.add(text01);
		frame01.add(button01);
		frame01.setVisible(true);
	}
}
