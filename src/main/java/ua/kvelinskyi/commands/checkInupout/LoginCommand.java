package ua.kvelinskyi.commands.checkInupout;

import ua.kvelinskyi.HibernateSessionFactory;
import ua.kvelinskyi.commands.user.CommandsAssistant;
import ua.kvelinskyi.commands.interfaces.Command;
import ua.kvelinskyi.commands.interfaces.IRequestWrapper;
import ua.kvelinskyi.entitys.UsersEntity;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * 1.User authentication.
 * 2.User identification(admin or user) and account entry.
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
        HibernateSessionFactory.getInstance().createEntityManager();
        CommandsAssistant commandsAssistant = new CommandsAssistant();
//        List<UsersEntity> listAllUsers = commandsAssistant.listAllUsers();
        if (commandsAssistant.isExist(user)) {
//            user = commandsAssistant.getUserData(user);
            session.setAttribute("user", user);
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
