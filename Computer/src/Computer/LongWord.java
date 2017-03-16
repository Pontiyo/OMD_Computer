package Computer;

public class LongWord implements Word{
	long value;
	
	LongWord(int value){
		this.value = value;
	}
	
	@Override
	public Word getWord(Memory memory) {
		return this;
	}

	@Override
	public long getValue() {
		return value;
	}

	@Override
	public void add(Word word1, Word word2) {
		this.value = (long) word1.getValue() + (long) word2.getValue(); 
		
	}

	@Override
	public void mul(Word word1, Word word2) {
		this.value = word1.getValue() * word2.getValue();
		
	}

	@Override
	public boolean equals(Word word) {
		return (this.value == (long) word.getValue());
		
	}
	
	@Override
	public String toString(){
		return "" + value;
	}

}
