package thinking.in.java.code18;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.Adler32;
import java.util.zip.CheckedInputStream;
import java.util.zip.CheckedOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class ZIPCompress {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileOutputStream f = new FileOutputStream("src/txt/test.zip");
		CheckedOutputStream csum = new CheckedOutputStream(f, new Adler32());
		ZipOutputStream zos = new ZipOutputStream(csum);
		BufferedOutputStream out = new BufferedOutputStream(zos);
		ZipEntry ze;
		zos.setComment("A test of Java Zipping");
		List<String> list = new ArrayList<String>();
		list.add("src/txt/mm.txt");
		list.add("src/txt/test.txt");
		
		for (String file : list) {
			System.out.println("Writing file: " + file);
			BufferedReader in = new BufferedReader(new FileReader(file));
			ze = new ZipEntry(file);
			zos.putNextEntry(ze);
			int c;
			while((c = in.read()) != -1){
				out.write(c);
			}
			in.close();
			out.flush();
		}
		out.close();
		System.out.println("Checksum: " + csum.getChecksum().getValue());
		System.out.println("Reading file: ");
		FileInputStream fi = new FileInputStream("src/txt/test.zip");
		CheckedInputStream csumi = new CheckedInputStream(fi, new Adler32());
		ZipInputStream in2 = new ZipInputStream(csumi);
		BufferedInputStream bis = new BufferedInputStream(in2);
		while((ze = in2.getNextEntry()) != null){
			System.out.println("Reading file: " + ze);
			int x;
			while((x = bis.read()) != -1){
				System.out.write(x);
				
			}
			System.out.println();
		}
		if(args.length == 1){
			System.out.println("Checksum: " + csumi.getChecksum().getValue());
		}
		bis.close();
		ZipFile zf = new ZipFile("src/txt/test.zip");
		Enumeration e = zf.entries();
		while(e.hasMoreElements()){
			ZipEntry ze2 = (ZipEntry)e.nextElement();
			System.out.println("File: " + ze2);
		}
	}

}
