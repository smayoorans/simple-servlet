#Simple example project on jersey jackson


##To check the api calls in this example use the following curl scripts

curl -X GET http://localhost:8090/simple-servlet/simple

curl -X POST http://localhost:8090/simple-servlet/simple

    curl -X GET http://localhost:8090/simple-servlet/guru-api/v1/json/track/get

    curl -v -H "Content-Type:application/json" -X POST -d '{"singer":"Mayoo","title":"Enter Sandman"}' http://localhost:8090/simple-servlet/guru-api/v1/json/track/post

