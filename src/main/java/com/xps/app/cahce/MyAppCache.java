package com.xps.app.cahce;

import java.util.Map;

import com.hazelcast.core.HazelcastInstance;
import com.xps.app.util.IdGenerator;

public class MyAppCache {
	
	private Map<String, Object> cacheData;
	
	private boolean 			loadDataOnInit;
	private IdGenerator			idGenerator;
	private HazelcastInstance 	hazelcastInstance;
	
	public void loadCacheData() {
		if (loadDataOnInit) {
			loadRandomData();
		}
	}
	
	private void loadRandomData() {
		cacheData = hazelcastInstance.getMap("data");
		
		for (int i=1; i<=10; i++) {
			String key = "key"+i;
			String value = idGenerator.generateAlphanumericId(10);
			cacheData.put(String.valueOf(i), "random value");
			System.out.println("cached [Key: " + key + ", Value: " + value + "");
		}
	}

	// Setters
	public void setHazelcastInstance(HazelcastInstance hazelcastInstance) {
		this.hazelcastInstance = hazelcastInstance;
	}

	public void setIdGenerator(IdGenerator idGenerator) {
		this.idGenerator = idGenerator;
	}

	public void setLoadDataOnInit(boolean loadDataOnInit) {
		this.loadDataOnInit = loadDataOnInit;
	}
}
