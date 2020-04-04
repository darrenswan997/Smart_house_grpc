package com.grpc.Fan;

import java.io.IOException;
import java.util.logging.Logger;

import com.Fan.FanServiceGrpc.FanServiceImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;


public class FanServer extends FanServiceImplBase{
	private static final Logger logger = Logger.getLogger(FanServer.class.getName());

	public static void main(String[] args) throws IOException, InterruptedException{
	
		FanService fanService = new FanService();
		int port = 50051;
				
			Server server = ServerBuilder.forPort(port)
	        .addService(fanService)
	        .build()
	        .start();
			
		
		
		System.out.println("the server has started listening for requests");
		server.awaitTermination();
	}


	
	
}
