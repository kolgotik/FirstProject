import java.util.*;

public class Winner extends Result {
    static String team;
    static int sum;
    static int res1 = 0;
    static int res2 = 0;
    static int res3 = 0;
    static int res4 = 0;
    static int res5 = 0, res6 = 0, res7 = 0, res8 = 0, res9 = 0, res10 = 0, res11 = 0, res12 = 0, res13 = 0, res14 = 0, res15 = 0, res16 = 0, res17 = 0, res18 = 0, res19 = 0, res20 = 0;
    static HashMap<String, Integer> winner = new HashMap<>();

    public static void winnerIdentifier() throws InterruptedException {

        winner.put("Team SoloMid", 0);
        winner.put("NRG Esports", 0);
        winner.put("Reignite", 0);
        winner.put("SCARZ", 0);
        winner.put("FURIA Esports", 0);
        winner.put("FENNEL", 0);
        winner.put("Team Liquid", 0);
        winner.put("Sentinels", 0);
        winner.put("Cloud9", 0);
        winner.put("Alliance", 0);
        winner.put("100 Thieves", 0);
        winner.put("Rogue", 0);
        winner.put("Natus Vincere", 0);
        winner.put("Gambit Esports", 0);
        winner.put("ZETA DIVISION", 0);
        winner.put("OpTic Gaming", 0);
        winner.put("Counter Logic Gaming", 0);
        winner.put("Riddle", 0);
        winner.put("Life Could be A Dream", 0);
        winner.put("T1", 0);

        List<String> list = new ArrayList<>();
        /*list.addAll(Result.game1);
        list.addAll(Result.game2);
        list.addAll(Result.game3);
        list.addAll(Result.game4);
        list.addAll(Result.game5);*/
        //Collections.sort(list);

        for (String key : winner.keySet()) {
            if (game1.indexOf(key) == 0) {
                winner.put(key, Constants.TOP_1);
            }
            if (game1.indexOf(key) == 1) {
                winner.put(key, Constants.TOP_2);
            }
            if (game1.indexOf(key) == 2) {
                winner.put(key, Constants.TOP_3);
            }
            if (game1.indexOf(key) == 3) {
                winner.put(key, Constants.TOP_4);
            }
            if (game1.indexOf(key) <= 8 && game1.indexOf(key) >= 4) {
                winner.put(key, Constants.TOP_9_5);
            }
            if (game1.indexOf(key) <= 13 && game1.indexOf(key) >= 9) {
                winner.put(key, Constants.TOP_14_10);
            }
            if (game1.indexOf(key) <= 19 && game1.indexOf(key) >= 14) {
                winner.put(key, Constants.TOP_20_15);
            }
            if (game2.indexOf(key) == 0) {
                winner.put(key, winner.get(key) + Constants.TOP_1);
            }
            if (game2.indexOf(key) == 1) {
                winner.put(key,winner.get(key) + Constants.TOP_2);
            }
            if (game2.indexOf(key) == 2) {
                winner.put(key,winner.get(key) + Constants.TOP_3);
            }
            if (game2.indexOf(key) == 3) {
                winner.put(key,winner.get(key) + Constants.TOP_4);
            }
            if (game2.indexOf(key) <= 8 && game2.indexOf(key) >= 4) {
                winner.put(key,winner.get(key) + Constants.TOP_9_5);
            }
            if (game2.indexOf(key) <= 13 && game2.indexOf(key) >= 9) {
                winner.put(key,winner.get(key) + Constants.TOP_14_10);
            }
            if (game2.indexOf(key) <= 19 && game2.indexOf(key) >= 14) {
                winner.put(key,winner.get(key) + Constants.TOP_20_15);
            }
            if (game3.indexOf(key) == 0) {
                winner.put(key, winner.get(key) + Constants.TOP_1);
            }
            if (game3.indexOf(key) == 1) {
                winner.put(key,winner.get(key) + Constants.TOP_2);
            }
            if (game3.indexOf(key) == 2) {
                winner.put(key,winner.get(key) + Constants.TOP_3);
            }
            if (game3.indexOf(key) == 3) {
                winner.put(key,winner.get(key) + Constants.TOP_4);
            }
            if (game3.indexOf(key) <= 8 && game3.indexOf(key) >= 4) {
                winner.put(key,winner.get(key) + Constants.TOP_9_5);
            }
            if (game3.indexOf(key) <= 13 && game3.indexOf(key) >= 9) {
                winner.put(key,winner.get(key) + Constants.TOP_14_10);
            }
            if (game3.indexOf(key) <= 19 && game3.indexOf(key) >= 14) {
                winner.put(key,winner.get(key) + Constants.TOP_20_15);
            }
            if (game4.indexOf(key) == 0) {
                winner.put(key, winner.get(key) + Constants.TOP_1);
            }
            if (game4.indexOf(key) == 1) {
                winner.put(key,winner.get(key) + Constants.TOP_2);
            }
            if (game4.indexOf(key) == 2) {
                winner.put(key,winner.get(key) + Constants.TOP_3);
            }
            if (game4.indexOf(key) == 3) {
                winner.put(key,winner.get(key) + Constants.TOP_4);
            }
            if (game4.indexOf(key) <= 8 && game4.indexOf(key) >= 4) {
                winner.put(key,winner.get(key) + Constants.TOP_9_5);
            }
            if (game4.indexOf(key) <= 13 && game4.indexOf(key) >= 9) {
                winner.put(key,winner.get(key) + Constants.TOP_14_10);
            }
            if (game4.indexOf(key) <= 19 && game4.indexOf(key) >= 14) {
                winner.put(key,winner.get(key) + Constants.TOP_20_15);
            }
            if (game5.indexOf(key) == 0) {
                winner.put(key, winner.get(key) + Constants.TOP_1);
            }
            if (game5.indexOf(key) == 1) {
                winner.put(key,winner.get(key) + Constants.TOP_2);
            }
            if (game5.indexOf(key) == 2) {
                winner.put(key,winner.get(key) + Constants.TOP_3);
            }
            if (game5.indexOf(key) == 3) {
                winner.put(key,winner.get(key) + Constants.TOP_4);
            }
            if (game5.indexOf(key) <= 8 && game5.indexOf(key) >= 4) {
                winner.put(key,winner.get(key) + Constants.TOP_9_5);
            }
            if (game5.indexOf(key) <= 13 && game5.indexOf(key) >= 9) {
                winner.put(key,winner.get(key) + Constants.TOP_14_10);
            }
            if (game5.indexOf(key) <= 19 && game5.indexOf(key) >= 14) {
                winner.put(key,winner.get(key) + Constants.TOP_20_15);
            }






       /* for (int i = 0; i < game1.size(); i++) {
            team = game1.get(i);
            int indexOfTeam = game1.indexOf(team);
            if (team.equalsIgnoreCase("Team SoloMid")) {
                if (indexOfTeam == 0) {
                    res1 = Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res1 = Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res1 = Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res1 = Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res1 = Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res1 = Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res1 = Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("NRG Esports")) {
                if (indexOfTeam == 0) {
                    res2 = Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res2 = Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res2 = Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res2 = Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res2 = Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res2 = Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res2 = Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("Reignite")) {
                if (indexOfTeam == 0) {
                    res3 = Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res3 = Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res3 = Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res3 = Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res3 = Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res3 = Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res3 = Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("SCARZ")) {
                if (indexOfTeam == 0) {
                    res4 = Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res4 = Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res4 = Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res4 = Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res4 = Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res4 = Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res4 = Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("FURIA Esports")) {
                if (indexOfTeam == 0) {
                    res5 = Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res5 = Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res5 = Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res5 = Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res5 = Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res5 = Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res5 = Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("FENNEL")) {
                if (indexOfTeam == 0) {
                    res6 = Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res6 = Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res6 = Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res6 = Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res6 = Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res6 = Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res6 = Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("Team Liquid")) {
                if (indexOfTeam == 0) {
                    res7 = Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res7 = Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res7 = Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res7 = Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res7 = Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res7 = Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res7 = Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("Sentinels")) {
                if (indexOfTeam == 0) {
                    res8 = Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res8 = Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res8 = Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res8 = Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res8 = Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res8 = Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res8 = Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("Cloud9")) {
                if (indexOfTeam == 0) {
                    res9 = Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res9 = Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res9 = Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res9 = Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res9 = Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res9 = Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res9 = Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("Alliance")) {
                if (indexOfTeam == 0) {
                    res10 = Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res10 = Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res10 = Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res10 = Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res10 = Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res10 = Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res10 = Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("100 Thieves")) {
                if (indexOfTeam == 0) {
                    res11 = Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res11 = Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res11 = Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res11 = Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res11 = Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res11 = Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res11 = Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("Rogue")) {
                if (indexOfTeam == 0) {
                    res12 = Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res12 = Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res12 = Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res12 = Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res12 = Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res12 = Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res12 = Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("Natus Vincere")) {
                if (indexOfTeam == 0) {
                    res13 = Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res13 = Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res13 = Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res13 = Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res13 = Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res13 = Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res13 = Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("Gambit Esports")) {
                if (indexOfTeam == 0) {
                    res14 = Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res14 = Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res14 = Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res14 = Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res14 = Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res14 = Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res14 = Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("ZETA DIVISION")) {
                if (indexOfTeam == 0) {
                    res15 = Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res15 = Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res15 = Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res15 = Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res15 = Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res15 = Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res15 = Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("OpTic Gaming")) {
                if (indexOfTeam == 0) {
                    res16 = Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res16 = Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res16 = Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res16 = Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res16 = Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res16 = Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res16 = Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("Counter Logic Gaming")) {
                if (indexOfTeam == 0) {
                    res17 = Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res17 = Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res17 = Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res17 = Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res17 = Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res17 = Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res17 = Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("Riddle")) {
                if (indexOfTeam == 0) {
                    res18 = Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res18 = Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res18 = Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res18 = Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res18 = Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res18 = Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res18 = Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("Life Could be A Dream")) {
                if (indexOfTeam == 0) {
                    res19 = Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res19 = Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res19 = Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res19 = Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res19 = Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res19 = Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res19 = Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("T1")) {
                if (indexOfTeam == 0) {
                    res20 = Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res20 = Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res20 = Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res20 = Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res20 = Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res20 = Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res20 = Constants.TOP_20_15;
                }
            }


        }
        for (int i = 0; i < game2.size(); i++) {
            team = game2.get(i);
            int indexOfTeam = game2.indexOf(team);
            if (team.equalsIgnoreCase("Team SoloMid")) {
                if (indexOfTeam == 0) {
                    res1 = res1 + Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res1 = res1 + Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res1 = res1 + Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res1 = res1 + Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res1 = res1 + Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res1 = res1 + Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res1 = res1 + Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("NRG Esports")) {
                if (indexOfTeam == 0) {
                    res2 = res2 + Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res2 = res2 + Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res2 = res2 + Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res2 = res2 + Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res2 = res2 + Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res2 = res2 + Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res2 = res2 + Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("Reignite")) {
                if (indexOfTeam == 0) {
                    res3 = res3 + Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res3 = res3 + Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res3 = res3 + Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res3 = res3 + Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res3 = res3 + Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res3 = res3 + Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res3 = res3 + Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("SCARZ")) {
                if (indexOfTeam == 0) {
                    res4 = res4 + Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res4 = res4 + Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res4 = res4 + Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res4 = res4 + Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res4 = res4 + Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res4 = res4 + Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res4 = res4 + Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("FURIA Esports")) {
                if (indexOfTeam == 0) {
                    res5 = res5 + Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res5 = res5 + Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res5 = res5 + Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res5 = res5 + Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res5 = res5 + Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res5 = res5 + Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res5 = res5 + Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("FENNEL")) {
                if (indexOfTeam == 0) {
                    res6 = res6 + Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res6 = res6 + Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res6 = res6 + Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res6 = res6 + Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res6 = res6 + Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res6 = res6 + Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res6 = res6 + Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("Team Liquid")) {
                if (indexOfTeam == 0) {
                    res7 = res7 + Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res7 = res7 + Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res7 = res7 + Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res7 = res7 + Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res7 = res7 + Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res7 = res7 + Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res7 = res7 + Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("Sentinels")) {
                if (indexOfTeam == 0) {
                    res8 = res8 + Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res8 = res8 + Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res8 = res8 + Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res8 = res8 + Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res8 = res8 + Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res8 = res8 + Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res8 = res8 + Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("Cloud9")) {
                if (indexOfTeam == 0) {
                    res9 = res9 + Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res9 = res9 + Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res9 = res9 + Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res9 = res9 + Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res9 = res9 + Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res9 = res9 + Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res9 = res9 + Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("Alliance")) {
                if (indexOfTeam == 0) {
                    res10 = res10 + Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res10 = res10 + Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res10 = res10 + Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res10 = res10 + Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res10 = res10 + Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res10 = res10 + Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res10 = res10 + Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("100 Thieves")) {
                if (indexOfTeam == 0) {
                    res11 = res11 + Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res11 = res11 + Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res11 = res11 + Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res11 = res11 + Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res11 = res11 + Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res11 = res11 + Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res11 = res11 + Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("Rogue")) {
                if (indexOfTeam == 0) {
                    res12 = res12 + Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res12 = res12 + Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res12 = res12 + Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res12 = res12 + Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res12 = res12 + Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res12 = res12 + Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res12 = res12 + Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("Natus Vincere")) {
                if (indexOfTeam == 0) {
                    res13 =res13 + Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res13 = res13 +Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res13 =res13 + Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res13 = res13 +Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res13 =res13 + Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res13 =res13 + Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res13 =res13 + Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("Gambit Esports")) {
                if (indexOfTeam == 0) {
                    res14 =res14 +  Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res14 =res14 +  Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res14 =res14 +  Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res14 = res14 + Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res14 =res14 +  Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res14 =res14 +  Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res14 =res14 +  Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("ZETA DIVISION")) {
                if (indexOfTeam == 0) {
                    res15 = res15 + Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res15 =res15 + Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res15 = res15 +Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res15 = res15 +Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res15 =res15 + Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res15 = res15 +Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res15 = res15 +Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("OpTic Gaming")) {
                if (indexOfTeam == 0) {
                    res16 =res16+ Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res16 = res16+Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res16 =res16+ Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res16 = res16+Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res16 =res16+ Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res16 =res16+ Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res16 =res16+ Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("Counter Logic Gaming")) {
                if (indexOfTeam == 0) {
                    res17 = res17 +Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res17 = res17 +Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res17 =res17 + Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res17 = res17 +Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res17 =res17 + Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res17 = res17 +Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res17 =res17 + Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("Riddle")) {
                if (indexOfTeam == 0) {
                    res18 =res18+ Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res18 =res18+ Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res18 =res18+ Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res18 =res18+ Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res18 =res18+ Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res18 = res18+Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res18 = res18+Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("Life Could be A Dream")) {
                if (indexOfTeam == 0) {
                    res19 =res19+ Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res19 =res19+  Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res19 =res19+  Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res19 =res19+  Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res19 =res19+  Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res19 = res19+ Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res19 = res19+ Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("T1")) {
                if (indexOfTeam == 0) {
                    res20 =res20+ Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res20 =res20+ Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res20 =res20+ Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res20 = res20+Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res20 =res20+ Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res20 =res20+ Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res20 =res20+ Constants.TOP_20_15;
                }
            }

        }*/
        /*for (int i = 0; i < game3.size(); i++) {
            team = game3.get(i);
            int indexOfTeam = game3.indexOf(team);
            if (team.equalsIgnoreCase("Team SoloMid")) {
                if (indexOfTeam == 0) {
                    res1 = Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res1 = Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res1 = Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res1 = Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res1 = Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res1 = Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res1 = Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("NRG Esports")) {
                if (indexOfTeam == 0) {
                    res2 = Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res2 = Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res2 = Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res2 = Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res2 = Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res2 = Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res2 = Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("Reignite")) {
                if (indexOfTeam == 0) {
                    res3 = Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res3 = Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res3 = Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res3 = Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res3 = Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res3 = Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res3 = Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("SCARZ")) {
                if (indexOfTeam == 0) {
                    res4 = Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res4 = Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res4 = Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res4 = Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res4 = Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res4 = Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res4 = Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("FURIA Esports")) {
                if (indexOfTeam == 0) {
                    res5 = Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res5 = Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res5 = Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res5 = Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res5 = Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res5 = Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res5 = Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("FENNEL")) {
                if (indexOfTeam == 0) {
                    res6 = Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res6 = Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res6 = Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res6 = Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res6 = Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res6 = Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res6 = Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("Team Liquid")) {
                if (indexOfTeam == 0) {
                    res7 = Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res7 = Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res7 = Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res7 = Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res7 = Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res7 = Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res7 = Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("Sentinels")) {
                if (indexOfTeam == 0) {
                    res8 = Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res8 = Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res8 = Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res8 = Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res8 = Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res8 = Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res8 = Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("Cloud9")) {
                if (indexOfTeam == 0) {
                    res9 = Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res9 = Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res9 = Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res9 = Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res9 = Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res9 = Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res9 = Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("Alliance")) {
                if (indexOfTeam == 0) {
                    res10 = Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res10 = Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res10 = Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res10 = Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res10 = Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res10 = Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res10 = Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("100 Thieves")) {
                if (indexOfTeam == 0) {
                    res11 = Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res11 = Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res11 = Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res11 = Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res11 = Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res11 = Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res11 = Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("Rogue")) {
                if (indexOfTeam == 0) {
                    res12 = Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res12 = Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res12 = Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res12 = Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res12 = Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res12 = Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res12 = Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("Natus Vincere")) {
                if (indexOfTeam == 0) {
                    res13 = Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res13 = Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res13 = Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res13 = Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res13 = Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res13 = Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res13 = Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("Gambit Esports")) {
                if (indexOfTeam == 0) {
                    res14 = Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res14 = Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res14 = Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res14 = Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res14 = Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res14 = Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res14 = Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("ZETA DIVISION")) {
                if (indexOfTeam == 0) {
                    res15 = Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res15 = Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res15 = Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res15 = Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res15 = Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res15 = Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res15 = Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("OpTic Gaming")) {
                if (indexOfTeam == 0) {
                    res16 = Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res16 = Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res16 = Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res16 = Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res16 = Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res16 = Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res16 = Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("Counter Logic Gaming")) {
                if (indexOfTeam == 0) {
                    res17 = Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res17 = Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res17 = Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res17 = Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res17 = Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res17 = Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res17 = Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("Riddle")) {
                if (indexOfTeam == 0) {
                    res18 = Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res18 = Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res18 = Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res18 = Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res18 = Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res18 = Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res18 = Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("Life Could be A Dream")) {
                if (indexOfTeam == 0) {
                    res19 = Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res19 = Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res19 = Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res19 = Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res19 = Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res19 = Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res19 = Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("T1")) {
                if (indexOfTeam == 0) {
                    res20 = Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res20 = Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res20 = Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res20 = Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res20 = Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res20 = Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res20 = Constants.TOP_20_15;
                }
            }

        }
        for (int i = 0; i < game4.size(); i++) {
            team = game4.get(i);
            int indexOfTeam = game4.indexOf(team);
            if (team.equalsIgnoreCase("Team SoloMid")) {
                if (indexOfTeam == 0) {
                    res1 = Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res1 = Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res1 = Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res1 = Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res1 = Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res1 = Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res1 = Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("NRG Esports")) {
                if (indexOfTeam == 0) {
                    res2 = Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res2 = Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res2 = Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res2 = Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res2 = Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res2 = Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res2 = Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("Reignite")) {
                if (indexOfTeam == 0) {
                    res3 = Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res3 = Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res3 = Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res3 = Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res3 = Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res3 = Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res3 = Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("SCARZ")) {
                if (indexOfTeam == 0) {
                    res4 = Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res4 = Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res4 = Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res4 = Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res4 = Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res4 = Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res4 = Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("FURIA Esports")) {
                if (indexOfTeam == 0) {
                    res5 = Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res5 = Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res5 = Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res5 = Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res5 = Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res5 = Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res5 = Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("FENNEL")) {
                if (indexOfTeam == 0) {
                    res6 = Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res6 = Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res6 = Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res6 = Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res6 = Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res6 = Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res6 = Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("Team Liquid")) {
                if (indexOfTeam == 0) {
                    res7 = Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res7 = Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res7 = Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res7 = Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res7 = Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res7 = Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res7 = Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("Sentinels")) {
                if (indexOfTeam == 0) {
                    res8 = Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res8 = Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res8 = Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res8 = Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res8 = Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res8 = Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res8 = Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("Cloud9")) {
                if (indexOfTeam == 0) {
                    res9 = Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res9 = Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res9 = Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res9 = Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res9 = Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res9 = Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res9 = Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("Alliance")) {
                if (indexOfTeam == 0) {
                    res10 = Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res10 = Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res10 = Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res10 = Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res10 = Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res10 = Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res10 = Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("100 Thieves")) {
                if (indexOfTeam == 0) {
                    res11 = Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res11 = Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res11 = Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res11 = Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res11 = Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res11 = Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res11 = Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("Rogue")) {
                if (indexOfTeam == 0) {
                    res12 = Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res12 = Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res12 = Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res12 = Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res12 = Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res12 = Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res12 = Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("Natus Vincere")) {
                if (indexOfTeam == 0) {
                    res13 = Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res13 = Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res13 = Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res13 = Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res13 = Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res13 = Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res13 = Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("Gambit Esports")) {
                if (indexOfTeam == 0) {
                    res14 = Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res14 = Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res14 = Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res14 = Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res14 = Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res14 = Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res14 = Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("ZETA DIVISION")) {
                if (indexOfTeam == 0) {
                    res15 = Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res15 = Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res15 = Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res15 = Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res15 = Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res15 = Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res15 = Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("OpTic Gaming")) {
                if (indexOfTeam == 0) {
                    res16 = Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res16 = Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res16 = Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res16 = Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res16 = Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res16 = Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res16 = Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("Counter Logic Gaming")) {
                if (indexOfTeam == 0) {
                    res17 = Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res17 = Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res17 = Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res17 = Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res17 = Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res17 = Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res17 = Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("Riddle")) {
                if (indexOfTeam == 0) {
                    res18 = Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res18 = Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res18 = Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res18 = Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res18 = Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res18 = Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res18 = Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("Life Could be A Dream")) {
                if (indexOfTeam == 0) {
                    res19 = Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res19 = Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res19 = Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res19 = Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res19 = Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res19 = Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res19 = Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("T1")) {
                if (indexOfTeam == 0) {
                    res20 = Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res20 = Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res20 = Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res20 = Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res20 = Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res20 = Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res20 = Constants.TOP_20_15;
                }
            }
        }
        for (int i = 0; i < game5.size(); i++) {
            team = game5.get(i);
            int indexOfTeam = game5.indexOf(team);
            if (team.equalsIgnoreCase("Team SoloMid")) {
                if (indexOfTeam == 0) {
                    res1 = Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res1 = Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res1 = Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res1 = Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res1 = Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res1 = Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res1 = Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("NRG Esports")) {
                if (indexOfTeam == 0) {
                    res2 = Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res2 = Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res2 = Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res2 = Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res2 = Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res2 = Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res2 = Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("Reignite")) {
                if (indexOfTeam == 0) {
                    res3 = Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res3 = Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res3 = Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res3 = Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res3 = Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res3 = Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res3 = Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("SCARZ")) {
                if (indexOfTeam == 0) {
                    res4 = Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res4 = Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res4 = Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res4 = Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res4 = Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res4 = Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res4 = Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("FURIA Esports")) {
                if (indexOfTeam == 0) {
                    res5 = Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res5 = Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res5 = Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res5 = Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res5 = Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res5 = Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res5 = Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("FENNEL")) {
                if (indexOfTeam == 0) {
                    res6 = Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res6 = Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res6 = Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res6 = Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res6 = Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res6 = Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res6 = Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("Team Liquid")) {
                if (indexOfTeam == 0) {
                    res7 = Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res7 = Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res7 = Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res7 = Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res7 = Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res7 = Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res7 = Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("Sentinels")) {
                if (indexOfTeam == 0) {
                    res8 = Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res8 = Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res8 = Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res8 = Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res8 = Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res8 = Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res8 = Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("Cloud9")) {
                if (indexOfTeam == 0) {
                    res9 = Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res9 = Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res9 = Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res9 = Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res9 = Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res9 = Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res9 = Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("Alliance")) {
                if (indexOfTeam == 0) {
                    res10 = Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res10 = Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res10 = Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res10 = Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res10 = Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res10 = Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res10 = Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("100 Thieves")) {
                if (indexOfTeam == 0) {
                    res11 = Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res11 = Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res11 = Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res11 = Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res11 = Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res11 = Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res11 = Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("Rogue")) {
                if (indexOfTeam == 0) {
                    res12 = Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res12 = Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res12 = Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res12 = Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res12 = Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res12 = Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res12 = Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("Natus Vincere")) {
                if (indexOfTeam == 0) {
                    res13 = Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res13 = Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res13 = Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res13 = Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res13 = Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res13 = Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res13 = Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("Gambit Esports")) {
                if (indexOfTeam == 0) {
                    res14 = Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res14 = Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res14 = Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res14 = Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res14 = Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res14 = Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res14 = Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("ZETA DIVISION")) {
                if (indexOfTeam == 0) {
                    res15 = Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res15 = Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res15 = Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res15 = Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res15 = Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res15 = Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res15 = Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("OpTic Gaming")) {
                if (indexOfTeam == 0) {
                    res16 = Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res16 = Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res16 = Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res16 = Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res16 = Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res16 = Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res16 = Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("Counter Logic Gaming")) {
                if (indexOfTeam == 0) {
                    res17 = Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res17 = Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res17 = Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res17 = Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res17 = Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res17 = Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res17 = Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("Riddle")) {
                if (indexOfTeam == 0) {
                    res18 = Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res18 = Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res18 = Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res18 = Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res18 = Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res18 = Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res18 = Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("Life Could be A Dream")) {
                if (indexOfTeam == 0) {
                    res19 = Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res19 = Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res19 = Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res19 = Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res19 = Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res19 = Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res19 = Constants.TOP_20_15;
                }
            }
            if (team.equalsIgnoreCase("T1")) {
                if (indexOfTeam == 0) {
                    res20 = Constants.TOP_1;
                }
                if (indexOfTeam == 1) {
                    res20 = Constants.TOP_2;
                }
                if (indexOfTeam == 2) {
                    res20 = Constants.TOP_3;
                }
                if (indexOfTeam == 3) {
                    res20 = Constants.TOP_4;
                }
                if (indexOfTeam <= 8 && indexOfTeam >= 4) {
                    res20 = Constants.TOP_9_5;
                }
                if (indexOfTeam <= 13 && indexOfTeam >= 9) {
                    res20 = Constants.TOP_14_10;
                }
                if (indexOfTeam <= 19 && indexOfTeam >= 14) {
                    res20 = Constants.TOP_20_15;
                }
            }
            //sum = res1 + res2 + res3 + res4 + res5 + res6 + res7 + res8 + res9 + res10+ res11 + res12 + res13 + res14 + res15 + res16 + res17 + res18 + res19 + res20;

           // System.out.println("Team " + team + " scored " + sum + " points.");

        }*/

            //GetSum.sum();

        /*System.out.println("Победитель турнира...");
        Thread.sleep(2000);
        System.out.println("Команда " + team + " становятся чемпионами турнира со счетом - " + sum);*/
        }

    }
}
