# Xcelvie-rest

An example REST API controller written in spring-boot with minimal dependencies. The application implemments a product / order book HTTP API for a sample pharmeceutical company. Given the API, a client can query the product catalogue for published products. Query the catalogue by product title. Insert a new product, update a product and delete a product.
Clients can also place orders for products.

## Prerequisites

* This application was writen ussing InteliJ IDE.
* This application was written using an open source JDK (Open JDK VM Correto 11).
* This application saves data to an instance of mmongodb (no password is set, runnning on the standard port).
* This application uses Postman to test API calls.
* This application uses Maven for life-cyle management and depenndency management.
* This appliication is compatible with Java SE 8.

## Installation for Postman, Mongo, xcelvie-rest

A linux OS was used to install the application. I assume you have an IDE and a JDK installed.For Postman and Mongo, you can follow these steps. 

1. Install a community version of mongo locally: https://www.mongodb.com/try/download/community
2. Install Postman locally: https://www.postman.com/downloads/ 
3. Clone this project in your deployment directory

```bash

~/dev git clone git@github.com:contexua/xcelvie-rest.git

```

After you have checked out the project, you need to build it using maven:

```bash

~/dev cd xcelvie-rest

~/dev/xcelvie-rest/mvn clean install

```


## Usage - Spring



* Start the application. It's a spring boot server using an embedded catalina engine running on 8080:

```bash

~/dev/xcelvie-rest/mvn spring-boot:run

```
Note the progress of the spring boot startup log and ensure the tests run correctly.

* Open a 'browser of your choice' and paste in the swagger URL: http://localhost:8080/swagger-ui/
* Follow the instructions in the swagger UI to perform the API functions:


![an image of swagger used to acccess the API for xcelvie-rest by kevin hamid.](https://github.com/contexua/xcelvie-rest/blob/master/docs/swagger-image.png)


## Usage - Mongo

* Ensure your mongodb is running - Mine runs as a service:

```bash

~/dev/xcelvie-rest/systemctl status mongodb

```

<pre> 

 mongodb.service - An object/document-oriented database
   Loaded: loaded (/lib/systemd/system/mongodb.service; enabled; vendor preset: enabled)
   Active: <font color="#859900"><b>active (running)</b></font> since Mon 2020-09-14 06:27:17 CEST; 1h 11min ago
     Docs: man:mongod(1)
 Main PID: 867 (mongod)
    Tasks: 24 (limit: 4915)
   Memory: 187.2M
   CGroup: /system.slice/mongodb.service
           └─867 /usr/bin/mongod --unixSocketPrefix=/run/mongodb --config /etc/mongodb.conf

Sep 14 10:27:17 kevin-notebook systemd[1]: Started An object/document-oriented database.

</pre>


Its always good to inspect the raw data in mongo after creating records via the API. Some commands to help are:

<pre>mongo
MongoDB shell version v3.6.8
connecting to: mongodb://127.0.0.1:27017
Implicit session: session { &quot;id&quot; : UUID(&quot;c525e9d2-3be8-4d72-a812-b26f5342594f&quot;) }
MongoDB server version: 3.6.8
Server has startup warnings: 
2020-09-14T06:27:17.510+0200 I STORAGE  [initandlisten] 
2020-09-14T06:27:17.510+0200 I STORAGE  [initandlisten] ** WARNING: Using the XFS filesystem is strongly recommended with the WiredTiger storage engine
2020-09-14T06:27:17.510+0200 I STORAGE  [initandlisten] **          See http://dochub.mongodb.org/core/prodnotes-filesystem
2020-09-14T06:27:19.154+0200 I CONTROL  [initandlisten] 
2020-09-14T06:27:19.154+0200 I CONTROL  [initandlisten] ** WARNING: Access control is not enabled for the database.
2020-09-14T06:27:19.154+0200 I CONTROL  [initandlisten] **          Read and write access to data and configuration is unrestricted.
2020-09-14T06:27:19.154+0200 I CONTROL  [initandlisten] 
&gt; use xcelvie_salesledger_db
switched to db xcelvie_salesledger_db
&gt; show collections
orderbooks
products
&gt; 
&gt; db.orderbooks.find().pretty()
{
	&quot;_id&quot; : ObjectId(&quot;5f5f3662218f1609a2789e63&quot;),
	&quot;createdDate&quot; : ISODate(&quot;2020-09-14T09:22:42.976Z&quot;),
	&quot;clientEmail&quot; : &quot;kevin&quot;,
	&quot;_class&quot; : &quot;com.contexua.xcelvie.models.OrderBook&quot;
}
{
	&quot;_id&quot; : ObjectId(&quot;5f5f3d7e1915a85bf01d196e&quot;),
	&quot;createdDate&quot; : ISODate(&quot;2020-09-14T09:53:02.134Z&quot;),
	&quot;clientEmail&quot; : &quot;jimbo&quot;,
	&quot;orders&quot; : [
		{
			&quot;orderId&quot; : &quot;jimbo_205977&quot;,
			&quot;orderTotal&quot; : 0
		},
		{
			&quot;orderId&quot; : &quot;jimbo_41428&quot;,
			&quot;orderTotal&quot; : 958.5,
			&quot;orderItems&quot; : [
				{
					&quot;skuid&quot; : &quot;Genfro_200_286&quot;,
					&quot;quantity&quot; : 9,
					&quot;lineItemTotal&quot; : 319.5
				},
				{
					&quot;skuid&quot; : &quot;Genfro_200_286&quot;,
					&quot;quantity&quot; : 9,
					&quot;lineItemTotal&quot; : 319.5
				},
				{
					&quot;skuid&quot; : &quot;Genfro_200_286&quot;,
					&quot;quantity&quot; : 9,
					&quot;lineItemTotal&quot; : 319.5
				}
			]
		},
		{
			&quot;createdDate&quot; : ISODate(&quot;2020-09-14T12:24:10.356Z&quot;),
			&quot;orderId&quot; : &quot;jimbo_159255&quot;,
			&quot;orderTotal&quot; : 14519.5,
			&quot;orderItems&quot; : [
				{
					&quot;skuid&quot; : &quot;Genfro_200_286&quot;,
					&quot;quantity&quot; : 9,
					&quot;lineItemTotal&quot; : 319.5
				},
				{
					&quot;skuid&quot; : &quot;Genfro_200_286&quot;,
					&quot;quantity&quot; : 200,
					&quot;lineItemTotal&quot; : 7100
				},
				{
					&quot;skuid&quot; : &quot;Genfro_200_286&quot;,
					&quot;quantity&quot; : 200,
					&quot;lineItemTotal&quot; : 7100
				}
			]
		}
	],
	&quot;_class&quot; : &quot;com.contexua.xcelvie.models.OrderBook&quot;
}
&gt; 
</pre>


## Contributing

If you have any general questions about the function of the API, then the documentation via Swagger or via the code should help. You can leave comments against this reopository if you like.

## Improvements

* Testing is pretty basic - just testing the controller httpstatus messages, I mocked the service call, but still need to mock the DAO's
* Persistence should probably be via a que, but for this example the service is on the same JVM.
* Service helpers are hardcoded, business domain services should be used.
* No instructions for running in a Microsoft Windows environment.
* Candidate for containerisation.

## License
This application is free to use in any scenario with no responsibility owned by Kevin Hamid.
