package innerclass;

public class InnerClass1 {
	private String msg="Welcome to simplilearn"; 
	 
	 class Inner{  
	  void hello(){
		  System.out.println(msg+", Let us start learning Inner Classes");
	  	}  
	 }  


	public static void main(String[] args) {
		InnerClass1 inr=new InnerClass1();
		InnerClass1.Inner in=inr.new Inner();  
		in.hello();  


	}

}
