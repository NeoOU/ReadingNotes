package com.omed.ch3.entities;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xiaob_000 on 2016/10/21 0021.
 */
public class Bread {
    public static List<Bread> breads = new ArrayList<>();

    public static ThreadLocalExt<Integer> threadLocal= new ThreadLocalExt<>();

}

