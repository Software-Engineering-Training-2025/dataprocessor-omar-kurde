package org.example.dataprocessor.AnalysisBackage;

import java.util.Collections;
import java.util.List;

public class median implements Analysis{
    private static  median instance;
    private median() {
    }
    public static median getInstance(){
        if (instance == null)
            instance = new median();
        return instance;
    }
    @Override
    public  Double analyse(List<Number> prepared_data) {
        prepared_data.sort((a, b) -> Double.compare(a.doubleValue(), b.doubleValue()));
        Integer size = prepared_data.size();
        if (size==0)return Double.NaN;;
        return (prepared_data.get(size/2).doubleValue()+prepared_data.get((size-1)/2).doubleValue() )/2D;
    }

}
