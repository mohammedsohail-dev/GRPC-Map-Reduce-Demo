package user;

import java.util.List;

import org.bson.Document;

import com.sohail.grpc.User.APIResponse;

import com.sohail.grpc.User.Empty;
import com.sohail.grpc.User.LoginRequest;

import com.sohail.grpc.userGrpc.userImplBase;


import io.grpc.stub.StreamObserver;




public class UserService extends userImplBase {
	
	

	

	@Override
	public void login(LoginRequest request, StreamObserver<APIResponse> responseObserver) {
		System.out.println("Inside login");
		
		String username =request.getUsername();
		String password = request.getPassword();
		
		APIResponse.Builder response = APIResponse.newBuilder();
		
		if(username.equals(password)) {
			response.setResponseCode(0).setResponsemessage("SUCCESS");
			
		}
		else {
			response.setResponseCode(100).setResponsemessage("Failure");
			
		}
		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
	}

	@Override
	public void logout(Empty request, StreamObserver<APIResponse> responseObserver) {
		
	}
	

}
