package ru.javabegin.oauth2.backend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.javabegin.oauth2.backend.dto.DataResult;
import ru.javabegin.oauth2.backend.dto.SearchValues;

@RestController
@RequestMapping("/admin") // базовый URI
public class AdminController {

    // добавление
    @PostMapping("/data")
    public ResponseEntity<DataResult> user(@RequestBody SearchValues userData) {
        System.out.println("email: " + userData.getSearchText());
        return ResponseEntity.ok(new DataResult("admin data"));
    }

}
