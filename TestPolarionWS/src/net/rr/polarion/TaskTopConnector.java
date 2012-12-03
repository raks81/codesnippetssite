package net.rr.polarion;

import com.tasktop.internal.polarion.core.PolarionRepositoryConnector;

public class TaskTopConnector {
	public static void main(String[] args) {
		PolarionRepositoryConnector pcm = new PolarionRepositoryConnector();
		System.out.println(pcm.getClientManager());
		
	}
}
