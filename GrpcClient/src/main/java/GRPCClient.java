


import com.sohail.grpc.User.APIResponse;
import com.sohail.grpc.User.LoginRequest;
import com.sohail.grpc.userGrpc;
import com.sohail.grpc.userGrpc.userBlockingStub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;


public class GRPCClient {
	
	public static void main(String[] args) {
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090).usePlaintext().build();
		userBlockingStub userStub = userGrpc.newBlockingStub(channel);
		LoginRequest loginrequest =  LoginRequest.newBuilder().setUsername("Sohail").setPassword("Sohail").build();
		APIResponse response = userStub.login(loginrequest);
		
		System.out.println(response.getResponsemessage());
		
	}

}

