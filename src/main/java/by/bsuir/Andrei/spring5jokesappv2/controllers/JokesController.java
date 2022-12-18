package by.bsuir.Andrei.spring5jokesappv2.controllers;

import by.bsuir.Andrei.spring5jokesappv2.services.ChuckNorrisService;
import by.bsuir.Andrei.spring5jokesappv2.services.ChuckNorrisServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JokesController {

    private final ChuckNorrisService chuckNorrisService;

    public JokesController(ChuckNorrisService chuckNorrisService) {
        this.chuckNorrisService = chuckNorrisService;
    }

    @GetMapping(value = {"", "/"})
    public String getJoke(Model model) {
        String joke = chuckNorrisService.getRandomJoke();
        model.addAttribute("joke", joke);
        return "index";
    }
}
