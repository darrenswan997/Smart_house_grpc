package com.proto.Fan;

import java.util.logging.Logger;

import com.proto.Fan.FanClient;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import com.proto.Fan.*;;

public class FanClient {
	private static  Logger logger = Logger.getLogger(FanClient.class.getName());

	private static FanServiceGrpc.FanServiceBlockingStub blockingStub;
	private static FanServiceGrpc.FanServiceStub asyncStub;
	private static FanServiceGrpc.FanServiceFutureStub futureStub;
	
	public static void main(String[] args) throws Exception {
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
	
		blockingStub = FanServiceGrpc.newBlockingStub(channel);
		asyncStub = FanServiceGrpc.newStub(channel);
		futureStub =  FanServiceGrpc.newFutureStub(channel);

		ShowDeviceStatus();
		SetNewTemp();
		TurnOffFan();
	
	
	}

	private static void SetNewTemp() {
		// TODO Auto-generated method stub
		
	}

	private static void TurnOffFan() {
		// TODO Auto-generated method stub
		
	}

	private static void ShowDeviceStatus() {
		// TODO Auto-generated method stub
		
	}

}
