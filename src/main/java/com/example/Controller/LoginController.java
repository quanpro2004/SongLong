package com.example.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.service.UserService;
import com.example.model.User;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String showLoginForm() {
        return "login"; 
    }

    @PostMapping("/login")
    public String processLogin(@RequestParam("username") String username,
                               @RequestParam("password") String password,
                               Model model) {
        User user = userService.findByUsernameAndPassword(username, password);
        if (user != null) {
            model.addAttribute("username", username);
            System.out.println("Username: " + username);
            System.out.println("Password: " + password);
            return "login_success";
        } else {
            model.addAttribute("error", "Tên đăng nhập hoặc mật khẩu không đúng. Vui lòng thử lại!");
            return "login"; 
        }
    }
}
