public class FindLastIndex{
 
 	public static void main(String[] args){
 	  StringBuilder obj=new StringBuilder();
 	  obj.append("hello");
 	  obj.append("#");
 	  obj.append("all");
 	  obj.append("#");
 	  obj.append("wellcome");
 	  int len=obj.length();
 	 
 	  System.out.println("bofere length:"+len);
 	  //int lastIndex=obj.lastIndexOf( "#");
 	  
 	  System.out.println("last index of:"+obj.lastIndexOf("#"));
 	  System.out.println("after length of string:"+obj);
 	  System.out.println("final string:"+obj);
 	  }
 	  }
