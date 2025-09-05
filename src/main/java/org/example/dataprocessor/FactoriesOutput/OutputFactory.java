package org.example.dataprocessor.FactoriesOutput;

import org.example.dataprocessor.OutputBackage.ConsoleOutput;
import org.example.dataprocessor.OutputBackage.FileOutput;
import org.example.dataprocessor.OutputBackage.Output;
import org.example.dataprocessor.enums.OutputType;

public class OutputFactory {
    public static Output getInstance(OutputType type) {

        if (type==OutputType.CONSOLE)
            return new ConsoleOutput();
        else if (type==OutputType.TEXT_FILE)
            return new FileOutput();
        throw new IllegalArgumentException("Invalid output type");
    }
}
