package Computer;

public class Address implements Operand{
 int index;
 
 public Address(int index){
	 this.index = index;
 }

@Override
public Word getWord(Memory memory) {
	return memory.getWord(this);
}

public int getValue() {
	return index;
}

public String toString(){
	return "[" + index + "]";
}
}
