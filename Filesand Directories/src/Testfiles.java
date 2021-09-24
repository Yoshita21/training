import java.io.File;

import java.io.FileInputStream;

import java.io.FileNotFoundException;

import java.io.FileOutputStream;

import java.io.IOException;

public class Testfiles {

	public static void main(String[] args) throws IOException {

		File start = new File("../test1");

		File target = new File("../test2");

		

		if (!start.exists())
			throw new IOException("Source Folder Not Found");

		Testfiles d = new Testfiles();

		// if there is a folder already then we will delete it first and copy the
		// contents

		if (target.exists()) {

			d.deleteDir(target);

		}

		else {

			// copy the directories

			d.copyDir(start, target);

		}

	}

	public void copyDir(File src, File tgt) throws IOException, FileNotFoundException {

		if (src.isDirectory()) {

			if (!tgt.exists()) {

				tgt.mkdir();

				System.out.println(src.getName() + " Folder Copied");

			}

			String[] files = src.list();

			for (String f : files) {

				copyDir(new File(src, f), new File(tgt, f));

			}

		}

		else {

			FileInputStream in = null;

			FileOutputStream out = null;

			try {

				in = new FileInputStream(src);

				out = new FileOutputStream(tgt);

				byte stream[] = new byte[1024];

				int length = 1;

				while ((length = in.read(stream)) > 0) {

					out.write(stream, 0, length);

				}

			}

			finally {

				if (in != null)
					in.close();

				if (out != null)
					out.close();

			}

			System.out.println(tgt.getName() + " File Copied");

		}

	}

public void deleteDir(File tgt) {

if(tgt.isDirectory()) {

if(tgt.list().length == 0) {

tgt.delete();

 // check for folders 

System.out.println(tgt.getName()+" Folder Deleted");

}

else{

 //loop through all the files .

for(File f : tgt.listFiles()) {

deleteDir(f);

}

if(tgt.list().length == 0) {

tgt.delete();

 

System.out.println(tgt.getName()+" Folder Deleted");

}

}

 

}

else {

tgt.delete();

System.out.println(tgt.getName()+" File Deleted");

}

 

}
}
