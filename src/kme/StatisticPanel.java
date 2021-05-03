package kme;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class StatisticPanel extends PanelObject{

	private Frame frame;
	
	private JPanel statisticPanel;
	
	private JButton statisticBackToHome;
	
	private JTextField statisticText;
	
	public StatisticPanel(Frame frame, PanelID id) {
		super(id);
		this.frame = frame;
		
		statisticPanel = new JPanel();
		statisticPanel.setBounds(0,0,SIZE_X, SIZE_Y);
		statisticPanel.setLayout(null);
		
		statisticText = new JTextField();
		statisticText.setText("Statistic");
		statisticText.setBounds(SIZE_X/2-100, SIZE_Y/4, 200, 50);
		
		statisticText.setEditable(false);
		statisticPanel.add(statisticText);
		
		statisticBackToHome = new JButton();
		statisticBackToHome.setText("Back");
		statisticBackToHome.setBounds(SIZE_X/2 -70, SIZE_Y/4 * 3, 70, 50);
		statisticPanel.add(statisticBackToHome);
		
		statisticPanel.setVisible(false);
		
		frame.add(statisticPanel);
		
		Handler handler = new Handler();
		statisticBackToHome.addActionListener(handler);
		
	}
	
	@Override
	public JPanel getPanel() {
		// TODO Auto-generated method stub
		return statisticPanel;
	}

	
	
private class Handler implements ActionListener{
		
		public void actionPerformed(ActionEvent event) {
			if(event.getSource() == statisticBackToHome) {
				frame.view(PanelID.Home);
			}
			
			
		}
}




	
	
}
