package lesson13;

public class Main {
    public static void main(String[] args) {
        double[][] numsForA = {{3, 5, 7},
                {4, 2, 1},
                {2, 0, 8}};
        Matrix a = new Matrix(numsForA);
        System.out.println(a.getRows());
        System.out.println(a.getColumns());
        System.out.println(a.getValueAt(18, 3));
        a.setValueAt(0, 0, 3);
        System.out.println(a.getValueAt(0, 0));

        double[][] numsForB = {{2, 1, 4},
                {2, 2, 2},
                {1, 1, 1}};
        Matrix b = new Matrix(numsForB);
        double[][] numsForC = {{1, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 1, 0},
                {0, 0, 0, 1}};
        Matrix c = new Matrix(numsForC);
        IMatrix resultSub = a.sub(b);
        IMatrix resultMul1 = a.mul(b);
        IMatrix resultMul2 = a.mul(3);
        IMatrix resultTransponse = a.transpose();
        a.fillMatrix(6);
        boolean resultNullMatrix = a.isNullMatrix();
        boolean resultIsIdentityMatrix = c.isIdentityMatrix();
        boolean resultisSquareMatrix = c.isSquareMatrix();


        // явный параметр - а (внутри метода доступен по this)
        // явный параметр - b (внутри метода доступен otherMatrix)
        IMatrix resultAdd = a.add(b);
        System.out.println("------------------------");
        System.out.println("Матрица А");
        a.printToConsole();
        System.out.println("------------------------");
        System.out.println("Сложение матриц");
        resultAdd.printToConsole();
        System.out.println("------------------------");
        System.out.println("Вычетание матриц");
        resultSub.printToConsole();
        System.out.println("------------------------");
        System.out.println("Умножение матрицы на число");
        resultMul2.printToConsole();
        System.out.println("------------------------");
        System.out.println("Транспонированная матрица");
        resultTransponse.printToConsole();
        System.out.println("------------------------");
        System.out.println("Применение задонного значения к каждой ячейке матрицы");
        a.printToConsole();
        System.out.println("------------------------");
        System.out.println("Матрица нулевая?");
        System.out.println(resultNullMatrix);
        System.out.println("------------------------");
        System.out.println("Матрица единичная?");
        c.printToConsole();
        System.out.println(resultIsIdentityMatrix);
        System.out.println("------------------------");
        System.out.println("Матрица квадратная?");
        c.printToConsole();
        System.out.println(resultisSquareMatrix);
    }
}
