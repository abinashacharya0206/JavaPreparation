package testpack;

public class EmployeeRecords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PermanentEmployee PE=new PermanentEmployee();
		PE.setBasicpay(20000);
		PE.setHra(1500);
		PE.setExperience(3);
		PE.setName("Anil");
		PE.setEmployeeId(101);
		
		ContractEmplyee CE=new ContractEmplyee();
		CE.setName("Ankit");
		CE.setEmployeeId(102);
		CE.setWages(500);
		CE.setHours(10);
		
		CE.calculateSalary();
		PE.calculateSalary();
		System.out.println(CE.getName());
		System.out.println(PE.getEmployeeId());

	}

}
