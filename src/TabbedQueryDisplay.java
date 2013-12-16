import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class TabbedQueryDisplay extends JTabbedPane{
	
	DoctorPanel drp;
	PatientsPanel pp;
	RoomsPanel rp;
	
	public TabbedQueryDisplay(DoctorPanel drp, PatientsPanel pp, RoomsPanel rp, ResultsDisplay rd){
		this.drp = drp;
		this.pp = pp;
		this.rp = rp;
		
		
		setName("Hospital Database");
		setSize(300,200);
		setLocation(10,200);
		
		JTabbedPane patients = new JTabbedPane(JTabbedPane.TOP);
		this.addTab("Patients", pp);
		
		JTabbedPane rooms = new JTabbedPane(JTabbedPane.TOP);
		addTab("Rooms", rp);
		
		JTabbedPane doctors = new JTabbedPane(JTabbedPane.TOP);
		addTab("Doctors", drp);
	}
	
	
	
	
	
	
}
