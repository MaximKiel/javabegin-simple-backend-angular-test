package ru.javabegin.oauth2.backend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.javabegin.oauth2.backend.dto.DataResult;
import ru.javabegin.oauth2.backend.dto.UserData;

@RestController
@RequestMapping("/user") // базовый URI
public class UserController {

    @PostMapping("/data")
    public ResponseEntity<DataResult> user(@RequestBody UserData userData) {
        System.out.println("email: " + userData.getEmail());
        return ResponseEntity.ok(new DataResult("user data"));
    }

}
