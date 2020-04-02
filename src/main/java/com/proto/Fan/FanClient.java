package com.proto.Fan;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Logger;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.proto.Fan.FanClient;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import com.proto.Fan.*;;

public class FanClient {
	private static  Logger logger = Logger.getLogger(FanClient.class.getName());

	private static FanServiceGrpc.FanServiceBlockingStub blockingStub;
	private static FanServiceGrpc.FanServiceStub asyncStub;
	private static FanServiceGrpc.FanServiceFutureStub futureStub;
	
	 JFrame frame;
	    JTextArea message_text_area = new JTextArea();
	    
	    FanServiceGrpc.FanServiceBlockingStub synchClient;
	    JTextField temp_value;
	
	public static void main(String[] args) throws Exception {
		
	
		
		asyncStub = FanServiceGrpc.newStub(channel);
		futureStub =  FanServiceGrpc.newFutureStub(channel);
	
	}
	
	public FanClient() {
		run();
	}
	
	private void run() {
		// TODO Auto-generated method stub
		//creating instances for jframe
		frame = new JFrame("Fan Remote");
		JPanel panel = new JPanel();
		JLabel label = new JLabel("Set Speed");
		
		temp_value = new JTextField(1);
		temp_value.setText("1");
		
		//creating instance of jbutton
		JButton speedButton = new JButton("Reset speed");
		panel.add(speedButton);//adding the speed button to the jframe
		speedButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				SetSpeed();
			}
		});
		//creating fan information button using jbutton
		JButton showInfoButton = new JButton("Show Fan Info");
		panel.add(showInfoButton);//adding button to the jframe
		showInfoButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ShowDeviceStatus();
			}
			
		});
		
		JButton offButton = new JButton("Turn off Button");
		panel.add(offButton);//adding button to the jframe
		offButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				TurnOffFan();
			}
			
		});
		
		message_text_area = new JTextArea(20,50);
		panel.add(message_text_area);
		message_text_area.setText("Fan Cient is running.");
		
		frame.add(panel);
		frame.setSize(500,500);
		frame.setVisible(true);
		
	}

	
	
	

	private static void SetSpeed() {
		// TODO Auto-generated method stub
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
		
		//creating stub
		blockingStub = FanServiceGrpc.newBlockingStub(channel);
		
		GetDeviceByIdRequest current_fan = GetDeviceByIdRequest.newBuilder().setDeviceId(1).build();
		FanInfoResponse server_response = blockingStub.setNewTemp(request)
		
	}

	private static void TurnOffFan() {
		// TODO Auto-generated method stub
		
	}

	private static void ShowDeviceStatus() {
		// TODO Auto-generated method stub
		
	}

}
