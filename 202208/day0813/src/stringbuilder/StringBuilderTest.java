package stringbuilder;

// StringBuffer与StringBuilder增加方法效率比较
public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder stringBuilder = new StringBuilder();
        String string = new String();

        // StringBuffer测试
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            stringBuffer.append(String.valueOf(i));
        }
        long endTime = System.currentTimeMillis();
        System.out.println("StringBuffer执行时间: " + (endTime - startTime));

        // StringBuilder测试
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            stringBuilder.append(String.valueOf(i));
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder执行时间: " + (endTime - startTime));

        // String测试
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            string = string + i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("String执行时间: " + (endTime - startTime));
    }
}
