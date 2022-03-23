package pl.coderslab;

public class MainDaoReadAll {

    public static void main(String[] args) {

        //public User[] findAll
        UserDao userDao = new UserDao();

        User[] all = userDao.findAll();
        for (User u : all) {
            System.out.println(u);
        }
    }
}
