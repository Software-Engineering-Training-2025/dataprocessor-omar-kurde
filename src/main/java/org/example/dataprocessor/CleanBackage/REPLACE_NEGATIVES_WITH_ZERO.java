package org.example.dataprocessor.CleanBackage;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.max;

public class REPLACE_NEGATIVES_WITH_ZERO implements Clean {
    private static  REPLACE_NEGATIVES_WITH_ZERO instance;
    private REPLACE_NEGATIVES_WITH_ZERO(){

    }
    public static REPLACE_NEGATIVES_WITH_ZERO getInstance(){
        if (instance == null)
            instance = new REPLACE_NEGATIVES_WITH_ZERO();
        return instance;
    }
    @Override
    public   List<Number> clean(List<Number> data) {
        List<Number> result = new ArrayList<>();

        for (Number record : data) {
            if (record.doubleValue() > 0)
                result.add(record);
            else{

                result.add(0.0);
            }
        }
        return result;
    }

}
