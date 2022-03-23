package pl.coderslab;

public class MainDao {

    public static void main(String[] args) {

        UserDao userDao = new UserDao();
        //public User create
        User user = new User();
        user.setUserName("damian");
        user.setEmail("damian.wasik@coderslab.pl");
        user.setPassword("pass");
        userDao.create(user);

        //public User read
        User read = userDao.read(12);
        System.out.println(read);

        User readNotExist = userDao.read(13);
        System.out.println(readNotExist);

        //public void update
        User userToUpdate = userDao.read(1);
        userToUpdate.setUserName("Arkadiusz");
        userToUpdate.setEmail("arek@coderslab.pl");
        userToUpdate.setPassword("superPassword");
        userDao.update(userToUpdate);


        //public User[] findAll()
//        User secondUser = new User();
//        secondUser.setUserName("czesiek");
//        secondUser.setEmail("czesiek@coderslab.pl");
//        secondUser.setPassword("pass");
//        userDao.create(secondUser);
        User[] all = userDao.findAll();
        for (User u : all) {
            System.out.println(u);

            //public void delete
        userDao.delete(1);
        userDao.delete(2);
        userDao.delete(3);
        userDao.delete(4);
        userDao.delete(5);
        }
    }
}
