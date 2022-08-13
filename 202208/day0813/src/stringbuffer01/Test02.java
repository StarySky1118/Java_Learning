package stringbuffer01;

public class Test02 {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("919810.20");

        for (int i = stringBuffer.indexOf(".") - 3; i > 0; i -= 3) {
            stringBuffer.insert(i, ",");

        }

        System.out.println(stringBuffer);
    }
}
