package Instructions;

import Computer.Memory;
import Computer.ProgramCounter;

public class Halt implements Command{

	
	public void execute(ProgramCounter pc, Memory memory) {
	
		pc.halt();

	}
	
	public String toString(){
		
		return "HALT";
		
	}

}
