import java.util.ArrayList;
import java.util.List;

public class challenge {
	public static Employee createDeveloper() {
		return new Employee("Developer", 2000, null);
	}
	public static Employee createQAtester() {
		return new Employee("QA Tester", 1000, null);
	}
	public static Employee createManager(List<Employee>members) {
		return new Employee("Manager", 600, members);
	}
	
	public static Department createDepartment() {
		Department office = new Department();
		
		List<Employee> membersofB = new ArrayList<Employee>();
		membersofB.add(createDeveloper());
		membersofB.add(createQAtester());
		Employee managerB = createManager(membersofB);
		
		List<Employee> membersofA = new ArrayList<Employee>();
		membersofA.add(managerB);
		Employee managerA = createManager(membersofA);
		
		Employee managerD = createManager(null);
		
		List<Employee> membersofC = new ArrayList<Employee>();
		membersofC.add(managerD);
		Employee managerC = createManager(membersofC);
		
		List<Employee> membersofE = new ArrayList<Employee>();
		membersofE.add(createDeveloper());
		Employee managerE = createManager(membersofE);
		
		List<Employee> managers = new ArrayList<Employee>();
		managers.add(managerA);
		managers.add(managerC);
		managers.add(managerE);
		
		office.setEmployees(managers);
		
		System.out.println("Cost for Manager A: " + employeeCost(managerA));
		System.out.println("Cost for Manager B: " + employeeCost(managerB));
		System.out.println("Cost for Manager C: " + employeeCost(managerC));
		System.out.println("Cost for Manager D: " + employeeCost(managerD));
		System.out.println("Cost for Manager E: " + employeeCost(managerE));

		
		
		return office;
		
	}
	
	public static int departmentCost(Department dept) {
		int totalcost = 0;
		
		for (Employee e : dept.getEmployees()) {
			totalcost += employeeCost(e);
		}
		return totalcost;
		
	}
	
	public static int employeeCost(Employee em) {
		int totalcost = em.getCost();
		if(em.getTeam_members() != null) {
			for (Employee e : em.getTeam_members()) {
				totalcost += employeeCost(e);
			}
		}
		
		return totalcost;
	}

	public static void main(String[] args) {
		Department dept = createDepartment();
		int cost = departmentCost(dept);
		System.out.println("Department cost: "+ cost);
		System.out.println("No one reports to Manager D");

	}

}
