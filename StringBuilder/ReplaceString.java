public class ReplaceString{
	
		public static void main(String[] args){
		 StringBuilder call=new StringBuilders();
		   call.append("learn");
		   call.append(" " );
		   call.append("java");
		   call.append(" ");
		   call.append("easy");
		 
		 int length=call.length();
		   System.out.println("length of before replace:"+length);
		   call.replace(5,6, "_");
		   call.replace(10,11,"_");
		   int lenTwo=call.length();
		   System.out.println("length of after replace:"+lenTwo);
		   System.out.println("final String:"+call);
		   }
		 }
		 
