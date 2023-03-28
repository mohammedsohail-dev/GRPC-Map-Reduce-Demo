package user;

import java.util.List;

import org.bson.Document;

import com.sohail.grpc.User.APIResponse;
import com.sohail.grpc.User.Details1;
import com.sohail.grpc.User.Details2;
import com.sohail.grpc.User.Details3;
import com.sohail.grpc.User.Details4;
import com.sohail.grpc.User.Details5;
import com.sohail.grpc.User.Empty;
import com.sohail.grpc.User.LoginRequest;
import com.sohail.grpc.User.Query1;
import com.sohail.grpc.User.Query2;
import com.sohail.grpc.User.Query3;
import com.sohail.grpc.User.Query4;
import com.sohail.grpc.User.Query5;
import com.sohail.grpc.userGrpc.userImplBase;


import io.grpc.stub.StreamObserver;
import mongodb.DAOQuery1;
import mongodb.DAOQuery2;
import mongodb.DAOQuery3;
import mongodb.DAOQuery4;
import mongodb.DAOQuery5;



public class UserService extends userImplBase {
	
	

	@Override
	public void queryone(Details1 request, StreamObserver<Query1> responseObserver) {
          System.out.println("Query1 was performed");

		
		 String Year =request.getYear();
		 String State = request.getState();
		 String Type =request.getType();
		 String Length = request.getLength();
		 String Expense =request.getExpense();
		
		Query1.Builder response = Query1.newBuilder();
		
		DAOQuery1 dao = new DAOQuery1();
		List<Document> docs = dao.getCosts(Year,State,Type,Length,Expense);
		
		String doc = docs.get(0).get("value").toString();
		response.setValue(doc);
		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
		
	}

	@Override
	public void querytwo(Details2 request, StreamObserver<Query2> responseObserver) {
		 System.out.println("Query1 was performed");

			
		 String Year =request.getYear();
		 String Type =request.getType();
		 String Length = request.getLength();
		
		Query2.Builder response = Query2.newBuilder();
		
		DAOQuery2 dao = new DAOQuery2();
		List<String[]> docs = dao.getExpensivestates(Year,Type,Length);
		
		String state1 = docs.get(4)[0];
		String state2 = docs.get(3)[0];
		String state3 = docs.get(2)[0];
		String state4 = docs.get(1)[0];
		String state5 = docs.get(0)[0];
		response.setState1(state1);
		response.setState2(state2);
		response.setState3(state3);
		response.setState4(state4);
		response.setState5(state5);
		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
	}

	@Override
	public void querythree(Details3 request, StreamObserver<Query3> responseObserver) {
		 System.out.println("Query1 was performed");

			
		 String Year =request.getYear();
		 String Type =request.getType();
		 String Length = request.getLength();
		
		Query3.Builder response = Query3.newBuilder();
		
		DAOQuery3 dao = new DAOQuery3();
		List<String[]> docs = dao.getEconomicstates(Year,Type,Length);
		
		String state1 = docs.get(0)[0];
		String state2 = docs.get(1)[0];
		String state3 = docs.get(2)[0];
		String state4 = docs.get(3)[0];
		String state5 = docs.get(4)[0];
		response.setState1(state1);
		response.setState2(state2);
		response.setState3(state3);
		response.setState4(state4);
		response.setState5(state5);
		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
	}

	@Override
	public void queryfour(Details4 request, StreamObserver<Query4> responseObserver) {
		
		System.out.println("Query1 was performed");

		 String r1 = request.getR1();
		 String r2 = request.getR2();		
		 String Type =request.getType();
		 String Length = request.getLength();
		 
		 
		 
		
		Query4.Builder response = Query4.newBuilder();
		
		DAOQuery4 dao = new DAOQuery4();
		List<String[]> docs = dao.getgrowthstates(r1,r2,Type,Length);
		
		String state1 = docs.get(0)[0];
		String state2 = docs.get(1)[0];
		String state3 = docs.get(2)[0];
		String state4 = docs.get(3)[0];
		String state5 = docs.get(4)[0];
		response.setState1(state1);
		response.setState2(state2);
		response.setState3(state3);
		response.setState4(state4);
		response.setState5(state5);
		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
	}

	@Override
	public void queryfive(Details5 request, StreamObserver<Query5> responseObserver) {
		
		System.out.println("Query1 was performed");

		
		 String Year =request.getYear();
		 String Type =request.getType();
		 String Length = request.getLength();
		
		Query5.Builder response = Query5.newBuilder();
		
		DAOQuery5 dao = new DAOQuery5();
		List<String[]> docs = dao.getAveragesstates(Year,Type,Length);
		
		String state1 = docs.get(0)[1];
		String state2 = docs.get(1)[1];
		String state3 = docs.get(2)[1];
		String state4 = docs.get(3)[1];
		String state5 = docs.get(4)[1];
		response.setRegion1(state1);
		response.setRegion2(state2);
		response.setRegion3(state3);
		response.setRegion4(state4);
		response.setRegion5(state5);
		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
		
		
		
	}

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
