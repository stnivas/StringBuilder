public class DeleteFirstString{
	
		public static void main(String[] args){
		 StringBuilder call=new StringBuilder();
		 call.append("java");
		 call.append(" ");
		 call.append("stringBuffer");
		 
		 System.out.println("length of before delete:"+call.length());
		 call.delete(0,4);
		 
		 System.out.println("length of after delete:"+call.length());
		 System.out.println("final String:"+call);
		 }
		 }
		 
