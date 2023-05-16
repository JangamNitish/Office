package pojo;

public class AllEmployyPojo {
	int id,sal;
	String dep,ep;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public String getDep() {
		return dep;
	}

	public void setDep(String dep) {
		this.dep = dep;
	}

	public String getEp() {
		return ep;
	}

	public void setEp(String ep) {
		this.ep = ep;
	}

	public AllEmployyPojo(int id, int sal, String dep, String ep) {
		super();
		this.id = id;
		this.sal = sal;
		this.dep = dep;
		this.ep = ep;
	}
	public AllEmployyPojo() {
		super();
	}
	

}
