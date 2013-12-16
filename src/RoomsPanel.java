import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;


public class RoomsPanel extends JPanel{
		private JTextField textField;
		private MySQLAccess access = new MySQLAccess();
		ResultsDisplay rd;

		RoomsPanel(ResultsDisplay x){
			rd = x;
			setLayout(null);
			
			JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
			tabbedPane.setBounds(214, 5, 21, 21);
			add(tabbedPane);
			
			JButton btnQuery = new JButton("# of P");
			btnQuery.setBounds(22, 52, 117, 29);
			add(btnQuery);
			btnQuery.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e) {
					access.sql = "SELECT PATIENT FROM ROOMS";
					access.readDataBase();
					
					try {
						//System.out.print(access.getResult());
						rd.setResult(access.getResult());
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				}
				
			});
			
			JButton btnQuery_1 = new JButton("2P Room");
			btnQuery_1.setBounds(161, 52, 117, 29);
			add(btnQuery_1);
			btnQuery_1.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e) {
					access.sql = "SELECT ROOM FROM ROOMS WHERE PATIENT = 2";
					access.readDataBase();
					
					try {
						//System.out.print(access.getResult());
						rd.setResult(access.getResult());
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				}
				
			});
			
			JButton btnQuery_2 = new JButton("Bed# for 2P Room");
			btnQuery_2.setBounds(309, 52, 117, 29);
			add(btnQuery_2);
			btnQuery_2.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e) {
					access.sql = "SELECT BED FROM ROOMS WHERE PATIENT = 2";
					access.readDataBase();
					
					try {
						//System.out.print(access.getResult());
						rd.setResult(access.getResult());
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				}
				
			});
			
			JButton btnQuery_3 = new JButton("R301 Equipment");
			btnQuery_3.setBounds(22, 115, 117, 29);
			add(btnQuery_3);
			btnQuery_3.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e) {
					access.sql = "SELECT EQUIPMENT FROM ROOMS WHERE ROOM = 301";
					access.readDataBase();
					
					try {
						//System.out.print(access.getResult());
						rd.setResult(access.getResult());
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				}
				
			});
			
			JButton btnQuery_4 = new JButton("All Equipment");
			btnQuery_4.setBounds(161, 115, 117, 29);
			add(btnQuery_4);
			btnQuery_4.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e) {
					access.sql = "SELECT EQUIPMENT FROM ROOMS";
					access.readDataBase();
					
					try {
						//System.out.print(access.getResult());
						rd.setResult(access.getResult());
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				}
				
			});
			
			JButton btnQuery_5 = new JButton("All R#");
			btnQuery_5.setBounds(309, 115, 117, 29);
			add(btnQuery_5);
			btnQuery_5.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e) {
					access.sql = "SELECT ROOM FROM ROOMS";
					access.readDataBase();
					
					try {
						//System.out.print(access.getResult());
						rd.setResult(access.getResult());
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				}
				
			});
			
			textField = new JTextField();
			textField.setBounds(22, 174, 256, 28);
			add(textField);
			textField.setColumns(10);
			
			JButton btnRunQuery = new JButton("Run Query");
			btnRunQuery.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					access.sql = textField.getText();
					access.readDataBase();

					try {
						//System.out.print(access.getResult());
						rd.setResult(access.getResult());
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			});
			btnRunQuery.setBounds(309, 175, 117, 29);
			add(btnRunQuery);

			init();

		}

	public void init(){

		this.setVisible(true);


	}

}
