package com.kasprzak.kamil.eureka.socialappeureka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("api/auth")
public class AccountsController {

    private final AccountsClient accountsClient;

    @Autowired
    public AccountsController(AccountsClient accountsClient) {
        this.accountsClient = accountsClient;
    }

    @PostMapping(path = "login",  consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public String login(@RequestParam MultiValueMap<String,String> request, Model model) {
        model.addAttribute("login", accountsClient.login(request));
        return "login-v";
    }

    @PostMapping(path = "register")
    public String register(@RequestBody LoginRequest request, Model model) {
        model.addAttribute("register", accountsClient.register(request));
        return "reiguster-v";
    }
}
