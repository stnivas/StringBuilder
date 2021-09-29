import java.util.Scanner;
public class FindLengthWithValue {

	public static void main(String[] args){
	   Scanner input= new Scanner(System.in);
	    StringBuilder string=new StringBuilder();
	    System.out.println("please eneter the any word");
	    String words=input.next();
	    
	   System.out.println("before length of your words:"+string.length());

	    string.append("Im");
	    string.append("#");
	    string.append("learn");
	    string.append("#");
	    string.append("java");
	    string.append("#");
	    string.append("stringBuilder");
	    
	    System.out.println("after length of your words:"+string.length());
	    System.out.println("final string :"+string);
	  
	   }
	  } 
