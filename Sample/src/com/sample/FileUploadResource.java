package com.sample;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;

public class FileUploadResource {

	public static void main(String[] args) {
		Path path = Paths.get("D:\\Samples\\sample.pdf");
		//Path path = Paths.get("E:\\jQuery_Cookbook.pdf");
		//File file = new File("D:\\Samples\\sample.docx");
		
		String result = "";
		FileOutputStream fileOuputStream = null;
		if(path.isAbsolute()){
			System.out.println("File Uploaded sucessfully");
			//System.out.println("--"+file.toString());
			byte[] bFile;
			Date now = new Date();
			try {
				FileDetails fileDetails = new FileDetails();
				//String fileName = uploadedFile[0].getOriginalFilename();
				bFile = Files.readAllBytes(path);
				
				String fileName = path.getFileName().toString();
				fileDetails.setFileName(fileName);
				fileDetails.setFileContent(bFile);
				fileDetails.setCreatedDate(now);
			//	fileDetails = fileRepository.save(fileDetails);
				
				//fileOuputStream = new FileOutputStream("E:\\test\\"+name);
			   // fileOuputStream.write(bFile);
				
				
			//	FileDetails getFileDetails= fileRepository.findOne(fileDetails.getId());
				//File file = new File(uploadedFile[0].getOriginalFilename());
			    fileOuputStream = new FileOutputStream("D:\\Samples\\test\\"+fileDetails.getFileName());
			    fileOuputStream.write(fileDetails.getFileContent());
			    fileOuputStream.close();
				
			    /*File file = new File(uploadedFile[0].getOriginalFilename());
			    fileOuputStream = new FileOutputStream("E:\\test\\"+file.getName());
			    System.out.println("path "+file.toPath());
			    fileOuputStream.write(bFile);
			    fileOuputStream.close();*/
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
			
			result = "Sucessfully uploaded";
		} else {
			System.out.println("Faild to Upload the File");
			result = "Failed to upload try again";
		}

	}

}
