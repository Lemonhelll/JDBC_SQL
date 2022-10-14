package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;


public class Main {
    private final static UserService userService = new UserServiceImpl();
    private final static User us1 = new User("Vladimir", "Zolotov", (byte) 25);
    private final static User us2 = new User("Dmitriy", "Zolotov", (byte) 17);
    private final static User us3 = new User("Olga", "Zolotova", (byte) 49);
    private final static User us4 = new User("Yuriy", "Zolotov", (byte) 55);

    public static void main(String[] args) {
        userService.createUsersTable();
        userService.saveUser(us1.getName(), us1.getLastName(), us1.getAge());
        userService.saveUser(us2.getName(), us2.getLastName(), us2.getAge());
        userService.saveUser(us3.getName(), us3.getLastName(), us3.getAge());
        userService.saveUser(us4.getName(), us4.getLastName(), us4.getAge());
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
