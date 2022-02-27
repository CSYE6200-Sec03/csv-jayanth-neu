package edu.neu.csye6200;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {
	
	public static List<String> readCsv(String inputFilePath) {
		List<String> strings = new ArrayList<>();		
		try(BufferedReader br = new BufferedReader(new FileReader(inputFilePath))){
			String line = "";
			while((line = br.readLine()) != null) strings.add(line);
		} 
		catch(IOException e) {
			e.printStackTrace();
		}
		return strings;		
	}
	
	public static void writeCsv(String outputFilepath, List<String> fileContent) {
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(outputFilepath))) {
			for(String line:fileContent) {
				bw.write(line);
				bw.newLine();
			}
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
}
