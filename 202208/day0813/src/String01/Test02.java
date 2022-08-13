package String01;

public class Test02 {
    public static void main(String[] args) {
        String str1 = "hello World";
        String str2 = "Hello World";

        // 实例方法 “相等”
        // public boolean equals(Object anObject)
        // 判断该字符串对象和另一个字符串对象内容是否相等
        System.out.println(str1.equals(str2));

        // 实例方法 “忽略大小写相等”
        // public boolean equalsIgnoreCase(String anotherString)
        // 判断字符串对象在忽略大小写情况下与另一个字符串是否相等
        System.out.println(str1.equalsIgnoreCase(str2));

        // 实例方法 “长度”
        // public int length()
        // 返回字符串对象的长度
        System.out.println(str1.length());

        // 实例方法 “下标”
        // public int indexOf(String str)
        // 返回该字符串对象中首次出现str的下标，若未出现过返回-1
        System.out.println(str1.indexOf("el"));

        // 实例方法 “最后出现的下标”
        // public int lastIndexOf(String str)
        // 返回字符串对象最后一次出现str的下标，若未出现过返回-1
        System.out.println(str1.lastIndexOf("el"));

        // 实例方法 “子串”
        // public String substring(int beginIndex, int endIndex)
        // 返回字符串对象[beginIndex,endIndex)的子串
        System.out.println(str1.substring(1, 3));

        // 实例方法 “去除空格”
        // public String trim()
        // 返回一个字符串，去除该字符串对象的首尾空格
        System.out.println("  hello  ".trim());

        // 实例方法 “切换成大写”
        // public String toUpperCase()
        // 返回字符串对象全部切换成大写的字符串
        System.out.println("  hello ".toUpperCase());

        // 实例方法 “字符串连接”
        // public String concat(String str)
        // 返回一个字符串，这个字符串有字符串对象和str拼接而成
        System.out.println("hello".concat(" world"));

        // 实例方法 “替换”
        // public String replace(char oldChar, char newChar)
        // 将字符串对象中的字符或字符串替换后返回一个新的字符串
        System.out.println("hello".replace('l', 'g'));

        // 实例方法 “分隔”
        // public String[] split(String regex, int limit)
        // 将字符串对象依据regex进行分割，最大份数为limit，返回一个字符串数组
        String[] strings = "192:168:1:1".split(":", 3);
        for (String str : strings) {
            System.out.print(str + " ");
        }

        // 特殊情况
        strings = "search?q=String对象&form=QBLH&sp=-1&pq=stringduixian&sc=0-13&qs=n&sk=&cvid=610469590D8B462AA56B45477778968C&ghsh=0&ghacc=0&ghpl=".split("&", -1);
        for(String str : strings) {
            System.out.println(str + " ");
        }

        // 实例方法 “比较”
        // public int compareTo(String anotherString)
        // 将该字符串对象与anotherString进行比较，相等时返回0，存在子串关系返回长度差值，否则返回第一个不同字符的ASCII码差值。
        System.out.println("hello".compareTo("Hello"));

        String name = "田所浩二";
        int age = 24;
        String job = "学生";
        // 静态方法 “格式化”
        String info = "%s, %d岁, 事%s";
        System.out.println(String.format(info, name, age, job));
    }
}
