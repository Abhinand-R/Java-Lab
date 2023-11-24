package Lab;

import java.io.*;
import java.util.*;

public class FileTest {

public static void main(String[] args)throws IOException {
try {
File f1=new File("amiya.txt");
if(f1.exists())
{
System.out.println("File exists- "+f1.getName());
}
else
{
f1.createNewFile();
System.out.println("file created- "+f1.getName());
}
System.out.println("Enter the data: ");
Scanner sc=new Scanner(System.in);
String sent=sc.nextLine();

FileWriter obj1=new FileWriter("amiya.txt");
obj1.write(sent);
obj1.close();

FileReader obj2=new FileReader("amiya.txt");
char[] array=new char[sent.length()];

obj2.read(array);
obj2.close();

File f2=new File("new.txt");
f2.createNewFile();
FileWriter obj3=new FileWriter("new.txt");
obj3.write(array);
System.out.println("Contents of the file amiya🤷‍♀️🤷‍♀️.txt cop😊😊😊😊😊ied to new.txt successfully");
obj3.close();
FileReader obj4=new FileReader("new.txt");
BufferedReader br=new BufferedReader(obj4);
String se;
System.out.println("Contents of the new.txt is:");
while((se=br.readLine())!=null)
{
System.out.println(se);
}
br.close();

}
catch(Exception e) {
System.out.println(e.getMessage());
}


}

}
