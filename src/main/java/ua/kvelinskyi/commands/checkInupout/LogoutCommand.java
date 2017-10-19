package ua.kvelinskyi.commands.checkInupout;

import ua.kvelinskyi.commands.interfaces.Command;
import ua.kvelinskyi.commands.interfaces.IRequestWrapper;

import javax.servlet.http.HttpSession;

/**
 * Completion of the session.
 * @author I.K.
 */

public class LogoutCommand implements Command {
    @Override
    public String execute(IRequestWrapper wrapper){
        HttpSession session = wrapper.getSession(true);
        String path = "/jsp/index.jsp";
        //TODO remove comment
//        session.invalidate();
        return path;
    }
}
