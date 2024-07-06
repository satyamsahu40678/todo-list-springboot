package org.example.webapp.login;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    public boolean authenticate(String username, String password) {
        boolean isValidUsername = username.equalsIgnoreCase("nerdy");
        boolean isValidPassword = password.equalsIgnoreCase("hello123");
        return isValidUsername && isValidPassword;
    }
}
