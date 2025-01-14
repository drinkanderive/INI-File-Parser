package com.krishna.ini.utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
	
	List<String> data = null;
	
	public List<String> readFile(String filePath) {
		
		if(!(validatefileType(filePath))) {
			System.out.println("Error: File type should be .ini");
			return data;
		}
		
		try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			
			data = new ArrayList<>();
			String line = br.readLine();			
			while(line!=null) {
				data.add(line);
				line = br.readLine();
			}
		
		} catch (FileNotFoundException e) {
			System.out.println("INI File not found in given path "+e);
		} catch (IOException IOexception) {
			System.out.println("IO Error occured while reading the INI file "+IOexception);
		}
		
		return data;
	}
	
	private boolean validatefileType(String filePath) {
		if(!(filePath.toLowerCase().endsWith(".ini"))) {			
			return false;
		}
		return true;
	}
	
}
