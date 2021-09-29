public class InsertBetween{
	
	public static void main(String[] args){
	  StringBuilder call=new StringBuilder();
	  call.append("java");
	  call.append(" ");
	  call.append("easy");
	 
	  System.out.println(" length of before inserting:"+call.length());
	  call.insert(6 ,"java");
	 
	  System.out.println("length of after insertting:"+ call.length());
	  System.out.println("the final string :"+call);
	  
	   
	      }
	  }
	  
