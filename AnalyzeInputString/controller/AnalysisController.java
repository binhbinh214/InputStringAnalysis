package controller;

import java.util.HashMap;
import java.util.List;

import model.AnalysisMethods;
import view.Menu;

public class AnalysisController {
    private AnalysisMethods model;
    public Menu view;

    public AnalysisController() {
        this.model = new AnalysisMethods();
        this.view = new Menu();
    }

    public void analyzeInput(String input) {
        HashMap<String, List<Integer>> numberAnalysis = model.getNumber(input);
        HashMap<String, StringBuilder> characterAnalysis = model.getCharacter(input);

        view.displayResult(numberAnalysis);
        view.displayResult(characterAnalysis);
    }
}