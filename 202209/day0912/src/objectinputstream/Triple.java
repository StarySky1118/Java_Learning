package objectinputstream;

import java.io.Serializable;

public class Triple implements Serializable {
    private int row;
    private int col;
    private int value;

    // 构造器
    public Triple(int row, int col, int value) {
        this.row = row;
        this.col = col;
        this.value = value;
    }

    // getter and setter
    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Triple{" +
                "row=" + row +
                ", col=" + col +
                ", value=" + value +
                '}';
    }
}
