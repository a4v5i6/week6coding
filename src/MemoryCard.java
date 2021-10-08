import java.util.List;

public class MemoryCard {
	State insert;
	State readData;
	State updateData;
	State deleteData;
	State eject;
	
	State s;
	String name;
	List<String> cycles;
	public MemoryCard()
	    {
		insert = new Insert(this);
		readData = new ReadData(this);
		updateData = new UpdateData(this);
		deleteData = new DeleteData(this);
		eject = new Eject(this);    
	    }
	void addNewConditon(List<String> cycles) {
		this.cycles = cycles;
	}
 
	void move_ahead() {
		System.out.println("Next Process is " + name + " along with :");
		for (String cycle : cycles) {
			System.out.println("   " + cycle);
		}
	}
	public void start() {

		s.start();
	}

	public void end() {

		s.end();
	}
 
	public void setName(String name) {
		this.name = name;
	}

	
	public State getState() {
		return s;
	}
	public void setState(State s) {
		this.s = s;
	}
	public String getName() {
		return name;
	}
	public String toString() {
		StringBuffer display = new StringBuffer();
		display.append("The State is "+ this.name + "\n");
		for (String cycle : cycles) {
			display.append(cycle + "\n");
		}
		return display.toString();
	}
}


