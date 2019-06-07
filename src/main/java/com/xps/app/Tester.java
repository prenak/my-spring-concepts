package com.xps.app;

import com.hazelcast.core.HazelcastInstance;

public class Tester {
	
	private HazelcastInstance hc;
	
	public void init() {
		hc.getMap("data").entrySet().forEach(e ->{
			System.out.println("Key: "+e.getKey()+", Value: "+e.getValue()+"");
		});
	}

	public void setHc(HazelcastInstance hc) {
		this.hc = hc;
	}
}
