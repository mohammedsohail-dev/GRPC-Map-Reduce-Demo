package user;

import java.util.List;

import org.bson.Document;

import com.sohail.grpc.User.Details1;
import com.sohail.grpc.User.Query1;
import com.sohail.grpc.query1Grpc.query1ImplBase;

import io.grpc.stub.StreamObserver;
import mongodb.DAOQuery1;

public class Query1Service extends query1ImplBase{
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
	

}
