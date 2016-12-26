package com.sample;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileReadDisplay {

	public static void main(String[] args) {

		String filePath = "D:\\Samples\\sample.txt";
		try {
			InputStream is = new FileInputStream(filePath);
			int i = 0;
			while ((i = is.read()) != -1) {
				if ((char) i != '\n')
					System.out.print((char) i);

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
