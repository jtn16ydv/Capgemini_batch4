package lab01;

import java.io.File;
import java.io.FileFilter;

public class Solution_app2 {

	public static void main(String[] args) {
//		FileFilter fileFilter = new FileFilter() {
//			
//			@Override
//			public boolean accept(File pathname) {
//				return pathname.getName().endsWith(".java");
//			}
//		};

		FileFilter lambdaFileFilter = (File pathname) -> {
			return pathname.getName().endsWith(".java");
		};

		File folder = new File("Files");
		File[] files = folder.listFiles(lambdaFileFilter);
		for (File file : files) {
			System.out.println(file.getName());
		}

	}
}
