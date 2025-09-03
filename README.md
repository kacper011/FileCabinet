# FileCabinet

A small Java application that simulates a virtual **file cabinet** using the **Composite Design Pattern**.  
The project was implemented as part of a recruitment task for the position of **Junior Java Developer**.

##  Features

- Search for a folder by its **name**
- Find all folders of a given **size** (`SMALL`, `MEDIUM`, `LARGE`)
- Count all elements that make up the cabinet structure
- Support for both simple folders and composite folders containing subfolders
- Implementation follows **OOP best practices**:
  - Clear separation of **interfaces (API)** and **implementations**
  - Use of **Java Streams** for searching and traversal
  - Unit tests included (`JUnit 5`)
 
##  Project structure
```text
src/
 └─ main/java/org/example/cabinet/
     ├─ api/
     │   ├─ Cabinet.java
     │   ├─ Folder.java
     │   └─ MultiFolder.java
     ├─ impl/
     │   ├─ FileCabinet.java
     │   ├─ SimpleFolder.java
     │   └─ CompositeFolder.java
     └─ Main.java
 └─ test/java/org/example/cabinet/
     └─ FileCabinetTest.java
```

- `api/` → defines contracts (interfaces)
- `impl/` → contains concrete implementations
- `Main.java` → demo entry point
- `FileCabinetTest.java` → JUnit tests

##  Technologies

![Java](https://img.shields.io/badge/java-20-blue)
![Maven](https://img.shields.io/badge/maven-3.9.0-red)
![JUnit](https://img.shields.io/badge/junit5-OK-green)

##  How to run the project

 ```bash
git clone https://github.com/kacper011/FileCabinet.git
cd FileCabinet

mvn clean compile
mvn exec:java -Dexec.mainClass="org.example.Main"
mvn test
```
## Author

Kacper – [GitHub](https://github.com/kacper011)
