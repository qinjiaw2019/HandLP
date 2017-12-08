package com.hankcs.test;

import com.hankcs.hanlp.HanLP;
import com.hankcs.hanlp.seg.common.Term;

import java.util.List;

public class test {
    public static void main(String[] args)
    {
        List<Term> termList = HanLP.segment("商品和服务");
        System.out.println(termList);
    }
}
