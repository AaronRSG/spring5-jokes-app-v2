package guru.springframework.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.services.GuruJokeService;

@Controller
public class GuruJokeController {
    private final GuruJokeService guruJokeService;

    public GuruJokeController(GuruJokeService guruJokeService) {
        this.guruJokeService = guruJokeService;
    }

    @RequestMapping("/guru")
    public String showJoke(Model model){
        model.addAttribute("gurujoke", guruJokeService.getJoke());
        return "guru";
    }
}
