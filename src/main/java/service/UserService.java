package service;

import spring.Autowired;
import spring.Component;

@Component("userService")
public class UserService {

    @Autowired
    private OrderService orderService;

    public void test() {
        System.out.println(orderService);
    }
}
