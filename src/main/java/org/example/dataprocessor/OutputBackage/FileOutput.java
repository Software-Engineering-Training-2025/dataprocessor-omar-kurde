package org.example.dataprocessor.OutputBackage;

import java.io.FileWriter;
import java.io.IOException;

public class FileOutput implements Output{
    @Override
    public  Double print(Number result) throws IOException {
        FileWriter fw = new FileWriter("target/result.txt");
        fw.write("Result = "+result.toString()+"\n");
        fw.close();
        return result.doubleValue();
    }
}
