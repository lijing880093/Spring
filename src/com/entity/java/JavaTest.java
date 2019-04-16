package com.entity.java;

/**
 * @author: Iman
 * date   : 2019/4/15
 */
public class JavaTest {
//    由主管进行分配，调用
    public static void main(String[] args) {
        TestWork testWork=new TestWork();
        testWork.setTester(new Zhangsan());
        testWork.doTest();
    }
}
