package mongodb;

import com.mongodb.ConnectionString;
import com.mongodb.DBCollection;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.AggregateIterable;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoIterable;
import com.mongodb.client.model.Aggregates;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Projections;
import com.mongodb.client.model.Sorts;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.InsertManyResult;
import com.mongodb.client.result.UpdateResult;

import java.util.Arrays;
import java.util.List;

import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;


// refer and write new code for this

public class artistDAO {

    
	ConnectionString connectionString = new ConnectionString("mongodb+srv://sohail179:URGr3Q!AyR4kyq4@cluster0.ggny9n6.mongodb.net/skiers_resorts?retryWrites=true&w=majority");
	MongoClientSettings settings = MongoClientSettings.builder()
	        .applyConnectionString(connectionString)
	        .build();
	MongoClient mongoClient = MongoClients.create(settings);
	MongoDatabase database = mongoClient.getDatabase("skiers_resorts");
	
	
	public void getDataBasesCollections() {
		
		MongoIterable<String> listDBs = mongoClient.listDatabaseNames();
		for (String db : listDBs) {
	         database = mongoClient.getDatabase(db);
	         MongoIterable<String> listCols = database.listCollectionNames();
	         for(String col: listCols) {
	        	 System.out.println(db + " : " + col );
	         }
	         
	    }
	}
	
	
	
	public void insertCollection() {
		
		MongoCollection<Document> collection = database.getCollection("EduCoststat");
		Document doc1 = new Document().append("account_holder","john doe").append("account_id","MDB99115881").append("balance",1785).append("account_type","checking");
		Document doc2 = new Document().append("account_holder","jane doe").append("account_id","MDB79101843").append("balance",1468).append("account_type","checking");
		List<Document> accounts = Arrays.asList(doc1, doc2);
		collection.insertMany(accounts);
		FindIterable<Document> docs = collection.find();
		for(Document doc : docs) {
			System.out.println(doc);
		}
		
		Bson query  = Filters.eq("account_id","MDB99115881");
		Bson updates  = Updates.combine(Updates.set("account_type","saving"),Updates.inc("balance",17850));
		UpdateResult upResult = collection.updateOne(query, updates);
		
	}
	
	
	public void aggregateQuery() {
		
		
		MongoCollection<Document> collection = database.getCollection("EduCostStat");
		
		Bson matchStage = Aggregates.match(Filters.eq("account_id", "MDB99115881"));
		System.out.println("Display aggregation of matching results");
		AggregateIterable<Document> docs = collection.aggregate(Arrays.asList(matchStage));
		for(Document doc:docs) {
			System.out.println(doc.toJson());
		}
		
		
		
		matchStage =
	            Aggregates.match(Filters.and(Filters.gt("balance", 1500), Filters.eq("account_type", "checking")));
	    Bson sortStage = Aggregates.sort(Sorts.descending("balance"));
	    Bson projectStage = Aggregates.project(
	    		Projections.fields(
	    		Projections.include("account_id", "account_type", "balance"), 
	    		Projections.computed("euro_balance", 
	    				new Document("$divide", Arrays.asList("$balance", 1.20F))), 
	    		Projections.excludeId()));
	    System.out.println("Display aggregation of matching, sorting and projection results");
	    docs = collection.aggregate(Arrays.asList(matchStage,sortStage, projectStage));
	    for(Document doc:docs) {
	    	System.out.println(doc.toJson());
	    }
	}
	
}
