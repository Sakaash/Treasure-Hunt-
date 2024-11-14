import java.util.Scanner;

public class Dungeon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the dimensions of the dungeon");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        char[][] dungeon = new char[rows][cols];
        System.out.println("Enter the position of the adventurer");
        int[] adventurerPos = new int[2];
        adventurerPos[0] = scanner.nextInt();
        adventurerPos[1] = scanner.nextInt();
        System.out.println("Enter the position of the gold");
        int[] goldPos = new int[2];
        goldPos[0] = scanner.nextInt();
        goldPos[1] = scanner.nextInt();
        System.out.println("Enter the position of the monster");
        int[] monsterPos = new int[2];
        monsterPos[0] = scanner.nextInt();
        monsterPos[1] = scanner.nextInt();
        // Uncomment to use the function
        // findMinStepsToGold(dungeon, adventurerPos, goldPos);
        // findMinStepsToGoldWithMonster(dungeon, adventurerPos, goldPos, monsterPos);
        // printPath(dungeon, adventurerPos, goldPos, monsterPos);
    }
    private static void findMinStepsToGold(char[][] dungeon, int[] adventurerPos, int[] goldPos) {
        System.out.println("Minimum number of steps : " + ((Math.abs(goldPos[0]-adventurerPos[0]))+(Math.abs(goldPos[1]-adventurerPos[1]))));
    }
    private static void findMinStepsToGoldWithMonster(char[][] dungeon, int[] adventurerPos, int[] goldPos, int[] monsterPos) {
        int monsterSteps = Math.abs(goldPos[0]-monsterPos[0]) + Math.abs(goldPos[1]-monsterPos[1]);
        int adventurerSteps = Math.abs(goldPos[0]-adventurerPos[0]) + Math.abs(goldPos[1]-adventurerPos[1]);

        if(adventurerSteps<=monsterSteps){
            System.out.println("Minimum number of steps : " + adventurerSteps);
        } else {
            System.out.println("Not possible");
        }

    }
    private static void printPath(char[][] dungeon, int[] adventurerPos, int[] goldPos, int[]monsterPos) {
        int monsterSteps = Math.abs(goldPos[0]-monsterPos[0]) + Math.abs(goldPos[1]-monsterPos[1]);
        int adventurerSteps = Math.abs(goldPos[0]-adventurerPos[0]) + Math.abs(goldPos[1]-adventurerPos[1]);
        
        if(adventurerSteps<=monsterSteps){
            System.out.print("Path : ");
            while(adventurerPos[1]!=goldPos[1]){
                System.out.print("("+adventurerPos[0]+", "+adventurerPos[1]+") -> ");
                if(adventurerPos[1]>goldPos[1])
                    adventurerPos[1]--;
                else
                    adventurerPos[1]++;
            }

            while (adventurerPos[0]!=goldPos[0]) {
                System.out.print("("+adventurerPos[0]+", "+adventurerPos[1]+") -> ");
                if(adventurerPos[0]>goldPos[0])
                    adventurerPos[0]--;
                else
                    adventurerPos[0]++;
            }
            System.out.print("("+adventurerPos[0]+", "+adventurerPos[1]+")");
        }
    }
    private static void 
}
