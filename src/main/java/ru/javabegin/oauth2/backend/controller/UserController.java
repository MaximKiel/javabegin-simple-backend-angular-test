package ru.javabegin.oauth2.backend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.javabegin.oauth2.backend.dto.DataResult;
import ru.javabegin.oauth2.backend.dto.SearchValues;

import java.util.UUID;

@RestController
@RequestMapping("/user") // базовый URI
public class UserController {

    @PostMapping("/data")
    public ResponseEntity<DataResult> user(@RequestBody SearchValues searchValues) {
        System.out.println("searchValues: " + searchValues.getSearchText());

        // эмуляция работы - как будто сервер возвращает данные конкретного пользователя
        // в боевом приложении конечно данные будут запрашиваться из БД
        return ResponseEntity.ok(new DataResult(UUID.randomUUID().toString()));
    }
}