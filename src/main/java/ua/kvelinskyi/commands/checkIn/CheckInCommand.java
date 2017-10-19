package ua.kvelinskyi.commands.checkIn;


import ua.kvelinskyi.commands.interfaces.Command;
import ua.kvelinskyi.commands.interfaces.IRequestWrapper;
import ua.kvelinskyi.entitys.UsersEntity;

import javax.servlet.http.HttpSession;

/**
 * Store the password in the User object and
 * create this user in the database.
 *
 * @author I.K.
 */
public class CheckInCommand implements Command {

    @Override
    public String execute(IRequestWrapper wrapper) {
        HttpSession session = wrapper.getSession(true);
        String password = wrapper.getParameter("password");
        UsersEntity user = (UsersEntity) session.getAttribute("user");
//        FactoryDAO factory = FactoryDAO.getInstance();
//        UserDAO userDao = factory.getUsersDAO();
            user.setPassword(password);
            if (false) {
 //               user = userDao.getUserData(user);
                session.setAttribute("user", user);
 //               CommandSessionHelper.setUserSessionAttributes(wrapper, user);
                String path = "/jsp/userPages/userEditDataPage.jsp";
                return path;
            } else {
                session.setAttribute("checkInUserMessage", "AnotherPassword");
                String path = "/jsp/password.jsp";
                return path;
            }
    }
}
