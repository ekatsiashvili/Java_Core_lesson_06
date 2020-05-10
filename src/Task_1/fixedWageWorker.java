package Task_1;

public class fixedWageWorker implements Salary {

	private String name;
	private int salaryPerMonth;

	public fixedWageWorker(String name, int salaryPerMonth) {
		super();
		this.name = name;
		this.salaryPerMonth = salaryPerMonth;
	}

	@Override
	public void Salary() {
		System.out.println(name +": "+ salaryPerMonth + "$" +"\n"+ "===============================") ;
	}

}
