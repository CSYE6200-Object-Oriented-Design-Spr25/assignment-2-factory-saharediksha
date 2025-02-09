package edu.neu.csye6200.util;

import java.io.*;
import java.util.*;

/**
 * Utility class for reading text files using a relative path.
 */
public class FileUtil {

    // Use ClassLoader to load resources from the resources folder
    public static List<String> readLines(String fileName) {
        List<String> lines = new ArrayList<>();
        InputStream inputStream = FileUtil.class.getClassLoader().getResourceAsStream(fileName);
        
        if (inputStream == null) {
            System.err.println("File not found: " + fileName);
        } else {
            try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
                String line;
                while ((line = br.readLine()) != null) {
                    lines.add(line);
                }
            } catch (IOException e) {
                System.err.println("Error reading file: " + fileName);
                e.printStackTrace();
            }
        }
        return lines;
    }
}
