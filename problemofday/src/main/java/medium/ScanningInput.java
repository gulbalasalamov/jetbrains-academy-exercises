package medium;

import java.util.Scanner;

/**
 * hyperskill.org/learn/daily/9057
 *
 * Imagine that you are an HR manager at a restaurant and you need to hire a chef. To do that, you need to collect some preliminary data about the candidates.
 * You have a special form for the candidates that includes 3 fields: first name, years of experience and cuisine preference.
 * Your program should read all the words (or numbers) from the three lines and output "The form for first name is completed.
 * We will contact you if we need a chef who cooks cuisine preference dishes and has years of experience years of experience."
 *
 *
 * Sample Input 1:
 * Eugene
 * 8
 * fusion
 * Sample Output 1:
 * The form for Eugene is completed. We will contact you if we need a chef who cooks fusion dishes and has 8 years of experience.
 */
public class ScanningInput {
    static String collectData(Scanner scannner) {
        String firstName = "";
        String cuisinePreference = "";
        int yearsOfExperience = 0;
        try (scannner) {
            firstName = scannner.nextLine();
            yearsOfExperience = scannner.nextInt();
            cuisinePreference = scannner.next();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "The form for " + firstName + " is completed." +
                " We will contact you if we need a chef who cooks " + cuisinePreference + " dishes and has " +
                yearsOfExperience + " years of experience.";
    }
}
