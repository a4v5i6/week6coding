import java.util.ArrayList;
import java.util.List;

public abstract class WinBuilderClass {
	String name;
	List<String> item = new ArrayList<String>();
	
	public abstract WinBuilderClass withChip();
	public abstract WinBuilderClass withUsb();
	public abstract WinBuilderClass withWire();
	public abstract WinBuilderClass withCardReader();
	
	public MemoryCard build() {
		MemoryCard memoryCard = new MemoryCard();
		memoryCard.setName(this.name);
		memoryCard.addNewConditon(item);
		return memoryCard;
	}
	public String toString() {
		return "End Winner";
	}
}
