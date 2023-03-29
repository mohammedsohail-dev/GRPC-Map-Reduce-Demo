package user;

import java.util.List;

import com.sohail.grpc.User.Details5;
import com.sohail.grpc.User.Query5;
import com.sohail.grpc.query5Grpc.query5ImplBase;

import io.grpc.stub.StreamObserver;
import mongodb.DAOQuery5;

public class Query5Service extends query5ImplBase {
	
	@Override
	public void queryfive(Details5 request, StreamObserver<Query5> responseObserver) {
		
		System.out.println("Query5 was performed");

		
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
		response.setNortheast(state1);
		response.setSoutheast(state2);
		response.setMidwest(state3);
		response.setSouthwest(state4);
		response.setWest(state5);
		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
		
		
		
	}

}
