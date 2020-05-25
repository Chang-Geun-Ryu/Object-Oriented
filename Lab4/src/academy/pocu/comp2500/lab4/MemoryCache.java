package academy.pocu.comp2500.lab4;

import java.time.OffsetDateTime;
import java.time.temporal.ChronoField;
import java.util.HashMap;

public class MemoryCache {
    static private HashMap<String, MemoryCache> instances = new HashMap<String, MemoryCache>();
    static private int instancesSize = 0;

    private OffsetDateTime usingTime;
    private HashMap<String, Entry> memory;
    private int memorySize;
    private EvictionPolicy policy = EvictionPolicy.LEAST_RECENTLY_USED;

    private MemoryCache() {
        this.memory = new HashMap<String, Entry>();
        this.usingTime = OffsetDateTime.now();
        this.memorySize = 0;
    }

    static final public MemoryCache getInstance(String name) {
        if (MemoryCache.instances.containsKey(name)) {
            MemoryCache instance = MemoryCache.instances.get(name);
//            instance.usingTime = OffsetDateTime.now();

            return instance;
        } else {
            MemoryCache.deleteInstance(1);
            MemoryCache newInstance = new MemoryCache();
            MemoryCache.instances.put(name, newInstance);

            return newInstance;
        }
    }

    static final private void deleteInstance(int addSize) {
        if (MemoryCache.instancesSize == 0 || MemoryCache.instancesSize > MemoryCache.instances.size() + addSize) {
            return;
        }

        int repeatCount = MemoryCache.instances.size() + addSize - MemoryCache.instancesSize;

        for(int i = 0; i < repeatCount; i++) {
            String deleteKey = "";
            for (String key: MemoryCache.instances.keySet()) {
                if (deleteKey == "") {
                    deleteKey = key;
                    continue;
                }

                if (MemoryCache.instances.get(deleteKey).usingTime.getLong(ChronoField.NANO_OF_DAY)
                        > MemoryCache.instances.get(key).usingTime.getLong(ChronoField.NANO_OF_DAY)) {
                    deleteKey = key;
                }
            }

            MemoryCache.instances.remove(deleteKey);
        }
    }

    static final public void clear() {
        MemoryCache.instances.clear();
    }

    static final public void setMaxInstanceCount(int size) {
        MemoryCache.instancesSize = size;
        MemoryCache.deleteInstance(0);
    }


    final private void deleteEntry(int addSize) {
        if (this.memorySize == 0 || this.memorySize >= this.memory.size() + addSize) {
            return;
        }

        int repeatCount = this.memory.size() + addSize - this.memorySize;

        for(int i = 0; i < repeatCount; i++) {
            String deleteKey = "";

            for (String key : this.memory.keySet()) {
                if (deleteKey == "") {
                    deleteKey = key;
                    continue;
                }

                if (getDeleteKey(this.memory.get(deleteKey), this.memory.get(key))) {
                    deleteKey = key;
                }
            }

            this.memory.remove(deleteKey);
        }
    }

    final private boolean getDeleteKey(Entry tempValue, Entry value) {
        boolean result = false;
        switch (this.policy) {
            case FIRST_IN_FIRST_OUT:
                result = tempValue.getCreateTime().getLong(ChronoField.MICRO_OF_DAY) > value.getCreateTime().getLong(ChronoField.MICRO_OF_DAY) ? true : false;
                break;
            case LAST_IN_FIRST_OUT:
                result = tempValue.getCreateTime().getLong(ChronoField.MICRO_OF_DAY) < value.getCreateTime().getLong(ChronoField.MICRO_OF_DAY) ? true : false;
                break;
            case LEAST_RECENTLY_USED:
                result = tempValue.getUsingTime().getLong(ChronoField.MICRO_OF_DAY) > value.getUsingTime().getLong(ChronoField.MICRO_OF_DAY) ? true : false;
                break;
            default:
                assert (true);
        }

        return result;
    }

    final public void setEvictionPolicy(EvictionPolicy policy) {
        this.usingTime = OffsetDateTime.now();
        this.policy = policy;
    }

    final public void addEntry(String key, String entry) {
        this.usingTime = OffsetDateTime.now();
        if (this.memory.containsKey(key)) {
            this.memory.get(key).setValue(entry);
        } else {
            deleteEntry(1);
            this.memory.put(key, new Entry(entry));
        }
    }

    final public String getEntryOrNull(String key) {
        this.usingTime = OffsetDateTime.now();
        if (this.memory.get(key) != null) {
            return this.memory.get(key).getValue();
        } else {
            return null;
        }
    }

    final public void setMaxEntryCount(int size) {
        this.usingTime = OffsetDateTime.now();
        this.memorySize = size;
        deleteEntry(0);
    }
}
