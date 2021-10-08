

public class MemoryCardCondtion extends WinBuilderClass{

	public MemoryCardCondtion() {
		this.name = "MemoryCard Condition Possible Ways";
	}
	@Override
	public WinBuilderClass withChip() {
		return this;
	}

	@Override
	public WinBuilderClass withUsb() {
		this.item.add("usb");
		return this;	
		}

	@Override
	public WinBuilderClass withWire() {
		this.item.add("wire");
		return this;	
	}
	@Override
	public WinBuilderClass withCardReader() {
		this.item.add("card reader");
		return this;	
		}		
}
