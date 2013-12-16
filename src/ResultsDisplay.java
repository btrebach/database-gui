import java.util.ArrayList;

import javax.swing.JPanel;

import javax.swing.JTextArea;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;


public class ResultsDisplay extends JPanel{
	private JTextArea textArea;
	
	
	ResultsDisplay(){
		
		init();

		
	}
	
	
	public void setResult(ArrayList<String> r){
		
		textArea.setText("");
	 	
		for(int i = 0; i < r.size(); i++){
			System.out.println(r.get(i));
			textArea.append(r.get(i) + "\n");
		}
		textArea.setCaretPosition(textArea.getDocument().getLength());
		
		
	}

	
	public void init(){
		
		textArea = new JTextArea();
		
		textArea.setVisible(true);
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Results");
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		add(lblNewLabel, BorderLayout.NORTH);
	//	textArea.setEditable(false);
		textArea.setText("");
		
		add(textArea);
		
	}
}
