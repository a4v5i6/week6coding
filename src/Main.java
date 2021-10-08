public class Main{

	public static void main(String[] args) {

		WinBuilderClass phases = new MemoryCardCondtion();
		MemoryCard phase = phases.withChip().withUsb().withWire().withCardReader().build();
		
		phase.setState(new Insert(phase));
		phase.start();
		phase.move_ahead();

		phase.setState(new ReadData(phase));
		phase.start();
		phase.end();

		phase.setState(new UpdateData(phase));	
		phase.start();
		phase.end();

		phase.setState(new DeleteData(phase));	
		phase.start();
		phase.end();
		
		phase.setState(new Eject(phase));	
		phase.start();
		phase.end();
	}
}
