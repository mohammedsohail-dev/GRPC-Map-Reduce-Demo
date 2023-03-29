package user;

import java.util.List;

import com.sohail.grpc.User.Details3;
import com.sohail.grpc.User.Query3;
import com.sohail.grpc.query3Grpc.query3ImplBase;

import io.grpc.stub.StreamObserver;
import mongodb.DAOQuery3;

public class Query3Service extends query3ImplBase{
	
	@Override
	public void querythree(Details3 request, StreamObserver<Query3> responseObserver) {
		 System.out.println("Query3 was performed");

			
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

}
