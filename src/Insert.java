
public class Insert implements State
{

	MemoryCard memoryCard;
	
	public Insert(MemoryCard memoryCard) {
		this.memoryCard = memoryCard;
	}

	@Override
	public void start() {
		System.out.println("Inserting");	

	}

	@Override
	public void end() {
		System.out.println("Inserted");	

	}

	
}
