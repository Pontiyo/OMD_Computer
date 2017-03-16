package Instructions;

import Computer.Memory;
import Computer.ProgramCounter;

public interface Command {
	
public void execute(ProgramCounter pc, Memory memory);
public String toString();

}
