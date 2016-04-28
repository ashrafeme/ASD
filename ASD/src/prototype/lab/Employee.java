package prototype.lab;

import java.io.Serializable;

public class Employee implements Cloneable, Serializable {

	private int id;
	private String Lastname;
	private String Firstname;
	private String streetAddress;
	private String city;
	private String state;
	private String zipcode;

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
		Employee newEmployee = new Employee();
		copyEmployeeData(newEmployee, this);

		if (supervisor != null)
			newEmployee.supervisor = cloneSupervisor(supervisor);
		if (staff != null && staff.length > 0) {
			newEmployee.staff = new Employee[staff.length];
			for (int i = 0; i < staff.length; i++) {
				newEmployee.staff[i] = (Employee) staff[i].clone();
			}
		}
		return newEmployee;
	}

	private Employee cloneSupervisor(Employee supervisor) {
		Employee newSuper = new Employee();
		copyEmployeeData(newSuper, supervisor);
		return newSuper;
	}

	private void copyEmployeeData(Employee newEmployee, Employee employee) {
		newEmployee.id = employee.getId();
		newEmployee.Lastname = employee.getLastname();
		newEmployee.Firstname = employee.getFirstname();
		newEmployee.streetAddress = employee.getStreetAddress();
		newEmployee.city = employee.getCity();
		newEmployee.state = employee.getState();
		newEmployee.zipcode = employee.getZipcode();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLastname() {
		return Lastname;
	}

	public void setLastname(String lastname) {
		Lastname = lastname;
	}

	public String getFirstname() {
		return Firstname;
	}

	public void setFirstname(String firstname) {
		Firstname = firstname;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public Employee getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(Employee supervisor) {
		this.supervisor = supervisor;
	}

	public Employee[] getStaff() {
		return staff;
	}

	public void setStaff(Employee[] staff) {
		this.staff = staff;
	}

	@Override
	public String toString() {
		StringBuilder osb = new StringBuilder();

		osb.append("RefrenceId:" + System.identityHashCode(this) + "\n");
		osb.append("Id:" + id + "\n");
		osb.append("FullName:" + Firstname + " " + Lastname + "\n");
		osb.append("Address:" + streetAddress + "\n");
		osb.append(city + "," + state + " " + zipcode + "\n");
		osb.append("SuperVisor:" + supervisor + "\n");
		return osb.toString();
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
