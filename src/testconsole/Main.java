package testconsole;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main extends JFrame {

	private JButton button;
	
	private Main() {
		
		setLayout(new FlowLayout());
		
		button = new JButton("Output to Console");
		add(button);
		
		thehandler handler = new thehandler();
		button.addActionListener(handler);
		
		setTitle("Console Output");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setSize(400,400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}
class thehandler implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Hello World");
		
	}
	}
}


	

	


