package builder.lab;

public class Agent {

	private String name;

	public Agent(String name) {
		super();
		this.name = name;
		System.out.println("Agent " + this.name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
