
public class UpdateData implements State
{

	MemoryCard memoryCard;
	
	public UpdateData(MemoryCard memoryCard) {
		this.memoryCard = memoryCard;
	}

	@Override
	public void start() {
		System.out.println("Updating Data");	

	}

	@Override
	public void end() {
		System.out.println("Updateed Data");	

	}

	
}
