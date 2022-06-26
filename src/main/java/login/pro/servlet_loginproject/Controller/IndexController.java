package login.pro.servlet_loginproject.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class IndexController {
    @RequestMapping(value = "/")
    public String index(Model model) {
        model.addAttribute("user", new User());
        return "index";
    }


    @PostMapping(value = "/login")
    public String login(@ModelAttribute("userdata")User user,Model mouser) {
        ArrayList<String> list = new ArrayList<>();
        if (user.getUsername().equalsIgnoreCase("hamidreza") && user.getPassword().equalsIgnoreCase("123")) {
            list.add(user.getUsername());
            mouser.addAttribute("data", list.get(0));
            return "content";
        } else {
            return "content2";
        }
    }

}
