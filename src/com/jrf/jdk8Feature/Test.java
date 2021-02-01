package com.jrf.jdk8Feature;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @Author ruofa
 * @Date 2021/2/1 15:41
 */
public class Test {
    public static void main(String[] args) {
        List<Integer> temp = Arrays.asList(1, 2, 3, null, null, 6, null, 8);
        System.out.println(temp);
        temp = temp.stream().filter(Objects::nonNull).collect(Collectors.toList());
        System.out.println(temp);
    }
}
