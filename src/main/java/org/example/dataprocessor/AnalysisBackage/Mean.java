package org.example.dataprocessor.AnalysisBackage;

import java.util.List;

public class Mean implements Analysis{
    private static  Mean instance;
    private Mean() {
    }
    public static Mean getInstance(){
        if (instance == null)
            instance = new Mean();
        return instance;
    }

    @Override
    public  Double analyse(List<Number> prepared_data) {
        Double sum ;
        Integer size;
        sum=0D;
        size=0;

        for (Number record : prepared_data) {
            sum+=record.doubleValue();
            size++;
        }

        return sum/size;

    }
}
