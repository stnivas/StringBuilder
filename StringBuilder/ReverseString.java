public class ReverseString{
 
 	public static void main(String[] args){
 	  StringBuilder obj=new StringBuilder();
 	  obj.append("hi");
 	  obj.append(" ");
 	  obj.append("hello");
 	  obj.append(" ");
 	  obj.append("wellcome");
 	  int len=obj.length();
 	  System.out.println("bofere length of string:"+len);
 	  obj.reverse();
 	  
 	  int lenTwo=obj.length();
 	  System.out.println("after length of string:"+lenTwo);
 	  System.out.println("final string:"+obj);
 	     }
 	  }
