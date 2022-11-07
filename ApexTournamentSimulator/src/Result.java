import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Result extends Logic {
    static List<String> game1 = new ArrayList<>();
    static List<String> game2 = new ArrayList<>();
    static List<String> game3 = new ArrayList<>();
    static List<String> game4 = new ArrayList<>();
    static List<String> game5 = new ArrayList<>();
    public static void scoreCounter() {


        Collections.reverse(firstGame);
        for (int i = 0; i < firstGame.size(); i++) {
            String team = firstGame.get(i);
            int indexOfTeam = firstGame.indexOf(team);
            if (indexOfTeam == 0) {
                String result = team + " - " + Constants.TOP_1;
                game1.add(team);
            }
            if (indexOfTeam == 1) {
                String result = team + " - " + Constants.TOP_2;
                game1.add(team);
            }
            if (indexOfTeam == 2) {
                String result = team + " - " + Constants.TOP_3;
                game1.add(team);
            }
            if (indexOfTeam == 3) {
                String result = team + " - " + Constants.TOP_4;
                game1.add(team);
            }
            if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                String result = team + " - " + Constants.TOP_9_5;
                game1.add(team);
            }
            if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                String result = team + " - " + Constants.TOP_14_10;
                game1.add(team);
            }
            if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                String result = team + " - " + Constants.TOP_20_15;
                game1.add(team);
            }
        }


        Collections.reverse(secondGame);
        for (int i = 0; i < secondGame.size(); i++) {
            String team = secondGame.get(i);
            int indexOfTeam = secondGame.indexOf(team);
            if (indexOfTeam == 0) {
                String result = team + " - " + Constants.TOP_1;
                game2.add(team);
            }
            if (indexOfTeam == 1) {
                String result = team + " - " + Constants.TOP_2;
                game2.add(team);
            }
            if (indexOfTeam == 2) {
                String result = team + " - " + Constants.TOP_3;
                game2.add(team);
            }
            if (indexOfTeam == 3) {
                String result = team + " - " + Constants.TOP_4;
                game2.add(team);
            }
            if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                String result = team + " - " + Constants.TOP_9_5;
                game2.add(team);
            }
            if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                String result = team + " - " + Constants.TOP_14_10;
                game2.add(team);
            }
            if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                String result = team + " - " + Constants.TOP_20_15;
                game2.add(team);
            }
        }

        Collections.reverse(thirdGame);
        for (int i = 0; i < thirdGame.size(); i++) {
            String team = thirdGame.get(i);
            int indexOfTeam = thirdGame.indexOf(team);
            if (indexOfTeam == 0) {
                String result = team + " - " + Constants.TOP_1;
                game3.add(team);
            }
            if (indexOfTeam == 1) {
                String result = team + " - " + Constants.TOP_2;
                game3.add(team);
            }
            if (indexOfTeam == 2) {
                String result = team + " - " + Constants.TOP_3;
                game3.add(team);
            }
            if (indexOfTeam == 3) {
                String result = team + " - " + Constants.TOP_4;
                game3.add(team);
            }
            if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                String result = team + " - " + Constants.TOP_9_5;
                game3.add(team);
            }
            if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                String result = team + " - " + Constants.TOP_14_10;
                game3.add(team);
            }
            if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                String result = team + " - " + Constants.TOP_20_15;
                game3.add(team);
            }
        }

        Collections.reverse(fourthGame);
        for (int i = 0; i < fourthGame.size(); i++) {
            String team = fourthGame.get(i);
            int indexOfTeam = fourthGame.indexOf(team);
            if (indexOfTeam == 0) {
                String result = team + " - " + Constants.TOP_1;
                game4.add(team);
            }
            if (indexOfTeam == 1) {
                String result = team + " - " + Constants.TOP_2;
                game4.add(team);
            }
            if (indexOfTeam == 2) {
                String result = team + " - " + Constants.TOP_3;
                game4.add(team);
            }
            if (indexOfTeam == 3) {
                String result = team + " - " + Constants.TOP_4;
                game4.add(team);
            }
            if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                String result = team + " - " + Constants.TOP_9_5;
                game4.add(team);
            }
            if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                String result = team + " - " + Constants.TOP_14_10;
                game4.add(team);
            }
            if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                String result = team + " - " + Constants.TOP_20_15;
                game4.add(team);
            }
        }

        Collections.reverse(fifthGame);
        for (int i = 0; i < fifthGame.size(); i++) {
            String team = fifthGame.get(i);
            int indexOfTeam = fifthGame.indexOf(team);
            if (indexOfTeam == 0) {
                String result = team + " - " + Constants.TOP_1;
                game5.add(team);
            }
            if (indexOfTeam == 1) {
                String result = team + " - " + Constants.TOP_2;
                game5.add(team);
            }
            if (indexOfTeam == 2) {
                String result = team + " - " + Constants.TOP_3;
                game5.add(team);
            }
            if (indexOfTeam == 3) {
                String result = team + " - " + Constants.TOP_4;
                game5.add(team);
            }
            if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                String result = team + " - " + Constants.TOP_9_5;
                game5.add(team);
            }
            if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                String result = team + " - " + Constants.TOP_14_10;
                game5.add(team);
            }
            if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                String result = team + " - " + Constants.TOP_20_15;
                game5.add(team);
            }
        }
        /*System.out.println("Результаты первой игры: " + game1);
        System.out.println("Результаты второй игры: " + game2);
        System.out.println("Результаты третьей игры: " + game3);
        System.out.println("Результаты четвертой игры: " + game4);
        System.out.println("Результаты финальной игры: " + game5);*/
    }
}