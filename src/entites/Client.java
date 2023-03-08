package entites;

public class Client implements Comparable<Client>{
	
	private String name;
	
	public Client(String name) {
		this.name = name;	
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}

	@Override
	public int compareTo(Client other) {
		if (this.getName().length() < other.getName().length()) {
			return -1;
		}
		if (this.getName().length() == other.getName().length()) {
			return 0;
		}
		return 1;
	}
	
	
}
