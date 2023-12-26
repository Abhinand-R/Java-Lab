package Lab;
import java.io.*;

import  java.util.*;
public class FileHandling {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String source=sc.nextLine();
		char buffer[]=new char[source.length()];
		source.getChars(0, source.length(), buffer, 0);
		
		//File ob=new File("sample.txt");
		FileWriter f=new FileWriter("D:\\s3\\oopj\\sample.txt");
		f.write(buffer);
		f.close();
		
		
	

		try {

			   FileReader fr=new FileReader("D:\\s3\\oopj\\sample.txt");
			   char[] content=new char[100];
			   
			   fr.read(content);
			   fr.close();
			   
			   FileWriter fw=new FileWriter("D:\\s3\\oopj\\newsample.txt");
			   fw.write(content);
			   fw.close();
			   
			   FileReader fr1=new FileReader("D:\\s3\\oopj\\newsample.txt");
			   BufferedReader br=new BufferedReader(fr1);
			   
			   System.out.println("contents of new-sample");
			   String s;
			while((s=br.readLine())!=null){
			    System.out.println(s);
			   }
			   
			}
			catch(Exception e) {
			System.out.println(e.getMessage());
			}

	}}			



