package service;

import spring.Autowired;
import spring.Component;

@Component("userService")
public class UserService implements UserInterface{

    @Autowired
    private OrderService orderService;

    @Override
    public void test() {
        System.out.println(orderService);
    }
}
