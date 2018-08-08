package PokemonGame;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PlayerQueue {
    private Queue<Player> playerQueue = new LinkedList<>();

    public boolean addPlayer(Player user){
        return playerQueue.add(user);
    }

    public Player removePlayer(){
        return playerQueue.remove();
    }

    public int size(){ return playerQueue.size(); }

    public boolean isEmpty(){ return  playerQueue.isEmpty(); }


}
