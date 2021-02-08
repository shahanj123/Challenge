import java.util.List;

public class Employee {
	String jobFunction;
	int cost;
	List<Employee>team_members;
	
	public Employee(String jobFunction, int cost,List<Employee>team_members) {
		this.jobFunction= jobFunction;
		this.cost = cost;
		this.team_members = team_members;
	}

	public String getJobFunction() {
		return jobFunction;
	}

	public void setJobFunction(String jobFunction) {
		this.jobFunction = jobFunction;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public List<Employee> getTeam_members() {
		return team_members;
	}

	public void setTeam_members(List<Employee> team_members) {
		this.team_members = team_members;
	}
	
}
