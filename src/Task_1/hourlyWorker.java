package Task_1;

public class hourlyWorker implements Salary {

	private String name;
	private int hours;
	private int payPerHours;

	public hourlyWorker(String name, int hours, int payPerHours) {
		super();
		this.name = name;
		this.hours = hours;
		this.payPerHours = payPerHours;
	}

	@Override
	public void Salary() {
		System.out.println(name+": "+ hours*payPerHours + "$"+"\n"+ "===============================") ;
		
		
	}

}
