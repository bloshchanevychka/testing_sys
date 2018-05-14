package com.iasa.tests.controller.command;

import com.iasa.tests.service.logger.MyLogger;
import org.apache.log4j.Logger;
public class LoginCommand implements ICommand{

    private static final Logger LOGGER = MyLogger.getLOGGER(LoginCommand.class);
    private static final String LOGIN = "login";
    private static final String PASSWORD = "password";
    private String page;
    private String language;
    private boolean access;
    //private Locale locale;

   // @Override
   /* public String execute(HttpServletRequest request, HttpServletResponse response) {
        LOGGER.info("Login command was chosen.");
        String login = request.getParameter(LOGIN);
        String password = request.getParameter(PASSWORD);
        AuthService authService = new AuthServiceImpl();

        Validator validator = new Validator();
        validator.setLogin(login);
        validator.setPassword(password);

        language = (String) request.getSession().getAttribute("language");
        LOGGER.info("Current language: " + language);
        if (language!=null){
            locale = new Locale(language);
            validator.setLocale(locale);
        }

        if (validator.isValidLogin()) {
            access=authService.getAccess(login, password);
            LOGGER.info("If such login and password is present in database.");
            if (access) {
                LOGGER.info("Login and password are present in database.");
                try {
                    request.getSession().setAttribute("user", authService.login(login, password));
                } catch (NoSuchUserException e) {
                    LOGGER.error("There is no such User in database. ", e);
                }
                page = ConfigManager.getInstance().getProperty(ConfigManager.getMAIN());
            } else {
                LOGGER.info("Login and password are not present in database.");
                request.setAttribute("errorPassMessage", MessageManager.getInstance().
                        getProperty(MessageManager.getLoginError()));
                page = ConfigManager.getInstance().getProperty(ConfigManager.getLOGIN());
            }
        } else {
            LOGGER.info("Data entered by User are invalid.");
            request.setAttribute("validator", validator);
            page = ConfigManager.getInstance().getProperty(ConfigManager.getLOGIN());
        }
        return page;
    }
    */
}
