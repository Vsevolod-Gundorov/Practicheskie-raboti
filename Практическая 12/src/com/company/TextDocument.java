package com.company;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TextDocument
{
    void createFile() throws IOException
    {
        File newFile = new File("D://IDE//MyFile");
        try
        {
            boolean created = newFile.createNewFile();
            if(created)
                System.out.println("File has been created");
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
    void openFile() throws IOException {
        try(FileWriter write = new FileWriter("D://IDE//MyFile", false))
        {
            System.out.println("File is opened, you can write");
            Scanner console = new Scanner(System.in);
            String a = console.nextLine();
            write.write(a);
            write.flush();
        }
    }
    void saveFileInformation()
    {
        try(FileReader reading = new FileReader("D://IDE//MyFile"))
        {
            System.out.println("Saved information from file");
            int c;
            while((c = reading.read()) != -1)
            {
                System.out.print((char)c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
