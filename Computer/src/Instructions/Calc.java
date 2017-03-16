package Instructions;

import Computer.Address;
import Computer.Memory;
import Computer.Operand;
import Computer.ProgramCounter;
import Computer.Word;

public abstract class Calc implements Command{
	private Operand operand1, operand2;
	private Address address;
	
Calc(Operand operand1, Operand operand2, Address address){
	this.operand1 = operand1;
	this.operand2 = operand2;
	this.address = address;
}

public abstract void action(Word word, Word word1, Word word2);
public abstract String actionString();

@Override
public void execute(ProgramCounter pc, Memory memory){
	Word result = memory.getWord(address); 
	action(result,operand1.getWord(memory),operand2.getWord(memory));
}

@Override
public String toString(){
	
}
	
}
