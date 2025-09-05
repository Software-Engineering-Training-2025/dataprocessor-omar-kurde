package org.example.dataprocessor.AnalysisBackage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TOP3_FREQUENT_COUNT_SUM implements Analysis{

    private static  TOP3_FREQUENT_COUNT_SUM instance;
    private TOP3_FREQUENT_COUNT_SUM() {
    }
    public static TOP3_FREQUENT_COUNT_SUM getInstance(){
        if (instance == null)
            instance = new TOP3_FREQUENT_COUNT_SUM();
        return instance;
    }
    @Override
    public  Double analyse(List<Number> prepared_data) {
        Map<Number,Integer> frequency_map = new HashMap<>();
        Double total_records =0D;
        Integer first_freq ,second_freq,third_freq;
        first_freq=second_freq=third_freq=0;
        for (Number data : prepared_data) {
            frequency_map.put(data,frequency_map.getOrDefault(data,0) + 1);
            if (frequency_map.get(data)>first_freq) {
                third_freq=second_freq;
                second_freq=first_freq;
                first_freq=frequency_map.get(data);
            }
            else if (frequency_map.get(data)>second_freq){
                third_freq=second_freq;
                second_freq=frequency_map.get(data);

            }
            else if (frequency_map.get(data)>third_freq){
                third_freq=frequency_map.get(data);
            }
        }

        total_records = (double) first_freq+second_freq+third_freq;
        return total_records;

    }



}
