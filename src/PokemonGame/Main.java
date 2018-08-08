package PokemonGame;

import java.io.IOException;


import static PokemonGame.PokemonUtils.displayPokemon;

public class Main {
    // This class contains the main method, the game will run from here

    public static void main(String[] args) throws IOException {
        GuessingGame theGame = new GuessingGame();
        theGame.instructions(); // How to play
        theGame.setUp(); // creating Objects
        theGame.game(); // game logic
        theGame.results(); //sorted
    }
}
