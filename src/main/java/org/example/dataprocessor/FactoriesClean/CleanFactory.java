package org.example.dataprocessor.FactoriesClean;

import org.example.dataprocessor.CleanBackage.Clean;
import org.example.dataprocessor.CleanBackage.REMOVE_NEGATIVES;
import org.example.dataprocessor.CleanBackage.REPLACE_NEGATIVES_WITH_ZERO;
import org.example.dataprocessor.enums.CleaningType;

public class CleanFactory {

    public static Clean getInstance(CleaningType type) {
        if (type==CleaningType.REMOVE_NEGATIVES)
            return REMOVE_NEGATIVES.getInstance();
        else if (type==CleaningType.REPLACE_NEGATIVES_WITH_ZERO)
            return REPLACE_NEGATIVES_WITH_ZERO.getInstance();
        throw new IllegalArgumentException("Invalid cleaning type");
    }
}
