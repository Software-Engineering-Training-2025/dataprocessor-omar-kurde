package org.example.dataprocessor.CleanBackage;

import java.util.ArrayList;
import java.util.List;

public class REMOVE_NEGATIVES implements Clean{

    private static  REMOVE_NEGATIVES instance;
    private REMOVE_NEGATIVES(){

    }
    public static REMOVE_NEGATIVES getInstance(){
        if (instance == null)
            instance = new REMOVE_NEGATIVES();
        return instance;
    }


    @Override
    public   List<Number> clean(List<Number> data) {
        List<Number> result = new ArrayList<>();
        for (Number record : data) {
            if (record.doubleValue()>=0D)
                result.add(record);
        }
        return result;
    }
}
