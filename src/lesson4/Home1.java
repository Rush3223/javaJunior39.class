package lesson4;

public class Home1 {
    public static void main(String[] args) {
        // Есть двухмерный массив ноликов,
        // нужно напечатать на консоль его диагональ
        // вместо остальных ячеек пустота
        int[][] nums = new int[9][9];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i + j == nums.length - 1) {
                    System.out.print(nums[i][j] + " ");
                } else {
                    System.out.print(" " + " ");
                }

            }
            System.out.println();
        }
    }
}
