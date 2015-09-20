package baller;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class fileABC {
	public static void main(String[] args) {
		try {
			FileReader file = new FileReader("ff.20.txt");
			try {
				
				int letter;
				while((letter = file.read())!=-1){
					System.out.print((char)letter);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}

}
