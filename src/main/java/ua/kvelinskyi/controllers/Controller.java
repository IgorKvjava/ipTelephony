package ua.kvelinskyi.controllers;


import ua.kvelinskyi.commands.CommandFactory;
import ua.kvelinskyi.commands.RequestWrapper;
import ua.kvelinskyi.commands.interfaces.Command;
import ua.kvelinskyi.commands.interfaces.IRequestWrapper;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * The Handler class is HTTP servlet.It extends from HttpServlet class and,
 * overrides two his methods:
 * 1.protected void doGet(HttpServletRequest request, HttpServletResponse response),
 * 2.protected void doPost(HttpServletRequest request, HttpServletResponse response).
 * Also he has his own method, which works with users request and response.
 *
 * @author I.K.
 */

public class Controller extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        IRequestWrapper wrapper = new RequestWrapper(request);
        Command command = CommandFactory.getInstance().getCommand(wrapper);
        String path= command.execute(wrapper);
        RequestDispatcher rd=request.getRequestDispatcher(path);
        rd.forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

}
