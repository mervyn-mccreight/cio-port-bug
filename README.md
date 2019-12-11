# Ktor-CIO local port bug

If you map a port in Docker, ktor with CIO evaluates `request.local.port` to the mapped port (Docker) not the port
local to the application (the port that the applications connector is receiving the requests on; in Docker wording - 
the "exposed port").

I.e. the application gets the mapped port, not the exposed port.

This behaviour makes it impossible to filter requests by port, as you can not know, how "the user" maps the ports.

## Running
To build and run a docker image with a mapped port:
```bash
./gradlew build
docker build -t ktor-docker-sample-application .
docker run -m512M --cpus 2 -it -p 31337:8080 --rm ktor-docker-sample-application
```
And navigate to http://localhost:31337/ to see what the application evaluates as the requests 'local port'.  

