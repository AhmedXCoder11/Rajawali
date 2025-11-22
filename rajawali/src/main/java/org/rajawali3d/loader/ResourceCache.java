package org.rajawali3d.loader;

import java.util.HashMap;
import java.util.Map;

public class ResourceCache {
    private Map<String, Object> cache = new HashMap<>();
    private int maxCacheSize = 50; // عدد الموارد الأقصى

    public void addResource(String key, Object resource) {
        if(cache.size() >= maxCacheSize) {
            evictOldest();
        }
        cache.put(key, resource);
    }

    public boolean hasResource(String key) {
        return cache.containsKey(key);
    }

    public Object getResource(String key) {
        return cache.get(key);
    }

    private void evictOldest() {
        String firstKey = cache.keySet().iterator().next();
        cache.remove(firstKey);
    }
  }
