package ua.kvelinskyi.servlets;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class LoginServlet  {
    @RequestMapping(value = "mainUserPage", method = RequestMethod.POST)
    public String manageMainPage(@RequestParam("login") String login,
                                  @RequestParam("password") String password,
                                  HttpSession session, Model model) {
        session.setAttribute("login", login);
        session.setAttribute("password", password);
        return "/userPages/mainUserPage";
    }

    @RequestMapping(value = "registrationPage", method = RequestMethod.GET)
    public String manageRegistrationPage(@RequestParam("login")String param,
                                  HttpSession session) {
        session.setAttribute("login", param);
        return "registration";
    }
    @RequestMapping(value = "passwordPage", method = RequestMethod.POST)
    public String managePasswordPage(@RequestParam("login")String param,
                                         HttpSession session) {
        session.setAttribute("login", param);
        return "password";
    }
    @RequestMapping(value = "userEditPage", method = RequestMethod.POST)
    public String manageUserEditPage(@RequestParam("password") String password,
                                     HttpSession session, Model model) {
        session.setAttribute("password", password);
        return "/userPages/userEditDataPage";
    }
    @RequestMapping(value = "indexPage", method = RequestMethod.GET)
    public String manageIndexPage(@RequestParam("param")String param,
                                  HttpSession session) {
        session.setAttribute("login", param);
        return "index";
    }
}
