package src.game;

import src.game.utils.HelloWorld;
import src.game.utils.UserInputReader;

public class Game {
    private HelloWorld      helloWorld;
    private int             nbEssaisRestants;
    private UserInputReader inputReader;
    
    public Game() {
        this.helloWorld       = new HelloWorld();
        this.nbEssaisRestants = 5;
        this.inputReader      = new UserInputReader();
    }

    public void run() {
        String userGuess = "";
        System.out.println(this.helloWorld);
        
        while (this.nbEssaisRestants > 0 && !this.helloWorld.equals(userGuess)) {
            
            System.out.println("En quel langage a été écrit ce code ? (Essai " + (5-this.nbEssaisRestants) + "/5)");
            userGuess = this.inputReader.getUserInput();
            this.nbEssaisRestants--;
        }

        if (this.nbEssaisRestants < 0) {System.out.println("Perdu ! La réponse était " + this.helloWorld.getReponse());}
        else  {System.out.println("Bien vu !");}

        this.inputReader.close(); 
    }
}
