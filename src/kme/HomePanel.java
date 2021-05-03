package kme;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class HomePanel extends PanelObject{

	private JPanel homePanel;
	
	private JTextField homeText;
	
	private JButton homeGoToStatistic;
	private JButton homeGoToProfile;
	private JButton homeGoToExercise;
	
	private Frame frame;
	
	public HomePanel(Frame frame, PanelID id) {
		super(id);
		this.frame = frame;
		
		homePanel = new JPanel();
		homePanel.setBounds(0,0,SIZE_X, SIZE_Y);
		homePanel.setLayout(null);
		
		homeText = new JTextField();
		homeText.setText("Welcome");
		homeText.setBounds(SIZE_X/3-100, SIZE_Y/4, 200, 50);
		homeText.setEditable(false);
		homePanel.add(homeText);
		
		homeGoToStatistic = new JButton();
		homeGoToStatistic.setText("Statistic");
		homeGoToStatistic.setBounds(SIZE_X / 2 - 100, SIZE_Y * 4/5, 100, 50);
		homePanel.add(homeGoToStatistic);
				
		homeGoToProfile = new JButton();
		homeGoToProfile.setText("Profile");
		homeGoToProfile.setBounds(SIZE_X / 2 , SIZE_Y * 4/5, 100, 50);
		homePanel.add(homeGoToProfile);
		
		homeGoToExercise = new JButton();
		homeGoToExercise.setText("Exercise");
		homeGoToExercise.setBounds(SIZE_X / 2 , SIZE_Y * 3/5, 100, 50);
		homePanel.add(homeGoToExercise);
		
		homePanel.setVisible(false);
		
		frame.add(homePanel);
		
		
		Handler handler = new Handler();
		homeGoToStatistic.addActionListener(handler);
		homeGoToProfile.addActionListener(handler);
		homeGoToExercise.addActionListener(handler);
	}

	@Override
	public JPanel getPanel() {
		
		return homePanel;
	}
	
private class Handler implements ActionListener{
		
		public void actionPerformed(ActionEvent event) {
			if(event.getSource() == homeGoToStatistic) {
				frame.view(PanelID.Statistic);
			}
			if(event.getSource() == homeGoToProfile) {
				frame.view(PanelID.Profile);
			}
			if(event.getSource() == homeGoToExercise) {
				frame.view(PanelID.Exercise);
			}
			
		}
}


		
	
}
