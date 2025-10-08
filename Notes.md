# What is Maven?
  Maven is a opensource project management tool released in 2004 by Apache software foundation that helps the developer in the creating,building,and managing java-based projects.

* Archetype
* POM
* Repository
* Lifecycles

# What is Archetype?
  An archetype is a project templating toolkit that provide a template or blueprint for creating a new project.
# Why Archetype?
* Consistency
* Ensures best practice by the client/Organization
* saves time

# Project Object Model(POM)
* Project Object Model is a fundamental building block of a Maven Project.
* It is basically a XML Configuration file named as pom.xml with the information about project and the necessary configuration.


# What is Repository?
  Repository is the place which stores everything required by a maven project
  * Archetype
  * Dependencies
  * Plugins
  * Generated artifacts
  
# Maven LifeCycle
  A lifecyle is a sequence of a well defined Phase that represent the stage of a project build process.
  Each phase may consists of one or more goals that are executed during that phase.

Maven has 3 Life cycle
* Clean LifeCycle : It deletes the output of a build by deleting the build directory.It has 3 phase.
* Default Lifecycle : This is the primary Lifecycle of maven and is used to build the application. It has 21 phases.
* Site LifeCycle: It is used to create documentation to create reports.It has 4 phases 

Link -> https://maven.apache.org/guides/introduction/introduction-to-the-lifecycle.html
-------------------------------------------------------------------------------------------------------

# `pre-clean`   → runs cleanup steps that need to happen before the actual clean

# `clean`       → deletes the target/ directory (removes compiled classes, JARs, reports, etc.)

# `package`     → compiles the code, runs tests, and packages the application 
#                (creates a JAR/WAR file inside target/)

# `clean package` → first deletes target/ (clean), then rebuilds everything and 
#                 generates a fresh JAR/WAR

------------------------------------------------------------------------------------------------------
# `install`       → compiles code, runs tests, packages it, 
#                 and installs the built JAR/WAR into your local Maven repository (~/.m2/repository)

# `clean install` → first deletes target/, then rebuilds everything from scratch 
#                 and finally installs the fresh artifact into the local Maven repo
-------------------------------------------------------------------------------------------------------
# clean                → deletes the target/ directory (removes compiled classes, JARs, reports, etc.)
# package              → compiles code, runs tests, and creates the JAR/WAR inside target/
# exec:java            → runs a Java class directly using the exec-maven-plugin
# -Dexec.mainClass=... → specifies the fully qualified main class to execute

# `clean package exec:java -Dexec.mainClass=com.maven.Demo`
# → first cleans target/, then builds a fresh JAR, then runs the main class com.maven.Demo
--------------------------------------------------------------------------------------------------------
# java               → Java launcher command
# -cp                → (classpath) tells Java where to look for classes and JARs
# target/Demo1-0.0.1-SNAPSHOT.jar → the JAR file built by Maven (inside target/)
# com.maven.Demo     → the fully qualified name of the main class (package + class)

# `java -cp target/Demo1-0.0.1-SNAPSHOT.jar com.maven.Demo`
# → runs the main() method of com.maven.Demo using the classes inside Demo1-0.0.1-SNAPSHOT.jar
--------------------------------------------------------------------------------------------------------
# `clean package assembly:single`
   Still need dependency

# Maven Assembly 
<plugin>
    <artifactId>maven-assembly-plugin</artifactId>
    <version>3.6.0</version>
    <configuration>
        <descriptorRefs>
            <descriptorRef>jar-with-dependencies</descriptorRef>
        </descriptorRefs>
    </configuration>
</plugin>


```bash 
java -cp target/Demo1-0.0.1-SNAPSHOT-jar-with-dependencies.jar com.maven.Demo
```
---------------------------------------------------------------------------------------------------------
# `site`
# → generates a project documentation website using reports, javadoc, test results, etc.
# → output is placed under target/site/
# → you can open target/site/index.html in a browser to view it
