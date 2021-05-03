package kme;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ExercisePanel extends PanelObject{
	
	private JPanel exercisePanel;
	
	private JButton exerciseBackToHome;
	
	private JTextField exerciseText;
	
	private Frame frame;

	public ExercisePanel(Frame frame, PanelID id) {
		super(id);
		this.frame = frame;
		
		exercisePanel = new JPanel();
		exercisePanel.setBounds(0,0,SIZE_X, SIZE_Y);
		exercisePanel.setLayout(null);
		
		exerciseBackToHome = new JButton();
		exerciseBackToHome.setText("Back");
		exerciseBackToHome.setBounds(SIZE_X/2 -70, SIZE_Y/4 * 3, 70, 50);
		exercisePanel.add(exerciseBackToHome);
		
		exerciseText = new JTextField();
		exerciseText.setText("Exercise");
		exerciseText.setBounds(SIZE_X/2-100, SIZE_Y/10, 200, 50);		
		exerciseText.setEditable(false);
		exercisePanel.add(exerciseText);
		
		exercisePanel.setVisible(false);
		
		frame.add(exercisePanel);
		
		Handler handler = new Handler();
		exerciseBackToHome.addActionListener(handler);
	}

	@Override
	public JPanel getPanel() {
		// TODO Auto-generated method stub
		return exercisePanel;
	}
	
private class Handler implements ActionListener{
		
		public void actionPerformed(ActionEvent event) {
			if(event.getSource() == exerciseBackToHome) {
				frame.view(PanelID.Home);
			}
			
		}
}
	
}
