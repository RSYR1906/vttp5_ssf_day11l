## Maven Compiler command (Run in terminal)

- In project root folder <br/>
  ./mvnw clean (Clean up target folder) <br/>

- Package the compiled bytecode classes into jar/war file
  ./mvnw package <br/>

- delete target file and recompile code to create target file again <br/>
  ./mvnw clean package

- run the application <br/>
  ./mvnw spring-boot::run

- run the application with a specific port number and logging level <br/>
  mvn spring-boot:run -Dspring-boot.run.arguments="--server.port=3000 --logging.level.root=TRACE"

## Railway CLI

- railway login -browserless
- railway link
- railway up
