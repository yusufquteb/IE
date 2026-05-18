package com.my.iengineer1;

import java.util.UUID;

public interface ReinforcementResultListener {
    void onReinforcementCalculated(UUID reinforcementId, double totalWeight);
    void onReinforcementRemoved(UUID reinforcementId);
}