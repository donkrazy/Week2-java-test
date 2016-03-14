package prob5;

public class MyStack implements Stack {
	public String[] buffer;
	public int length;
	public int max_length;

	

	public MyStack(int max_length) {
		super();
		length = 0;
		this.max_length = max_length;
		buffer = new String[max_length];
	}

	@Override
	public void push(String str) {
		if(length==max_length){
			String[] temp = buffer;
			buffer = new String[max_length+1];
			for(int i = 0; i < temp.length; i++){
				buffer[i] = temp[i];
			}
			max_length++;
		}
		buffer[length] = str;
		length++;
	}

	@Override
	public String pop() {
		if(length==0){
			return null;
		}
		String temp = buffer[length-1];
		buffer[length-1] = null; 
		length--;
		return temp;
	}

	@Override
	public boolean isEmpty() {
		return length==0;
	}

	@Override
	public int size() {
		return length;
	}

}
