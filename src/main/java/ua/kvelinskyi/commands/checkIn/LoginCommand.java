package ua.kvelinskyi.commands.checkIn;

import ua.kvelinskyi.Dao.impl.GenericDaoHibernateImpl;
import ua.kvelinskyi.HibernateSessionFactory;
import ua.kvelinskyi.commands.CommandListUsers;
import ua.kvelinskyi.commands.interfaces.Command;
import ua.kvelinskyi.commands.interfaces.IRequestWrapper;
import ua.kvelinskyi.entitys.UsersEntity;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * 1.User authentication.
 * 2.User identification(librarian or user) and account entry.
 *
 * @author I.K.
*/

public class LoginCommand implements Command {

    @Override
    public String execute(IRequestWrapper wrapper) {
        HttpSession session = wrapper.getSession(true);
        String login = wrapper.getParameter("login");
        String password = wrapper.getParameter("password");
        UsersEntity user = new UsersEntity();
        user.setLogin(login);
        user.setPassword(password);
        String path;
//        HibernateSessionFactory.getInstance();
//        HibernateSessionFactory.getInstance().createEntityManager();
        HibernateSessionFactory.getInstance().createEntityManager();
        CommandListUsers commandListUsers = new CommandListUsers();
        List<UsersEntity> list = commandListUsers.listAllUsers();
        session.setAttribute("list", list);
//        HibernateSessionFactory.getInstance().endEntityManager();
//        GenericDaoHibernateImpl<UsersEntity,Integer> genericDaoHibernateUser = new GenericDaoHibernateImpl<>(UsersEntity.class);
        if (true) {
//            user = userDao.getUserData(user);

            path = "/jsp/userPages/mainUserPage.jsp";
            return path;
/*           CommandSessionHelper.setUserSessionAttributes(wrapper, user);
            if (genericDaoHibernateUser.isAdmin(user)) {
                session.setAttribute("requestStatus", "Choose");
                path = "/jsp/librarianPages/mainLibrarianPage.jsp";
                return path;
            } else {
                path = "/jsp/userPages/mainUserPage.jsp";
                return path;
            }*/
        } else {
            path = "/jsp/errorPage.jsp";
            return path;
        }
    }
}
