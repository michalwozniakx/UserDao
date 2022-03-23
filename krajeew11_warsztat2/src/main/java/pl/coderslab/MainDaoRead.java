package pl.coderslab;

public class MainDaoRead {

    public static void main(String[] args) {

        //public User read
        UserDao userDao = new UserDao();

        User read = userDao.read(1);
        System.out.println(read);

        User readNotExist = userDao.read(3);
        System.out.println(readNotExist);
    }
}
