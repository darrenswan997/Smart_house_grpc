package com.grpc.Heater;

import java.io.IOException;
import java.util.logging.Logger;

import com.Heating.HeaterInfoResponse;
import com.Heating.HeaterStatusRequest;
import com.Heating.HeaterToUpdateRequest;
import com.Heating.HeatingServiceGrpc.HeatingServiceImplBase;
import com.grpc.Fan.FanServer;
import com.grpc.Fan.FanService;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class HeatingServer extends HeatingServiceImplBase{

	private static final Logger logger = Logger.getLogger(FanServer.class.getName());

	public static void main(String[] args) throws IOException, InterruptedException{
	
		HeatingService heatService = new HeatingService();
		int port = 50051;
				
			Server server = ServerBuilder.forPort(port)
	        .addService(heatService)
	        .build()
	        .start();
			
		
		
		System.out.println("the server has started listening for requests");
		server.awaitTermination();
	}

	
	
}
