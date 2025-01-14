package com.krishna.ini.parser;

import java.io.IOException;
import java.util.List;
import com.krishna.ini.utils.ReadFile;

public class INIParser {
	
	List<String> data;
	
	public INIParser(String filePath) throws IOException {
		data = new ReadFile().readFile(filePath); 
		if(data==null)
			throw new IOException("Error occured while trying to open the file");
	}
	
	public void printRawData() {
		this.data.forEach(System.out::println);
	}
	
	
	
}
