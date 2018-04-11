/**
 * 
 * @author ADD YOUR NAME & ID
 */
import java.util.Arrays;


public class MemoryManagementSystem{
	public String[] secondaryMemory;
	private boolean useLRU;
	public MainMemo MainMemo; 
	 
	public MemoryManagementSystem(int mainMemorySize, int secondaryMemorySize, boolean useLRU) {
		this.secondaryMemory=new String[secondaryMemorySize];
		for (int i = 0; i < secondaryMemory.length; i++) {
			 secondaryMemory[i]="";
			
		}
		this.useLRU=useLRU;
		// this.MainMemo=new MainMemo(mainMemorySize);  need to add constractot 
	}

	

	@Override
	public String toString() {
		return "secondaryMemory=" + Arrays.toString(secondaryMemory);
	}
	
	public String read(int index) {
		if(useLRU) {
		//read method with lru	
		}
		else {
			//read method with fifo
		}
		return null; 
	}

	public void write(int index, char c) {
		if(useLRU) {
			//write method with lru	
			}
			else {
				//write method with fifo
			}		
	}
}
