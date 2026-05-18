package com.my.iengineer1;

import java.util.UUID;

public interface OpeningResultListener {
    void onOpeningCalculated(UUID openingId, double totalArea);
    void onOpeningRemoved(UUID openingId);
}