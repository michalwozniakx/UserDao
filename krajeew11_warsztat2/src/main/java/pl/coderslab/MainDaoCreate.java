package pl.coderslab;

public class MainDaoCreate {

    public static void main(String[] args) {

        //public User create
        UserDao userDao = new UserDao();

        User user = new User();
        user.setUserName("damian");
        user.setEmail("damian.wasik@coderslab.pl");
        user.setPassword("pass");
        userDao.create(user);
    }
}
