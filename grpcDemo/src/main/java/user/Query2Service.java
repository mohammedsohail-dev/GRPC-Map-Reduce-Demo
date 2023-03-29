package user;

import java.util.List;

import com.sohail.grpc.User.Details2;
import com.sohail.grpc.User.Query2;
import com.sohail.grpc.query2Grpc.query2ImplBase;

import io.grpc.stub.StreamObserver;
import mongodb.DAOQuery2;

public class Query2Service extends query2ImplBase{
	@Override
	public void querytwo(Details2 request, StreamObserver<Query2> responseObserver) {
		 System.out.println("Query2 was performed");

			
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

}
