package com.zzy.homework01;

import com.zzy.equaltest.Person;

public class Test01 {
    public static void main(String[] args) {
        Person person1 = new Person("田所浩二", 24, '男');
        Person person2 = new Person("田所浩一", 22, '男');
        Person person3 = new Person("田所浩三", 32, '男');

        Person[] people = {person1, person2, person3};

        // 冒泡排序
        Person temp;
        for (int i = people.length-1; i > 0 ; i--) { // 从最后一个位置到第二个位置
            boolean flag = false; // 本趟是否进行交换的标志
            for(int j = 0; j < i; j++) {
                if(people[j].getAge() > people[j+1].getAge()) { // 左对象年龄更大
                    temp = people[j];
                    people[j] = people[j+1];
                    people[j+1] = temp;
                    flag = true;
                }
            }
            if(!flag) { // 若本趟未进行交换
                break;
            }
        }


    }
}
