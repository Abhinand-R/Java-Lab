package Lab;
import java.util.*;
public class FrequencyOfCharacter { 
	public static void main(String[] args) {
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String str=sc.nextLine();
		System.out.println("enter character to count");
		char search=sc.next().charAt(0);
		char [] anarray=(str.toLowerCase()).toCharArray();
		for(char ch:anarray)
		{
			if(ch==search)
			{
				count=count+1;
			}
		}
		System.out.println("frequency of character="+count);
	}
}
