package method;

public class CallByValue {
	

int val=150;

	int operation(int val) {
		val =val*10/100;
		return(val);
	}


	public static void main(String[] args) {
		CallByValue c=new CallByValue();
		System.out.println("Before operation value of data is "+c.val);
		c.operation(200);
		System.out.println("After operation value of data is "+c.val);
		

	}

}
