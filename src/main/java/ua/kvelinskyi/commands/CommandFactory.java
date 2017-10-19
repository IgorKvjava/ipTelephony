package ua.kvelinskyi.commands;

import ua.kvelinskyi.commands.checkIn.LoginCommand;
import ua.kvelinskyi.commands.interfaces.Command;
import ua.kvelinskyi.commands.interfaces.IRequestWrapper;

import javax.naming.NamingException;
import java.util.HashMap;
import java.util.Map;

/**
 * This class is Singleton and it is Factory from Factory pattern.
 * It includes only one method, getCommand which extracts value with name "do" from request and gets
 * needed command from commandMap and returns it.
 * @author I.K.
 */


public class CommandFactory {
   // private static final Logger LOGGER = Logger.getLogger(CommandFactory.class);
    private static Map<String, Command> commandMap = new HashMap<String, Command>();
    private static CommandFactory instance = null;

    public CommandFactory() throws NamingException {
    }

    public  static  synchronized CommandFactory getInstance(){
        if(instance == null){
            try {
                instance = new CommandFactory();
            } catch (NamingException e) {
               // LOGGER.error("NamingException", e);
            }
        }
        return instance;
    }

    static {
        commandMap.put("login", new LoginCommand());
        commandMap.put("exit", new LogoutCommand());
        /*commandMap.put("SignUp", new SignUpCommand());
        commandMap.put("SingPass", new CheckInCommand());
        commandMap.put("edit", new UpdateUserProfileCommand());

        commandMap.put("listUsers", new ListClientsCommand());
        commandMap.put("clientSearch", new ClientSearchCommand());
        commandMap.put("choiceGenres", new ChoiceGenreCommand());
        commandMap.put("orderBooks", new OrderBooksCommand());
        commandMap.put("showUserOrderBooks", new ShowUserOrderBooksCommand());
        commandMap.put("changeLanguage", new ChangeLanguageCommand());
        commandMap.put("mainUserPage", new MainUserPageCommand());
        commandMap.put("placeOrder", new PlaceOrderCommand());
        commandMap.put("catalogueBooks", new CatalogueBooksCommand());
        commandMap.put("listBooksGenre", new ListBooksGenreCommand());
        commandMap.put("choiceBooksUsers", new ChoiceBooksUsers());*/
    }

    public static Command getCommand(IRequestWrapper wrapper){
        String result = wrapper.getParameter("do");
        return commandMap.get(result);
    }

}
