package entities;

public class Aluguel {
	
	private String name;
	private String email;
	private int num;
	
	public Aluguel(String name, String email, int num) {
		this.name = name;
		this.email = email;
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	public String toString() {
		return num + ": " + name + ", " + email;
	}
	


}
