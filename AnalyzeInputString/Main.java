import java.util.Scanner;

import controller.AnalysisController;

public class Main {
    public static void main(String[] args) {
        AnalysisController controller = new AnalysisController();
        controller.view.displayInputPrompt();

        try (Scanner scanner = new Scanner(System.in)) {
            String input = scanner.nextLine();
            controller.analyzeInput(input);
        }
    }
}