package com.zzy.homework04;

public class UtilityTest {
    public static void main(String[] args) {
        String str = "https://www.baidu.com/s?ie=utf-8&f=8&rsv_bp=1&rsv_idx=1&tn=baidu&wd=%E5%93%88%E5%B8%8C&fenlei=256&rsv_pq=c502fe8800043c5e&rsv_t=32bfPHKKfHjJvXzLQibm3LYbGjrbGi6oZO9bvRlSZKvvOabx1OK5%2Bd2WClDd&rqlang=en&rsv_dl=tb&rsv_enter=1&rsv_sug3=10&rsv_sug1=9&rsv_sug7=101&rsv_sug2=0&rsv_btype=i&prefixsug=%25E5%2593%2588%25E5%25B8%258C&rsp=5&inputT=6225&rsv_sug4=8224";
        System.out.println(Utility.stringCounter(str));
    }
}
