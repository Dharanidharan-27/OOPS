import java.util.ArrayList;
import java.util.Scanner;

public class Ex12_GameTournament {
    static class Player {
        private int id;
        private String name;

        Player(int id, String name) {
            this.id = id;
            this.name = name;
        }

        void display() {
            System.out.println(id + "\t" + name);
        }
    }

    static class Team {
        private int id;
        private String name;
        private int points;

        Team(int id, String name) {
            this.id = id;
            this.name = name;
            this.points = 0;
        }

        int getId() {
            return id;
        }

        void addPoints(int p) {
            points += p;
        }

        void display() {
            System.out.println(id + "\t" + name + "\t" + points);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Player> players = new ArrayList<>();
        ArrayList<Team> teams = new ArrayList<>();

        int choice;
        do {
            System.out.println("\n===== GAME TOURNAMENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Register Player");
            System.out.println("2. Create Team");
            System.out.println("3. Enter Match Result");
            System.out.println("4. Display Players");
            System.out.println("5. Display Leaderboard");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Player ID: ");
                    int pid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Player Name: ");
                    String pname = sc.nextLine();
                    players.add(new Player(pid, pname));
                    System.out.println("Player Registered Successfully!");
                    break;

                case 2:
                    System.out.print("Enter Team ID: ");
                    int tid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Team Name: ");
                    String tname = sc.nextLine();
                    teams.add(new Team(tid, tname));
                    System.out.println("Team Created Successfully!");
                    break;

                case 3:
                    System.out.print("Enter Winning Team ID: ");
                    int winId = sc.nextInt();
                    boolean found = false;
                    for (Team t : teams) {
                        if (t.getId() == winId) {
                            t.addPoints(3);
                            found = true;
                            break;
                        }
                    }
                    if (found) {
                        System.out.println("Match Result Updated Successfully!");
                    } else {
                        System.out.println("Invalid Team ID!");
                    }
                    break;

                case 4:
                    System.out.println("\nID\tName");
                    for (Player p : players) {
                        p.display();
                    }
                    break;

                case 5:
                    System.out.println("\nID\tTeam\tPoints");
                    for (Team t : teams) {
                        t.display();
                    }
                    break;

                case 6:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }
        } while (choice != 6);

        sc.close();
    }
}
