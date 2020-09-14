# Xcelvie-rest

An example REST API controller written in spring-boot with minimul dependencies. The application implemments a product / order book HTTP API for a sample pharmeceutical company. Given the API, a client can query the product catalogue for published products. Query the catalogue by product title. Insert a new product, update a product and delete a product.
Clients can also place orders for produts.

## Pre-Rquisites

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


## Usage

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


* Start the application. It's a spring boot server using an embedded catalina engine running on 8080:

```bash

~/dev/xcelvie-rest/mvn spring-boot:run

```
Note the progress of the spring boot startup log and ensure the tests run correctly.

* Navigate to the deployed swagger UI to performm the API functions:



![alt text](https://github.com/[username]/[reponame]/docs/[branch]/swaggger-xcelvie.png?raw=true)

## Contributing

If you have any general questions about the function of the API, then the documentation via Swagger or via the code should help. You can leave comments against this reopository if you like.

## Improvements

*
*
*
*
*


## License
This application is free to use in any scenario with no responsibility owned by Kevin Hamid.
