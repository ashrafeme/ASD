package prototype.lab;

import java.io.Serializable;

public class Employee implements Cloneable, Serializable {

	private int id;
	private Employee supervisor;
	private Employee staff[];

	public Employee() {
		this(0, null, null);
	}

	public Employee(int id) {
		this(id, null, null);
	}

	public Employee(int id, Employee supervisor) {
		this(id, supervisor, null);
	}

	public Employee(Employee supervisor, Employee[] staff) {
		this(0, supervisor, staff);
	}

	public Employee(int id, Employee[] staff) {
		this(id, null, staff);
	}

	public Employee(int id, Employee supervisor, Employee[] staff) {
		super();
		this.id = id;
		this.supervisor = supervisor;
		this.staff = staff;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Employee newEmployee = new Employee();
		newEmployee.id = id;

		if (supervisor != null)
			newEmployee.supervisor = (Employee) supervisor.clone();
		if (staff != null && staff.length > 0) {
			newEmployee.staff = new Employee[staff.length];
			for (int i = 0; i < staff.length; i++) {
				newEmployee.staff[i] = (Employee) staff[i].clone();
			}
		}

		return newEmployee;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Id:" + id + " - SuperVisor:" + supervisor;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
