package com.cp8202.project.calc;


public class MemoryStoreService {

	private double savedInfo = 0D;
	
	public MemoryStoreService() {
		
	}
	
	public double retrieveMemory() {
		return savedInfo;
	}
	

	public void removeMemory() {
		this.savedInfo = 0L;
	}
	
	
	public void saveMemory(double param) {
		this.savedInfo = param;;
	}
	
}
