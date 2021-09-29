import java.util.Scanner;
public class FindLength{
	
	public static void main(String[] args){
	      Scanner input=new Scanner(System.in);
		StringBuilder obj=new StringBuilder();
		
		int length=obj.length();
		System.out.println("before length:"+length);
		
		System.out.println("please enter your name");
		String name=input.next();
		obj.append(name);
		
		
		System.out.println("after length:"+obj.length());
		
		System.out.println("final string is:"+obj);
		}
	}	
