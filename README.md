# Docker

Sample project for [Ktor](https://ktor.io) running as an application with 
inside [Docker](https://www.docker.com/).

## Running

Execute this command in the repository's root directory to run this sample:

```bash
./gradlew run
```

To build and run a docker image:

```bash
./gradlew build
docker build -t ktor-docker-sample-application .
docker run -m512M --cpus 2 -it -p 31337:8080 --rm ktor-docker-sample-application
```
 
And navigate to http://localhost:31337/ to see the sample home page.  

