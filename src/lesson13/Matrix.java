package lesson13;

public class Matrix implements IMatrix {
    private double[][] nums;

    public Matrix() {
        nums = new double[DEFAULT_MATRIX_SIZE][DEFAULT_MATRIX_SIZE];
    }

    public Matrix(double[][] nums) {
        this.nums = nums;
    }

    public Matrix(int row, int col) {
        nums = new double[row][col];
    }

    @Override
    public int getRows() {
        return nums.length;
    }

    @Override
    public int getColumns() {
        return nums[0].length;
    }

    @Override
    public double getValueAt(int rowIndex, int colIndex) throws IndexOutOfBoundsException {
        if (rowIndex < 0 || rowIndex > getRows()) {
            System.out.println("rowIndex не подходит!!!");
            return -1;
        }
        if (colIndex < 0 || colIndex > getColumns()) {
            System.out.println("colIndex не подходит!!!");
            return -1;
        }
        return nums[rowIndex][colIndex];
    }

    @Override
    public void setValueAt(int rowIndex, int colIndex, double value) throws IndexOutOfBoundsException {
        if (rowIndex < 0 || rowIndex > getRows()) {
            System.out.println("rowIndex не подходит!!!");
            return;
        }
        if (colIndex < 0 || colIndex > getColumns()) {
            System.out.println("colIndex не подходит!!!");
            return;
        }

        nums[rowIndex][colIndex] = value;
    }

    @Override
    public IMatrix add(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        // явный параметр - а (внутри метода доступен по this)
        // явный параметр - b (внутри метода доступен otherMatrix)

        if (this.getRows() != otherMatrix.getRows() || this.getColumns() != otherMatrix.getColumns()) {
            System.out.println("Матрицы должны быть равны");
            return null;
        }
        Matrix result = new Matrix(getRows(), getColumns());

        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                result.setValueAt(i, j, this.getValueAt(i, j) + otherMatrix.getValueAt(i, j));

            }
        }
        return result;
    }

    @Override
    public IMatrix sub(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (this.getRows() != otherMatrix.getRows() || this.getColumns() != otherMatrix.getColumns()) {
            System.out.println("Матрицы должны быть равны");
            return null;
        }
        Matrix result = new Matrix(getRows(), getColumns());

        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                result.setValueAt(i, j, this.getValueAt(i, j) - otherMatrix.getValueAt(i, j));

            }
        }
        return result;
    }

    @Override
    public IMatrix mul(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (this.getColumns() != otherMatrix.getRows()) {
            System.out.println("Количество колонок первой матрицы должно быть равно количеству строк второй");
            return null;
        }
        Matrix result = new Matrix(getRows(), getColumns());
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                for (int k = 0; k < otherMatrix.getRows(); k++) {
                    result.setValueAt(i, j, getValueAt(i, k) + (getValueAt(i, k) * otherMatrix.getValueAt(k, j)));
                }


            }

        }
        return result;
    }

    @Override
    public IMatrix mul(double value) {
        Matrix result = new Matrix(getRows(), getColumns());

        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                result.setValueAt(i, j, this.getValueAt(i, j) * value);

            }
        }
        return result;

    }

    @Override
    public IMatrix transpose() {
        Matrix result = new Matrix(getRows(), getColumns());
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                result.setValueAt(j, i, this.getValueAt(i, j));

            }

        }
        return result;
    }

    @Override
    public void fillMatrix(double value) {
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                this.setValueAt(i, j, this.getValueAt(i, j) * 0 + value);
            }
        }
    }

    @Override
    public double determinant() {
        return 0;
    }

    @Override
    public boolean isNullMatrix() {

        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                if (getValueAt(i, j) == 0) {
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public boolean isIdentityMatrix() {
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                if (getRows() == getColumns()) {
                    if (i == j && getValueAt(i, j) != 1) {
                        return false;
                    } else if (i != j && getValueAt(i, j) != 0) {
                        return false;
                    }
                }else{
                    return false;
                }

            }
        }
        return true;
    }

    @Override
    public boolean isSquareMatrix() {
        if (getRows() == getColumns()) {
            return true;
        }
        return false;
    }

    @Override
    public void printToConsole() {
        // this - та матрица, которую нужно напечатать

        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                System.out.print(this.getValueAt(i, j) + " ");
            }
            System.out.println();
        }

    }
}
