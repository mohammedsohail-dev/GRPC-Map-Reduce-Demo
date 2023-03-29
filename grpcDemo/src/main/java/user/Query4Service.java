package user;

import java.util.List;

import com.sohail.grpc.User.Details4;
import com.sohail.grpc.User.Query4;
import com.sohail.grpc.query4Grpc.query4ImplBase;

import io.grpc.stub.StreamObserver;
import mongodb.DAOQuery4;

public class Query4Service extends query4ImplBase{
	
	@Override
	public void queryfour(Details4 request, StreamObserver<Query4> responseObserver) {
		
		System.out.println("Query4 was performed");

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

}
