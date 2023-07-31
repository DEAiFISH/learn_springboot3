package com.deaifish.boot;

import com.deaifish.boot.bean.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//  SpringBoot只会扫描主程序所在的包及其下面的子包，自动的component-scan功能
@SpringBootApplication
/*
    //自定义扫描路径
    @SpringBootApplication(scanBasePackages = "com.atguigu")
    @ComponentScan("com.atguigu") 直接指定扫描的路径
*/
public class MainApplication {
    public static void main(String[] args) {

        //java10： 局部变量类型的自动推断
        var ioc = SpringApplication.run(MainApplication.class, args);

        //1、获取容器中所有组件的名字
        String[] names = ioc.getBeanDefinitionNames();
        //2、挨个遍历：
        // dispatcherServlet、beanNameViewResolver、characterEncodingFilter、multipartResolver
        // SpringBoot把以前配置的核心组件现在都给我们自动配置好了。
        /*for (String name : names) {
            System.out.println(name);
        }*/

        /*for (String s :ioc.getBeanNamesForType(Cat.class)) {
            System.out.println("cat:" + s);
        }

        for (String s :ioc.getBeanNamesForType(Dog.class)) {
            System.out.println("dog:" + s);
        }

        for (String s :ioc.getBeanNamesForType(User.class)) {
            System.out.println("user:" + s);
        }*/

        Pig pig = ioc.getBean(Pig.class);
        System.out.println(pig);

        Sheep sheep = ioc.getBean(Sheep.class);
        System.out.println(sheep);

    }

}
