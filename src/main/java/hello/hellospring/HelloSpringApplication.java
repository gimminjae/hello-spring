package hello.hellospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloSpringApplication.class, args);
    }

}
//    빌드하고 실행하기
//    콘솔로 이동
//    1. ./gradlew build
//    2. cd build/libs
//    3. java -jar hello-spring-0.0.1-SNAPSHOT.jar
//    4. 실행확인