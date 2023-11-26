package Lab;

import java.io.*;
import java.util.*;

public class FileProg3 {

public static void main(String[] args)throws IOException {

Scanner s=new Scanner(System.in);
File f1=new File("text.txt");
if(f1.exists()) {
System.out.println("File already exists");
}
else {
f1.createNewFile();
System.out.println("File created");
}

System.out.println("Ethra  num");
int lim=s.nextInt();

try {

FileOutputStream obj1=new FileOutputStream("Text.txt");

System.out.println("Number adii");
for(int i=0;i<lim;i++) {
obj1.write(s.nextInt());
}
int content,content1;
FileInputStream obj2=new FileInputStream("Text.txt");
/*while((content=obj2.read())!=-1) {
System.out.print(content+" ");

}*/

File f2=new File("Odd.txt");
File f3=new File("Even.txt");

f2.createNewFile();
f3.createNewFile();
System.out.println("\nFile odd and even created");
FileOutputStream obj3=new FileOutputStream("Odd.txt");
FileOutputStream obj4=new FileOutputStream("Even.txt");

while((content=obj2.read())!=-1) {

              if(content%2==0){
             obj4.write(content);
              }
              else {
             obj3.write(content);
              }
}
              System.out.println("\n Numbers Written");
             
              FileInputStream obj5=new FileInputStream("Odd.txt");
              FileInputStream obj6=new FileInputStream("Even.txt");
             
              System.out.println("Content of the file Odd are");
             while((content=obj5.read())!=-1) {
             
  System.out.print(content+" ");
 
  }
             System.out.println("\nContent of the file Even are");
              while((content=obj6.read())!=-1) {
             
    System.out.print(content+" ");
   
    }

           
}catch(Exception e) {
System.out.println("Thettii");
}

}

}
