/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meetingschedulingsystemtest;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.logging.Formatter;

/**
 *
 * @author hozaifa
 */
public class WriteFile {
    private String path;
    private boolean append_to_file = false;
    
    public WriteFile(String file_path){
        path = file_path;
    }
    
    public WriteFile(String file_path, boolean append_value){
        path = file_path;
        append_to_file = append_value;
    }
    
    public void writeToFile(String textLine) throws IOException {
        FileWriter write = new FileWriter(path, append_to_file);
        PrintWriter print_line = new PrintWriter(write);
        print_line.printf( "%s", textLine);
        print_line.close();
    }
    
    public void writeToFileEndLine() throws IOException {
        FileWriter write = new FileWriter(path, append_to_file);
        PrintWriter print_line = new PrintWriter(write);
        print_line.printf( "%n");
        print_line.close();
    }
    
 public String writeToFileNumberOfSpaces(int numberOfSpaces) throws IOException {
        FileWriter write = new FileWriter(path, append_to_file);
        PrintWriter print_line = new PrintWriter(write);
        String spaces = "";
        for(int i=0;i<numberOfSpaces;i++){
            spaces+= " ";
        }
        print_line.close();
        return spaces;
    }
 
 
}
