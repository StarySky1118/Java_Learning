package com.zzy.homework07;

public class Test {
    public static void main(String[] args) {
        // 定义多态数组
        Person[] people = new Person[4];
        people[0] = new Teacher("田所浩二", '男', 24, 2);
        people[1] = new Teacher("田所浩三", '男', 28, 2);
        people[2] = new Student("远野", '男', 15, "114514");
        people[3] = new Student("远野", '男', 17, "114514");

        // 排序
        sortByAge(people);
    }

    // 排序
    public static void sortByAge(Person[] people) {
        for (int i = people.length - 1; i > 0 ; i--) { // 从最后一个位置到第二个位置
            boolean flag = false; // 是否进行交换的标志
            for(int j = 0; j<i;j++) { // 两两比较
                if(people[j].getAge() > people[j+1].getAge()) { // 左对象年龄大
                    Person temp = people[j];
                    people[j] = people[j+1];
                    people[j+1] = temp;
                    flag = true;
                }
            }
            if(!flag) { // 本趟未进行交换
                break;
            }
        }
    }
}
