package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HomeController {

    @GetMapping("/")
    public String welcome() {
        return "<h1>Hey BITBEE, Now you logged in with your custom credentials</h1>";
    }
}
