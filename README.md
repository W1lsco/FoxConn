# FoxConn
An API that allows a user to search a list to find a word they are looking for


Having never worked with anything other than Object Oriented Programming as far as Java goes, I struggled to use Spring, Gradle, Thymeleaf, and H2 alongside Java. I was able to get the project set up and running a basic "Hello World". I can say confidently that I have a good grip on this project now after I did all the research. I feel like if I had more time that I would be able to submit something I could be more proud of. With that being said I attempted to build the H2 database and could not get over the errors. I was able to get the program to run up until I started with the database. If you delete: 'Word.java', 'entity', 'repository', 'application.yml', and 'WordController.java'  . I do not have much implementation towards the acutal problem at hand, but since I saw that as the least important part considering I know how to do it, I just don't know how to get it all set up, I am not too concerned with that part. I really did enjoy working with spring and it is something I hope to work with in the future.

In order to run the project, (I use Mac), two terminals are required. The first terminal will run:
./gradlew bootJar
This will compile our code into a jar file that is executable. Then we run:
./gradle bootRun
This will run the app at 80% in the background. Then in our other terminal, we run:
curl --location --request GET 'localhost:8080/hello/test'
to get to our controller paths. the '/hello/test' is the path that can be modified based off where we want to be in our program.