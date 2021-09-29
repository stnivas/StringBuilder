public class DeleteIndex{
 
 	public static void main(String[] args){
 	  StringBuilder obj=new StringBuilder();
 	  obj.append("wellcomeAll");   
 	  
 	  int len=obj.length();
 	  System.out.println("bofere length:"+len);
 	  obj.delete(6,8);
 	  
 	 int lenTwo=obj.length();
 	 System.out.println("after length of string:"+lenTwo);
 	  System.out.println("final string:"+obj);
 	  }
 	  }
