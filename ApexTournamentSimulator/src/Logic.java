import java.util.*;
import java.util.concurrent.TimeUnit;

public class Logic {

    public static HashMap<Integer, String> Teams = new HashMap<>();
    public static HashMap<String, Integer> results = new HashMap<>();

    public static HashMap<Integer, String> phrasesOnDeath = new HashMap<>();

    public static List<String> firstGame = new Stack<>();
    public static List<String> secondGame = new Stack<>();
    public static List<String> thirdGame = new Stack<>();
    public static List<String> fourthGame = new Stack<>();
    public static List<String> fifthGame = new Stack<>();
    public static HashMap<Integer, String> winners = new HashMap<>();

    public static int random () {
        return new Random().nextInt(Constants.MIN, Constants.MAX);
    }


    public static boolean oneTeamLeft (Map < Integer, String > teams){
        return teams.size() == 1;
    }
    public static void timer () throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000);
        }
    }

    public static void firstGameResults(Map<Integer, String> teams) throws InterruptedException {
        System.out.println("Первая игра начинается через 5 скунд.");
        //timer();
        System.out.println("Игра начинается!!!");
        while (!oneTeamLeft(teams)) {
            for (Iterator<Integer> iterator = teams.keySet().iterator(); iterator.hasNext(); ) {
                int rand = random();
                if (rand == iterator.next()) {
                    int randomSLEEP = new Random().nextInt(200,500);
                    TimeUnit.MILLISECONDS.sleep(randomSLEEP);
                    String teamName = teams.get(rand);
                    firstGame.add(teamName);
                    Teams.put(rand, teamName);
                    //System.out.println(phrasesOnDeath.get(rand));
                    System.out.println(teamName + " - Eliminated" + " on TOP - " + Constants.TOP--);
                    iterator.remove();
                    if (oneTeamLeft(teams)) {
                        firstGame.addAll(teams.values());
                        Teams.putAll(teams);
                        winners.putAll(teams);
                        System.out.println(teams.values() + " - Winners");
                        System.out.println("Конец первой игры.");
                    }
                }
            }
        }
    }

    public static void secondGameResults(HashMap<Integer, String> teams) throws InterruptedException {
        HashMap<Integer, String> temp = new HashMap<>(Teams);
        Teams.clear();
        System.out.println("Вторая игра начинается через 5 скунд.");
        //timer();
        System.out.println("Игра начинается!!!");
        int top = 20;
        while (!oneTeamLeft(temp)) {
            for (Iterator<Integer> iterator = temp.keySet().iterator(); iterator.hasNext(); ) {
                int rand = random();
                if (rand == iterator.next()) {
                   int randomSLEEP = new Random().nextInt(200,500);
                    TimeUnit.MILLISECONDS.sleep(randomSLEEP);
                    String teamName = temp.get(rand);
                    secondGame.add(teamName);
                    Teams.put(rand, teamName);
                   // System.out.println(phrasesOnDeath.get(rand));

                    System.out.println(teamName + " - Eliminated" + " on TOP - " + top--);
                    iterator.remove();
                    if (oneTeamLeft(temp)) {
                        secondGame
                                .addAll(temp.values());
                        Teams.putAll(temp);
                        winners.putAll(temp);
                        System.out.println(temp.values() + " - Winners");
                        System.out.println("Конец второй игры.");
                    }
                }
            }
        }
    }
    public static void thirdGameResults(HashMap<Integer, String> teams) throws InterruptedException {
        HashMap<Integer, String> temp = new HashMap<>(Teams);
        Teams.clear();
        System.out.println("Третья игра начинается через 5 скунд.");
        //timer();
        System.out.println("Игра начинается!!!");
        int top = 20;
        while (!oneTeamLeft(temp)) {
            for (Iterator<Integer> iterator = temp.keySet().iterator(); iterator.hasNext(); ) {
                int rand = random();
                if (rand == iterator.next()) {
                    int randomSLEEP = new Random().nextInt(200,500);
                    TimeUnit.MILLISECONDS.sleep(randomSLEEP);
                    String teamName = temp.get(rand);
                    thirdGame.add(teamName);
                    Teams.put(rand, teamName);
                   // System.out.println(phrasesOnDeath.get(rand));

                   System.out.println(teamName + " - Eliminated" + " on TOP - " + top--);
                    iterator.remove();
                    if (oneTeamLeft(temp)) {
                        thirdGame
                                .addAll(temp.values());
                        Teams.putAll(temp);
                        winners.putAll(temp);
                        System.out.println(temp.values() + " - Winners");
                        System.out.println("Конец третьей игры.");
                    }
                }
            }
        }
    }
    public static void forthGameResults(HashMap<Integer, String> teams) throws InterruptedException {
        HashMap<Integer, String> temp = new HashMap<>(Teams);
        Teams.clear();
        System.out.println("Четвертая игра начинается через 5 скунд.");
        //timer();
        System.out.println("Игра начинается!!!");
        int top = 20;
        while (!oneTeamLeft(temp)) {
            for (Iterator<Integer> iterator = temp.keySet().iterator(); iterator.hasNext(); ) {
                int rand = random();
                if (rand == iterator.next()) {
                    int randomSLEEP = new Random().nextInt(200,500);
                    TimeUnit.MILLISECONDS.sleep(randomSLEEP);
                    String teamName = temp.get(rand);
                    fourthGame.add(teamName);
                    Teams.put(rand, teamName);
                    //System.out.println(phrasesOnDeath.get(rand));

                    System.out.println(teamName + " - Eliminated" + " on TOP - " + top--);
                    iterator.remove();

                    if (oneTeamLeft(temp)) {
                        fourthGame
                                .addAll(temp.values());
                        Teams.putAll(temp);
                        winners.putAll(temp);
                        System.out.println(temp.values() + " - Winners");
                        System.out.println("Конец четвертой игры.");
                    }
                }
            }
        }
    }
    public static void fifthGameResults(HashMap<Integer, String> teams) throws InterruptedException {
        System.out.println("Финальная пятая игра начинается через 5 скунд.");
        //timer();
        System.out.println("Игра начинается!!!");
        int top = 20;
        while (!oneTeamLeft(Teams)) {
            for (Iterator<Integer> iterator = Teams.keySet().iterator(); iterator.hasNext(); ) {
                int rand = random();
                if (rand == iterator.next()) {
                    int randomSLEEP = new Random().nextInt(200,500);
                    TimeUnit.MILLISECONDS.sleep(randomSLEEP);
                    String teamName = Teams.get(rand);
                    fifthGame.add(teamName);
                    Teams.put(rand, teamName);
                    //System.out.println(phrasesOnDeath.get(rand));
                    System.out.println(teamName + " - Eliminated" + " on TOP - " + top--);
                    iterator.remove();
                    if (oneTeamLeft(Teams)) {
                        fifthGame.addAll(Teams.values());
                        Teams.putAll(Teams);
                        winners.putAll(Teams);
                        System.out.println(Teams.values() + " - Winners");
                        System.out.println("Конец финала игры.");
                    }
                }
            }
        }
    }
}
