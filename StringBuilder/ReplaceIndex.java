public class ReplaceIndex{
 
 	public static void main(String[] args){
 	  StringBuilder obj=new StringBuilder();
 	  obj.append("wellcomeall");
 	  int len=obj.length();
 	  System.out.println("bofere length:"+len);
 	  obj.replace(6,9, "XYZ");
 	  
 	  int lenTwo=obj.length();
 	  System.out.println("after length of string:"+lenTwo);
 	  System.out.println("final string:"+obj);
 	  }
 	  }
