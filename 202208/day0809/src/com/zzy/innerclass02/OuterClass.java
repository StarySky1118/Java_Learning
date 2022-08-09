package com.zzy.innerclass02;


public class OuterClass {
    private static String name = "田所浩二";
    private String uid = "114514";

    public class InnerClass {
        private String uid = "1919810";

        public void hi() {
            System.out.println("对所有的烦恼说拜拜~");
            System.out.println("名字是:" + name);
            System.out.println("uid事" + uid + "外部类uid: " + OuterClass.this.uid);
        }
    }

    // 返回内部类对象
    public InnerClass getInstanceofInnerClass() {
        return new InnerClass();
    }


}
