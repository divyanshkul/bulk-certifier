# Certifier Project

This project generates a certificate. It runs on Vert.x, and is built on the Gradle build system.


## Features
* Students can generate certificates of completion for a variety of courses.
* Mentors can generate certificates for students from data in CSV files.


## Setting up the project

1. *Fork* this git repository and *clone* the fork to a local directory.
2. If you prefer using an IDE, install [Intellij IDEA](https://www.jetbrains.com/idea) or another preferred IDE

## Running the app


###### If using an IDE like Intellij IDEA,
1. Download Java development kit (JDK 8, as 9 won't work)
2. Configure intellij project defaults, project structure, to set the project SDK to java version 1.8
3. Import the cloned repository into your IDE
4. after importing there should be a notification in the bottom right, asking you to link the project to gradle. Click on it and it will occur automatically.
5. Right click the **App** class
6. Right click on the vertx at the top of the code and use the suggested help from intellij to link it to the project
7. Click **Run App.main()**

### If using an IDE like Intellij IDEA,

1. Right click the **App** class
2. Click **Run App.main()**


### If using on terminal at linux/unix,
```sh
./gradlew run         # pwd should be project home dir
```
### If using on terminal at windows,
```sh
gradlew run           # pwd should be project home dir
```

## Help/Reference

If you are stuck anywhere or need any help, you can refer the following:

1. [Git Handbook](https://guides.github.com/introduction/git-handbook)
2. [Introduction](https://guides.github.com/introduction/flow)
3. [Chat](https://gitter.im/jboss-outreach/gci)

## Contributing to the project

1. Make your intended changes on your locally cloned repository
2. *Commit* the changes and *push* the commit to your forked repository on GitHub
3. Ensure the changes on the commit pushed to your GitHub fork are right
4. Create a *pull request* requesting to merge the commits on your fork to this repository.
5. Write a concise and convincing pull request message explaining the purpose of your commits.
