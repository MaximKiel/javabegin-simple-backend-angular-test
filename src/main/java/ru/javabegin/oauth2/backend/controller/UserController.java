package ru.javabegin.oauth2.backend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.javabegin.oauth2.backend.dto.DataResult;
import ru.javabegin.oauth2.backend.dto.UserData;

import java.util.Random;
import java.util.UUID;

@RestController
@RequestMapping("/user") // базовый URI
public class UserController {

    @PostMapping("/data")
    public ResponseEntity<DataResult> user(@RequestBody UserData userData) {
        System.out.println("email: " + userData.getEmail());
        DataResult dataResult = new DataResult();

        Random random = new Random();
        dataResult.setFollowers(random.nextInt(100));
        dataResult.setFollowing(random.nextInt(1000));
        return ResponseEntity.ok(dataResult);
    }

}
