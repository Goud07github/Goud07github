package in.prashuIT.img;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ImageUtil {
	
	public static byte[] readImageFile(String filePath) throws IOException{
		
		File file= new File(filePath);
		byte[] fileData= new byte[(int) file.length()];
		
		try(FileInputStream fts= new FileInputStream(file)){
			fts.read(fileData);
		}
		return fileData;
		
	}

}
