```
docker run -it --rm --name gcloud-public-auth-bug -v "$(pwd)":/usr/src/mymaven -w /usr/src/mymaven maven:3.3-jdk-8 mvn clean install
```