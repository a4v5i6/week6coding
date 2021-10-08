public class ReadData implements State
{

	MemoryCard memoryCard;
	
	public ReadData(MemoryCard memoryCard) {
		this.memoryCard = memoryCard;
	}

	@Override
	public void start() {
		System.out.println("Reading Data");	

	}

	@Override
	public void end() {
		System.out.println("Data Read");	

	}

	
}
