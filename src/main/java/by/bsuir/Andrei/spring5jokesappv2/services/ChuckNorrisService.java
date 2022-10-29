package by.bsuir.Andrei.spring5jokesappv2.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    @Autowired
    public ChuckNorrisService() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    public String getRandomJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}

