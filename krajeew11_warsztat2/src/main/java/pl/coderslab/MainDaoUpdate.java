package pl.coderslab;

public class MainDaoUpdate {

    public static void main(String[] args) {

        //public void update
        UserDao userDao = new UserDao();

        User userToUpdate = userDao.read(1);
        userToUpdate.setUserName("Arkadiusz");
        userToUpdate.setEmail("arek@coderslab.pl");
        userToUpdate.setPassword("superPassword");
        userDao.update(userToUpdate);
    }
}
