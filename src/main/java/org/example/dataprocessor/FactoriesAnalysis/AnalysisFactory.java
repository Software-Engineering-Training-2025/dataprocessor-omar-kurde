package org.example.dataprocessor.FactoriesAnalysis;

import org.example.dataprocessor.AnalysisBackage.*;
import org.example.dataprocessor.enums.AnalysisType;

public class AnalysisFactory {
    public static Analysis getInstance(AnalysisType type){
        if (type==AnalysisType.MEAN){
            return Mean.getInstance();
        }
        else if (type==AnalysisType.MEDIAN){
            return median.getInstance();
        }
        else if (type==AnalysisType.P90_NEAREST_RANK){
            return P90_NEAREST_RANK.getInstance();
        }
        else if (type==AnalysisType.STD_DEV){
            return Std.getInstance();
        }
        else if (type==AnalysisType.TOP3_FREQUENT_COUNT_SUM)
            return TOP3_FREQUENT_COUNT_SUM.getInstance();
        throw new IllegalArgumentException("Invalid analysis type");
    }
}
