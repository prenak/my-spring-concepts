package com.xps.app.job;

import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.jmx.export.annotation.ManagedResource;

@ManagedResource
public class BatchJobExecutor {
	
	@ManagedOperation
	public void forceStopBatchJob(Long jobExecutionId) {
		System.out.println("Stopping job " + jobExecutionId);
	}
}
