package com.kasprzak.kamil.eureka.socialappeureka;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "Accounts")
public interface AccountsClient {
    @PostMapping("/api/auth/login")
    LoginResponse login(@RequestParam MultiValueMap<String,String> paramMap);

    @PostMapping("/api/auth/register")
    LoginResponse register(@RequestBody LoginRequest request);
}
