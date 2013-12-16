
public class Driver {


	public static void main(String[] args) {
		
			ResultsDisplay rd = new ResultsDisplay();
	    	PatientsPanel pp = new PatientsPanel(rd);
			DoctorPanel drp = new DoctorPanel(rd);
			RoomsPanel rp = new RoomsPanel(rd);
			
			
			TabbedQueryDisplay qs = new TabbedQueryDisplay(drp, pp, rp, rd);
			
    		MainInterface mi = new MainInterface(rd, qs);
    		mi.setVisible(true);

	}

}
