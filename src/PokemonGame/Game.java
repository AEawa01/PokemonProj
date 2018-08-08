package PokemonGame;

import java.io.IOException;

public interface Game {
    void setUp();
    void instructions() throws IOException;
    void game() throws IOException;
    void results();

}
