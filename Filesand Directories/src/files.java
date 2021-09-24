import java.io.File;

import java.io.FileFilter;

import java.io.FileInputStream;

import java.io.FileNotFoundException;

import java.io.FileOutputStream;

import java.io.FilenameFilter;

import java.io.IOException;

import java.util.Scanner;

public class files {

public static void main(String[] args) throws FileNotFoundException, IOException 

{

String path = "../";

 

 

 // Create a constructor of the files directories 

files f= new files();

 

 

 // Create a readOnly file ....

f.createReadOnlyFile(path+"trash");

String s = f.readFile(new File("../trash"));

System.out.println(s);

 

 

 // Creates a new textfile  

f.createTextFile(path+"yoshi");

System.out.println(f.readFile(new File("../yoshi.txt")));

 

 

 // This let's you add the content to the previously created text file ..

 // In order to see all the outputs , please comment and uncomment .so that the my code won't confuse you lenin.

 File fi=new File("../yoshi.txt");

f.writeIntoFile(fi);

 

 

 

 // to read the contents of the text file 

f.readFile(fi);

// to delete the file created.

f.deleteTexFile(path+"yoshi.txt");

 


 

}

 

 

 // function to delete the text file

private void deleteTexFile(String path) {

File file = new File(path);

if(file.isDirectory()) {

for(File f : file.listFiles(new FilenameFilter() {

 

 @Override

public boolean accept(File dir, String name) {

 

return name.endsWith(".tex");

}

}) ) {

f.delete();

 System.out.println("your file has been deleted!");

}

 

}

 

}

 

 

 // to create the text file ...i have created only text files.. extension can be changed 

 // with the code 

private void createTextFile(String string) throws FileNotFoundException, IOException {

 

 

String extention;

 

File f= new File(string+".txt");

if(f.exists()) f.delete();

this.writeIntoFile(f);

}


 

 

 

// // this is to read the contents of the file 

private String readFile(File file) throws IOException, FileNotFoundException {

 

FileInputStream fi = new FileInputStream(file.toString());

byte[] b = (byte[]) fi.readAllBytes();

fi.close();

return new String(b);

 

}

 

 

 // this is to write your content onto the string ..


 

public void writeIntoFile(File file) throws FileNotFoundException,IOException {

FileOutputStream fo= new FileOutputStream(file.toString(), true);


 

 

Scanner sc = new Scanner(System.in);

 System.out.println("Enter the Contents of the file:: "+file.getName());

String s = sc.nextLine()+"\n";

byte[] buffer = s.getBytes();

fo.write(buffer);

fo.close();

 

}

 

 

 

 // to create the readonly file 

public void createReadOnlyFile(String filename) throws IOException, FileNotFoundException 

{

File file = new File(filename);

if(file.exists()) file.delete();

this.writeIntoFile(file);

file.setReadOnly();

 

 System.out.println("File Created and converted to Read Only");

}

 


 

}