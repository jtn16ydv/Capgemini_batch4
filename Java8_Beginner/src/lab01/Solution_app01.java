package lab01;

import java.io.File;
import java.io.FileFilter;

public class Solution_app01 {

	public static void main(String[] args) {
		FileFilter fileFilter = new FileFilter() {
			
			@Override
			public boolean accept(File pathname) {
				return pathname.getName().endsWith(".java");
			}
		};
		
		File folder =new File("Files");
		File[] files = folder.listFiles(fileFilter);
		for (File file : files) {
			System.out.println(file.getName());
		}
		
		
	}
}
