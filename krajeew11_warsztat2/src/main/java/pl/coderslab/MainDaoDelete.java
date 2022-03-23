package pl.coderslab;

public class MainDaoDelete {

    public static void main(String[] args) {

        //public void delete
        UserDao userDao = new UserDao();

        userDao.delete(1);
        userDao.delete(2);
        userDao.delete(3);
        userDao.delete(4);
        userDao.delete(5);
    }
}
