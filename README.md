# how to run
1) First maven build the pom.xml of GRPC Demo
2) The data from the excelsheet will be added to EduCoststat collection when the GRPC server is executed
3) Run the GRPCClient to obtain output

Main purpose of this project: 
1) RPC communication for resources and services; 
2) data operations on MongoDB, a NoSQL database; 
3) implementation of aggregation pipelines for data  processing. 


This project involves querying a dataset of information about fees in the United States of America each query is unique
    1) Completed a cost query for a specific year, state, type, length, and expense in Maven, saving the result as a document in the EduCostStatQueryOne collection.
    2) Successfully executed a query to identify the top 5 most expensive states based on overall expense for a given year, type, and length. The results were saved as a document in the EduCostStatQueryTwo collection using Maven using gRPC Remote Procedure Call).
    3) Accomplished a query to determine the top 5 most economical states concerning overall expense given a specific year, type, and length. The outcome was stored as a document in the EduCostStatQueryThree collection, utilizing Maven using gRPC.
    4) Executed a query to find the top 5 states with the highest growth rate of overall expense within a range of past years (one, three, and five years), considering the latest year as the base, along with specific type and length criteria. The results were saved in the EduCostStatQueryFour collection using Maven.
    5) Conducted an aggregation to find the region's average overall expense for a given year, type, and length in Maven. The query results were saved as a document in the EduCostStatQueryFive collection, with reference to the Five US Region Map for geographical representation.
