

import ua.kvelinskyi.HibernateSessionFactory;
import ua.kvelinskyi.commands.user.CommandsAssistant;
import ua.kvelinskyi.entitys.UsersEntity;
import java.util.List;

public class Main {

    public static void main(final String[] args) throws Exception {

        /*SessionFactory sessionFactory = (SessionFactory)
                Persistence.createEntityManagerFactory
                        ("org.hibernate.tutorial.jpa");
        EntityManager entityManager = sessionFactory.createEntityManager();

        entityManager.getTransaction().begin();
        UsersEntity user = new UsersEntity();
        user.setUserName("Rulon");
        user.setRole("Admin");
        user.setLogin("admin1");
        user.setPassword("1");
        entityManager.persist(user);
        entityManager.getTransaction().commit();

        entityManager.close();*/



//        UsersEntity usersEntity = new UsersEntity("login2", "password", "userName", "user");
//        commandCRUD.CreateUser(usersEntity);
//CommandsCRUD commandCRUD = new CommandsCRUD();
//        PhoneBookEntity phoneBookEntity = new PhoneBookEntity();
       /* System.out.println("2-----------------------------------------");
        HibernateSessionFactory.getInstance().createEntityManager();

        EntityManager e = HibernateSessionFactory.getInstance().getEntityManager();

        e.getTransaction().begin();
        UsersEntity u = (UsersEntity) e.createQuery("select u from UsersEntity u where u.id=1").getResultList().get(0);

        System.out.println(u);
        e.getTransaction().commit();
        e.close();

        HibernateSessionFactory.getInstance().createEntityManager();

        e = HibernateSessionFactory.getInstance().getEntityManager();

        e.getTransaction().begin();
        UsersEntity u1 = (UsersEntity) e.createQuery("select u from UsersEntity u where u.id=1").getResultList().get(0);

        System.out.println(u1);
        e.getTransaction().commit();
e.close();*/

        HibernateSessionFactory.getInstance().createEntityManager();
        CommandsAssistant commandsAssistant = new CommandsAssistant();
        System.out.println("1-----------------------------------------");
        List<UsersEntity> list = commandsAssistant.listAllUsers();
        HibernateSessionFactory.getInstance().endEntityManager();

        System.out.println("3-----------------------------------------");
        HibernateSessionFactory.getInstance().createEntityManager();
        //UsersEntity usersEntity1= HibernateSessionFactory.getInstance().getEntityManager().find(UsersEntity.class,1);
        //UsersEntity usersEntity2= HibernateSessionFactory.getInstance().getEntityManager().find(UsersEntity.class,2);
        //UsersEntity usersEntity3= HibernateSessionFactory.getInstance().getEntityManager().find(UsersEntity.class,3);
        List<UsersEntity> list2 = commandsAssistant.listAllUsers();
        HibernateSessionFactory.getInstance().endEntityManager();
        list.forEach(System.out::println);
        list2.forEach(System.out::println);

        HibernateSessionFactory.getInstance().endSessionFactory();


    }
}