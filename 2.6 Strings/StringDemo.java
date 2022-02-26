package string;

public class StringDemo {

	public static void main(String[] args) {
		
		         //methods of strings
				System.out.println("Methods of Strings");
				
				String sl=new String("Hello World");
				System.out.println(sl.length());
				
				//substring
				String sub=new String("Welcome");
				System.out.println(sub.substring(3));
				
				//String Comparison
				String s1="Hello word";
				String s2="Hello wold";
				System.out.println(s1.compareTo(s2));
				
				//IsEmpty
				String s4="";
				System.out.println(s4.isEmpty());
				
				//toLowerCase
				String s5="HELLO";
				System.out.println(s5.toLowerCase());
				
				//replace
				String s6="Heldo";
				String replace=s6.replace('d', 'l');
				System.out.println(replace);
				
				//equals
				String x="Welcome to Java";
				String y="WeLcOmE tO JaVa";
				System.out.println(x.equals(y));
				
				System.out.println("\n");
				System.out.println("Creating StringBuffer");
				//Creating StringBuffer and append method
				StringBuffer s=new StringBuffer("my name is Janardhan");
				s.append("and i Enjoy your teaching");
				System.out.println(s);
				
				//insert method
				s.insert(1, 'M');
				System.out.println(s);
				
				//replace method
				StringBuffer sb=new StringBuffer("Hello");
				sb.replace(0, 2, "hEl");
				System.out.println(sb);

				//delete method
				sb.delete(0, 1);
				System.out.println(sb);
				
				//StringBuilder
				System.out.println("\n");
				System.out.println("Creating StringBuilder");
				StringBuilder sb1=new StringBuilder("Happy");
				sb1.append("Learning");
				System.out.println(sb1);

				System.out.println(sb1.delete(0, 1));

				System.out.println(sb1.insert(1, "Welcome"));

				System.out.println(sb1.reverse());
						
				//conversion	
				System.out.println("\n");
				System.out.println("Conversion of Strings to StringBuffer and StringBuilder");
				
				String str = "Hello"; 
				
		        // conversion from String object to StringBuffer 
		        StringBuffer sbr = new StringBuffer(str); 
		        sbr.reverse(); 
		        System.out.println("String to StringBuffer");
		        System.out.println(sbr); 
		        sbr.reverse();
		        System.out.println(sbr);
		        
		        System.out.println("\n");
		     // conversion from String object to StringBuilder 
		        StringBuilder sbl = new StringBuilder(str); 
		        System.out.println("Before String to StringBuilder");
		        System.out.println(sbl);
		        sbl.append(" world"); 
		        System.out.println("After String to StringBuilder");
		        System.out.println(sbl);              		
			}
}
