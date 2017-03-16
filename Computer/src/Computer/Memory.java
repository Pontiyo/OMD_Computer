package Computer;

public abstract class Memory {
	private Word[] memory;

	public abstract Word[] setMemory();
	
	public Memory(){
		memory = setMemory();
	}
	
	public Word getWord(Address adress){
		return memory[adress.getValue()];
	}
}
