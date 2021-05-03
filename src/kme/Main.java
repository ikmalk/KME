package kme;

import javax.swing.JFrame;



public class Main {

	public static void main(String args[]) {
		
		try {
			Frame object = new Frame();
			object.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			object.setSize(object.SIZE_X, object.SIZE_Y);
			object.setVisible(true);
			object.setResizable(false);
			object.setLocationRelativeTo(null);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
}
