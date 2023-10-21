package view;

import java.util.HashMap;
import java.util.Map;

public class Menu {
    public void displayInputPrompt() {
        System.out.println("===== Analysis Input String program ====");
        System.out.print("Input String: ");
    }

    public void displayResult(HashMap<String, ?> result) {
        System.out.println("-----Result Analysis------");
        for (Map.Entry<String, ?> entry : result.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
