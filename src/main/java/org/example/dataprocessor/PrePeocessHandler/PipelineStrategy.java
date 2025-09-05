package org.example.dataprocessor.PrePeocessHandler;

import org.example.dataprocessor.AnalysisBackage.Analysis;
import org.example.dataprocessor.CleanBackage.Clean;
import org.example.dataprocessor.OutputBackage.Output;

import java.util.List;

public class PipelineStrategy {
    private Clean clean;
    private Analysis analysis;
    private Output output;

    public PipelineStrategy(Clean clean, Analysis analysis, Output output) {
        this.clean = clean;
        this.analysis = analysis;
        this.output = output;
    }
    public  double GetInfo(List<Number> data)throws Exception{
       List<Number> Cleaned_Data = clean.clean(data);
       Double Analysis_Data = analysis.analyse(Cleaned_Data);
       output.print(Analysis_Data);
       return Analysis_Data;
    }
    
}
