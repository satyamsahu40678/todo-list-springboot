package org.example.webapp.login;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;


@Controller
@SessionAttributes("name") //to ensure this name attribute always get during the sessiomn
public class WelcomeController {
//    private Logger logger = LoggerFactory.getLogger(getClass());
    //login
    //http://localhost:8080/login?name=Satyam  //understanding Request param
    //Model - whenever we want anything to available for my jsp i can add it to model


//    private AuthenticationService authenticationService;
//
//    @Autowired
//    public LoginController(AuthenticationService authenticationService) {
//        this.authenticationService = authenticationService;
//    }


//    Right now it is handling both the request GET adn POST so i need to make it restricted to only GET request do changes as
    @RequestMapping(value="/", method = RequestMethod.GET)
    public String gotoWelcomePage(ModelMap model){
        model.put("name", getLoggedinUserName());
        return "welcome";
    }

    //login?name="name" RequestParam
//    @RequestMapping(value="login", method = RequestMethod.POST)
//    public String welcome(@RequestParam String name, @RequestParam String password, ModelMap model){
//        if (authenticationService.authenticate(name, password)){
//        model.put("name", name);
////        model.put("password", password);
//        return "welcome";
//        }
//
//        model.put("errorMessage", "Invalid username or password please try again");
//        return "login";
//    }


    private String getLoggedinUserName(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return authentication.getName();
    }
}
