package lesson4;

public class Home {
    public static void main(String[] args) {
        int[][] nums = new int[9][9];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}
