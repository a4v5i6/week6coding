public class DeleteData implements State
{

	MemoryCard memoryCard;
	
	public DeleteData(MemoryCard memoryCard) {
		this.memoryCard = memoryCard;
	}

	@Override
	public void start() {
		System.out.println("Deleting Data");	

	}

	@Override
	public void end(){
		System.out.println("Data Deleted");	

	}

	
}
