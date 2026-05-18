package com.my.iengineer1;

import android.util.Log;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.ref.WeakReference;
import java.util.Iterator;

public class StateManager {
    private static final String TAG = "StateManager";
    private static final Object lock = new Object();
    
    // State values
    private static double totalOpeningArea = 0.0;
    private static double totalNetArea = 0.0;
    private static double brickworkQuantity = 0.0;
    
    // Using WeakReference to prevent memory leaks
    private static final List<WeakReference<StateChangeListener>> listeners = new ArrayList<>();
    
    /**
     * Interface for state change callbacks
     */
    public interface StateChangeListener {
        void onTotalOpeningAreaChanged(double area);
        void onTotalNetAreaChanged(double area);
        void onBrickworkQuantityChanged(double quantity);
    }
    
    /**
     * Adds a listener for state changes
     * @param listener The listener to add
     */
    public static void addListener(@NonNull StateChangeListener listener) {
        synchronized (lock) {
            // Remove any dead references first
            cleanupDeadReferences();
            
            // Check if listener already exists
            for (WeakReference<StateChangeListener> ref : listeners) {
                if (ref.get() == listener) {
                    return;
                }
            }
            
            listeners.add(new WeakReference<>(listener));
            
            // Notify new listener of current state
            try {
                listener.onTotalOpeningAreaChanged(totalOpeningArea);
                listener.onTotalNetAreaChanged(totalNetArea);
                listener.onBrickworkQuantityChanged(brickworkQuantity);
            } catch (Exception e) {
                Log.e(TAG, "Error notifying new listener of current state", e);
            }
        }
    }
    
    /**
     * Removes a listener
     * @param listener The listener to remove
     */
    public static void removeListener(StateChangeListener listener) {
        synchronized (lock) {
            Iterator<WeakReference<StateChangeListener>> iterator = listeners.iterator();
            while (iterator.hasNext()) {
                WeakReference<StateChangeListener> ref = iterator.next();
                StateChangeListener existingListener = ref.get();
                if (existingListener == null || existingListener == listener) {
                    iterator.remove();
                }
            }
        }
    }
    
    /**
     * Removes dead references from the listeners list
     */
    private static void cleanupDeadReferences() {
        synchronized (lock) {
            Iterator<WeakReference<StateChangeListener>> iterator = listeners.iterator();
            while (iterator.hasNext()) {
                if (iterator.next().get() == null) {
                    iterator.remove();
                }
            }
        }
    }
    
    /**
     * Sets the total opening area and notifies listeners
     * @param area The new total opening area
     */
    public static void setTotalOpeningArea(double area) {
        synchronized (lock) {
            totalOpeningArea = area;
            notifyListeners(listener -> {
                try {
                    listener.onTotalOpeningAreaChanged(area);
                } catch (Exception e) {
                    Log.e(TAG, "Error notifying listener of opening area change", e);
                }
            });
        }
    }
    
    /**
     * Gets the current total opening area
     * @return The current total opening area
     */
    public static double getTotalOpeningArea() {
        synchronized (lock) {
            return totalOpeningArea;
        }
    }
    
    /**
     * Gets the current total net area
     * @return The current total net area
     */
    public static double getTotalNetArea() {
        synchronized (lock) {
            return totalNetArea;
        }
    }
    
    /**
     * Updates the brickwork quantity and notifies listeners
     * @param quantity The new brickwork quantity
     */
    public static void updateBrickworkQuantity(double quantity) {
        synchronized (lock) {
            brickworkQuantity = quantity;
            notifyListeners(listener -> {
                try {
                    listener.onBrickworkQuantityChanged(quantity);
                } catch (Exception e) {
                    Log.e(TAG, "Error notifying listener of brickwork quantity change", e);
                }
            });
        }
    }
    
    /**
     * Gets the current brickwork quantity
     * @return The current brickwork quantity
     */
    public static double getBrickworkQuantity() {
        synchronized (lock) {
            return brickworkQuantity;
        }
    }
    
    /**
     * Resets all state values to their defaults
     */
    public static void reset() {
        synchronized (lock) {
            totalOpeningArea = 0.0;
            totalNetArea = 0.0;
            brickworkQuantity = 0.0;
            
            notifyListeners(listener -> {
                try {
                    listener.onTotalOpeningAreaChanged(0.0);
                    listener.onTotalNetAreaChanged(0.0);
                    listener.onBrickworkQuantityChanged(0.0);
                } catch (Exception e) {
                    Log.e(TAG, "Error notifying listener of reset", e);
                }
            });
        }
    }
    
    /**
     * Helper method to notify all listeners
     * @param action The action to perform for each listener
     */
    private static void notifyListeners(ListenerAction action) {
        List<WeakReference<StateChangeListener>> listenersCopy;
        synchronized (lock) {
            cleanupDeadReferences();
            listenersCopy = new ArrayList<>(listeners);
        }
        
        for (WeakReference<StateChangeListener> ref : listenersCopy) {
            StateChangeListener listener = ref.get();
            if (listener != null) {
                action.perform(listener);
            }
        }
    }
    
    /**
     * Functional interface for listener actions
     */
    @FunctionalInterface
    private interface ListenerAction {
        void perform(StateChangeListener listener);
    }
    
    public static double getCurrentTotalNetArea() {
        synchronized (lock) {
            return totalNetArea;
        }
    }
    
    // Add validation before updating values
    public static void setTotalNetArea(double area) {
        if (area < 0) {
            Log.w(TAG, "Attempted to set negative total net area");
            area = 0;
        }
        
        synchronized (lock) {
            if (totalNetArea != area) {  // Only update if value changed
                totalNetArea = area;
                final double finalArea = area; // Create a final variable to use in the lambda
                notifyListeners(listener -> {
                    try {
                        listener.onTotalNetAreaChanged(finalArea);
                    } catch (Exception e) {
                        Log.e(TAG, "Error notifying listener of net area change", e);
                    }
                });
            }
        }
    }
    
    private static double totalVolume = 0.0;
    private static double totalReinforcement = 0.0;

    public static void setTotalVolume(double volume) {
        totalVolume = volume;
    }

    public static double getTotalVolume() {
        return totalVolume;
    }

    public static void setTotalReinforcement(double reinforcement) {
        totalReinforcement = reinforcement;
    }

    public static double getTotalReinforcement() {
        return totalReinforcement;
    }
    
}