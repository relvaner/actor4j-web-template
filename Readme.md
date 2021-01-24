## Actor4j Web Template ##

This is the repository for Actor4j web template.

>Aim of this project was to enhance the performance in message passing. As a reference implementation `Akka` was used. Results of the research shown that intra-thread-communication is much better than inter-thread-communication. You can group actors, so they are bound to the same thread, for instance. Message queues of the actors are outsourced to the thread. The four principles of reactive manifesto and the four semantic properties of actor systems have been applied.

For further information on `Actor4j`, see the following more complete [documentation](https://github.com/relvaner/actor4j-core).

## Dependencies ##

Following dependencies from this site are involved:
```xml
		<dependency>
			<groupId>io.actor4j</groupId>
			<artifactId>actor4j-core</artifactId>
			<version>1.1.0</version>
		</dependency>
		<dependency>
   			<groupId>io.actor4j</groupId>
   			<artifactId>actor4j-web-utils</artifactId>
   			<version>1.1.0</version>
   		</dependency>
		<dependency>
   			<groupId>io.actor4j</groupId>
   			<artifactId>actor4j-web-rest-server</artifactId>
   			<version>1.1.0</version>
   		</dependency>
   		<dependency>
   			<groupId>io.actor4j</groupId>
   			<artifactId>actor4j-web-websocket</artifactId>
   			<version>1.1.0</version>
   		</dependency>
```

Page to be updated 01/24/2021

