# springtemplate
template for a springboot web application

[<img src='https://spring.io/img/homepage/icon-spring-framework.svg' width=50>](https://spring.io/)
[<img src='https://spring.io/img/homepage/icon-spring-boot.svg' width=50>](https://spring.io/)
[<img src='https://upload.wikimedia.org/wikipedia/en/thumb/6/62/MySQL.svg/125px-MySQL.svg.png' width=70>](https://www.mysql.com/)
[<img src='http://www.howcsharp.com/img/0/52/hibernate-orm-300x223.jpg' width=50>](http://hibernate.org/)

# Runing instructions
## Edit configurations
1. Open **src/main/resources/application.properties**.
2. Add database credentials to the database setup section. set **spring.jpa.hibernate.ddl-auto=create** for initial run.

## Run by source code
Browse the root directory that contains pom.xml and run:
```sh
mvn clean install
mvn spring-boot:run
```
## Run by JAR executable.
Copy paste new **application.properties** to **target/** folder to inject configurations in to executable. run:
```sh
jar uf  springtest-1.0-SNAPSHOT.jar  application.properties
java -jar springtest-1.0-SNAPSHOT.jar
```
After initial run, set **spring.jpa.hibernate.ddl-auto=none** and save/ inject application.properties file and restart the server.
