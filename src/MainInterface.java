import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.GridLayout;

public class MainInterface extends JFrame {
	
	ResultsDisplay rd;
	TabbedQueryDisplay qs;
	
	
	MainInterface(ResultsDisplay rd, TabbedQueryDisplay qs ){
		JPanel grid = new JPanel();
		grid.setLayout(new GridLayout(2,1));
		Container content = getContentPane();
		this.rd = rd;
		this.qs = qs;
		qs.setFocusable (true);
		rd.setFocusable (true);
		grid.add(rd);
		grid.add(qs);
		content.add(grid);
		
		init();
		
	}
	
	private void init(){
		
		
		this.setSize(new Dimension(500,550));
		setVisible(true);
		
		
		
		
		
	}
	
	

}
