package ua.kvelinskyi.commands.checkInupout;


import ua.kvelinskyi.commands.interfaces.Command;
import ua.kvelinskyi.commands.interfaces.IRequestWrapper;
import ua.kvelinskyi.entitys.UsersEntity;

import javax.servlet.http.HttpSession;

/**
 * Sign up.
 * Login duplication check in the database.
 * Create an object of a new user
 * or output the error message "Login used."
 * @author I.K.
 */
public class SignUpCommand implements Command {
    @Override
    public String execute(IRequestWrapper wrapper) {
        HttpSession session = wrapper.getSession(true);
        String login = wrapper.getParameter("login");
        session.setAttribute("login", login);
        UsersEntity user= new UsersEntity();
        user.setLogin(login);
//        FactoryDAO factory = FactoryDAO.getInstance();
//        UserDAO userDao = factory.getUsersDAO();
        if (true) {
            session.setAttribute("login_used", "LoginUsed");
            String path = "/jsp/registration.jsp";
            return path;
        } else {
            session.setAttribute("user", user);
            String path = "/jsp/password.jsp";
            return path;
        }
    }
}
