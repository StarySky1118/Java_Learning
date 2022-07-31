package com.homeowrk01;

public class PersonTest01 {
    public static void main(String[] args) {
        // 新建三个Person对象
        Person person1 = new Person("田所浩二", 24, "GV演员");
        Person person2 = new Person("田所浩三", 25, "GV演员");
        Person person3 = new Person("田所浩四", 22, "GV演员");

        // 对象数组
        Person[] people = {null, person1, person2, person3};

        // 排序
        for(int i = people.length;i >= 2;i--) { // 从最后到第二个位置
            boolean flag = false;
            for(int j=1;j<i;j++) {
                if(people[j].getAge() > people[j+1].getAge()) { // 左大于右
                    // 交换
                    people[0] = people[j];
                    people[j] = people[j+1];
                    people[j+1] = people[0];
                    flag = true;
                }
            }
            if(!flag) { // 本趟排序未进行交换
                break;
            }
        }

        // 输出

    }
}
