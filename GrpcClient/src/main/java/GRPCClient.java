


import com.sohail.grpc.User.APIResponse;
import com.sohail.grpc.User.Details1;
import com.sohail.grpc.User.Details2;
import com.sohail.grpc.User.Details3;
import com.sohail.grpc.User.Details4;
import com.sohail.grpc.User.Details5;
import com.sohail.grpc.User.LoginRequest;
import com.sohail.grpc.User.Query1;
import com.sohail.grpc.User.Query2;
import com.sohail.grpc.User.Query3;
import com.sohail.grpc.User.Query4;
import com.sohail.grpc.User.Query5;
import com.sohail.grpc.query1Grpc;
import com.sohail.grpc.query1Grpc.query1BlockingStub;
import com.sohail.grpc.query2Grpc;
import com.sohail.grpc.query2Grpc.query2BlockingStub;
import com.sohail.grpc.query3Grpc;
import com.sohail.grpc.query3Grpc.query3BlockingStub;
import com.sohail.grpc.query4Grpc;
import com.sohail.grpc.query4Grpc.query4BlockingStub;
import com.sohail.grpc.query5Grpc;
import com.sohail.grpc.query5Grpc.query5BlockingStub;
import com.sohail.grpc.userGrpc;
import com.sohail.grpc.userGrpc.userBlockingStub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;


public class GRPCClient {
	
	public static void main(String[] args) {
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090).usePlaintext().build();
		userBlockingStub userStub = userGrpc.newBlockingStub(channel);
		query1BlockingStub query1Stub = query1Grpc.newBlockingStub(channel);
		query2BlockingStub query2Stub = query2Grpc.newBlockingStub(channel);
		query3BlockingStub query3Stub = query3Grpc.newBlockingStub(channel);
		query4BlockingStub query4Stub = query4Grpc.newBlockingStub(channel);
		query5BlockingStub query5Stub = query5Grpc.newBlockingStub(channel);
		
		Details1 details1 =Details1.newBuilder().setYear("2014").setState("Arizona").setType("Private").setLength("4-year").setExpense("Fees/Tuition").build();
		Query1 queryy1 = query1Stub.queryone(details1);
		
		Details2 details2 =Details2.newBuilder().setYear("2014").setType("Private").setLength("4-year").build();
		Query2 queryy2 = query2Stub.querytwo(details2);
		
		Details3 details3 =Details3.newBuilder().setYear("2014").setType("Private").setLength("4-year").build();
		Query3 queryy3 = query3Stub.querythree(details3);
		
		Details4 details4 =Details4.newBuilder().setR1("2014").setR2("2015").setType("Private").setLength("4-year").build();
		Query4 queryy4 = query4Stub.queryfour(details4);
		
		Details5 details5 =Details5.newBuilder().setYear("2014").setType("Private").setLength("4-year").build();
		Query5 queryy5 = query5Stub.queryfive(details5);
		
		
		
		System.out.println("Query 1");
		System.out.println( "Value"+" "+ queryy1.getValue());
		System.out.println("Query 2");
		System.out.println(queryy2.getState1()+" "+queryy2.getState2()+" "+queryy2.getState3()+" "+queryy2.getState4()+" "+queryy2.getState5());
		System.out.println("Query 3");
		System.out.println(queryy3.getState1()+" "+queryy3.getState2()+" "+queryy3.getState3()+" "+queryy3.getState4()+" "+queryy3.getState5());
		System.out.println("Query 4");
		System.out.println(queryy4.getState1()+" "+queryy4.getState2()+" "+queryy4.getState3()+" "+queryy4.getState4()+" "+queryy4.getState5());
		System.out.println("Query 5");
		System.out.println("Northeast"+" "+queryy5.getNortheast()+" "+"Southeast"+" "+queryy5.getSoutheast()+" "+"Midwest"+" "+queryy5.getMidwest()+" "+"Southwest"+" "+queryy5.getSouthwest()+" "+"West"+" "+queryy5.getWest());
		
		
		
	}

}

