import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ApexTournament {
    static HashMap<Integer, String> teams = new HashMap<>();
    public static void main(String[] args) throws InterruptedException {


        teams.put(1, "Team SoloMid");
        teams.put(2, "NRG Esports");
        teams.put(3, "Reignite");
        teams.put(4, "SCARZ");
        teams.put(5, "FURIA Esports");
        teams.put(6, "FENNEL");
        teams.put(7, "Team Liquid");
        teams.put(8, "Sentinels");
        teams.put(9, "Cloud9");
        teams.put(10, "Alliance");
        teams.put(11, "100 Thieves");
        teams.put(12, "Rogue");
        teams.put(13, "Natus Vincere");
        teams.put(14, "Gambit Esports");
        teams.put(15, "ZETA DIVISION");
        teams.put(16, "OpTic Gaming");
        teams.put(17, "Counter Logic Gaming");
        teams.put(18, "Riddle");
        teams.put(19, "Life Could be A Dream");
        teams.put(20, "T1");


        Logic.phrasesOnDeath.put(1, " �������");
        Logic.phrasesOnDeath.put(2, " �� - �� - �� ��� ��� ���������?!");
        Logic.phrasesOnDeath.put(3, " ������ �� �������!!!");
        Logic.phrasesOnDeath.put(4, " ��� - ���� ������ ���� ���������?");
        Logic.phrasesOnDeath.put(5, " ��� ����!");
        Logic.phrasesOnDeath.put(6, " � �� ��� ������?");
        Logic.phrasesOnDeath.put(7, " ��� ��� �������!");
        Logic.phrasesOnDeath.put(8, " ���������� ������");
        Logic.phrasesOnDeath.put(9, " �� ������� �������!");
        Logic.phrasesOnDeath.put(10, " �������������");
        Logic.phrasesOnDeath.put(11, " ����, � ������ �����");
        Logic.phrasesOnDeath.put(12, " ��� ����?");
        Logic.phrasesOnDeath.put(13, " ����� ��� ������");
        Logic.phrasesOnDeath.put(14, " �� �� � ���������!");
        Logic.phrasesOnDeath.put(15, " ������� �������!");
        Logic.phrasesOnDeath.put(16, " �� ������ �����!!");
        Logic.phrasesOnDeath.put(17, " ��� ��� � ������� �����");
        Logic.phrasesOnDeath.put(18, " ������� ������");
        Logic.phrasesOnDeath.put(19, " ������");
        Logic.phrasesOnDeath.put(20, " ����� �� ���");



        Logic.firstGameResults(teams);
        Logic.secondGameResults(Logic.Teams);
        Logic.thirdGameResults(Logic.Teams);
        Logic.forthGameResults(Logic.Teams);
        Logic.fifthGameResults(Logic.Teams);

        Result.scoreCounter();

        Winner.winnerIdentifier();
        GetSum.sum();

        //System.out.println(Winner.winner);
    }
}
