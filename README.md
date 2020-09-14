# Xcelvie-rest

An example REST API controller written in spring-boot with minimul dependencies. The application implemments a product and order book HTTP API for a sample pharmeceutical company. Given the API, a client can query the product catalogue for published products. Query the catalogue by product titile. Insert a new product, update a product and delete a product. 

Clients can also place orders for produts.

## Pre-Rquisites

This application was writen ussing InteliJ IDE.
This application was written using an open source JDK (Open JDK VM Correto 11).
This application saves data to an instance of mmongodb (no password is set, runnning on the standard port).
This application uses Postman to test API calls.
This application uses Maven for life-cyle management and depenndency management.
This appliication is compatible with Java SE 8.

## Installation for Postman, Mongo, xcelvie-rest

A linux OS was used to install the application. I assume you have an IDE and a JDK installed.For Postman and Mongo, you can follwo these steps. 

1. Install a community version of mongo locallay. You can follow instructions here : https://www.mongodb.com/try/download/community
2. Install Postman locally. You can follow instructions here: https://www.postman.com/downloads/ 
3. Clone this project in your deployment directory

```bash

~/dev git clone git@github.com:contexua/xcelvie-rest.git

```

After you have checked out the project, you need to build it using maven:

```bash

~/dev cd xcelvie-rest

~/dev/xcelvie-rest/mvn clean install

~/dev/xcelvie-rest/mvn spring-boot:run

```


## Usage

Out of the box, you 

```python
import foobar

foobar.pluralize('word') # returns 'words'
foobar.pluralize('goose') # returns 'geese'
foobar.singularize('phenomena') # returns 'phenomenon'
```

## Contributing
If you have any general questions about the function of the API, then the documentation via Swagger or via the code should help. You can leave comments against this reopository if you like.

## Improvements



## License
This application is free to use in any scenario with no responsibility owned by Kevin Hamid.
