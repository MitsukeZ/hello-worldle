package src.game.utils;

import java.util.Scanner;

public class UserInputReader {
    private Scanner sc;
    private boolean closed;
    
    public UserInputReader() {
        this.sc     = new Scanner(System.in);
        this.closed = false;
    }
    
    public String getUserInput() {
        if (this.closed) {return "";}
        
        String sInput = "";
        sInput = this.sc.nextLine();
        
        return sInput;
    }

    public void close() {sc.close(); this.closed = true;}
}
