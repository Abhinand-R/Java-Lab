package Lab;

import java.util.Scanner;
import java.io.*;
public class CountLinesWordsCharacters {

public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int countc=0,countw=0,countl=0;
try
{
File f=new File("three.txt");
if(f.exists())
{
System.out.println(f.getName()+" Exists");
}
else
{
f.createNewFile();
System.out.println(f.getName()+" Created");
}
String s;
System.out.println("Enter the data to be inserted into "+f.getName()+" : ");
s=sc.nextLine();
FileWriter f1=new FileWriter(f,true);
f1.write(s+"\n");
f1.close();
String c;
int i=1;
FileReader f2=new FileReader(f);
BufferedReader br=new BufferedReader(f2);
while((c=br.readLine())!=null)
{
System.out.println(i+"---"+c);
i++;
}
String line;
BufferedReader reader=new BufferedReader(new FileReader(f));
while((line=reader.readLine())!=null)
{
countl++;
String[] words=line.split(" ");
countw+=words.length;
for(String word : words)
{
countc+=word.length();
}
}
System.out.println("Characters : "+countc);
System.out.println("Words : "+countw);
System.out.println("Lines : "+countl);
}catch(Exception e)
{
System.out.println(e.getMessage());
}
}

}