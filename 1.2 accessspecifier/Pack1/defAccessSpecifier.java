package pack1;

	class defAccessSpecifier1
	{ 
	  void display()
	     { 
	         System.out.println("You are using defalut access specifier"); 
	     } 
	} 

	public class defAccessSpecifier  {

		public static void main(String[] args) {
			//default
			System.out.println("Dafault Access Specifier");
			defAccessSpecifier1 obj = new defAccessSpecifier1(); 		  
	      obj.display();

		}
	}


