package org.deaifish.boot3.core;

import com.deaifish.boot3.robot.starter.robot.anotation.EnableRobot;
import com.deaifish.boot3.robot.starter.robot.configration.RobotAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@EnableRobot
public class Main {
    public static void main(String[] args) {
        new SpringApplication(Main.class).run(args);
    }
}