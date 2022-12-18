# spring-boot-jpa-docker-compose
<!-- PROJECT SHIELDS -->

<!--
*** I'm using markdown "reference style" links for readability.
*** Reference links are enclosed in brackets [ ] instead of parentheses ( ).
*** See the bottom of this document for the declaration of the reference variables
*** for contributors-url, forks-url, etc. This is an optional, concise syntax you may use.
*** https://www.markdownguide.org/basic-syntax/#reference-style-links
-->
[![Contributors][contributors-shield]][contributors-url]
[![Forks][forks-shield]][forks-url]
[![Stargazers][stars-shield]][stars-url]
[![Issues][issues-shield]][issues-url]
[![LinkedIn][linkedin-shield]][linkedin-url]

<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[contributors-shield]: https://img.shields.io/github/contributors/yewin-mm/spring-boot-jpa-docker-compose.svg?style=for-the-badge
[contributors-url]: https://github.com/yewin-mm/spring-boot-jpa-docker-compose/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/yewin-mm/spring-boot-jpa-docker-compose.svg?style=for-the-badge
[forks-url]: https://github.com/yewin-mm/spring-boot-jpa-docker-compose/network/members
[stars-shield]: https://img.shields.io/github/stars/yewin-mm/spring-boot-jpa-docker-compose.svg?style=for-the-badge
[stars-url]: https://github.com/yewin-mm/spring-boot-jpa-docker-compose/stargazers
[issues-shield]: https://img.shields.io/github/issues/yewin-mm/spring-boot-jpa-docker-compose.svg?style=for-the-badge
[issues-url]: https://github.com/yewin-mm/spring-boot-jpa-docker-compose/issues
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[linkedin-url]: https://www.linkedin.com/in/ye-win-1a33a292/

<h1 align="center">
  Spring Boot JPA Docker Compose with Existing DB
  <img src="https://github.com/yewin-mm/spring-boot-jpa-docker-compose/blob/master/github/template/images/overview/spring_jpa_docker_compose.png" /><br/>
</h1>

<h1 align="center">
  Spring Boot JPA Docker Compose with New DB
  <img src="https://github.com/yewin-mm/spring-boot-jpa-docker-compose/blob/master/github/template/images/overview/spring_jpa_docker_compose_new_db.png" /><br/>
</h1>

<h1 align="center">
  Spring Boot JPA Docker Compose with New DB using ENV File
  <img src="https://github.com/yewin-mm/spring-boot-jpa-docker-compose/blob/master/github/template/images/overview/spring_jpa_docker_compose_new_db_with_env.png" /><br/>
</h1>


# spring-boot-jpa-docker-compose
* This is the sample project for spring-boot with jpa for database operation using docker compose and build dockerized application and connect to MySQL db container.
* Docker Compose is to manage one or many containerized applications in one configuration file called `docker-compose.yml` and you can easily build and run your applications by using that file.
* So, the purpose is to manage containerized applications by using docker compose files.

<!-- TABLE OF CONTENTS -->
## Table of Contents
- [About The Project](#about-the-project)
    - [Built With](#built-with)
- [Getting Started](#getting-started)
    - [Before you begin](#before-you-begin)
    - [Clone Project](#clone-project)
    - [Prerequisites](#prerequisites)
    - [Instruction](#instruction)
      -  [Generate Jar](#generate-jar)
      -  [Run with existing DB](#run-with-existing-db)
      -  [Run with new db](#run-with-new-db)
      -  [Run with new db using env file](#run-with-new-db-using-env)
      -  [Checking](#checking)
      -  [Stop Container](#stop-container)
      -  [Restart Container](#restart-container)
      -  [Update Changes](#update-changes)
      -  [Necessary tips](#necessary-tips)
      -  [Testing](#testing)
- [Contact Me](#contact)
- [Contributing](#Contributing)


<a name="about-the-project"></a>
## ⚡️About The Project
This is Demo Project for Spring boot with JPA and running with docker compose and connect existing MySQL db container and create new MySQL db containers. <br>
As of now, running application as container way is the best option to manage application deployment. (you can find more about benefits of using docker in google). <br>
This project used db as MySQL which is containerized.
You should see [Before you begin](#before-you-begin) section first.

<a name="built-with"></a>
### 🪓 Built With
This project is built with
* [Java](https://www.oracle.com/au/java/technologies/javase/javase-jdk8-downloads.html)
* [Maven](https://maven.apache.org/download.cgi)
* [Containerized MySQL Database](https://github.com/yewin-mm/mysql-docker-container)
* [Docker](https://www.docker.com/products/docker-desktop/)


<a name="getting-started"></a>
## 🔥 Getting Started
This project purpose is to run java application with Spring Boot framework and using JPA for database operation and running as `docker container`. <br>
And also this project purpose is to connect MySQL DB Container. 
This project is built with Java, Maven, Docker, MySQL db ([Containerized](https://github.com/yewin-mm/mysql-docker-container)) and use `Project Lombok` as plugin.
So, please make sure all are installed in your machine.<br> You should see [Before you begin](#before-you-begin) section first. 
- After installation was success, please note that `docker` will open when you turn on your computer as default, and it will take space on RAM of your machine. <br> 
So, you need to set the setting that **not to open always** when you turn on your computer (login account) to reduce unnecessary taking space when you are not using related with docker.
- Open `docker desktop` and you can see `docker icon` which are at noti bar. (Window user need to expand arrow which bottom right corner to see docker icon whereas Mac user can see at top noti bar).
- `Right click` on docker icon and click `Dashboard`, after docker desktop was open, click `setting icon` (top right corner) and `uncheck` (untip) mark on `“Start Docker Desktop when you login”` in `General` tab. Click `“Apply & Restart”`.
- With that setting, you can close, open whatever you want and it **will not open always** when you turn on your computer anymore.


<a name="before-you-begin"></a>
### 🔔 Before you begin
If you are new in Git, GitHub and new in Spring Boot configuration structure, <br>
You should see basic detail instructions first in here [Spring Boot Application Instruction](https://github.com/yewin-mm/spring-boot-app-instruction)<br>
If you are not good enough in basic API knowledge with Java Spring Boot, Docker basic, Docker Compose basic and other spring basic knowledge, you should learn below example projects first. <br>
Click below links.
* [Spring Boot Sample CRUD Application](https://github.com/yewin-mm/spring-boot-sample-crud) (for sample CRUD application)
* [Reading Values from Properties files](https://github.com/yewin-mm/reading-properties-file-values) (for reading values from properties files)
* [Spring Boot Docker Sample](https://github.com/yewin-mm/spring-boot-docker-sample)
* [MySQL Container](https://github.com/yewin-mm/mysql-docker-container)
* [Spring Boot JPA Docker](https://github.com/yewin-mm/spring-boot-jpa-docker)
* [Spring Boot Docker Compose Sample](https://github.com/yewin-mm/spring-boot-docker-compose-sample)


<a name="clone-project"></a>
### 🥡 Clone Project
* Clone the repo
   ```sh
   git clone https://github.com/yewin-mm/spring-boot-jpa-docker-compose.git
   ```
<a name="prerequisites"></a>
### 🔑 Prerequisites
Prerequisites can be found here, [Spring Boot Application Instruction](https://github.com/yewin-mm/spring-boot-app-instruction). <br>
You need to install `Docker` in your machine. [Get Docker](https://www.docker.com/products/docker-desktop/). <br>
You need to learn sample dockerized application by using `Dockerfile` first. [Spring Boot Docker Sample](https://github.com/yewin-mm/spring-boot-docker-sample)
You also need to learn MySQL docker container here if you want to use existing MySQL DB. [MySQL Container](https://github.com/yewin-mm/mysql-docker-container)
You also need to learn spring boot jpa docker application here. [Spring Boot JPA Docker](https://github.com/yewin-mm/spring-boot-jpa-docker)
You also need to learn sample docker-compose application here. [Spring Boot Docker Compose Sample](https://github.com/yewin-mm/spring-boot-docker-compose-sample)


<a name="instruction"></a>
### 📝 Instruction
* `docker-compose.yml` file read `Dockerfile`. So, your application should have `Dockerfile`.
* For more details about `Dockerfile`, you can find in here. [Spring Boot Docker Sample](https://github.com/yewin-mm/spring-boot-docker-sample)
* For sample `Docker Compose` application, you can find in here. [Spring Boot Docker Compose Sample](https://github.com/yewin-mm/spring-boot-docker-compose-sample)

<a name="generate-jar"></a>
#### Generate Jar
* Go to your application folder with command prompt CMD (for window) or Terminal (for Mac and Linux) or you can also use your `IDE Terminal` while you open the project with your IDE.
* Below commands need to type in your `CMD` or `Terminal` where path should be in your application folder.
* Generate jar file
  * Type -> `mvn clean package -DskipTests=true`
  * Here, if you don't add skipTest, it will get compile time error because your application will try to connect to MySQL container as per application.properties file config db url.
  * Because if you want to connect to MySQL container, you need to add container name in datasource url of properties file and that url can't be resolved from your local.
  * You can also type `mvn clean install -DskipTests=true`.
* Check docker version to make sure your installed docker is up or down by typing `docker --version`,
* Build image and run application as container
  * Before do below commands,
    * Please make sure Docker Desktop (Docker service) is open in your machine.
    * Please make sure your generated jar file (generate with above `mvn clean package -DskipTests=true`) is under target folder.
    * Because `docker-compose.yml` file will run application, and it will read `Dockerfile` to build image and do process as per `Dockerfile`. 
    * So, if your jar file name is not same with inside jar file name of `Dockerfile`, you can't create image.
    * Please make sure your jar file name under target folder and jar file name in COPY keyword of `Dockerfile` **must be same**.
  * If all are ok, create image and run your application as container by below commands.
* Here I provide with three ways
  1. Run application with existing MySQL DB container
  2. Run application with new MySQL DB container
  3. Run application with new MySQL DB container using .env file


<a name="run-with-existing-db"></a>
#### 1. Run application with existing MySQL DB container
* In this way, I run this application as container and used existing MySQL DB Container.
* If you don't have MySQL DB container, you need to create that by below tutorial
  * [Run MySQL DB as Container Tutorial](https://github.com/yewin-mm/mysql-docker-container)
  * After that, Type in Terminal or CMD
  * ```sh
    docker-compose up -d
    ```
  * You can remove `-d` when you want to test your application is running well or not by checking logs.
  * You can also check container logs without removing `-d` option by typing `docker logs -f -n 200 {container_id}`, here, `-n 200` is line number.<br> But I recommend to use with `-d` option when you run your application.
  * After checking without `-d` option, please type in another terminal `docker-compose down` and you can again run with `-d` option as I showed in above if you run.
  * Go for stopping container first before you do other ways. [Stop Container](#stop-container)


<a name="run-with-new-db"></a>
#### 2. Run application with new MySQL DB container
* In this way, I run this application as container and used new MySQL DB Container by creating new MySQL DB Container with MySQL Image from DockerHub.
  * Type
  * ```sh
    docker-compose -f docker-compose-app-with-new-db.yml up -d
    ```
  * You can remove `-d` when you want to test your application is running well or not by checking logs.
  * You can also check container logs without removing `-d` option by typing `docker logs -f -n 200 {container_id}`, here, `-n 200` is line number.<br> But I recommend to use with `-d` option when you run your application.
  * After checking without `-d` option, please type in another terminal `docker-compose down` and you can again run with `-d` option as I showed in above if you run.
  * Go for stopping container first before you do other ways. [Stop Container](#stop-container)


<a name="run-with-new-db-using-env"></a>
#### 3. Run application with new MySQL DB container using .env file
* In this way, I run this application as container and used existing MySQL DB Container by creating new MySQL DB Container with MySQL Image from DockerHub.
* I used .env file for getting credentials value.
* This is the best way for running application in real world than above ways.
* Because if we set actual credentials values like db password in compose file, attacker can get easily.
* So, we will separate the credentials file and `.env` file will be hidden by default.
  * Type
  * ```sh
    docker-compose -f docker-compose-app-with-new-db-with-env.yml up -d
    ```
  * You can remove `-d` when you want to test your application is running well or not by checking logs.
  * You can also check container logs without removing `-d` option by typing `docker logs -f -n 200 {container_id}`, here, `-n 200` is line number.<br> But I recommend to use with `-d` option when you run your application.
  * After checking without `-d` option, please type in another terminal `docker-compose down` and you can again run with `-d` option as I showed in above if you run.
  * Go for stopping container first before you do other ways. [Stop Container](#stop-container)

As in above commands,
* `up` is to build image and run this application as container
* `-d` option is to hide log and run in background.
* You can remove `-d` option when you want to test your application is running well or not by checking logs
  * You can also check container logs without removing `-d` option by typing `docker logs -f -n 200 {container_id}`, here, `-n 200` is line number.<br> But I recommend to use with `-d` option when you run your application.
  * After checking without `-d` option, please type in another terminal `docker-compose down` and you can again run with `-d` option when you run.

<a name="checking"></a>
#### Checking
* You can check your created docker images with below command.
  * ```sh
    docker images
    ```
  * Here, If created, you can see Repository name (image name), Tag (version), Image Id, Created date, etc.
  * If not created, you need to check Dockerfile like jar file name is same with target folder and your CMD or terminal path is under project directory or not.

* Check container
  * Type (check running containers)
      ```sh
      docker ps

  * Here, you can see Container Id, Image name, Container Name, etc.

  * Type (check all containers including running container, not running container, unsuccessful running container)
    ```sh
    docker ps -a

  * If your application is not running well when application was started up, you can check logs by removing `-d` to appear log to check error in CMD or Terminal like below. <br>
  * run without detached mode `docker-compose up` <br>
  * you can stop (terminate) application by pressing Ctrl+C when you run application without detached mode.
  * I recommend to run with `-d` option after checking error and use `docker-compose down` to stop container as `down` keyword will also be removed container and network also.
  * Here, you can use another (new tab) `Terminal` or `CMD` to stop container by typing `docker-compose down`.


* Please note that, docker compose file will create default `network` for your application even if you don't set the network in compose file,
* You can test network by typing `docker network ls` after docker compose was up.
* I've dropped network in `docker-compose.yml` file, and you can check it out.

<a name="stop-container"></a>
#### Stop Container
  * Please note that If you don't stop container, your application container will run background the whole time.
  * You can type below commands in `another` (new tab) `Terminal` or `CMD` .
  * If you run without `-d` option, you don't need to click `ctrl+c` and just type below command in another `Terminal` or `CMD` where that terminal should be under project directory if you don't want to add specific location in command.
  * So, you need to stop your application if your application is not go live for the whole time.
    * Type
      ```sh
      docker-compose down
      ```
  * If you use another compose file which name is not formal name (docker-compose) like `docker-compose-dev` or `docker-compose-prod`, etc,
  * You need to add -f option to know compose file by docker engine.
  * Type
    ```sh
    docker-compose -f <compose file name> down
    ```
    * As my example compose files, you need to type `docker-compose -f docker-compose-app-with-new-db.yml down` or `docker-compose -f docker-compose-app-with-new-db-with-env.yml down`.
    * `down` option will remove container too.
    * If you don't use `docker-compose` file and if you use dockerfile only, you need to stop by `docker stop {container_id}` and for that case you need container id.
    * You can also use `docker stop {container_id}` command, but for that case, container will remain as stopped container (not remove), and it will take a bit space on docker.
    * And also new MySQL DB container will be run the whole time in background, even you stop by MySQL container id, it's will busy for you as you need to stop by manual for all containers which are at compose file.
    * `docker-compose down` don't need container id and stop all containers which is handle by `compose` file.
    * It will remove both of your application container and MySQL container and also associated network also.
    * `docker-compose down` won't delete the volume. 
    * If you want to delete the volume you need to add `-v` option in down keyword, but you need to take care if you do for deleting volume as it's the place that stored your db data. 
    * So, that `down` option will clear your stopped containers and running network, and it's the good thing to remove stopped/no use container.
    * So, that is one of the good approach using `docker-compose` file and `docker-compose down` keyword.

<a name="restart-container"></a>
#### Restart Container
* If you want to start or restart the application next time, you can start application easily with below command.
  * Type
    ```sh
    docker-compose up -d
    ```
  * If you used another compose file to run app.
  * Type
    ```sh
    docker-compose -f <compose file name> up -d
    ```
    
  * Docker compose will use existing image and if not existed image, it will automatically create.

<a name="update-changes"></a>
#### Update changes
* If you did some changes in your application,
* You need to regenerate jar file by `mvn clean package -DskipTests=true`.
* If you type `docker-compose up -d` to run application, you don't get the update even you already regenerate jar file.
* This is because `docker-compose` will use `existing created image` which is build from old jar file.
* So, you need to recreate image by below command.

  * Type
    ```sh
    docker-compose up --build -d
    ```
    
  * If you use other compose files, Type
    ```sh
    docker-compose -f <compose file name> up --build -d
    ```
    
  * `--build` will re-create image. (Please note that don't forget to re-generate jar file first by `mvn clean package -DskipTests=true`).


<a name="necessary-tips"></a>
#### Necessary Tips
* If you want to check running application logs or your output log values, you can type docker logs option.
  * Type
    ```sh
    docker logs -f -n 200 {container_id}
    ```
  * Here, -f mean follow the logs for upcoming logs and -n mean line number follow by number of lines to reduce appearing huge amount of logs.
  * You can reference for more details about logs in [Docker official log documentation](https://docs.docker.com/engine/reference/commandline/logs/) or you can find usage in google.
  * You can exit following logs by clicking `Ctrl+c`.

* If you want to delete your application image, you need to stop and delete container (but if you use, `docker-compose down`, it will remove(delete) container)
* So, no need to manual remove (delete) container to removing image if you use `docker-compose down`.
    ```sh
    docker rmi {image_id}
    ```
  * here, you can get your application image id by typing `docker images`.

* If you get exception error for successful running application, or if you want to check your application inside container, <br>
  you can either go inside into container for seeing logs, jar file as your path, folder, etc. Every application has own containers.
* To go inside your application container
  * Type
      ```sh
      docker exec -it {container_id} /bin/bash

  * You can also type `docker exec -it {container_id} /bin/sh` or `docker exec -it {container_id} bash`
  * here, you can get your application container id by typing `docker ps`.
  * If container is not up (not running), you can't go inside container.
  * here, you can leave inside docker container by typing `exit` inside container.

* Check Docker disk space as some unnecessary images and unused containers may take much space
  * Type
    ```sh
    docker system df
    ```
  * For more commands like, cleaning unused containers, images, get inside container, logging, deleting container, image
  * You can find in here, [Dockerized Application Sample Commands](https://github.com/yewin-mm/spring-boot-docker-sample/blob/master/README.md#instruction)

* Read `Dockerfile`, `docker-compose.yml`, `docker-compose-app-with-new-db-with-env.yml`, `docker-compose-app-with-new-db.yml` files again under application folder path carefully <br> 
and see the comments in there.
* In above way, we can separate multiple `.env` file (name may different like `.env-dev`, `.env-prod`, etc.) with different credentials <br> 
and can use only one `docker-compose` file to run on different environment (dev server, prod server, etc). 
* So, even credentials was change as per environment, our env file will also be suit for all environment as using multiple env file. 
* You can also use multiple `docker-compose` file and multiple `.env` file for different environment.
* You can even inject `.env` file while running `docker-compose` command to know get different environment credentials. For more details, you can find in google. 

<a name="testing"></a>
#### Testing
* Import `spring-boot-jpa-docker-compose.postman_collection.json` file under project directory (see that file in project directory) into your installed Postman application.
  * Click in your Postman (top left corner) import -> file -> upload files -> {choose that json file} and open/import.
  * After that, you can see the folder which you import from file in your Postman.
* Now, you can 'Test' this project by calling API from Postman.
  * Open your imported folder in postman and inside this folder, you will see total of 3 APIs, you can test that all APIs by clicking `Send` button one by one and see the response.
  * You need to change the `port` in postman when you call APIs if you run with other docker compose files as application running ports are `different` in those files.
  * You can also check in your docker container logs for some print out values.
  * You can check data in DB by using Database GUI tools like DBeaver or Datagrip or Workbench or you can select query inside MySQL Container.
  
* After that you can see the code and check the code and `compose files` (I provided 3 files) and `Dockerfile` which you don't know. You can learn it, and you can apply in your job or study fields.

***Have Fun and Enjoy in Learning Code***


<a name="contact"></a>
## ✉️ Contact
Name - Ye Win <br> LinkedIn profile -  [Ye Win's LinkedIn](https://www.linkedin.com/in/ye-win-1a33a292/)  <br> Email Address - yewin.mmr@gmail.com

Project Link: [Spring Boot JPA Docker Compose](https://github.com/yewin-mm/spring-boot-jpa-docker-compose)


<a name="contributing"></a>
## ⭐ Contributing
Contributions are what make the open source community such an amazing place to be learnt, inspire, and create. Any contributions you make are **greatly appreciated**.
<br>If you want to contribute....
1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/yourname`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeatures'`)
4. Push to the Branch (`git push -u origin feature/yourname`)
5. Open a Pull Request
