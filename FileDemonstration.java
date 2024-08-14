import java.io.File;
import java.util.Scanner;

public class FileDemonstration {

    
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("nome do diretorio: ");
        analyzePath(input.nextLine());
               
        
    }
    
    public static void analyzePath(String path){
        File name = new File(path);
        if(name.exists()){
            System.out.printf("%s%s\n%s\n%s\n%s\n%s%s\n%s%s\n%s%s\n%s%s\n%s%s",
                    name.getName(), "exists",
                    (name.isFile()?"is a file":"is not a file"),
                    (name.isDirectory()?"is a directory": "is not absolute path"), "Last modified: ",
                    name.lastModified(), "Lenght: ", name.length(),
                    "path: ", name.getPath(), "Parent: ", name.getParent());
            
            if(name.isDirectory()){
                String[] directory = name.list();
                System.out.println("\n\nDirectory contents:\n");
                
                for(String directoryName : directory){
                    System.out.println(directoryName);
                }
            }
            else{
                System.out.printf("%s%s", path, "does not exist.");
            }
            
                
        
            
            }
        }
    }