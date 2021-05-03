package kme;

import java.awt.FontFormatException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Frame extends JFrame{
	
	
	private PanelObject loginPanel;
	private PanelObject homePanel;
	private PanelObject statisticPanel;
	private PanelObject profilePanel;
	private PanelObject excersicePanel;
	
	
	private ArrayList<PanelObject> panel;
	
	
	public final int SIZE_X = 375;
	public final int SIZE_Y = 667;
	
	public Frame() throws IOException ,FontFormatException{
		
		super("Buffalo");
		/**
		 * TO DO: Think out a way to import a font to system without giving any error
		 */
		
		/*
		Font font1;
		InputStream is = Main.class.getResourceAsStream("/font/OpenSans-Regular.ttf");
		font1 = Font.createFont(Font.TRUETYPE_FONT, is);
		setFont(font1);		
		*/
		
		panel = new ArrayList<>();
		
		loginPanel = new LoginPanel(this, PanelID.Login);
		homePanel = new HomePanel(this, PanelID.Home);
		statisticPanel = new StatisticPanel(this, PanelID.Statistic);
		profilePanel = new ProfilePanel(this, PanelID.Profile);		
		excersicePanel = new ExercisePanel(this, PanelID.Exercise);
		
		
		panel.add(loginPanel);
		panel.add(homePanel);
		panel.add(statisticPanel);
		panel.add(profilePanel);
		panel.add(excersicePanel);
		
	}	
	

	
	public void view(PanelID id) {
		
		PanelObject temp;
		for(int i = 0; i < panel.size(); i++) {
			temp = panel.get(i);
			if(temp.getId() == id) {
				temp.getPanel().setVisible(true);
			}else {
				temp.getPanel().setVisible(false);
			}
		}
		
	}
	
private class Handler implements ActionListener{
		
		public void actionPerformed(ActionEvent event) {
			
			
			
		}
	}
}
