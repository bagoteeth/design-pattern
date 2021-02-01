package com.jrf.zuoti;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author ruofa
 * @Date 2021/2/1 15:58
 */
public class Test1 {
    public static void main(String[] args) {
        System.out.println(countBalls(1,11));
    }
    public static Map<Integer, Integer> countBalls(int lowLimit, int highLimit) {
        int max=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=lowLimit;i<=highLimit;i++){
            int temp=convert(i);
            map.put(temp,map.getOrDefault(temp,0)+1);
            if(map.get(temp)>max) max=map.get(temp);
        }
        return map;
    }
    public static int convert(int num){
        int res=0;
        while(num!=0){
            res+=num%10;
            num/=10;
        }
        return res;
    }
}
