package org.example.dataprocessor.AnalysisBackage;

import java.util.List;

public class Std implements Analysis{
    private static  Std instance;
    private Std() {
    }
    public static Std getInstance(){
        if (instance == null)
            instance = new Std();
        return instance;
    }
    @Override
    public  Double analyse(List<Number> prepared_data) {

        Double mean = Mean.getInstance().analyse(prepared_data);
        Double std = 0D;
        Integer size = prepared_data.size();
        for (Number record: prepared_data) {
            std+=Math.pow(record.doubleValue()-mean,2);
        }
        return Math.sqrt(std/size);
    }
}
