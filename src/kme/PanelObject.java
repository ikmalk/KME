package kme;

import javax.swing.JFrame;
import javax.swing.JPanel;

public abstract class PanelObject {
	
	protected final int SIZE_X = 375;
	protected final int SIZE_Y = 667;
	
	protected PanelID id;
	
	public PanelObject(PanelID id){
		this.id  = id;
	}

	public abstract JPanel getPanel();
	public  PanelID getId() {
		return id;
	};
}
