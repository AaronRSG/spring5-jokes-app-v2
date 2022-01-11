package guru.springframework.services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class GuruJokeServiceImpl implements GuruJokeService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public GuruJokeServiceImpl(){
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
    
    
}
