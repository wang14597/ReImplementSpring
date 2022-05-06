package service;

import spring.ApplicationContext;

public class Test {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ApplicationContext(AppConfig.class);
//        System.out.println(applicationContext.getBean("userService"));
//        System.out.println(applicationContext.getBean("userService"));
//        System.out.println(applicationContext.getBean("userService"));
//        System.out.println(applicationContext.getBean("orderService"));

        UserInterface userService = (UserInterface) applicationContext.getBean("userService");
        userService.test();

    }
}
