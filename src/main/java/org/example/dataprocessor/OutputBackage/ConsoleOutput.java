package org.example.dataprocessor.OutputBackage;

public class ConsoleOutput implements Output{

    @Override
    public Double print(Number result) {
        System.out.println("Result = "+result);
        return result.doubleValue();
    }
}
