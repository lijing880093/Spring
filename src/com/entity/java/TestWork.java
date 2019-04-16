package com.entity.java;

/**
 * @author: Iman
 * date   : 2019/4/15
 */
public class TestWork {
    private  tester tester;

    public void setTester(tester tester) {
        this.tester = tester;
    }

    public void doTest(){
        // 业务操作时，对象之间的耦合度高
//        ZhangSan zhangsan  = new ZhangSan();
//        zhangsan.test();
        tester.doTest();
    }
}
