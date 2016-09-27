package team;

public class Team {

    String name;

    Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {

        Team barcelona = new Team("FC Barcelona");
        System.out.println("Team: " + barcelona.getName());
        Player mikael = new Player("Mikael", 1);
        Player brian = new Player("Brian", 0);
        Player pekka = new Player("Pekka", 39);
        brian.getPlayerName();
        pekka.getPlayerName();
        System.out.println("Nombre :" + brian.getPlayerName() + "\nGoles :" + brian.getGoals());
        System.out.println("Nombre :" + pekka.getPlayerName() + "\nGoles :" + pekka.getGoals());
        System.out.println("Nombre :" + mikael.getPlayerName() + "\nGoles :" + mikael.getGoals());
        int gs = mikael.getGoals() + pekka.getGoals() + brian.getGoals();
        System.out.println("\nTotal de goles :" + gs);
    }

}
