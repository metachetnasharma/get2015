package Assignment2;


/**
 * @author Chetna
 *
 */
public class Mentor extends LeaveHandler {
	
	public Mentor(int day) {
		this.day = day;
	}

	@Override
	protected void leaveApprovalMessage() {
		System.out.println("Leave approved by mentor");
	}
}
 