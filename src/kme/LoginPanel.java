package kme;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LoginPanel extends PanelObject{

	private Frame frame;
	
	private JPanel homePanel;
	public JPanel loginPanel;
	
	private JButton loginButton;
	
	public LoginPanel(Frame frame, PanelID id){
		
		super(id);
		this.frame = frame;
		
		loginPanel = new JPanel();
		loginPanel.setBounds(0,0,SIZE_X, SIZE_Y);
		loginPanel.setLayout(null);
		loginPanel.setBackground(Color.GRAY);
		
		loginButton = new JButton("Login");
		loginButton.setBounds(SIZE_X/2 - 50, SIZE_Y * 3/4, 100, 50);
		loginPanel.add(loginButton);
		
		frame.add(loginPanel);
		
		
		Handler handler = new Handler();
		loginButton.addActionListener(handler);
	}
	
	

	@Override
	public JPanel getPanel() {
		// TODO Auto-generated method stub
		return loginPanel;
	}
	
private class Handler implements ActionListener{
		
		public void actionPerformed(ActionEvent event) {
			if(event.getSource() == loginButton) {
				frame.view(PanelID.Home);
			}
			
		}
}


	
}
