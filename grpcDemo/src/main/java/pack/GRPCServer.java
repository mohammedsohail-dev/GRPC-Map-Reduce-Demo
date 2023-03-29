package pack;
import java.io.IOException;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import mongodb.DetailsDAO;
import user.Query1Service;
import user.Query2Service;
import user.Query3Service;
import user.Query4Service;
import user.Query5Service;
import user.UserService;

public class GRPCServer {
	
	public static void main(String[] args) throws IOException, InterruptedException{
		DetailsDAO details = new DetailsDAO();
		details.insertAll();
		Server server= ServerBuilder.forPort(9090).addService(new UserService()).addService(new Query1Service()).addService(new Query2Service()).addService(new Query3Service()).addService(new Query4Service()).addService(new Query5Service()).build();
		server.start();
		
		System.out.println("Server started at " + server.getPort());
		server.awaitTermination();
	}

}
