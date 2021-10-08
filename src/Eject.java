
public class Eject implements State
{

	MemoryCard memoryCard;
	
	public Eject(MemoryCard memoryCard) {
		this.memoryCard = memoryCard;
	}

	@Override
	public void start() {
		System.out.println("Ejecting");	

	}

	@Override
	public void end() {
		System.out.println("Ejected");	

	}

	
}