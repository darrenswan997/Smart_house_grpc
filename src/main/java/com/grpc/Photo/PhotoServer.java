package com.grpc.Photo;

import java.io.IOException;
import java.util.logging.Logger;

import com.grpc.Fan.FanServer;
import com.grpc.Heater.HeatingService;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class PhotoServer {

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
