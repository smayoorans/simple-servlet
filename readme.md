#This is simple example project on json jackson


curl -X Get http://localhost:8090/simple-servlet/simple
curl -X Post http://localhost:8090/simple-servlet/simple

curl http://localhost:8090/simple-servlet/rest/json/metallica/get

curl -v -H "Content-Type:application/json" -X POST -d '{"singer":"Metallica","title":"Enter Sandman"}' http://localhost:8090/simple-servlet/rest/json/metallica/post

