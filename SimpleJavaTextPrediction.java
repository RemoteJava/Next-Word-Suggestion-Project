//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class SimpleJavaTextPrediction {
    public static void main(String[] args) {
        //these are the lists that will have words added to them.
        String input1 = "to";
        String input2 = "sounds";
        String input3 = "if";
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a word: ");

        boolean[] phrasesToList = new boolean[0];



        for(int i = 0; i < phrasesToList.length; i++){
            String s = myObj.next();
            System.out.println(phrasesToList[i]);



            }
        }

    public static String[] generatePredictedText(String input, String in, String input3, boolean caseSensitive) {
        String[] listOfPhrases = getWords("sounds");

        return listOfPhrases;
    }

    public static String[] generatedPhraseList(String userInput, String[] listOfPhrases, boolean caseSensitive) {
        ArrayList<String> phrases = new ArrayList();

        for (int i = 0; i < listOfPhrases.length; i++) {
            if (caseSensitive) {
                if (listOfPhrases[i].startsWith(userInput)) {
                    phrases.add(listOfPhrases[i]);
                }

            } else {
                if (listOfPhrases[i].toUpperCase().startsWith(userInput.toUpperCase())) {
                    phrases.add(listOfPhrases[i]);
                }
            }

        }
        return phrases.toArray(new String[0]);
    }

    public static <fileReader> String[] getWords(String filepath) {
        ArrayList<String> phrases = new ArrayList();

        try {
            FileReader fileReader = new FileReader(filepath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String currentLine;

            While((currentLine = bufferedReader.readLine()) != null);
            {
                phrases.add(currentLine);
            }
            bufferedReader.close();

            Collections.sort(phrases);
        } catch (Exception e) {
            phrases.add(e.toString());
        }
        return phrases.toArray(new String[0]);
    }

    private static void While(boolean b) {
    }
}

