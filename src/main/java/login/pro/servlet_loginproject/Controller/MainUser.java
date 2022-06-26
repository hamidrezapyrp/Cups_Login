package login.pro.servlet_loginproject.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainUser {
    @PostMapping(value = "/param")
    public String param(@RequestParam(value = "username")String username,@RequestParam(value = "password")String password){
        return username + " " + password;
    }
    @PostMapping(value = "/body")
    public String body(@RequestBody String body){
        return body;
    }
}
