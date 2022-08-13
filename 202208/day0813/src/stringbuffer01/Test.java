package stringbuffer01;

public class Test {
    public static void main(String[] args) {

//        StringBuffer stringBuffer = new StringBuffer();
//
//        StringBuffer stringBuffer1 = new StringBuffer(18);
//
//        StringBuffer stringBuffer2 = new StringBuffer("hello");

        // String --> StringBuffer
//        StringBuffer stringBuffer = new StringBuffer("hello");
//
//        StringBuffer stringBuffer1 = new StringBuffer();
//        stringBuffer1.append("hello");

        // StringBuffer --> String
        StringBuffer stringBuffer = new StringBuffer("hello");

        String s = new String(stringBuffer);
        String s1 = stringBuffer.toString();
    }
}
