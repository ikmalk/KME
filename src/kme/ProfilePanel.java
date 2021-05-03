package kme;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class ProfilePanel extends PanelObject{

	
	private JPanel profilePanel;
	
	private Frame frame;
	
	private JTextField profileText;
	
	private JButton profileBackToHome;
	
	
	public ProfilePanel(Frame frame, PanelID id) {
		super(id);
		
		this.frame = frame;
		
		
		profilePanel = new JPanel();
		profilePanel.setBounds(0,0,SIZE_X, SIZE_Y);
		profilePanel.setLayout(null);
		
		profileBackToHome = new JButton();
		profileBackToHome.setText("Back");
		profileBackToHome.setBounds(SIZE_X/2 -70, SIZE_Y/4 * 3, 70, 50);
		profilePanel.add(profileBackToHome);
		
		profileText = new JTextField();
		profileText.setText("Profile");
		profileText.setBounds(SIZE_X/2-100, SIZE_Y/10, 200, 50);
		
		profileText.setEditable(false);
		profilePanel.add(profileText);
		profilePanel.setVisible(false);
		
		frame.add(profilePanel);
		
		
		Handler handler = new Handler();
		profileBackToHome.addActionListener(handler);
		
	}
	
	@Override
	public JPanel getPanel() {
		// TODO Auto-generated method stub
		return profilePanel;
	}

	
private class Handler implements ActionListener{
		
		public void actionPerformed(ActionEvent event) {
			if(event.getSource() == profileBackToHome) {
				frame.view(PanelID.Home);
			}
			
		}
}


	
	
}
