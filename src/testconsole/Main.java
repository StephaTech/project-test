package testconsole;

/*The source code below has been sourced     *    SapphireCode on youtube
Title: <C# vs Java - Console and GUI>
Author: <SapphireCode>
Date: <12 July of 2014>
Code version: <code version>
Availability: https://www.youtube.com/watch?v=TV9amMrJSfg&t=24s
*/

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main extends JFrame {

	private JButton button;
	
	private Main() {
		
		setLayout(new FlowLayout());
		
		button = new JButton("Search Titles");
		add(button);
		
		thehandler handler = new thehandler();
		button.addActionListener(handler);
		
		setTitle("Ultra Vision System");
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
		System.out.println("Type Title Name: ");
		//System.out.println("Women code too");
		
	}
	}
}


	

	


