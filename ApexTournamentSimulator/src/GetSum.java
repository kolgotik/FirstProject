import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GetSum extends Winner {

    public static void sum() throws InterruptedException {

        int max;
        for (String key : winner.keySet()) {
            System.out.println("������� " + key + " ���������� " + winner.get(key) + " �����.");

        }
        List<Integer> score = new ArrayList<>(winner.values());

        Collections.sort(score);

        System.out.println("���������� �����...");
        for (int i = 3; i >= 1; i--) {
            Thread.sleep(1000);
            System.out.println(i);
        }
        Thread.sleep(500);
        max =  Collections.max(score);

        for (String key : winner.keySet()) {

            if (winner.get(key).equals(max)) {
                System.out.println("������� " + key + " ���������� ������� - �� ������ " + max);
            }

        }
    }
}
