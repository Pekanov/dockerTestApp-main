package ru.uni;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("uni")
public class Controller {
    public Controller() {
    }

    @GetMapping(value = "hello")
    public String sendMessage() {
        return "hello, dude!";
    }

}
