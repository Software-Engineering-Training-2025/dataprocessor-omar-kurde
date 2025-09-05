package org.example.dataprocessor.AnalysisBackage;

import java.util.Collections;
import java.util.List;

public class P90_NEAREST_RANK implements Analysis{
    private static  P90_NEAREST_RANK instance;
    private P90_NEAREST_RANK() {
    }
    public static P90_NEAREST_RANK getInstance(){
        if (instance == null)
            instance = new P90_NEAREST_RANK();
        return instance;
    }

    @Override
    public  Double analyse(List<Number> prepared_data) {
        prepared_data.sort((a, b) -> Double.compare(a.doubleValue(), b.doubleValue()));
        Integer size = prepared_data.size();
        if (size==0)return Double.NaN;;
        Integer index = (9*size+9) /10  - 1;
        return prepared_data.get(index).doubleValue();

    }
}
