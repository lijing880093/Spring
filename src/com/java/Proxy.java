package com.java;

/**
 * @author: Iman
 * date   : 2019/4/16
 */
public class Proxy implements  Car {

    private XiaoMing xiaoMing;

    public void setXiaoMing(XiaoMing xiaoMing) {
        this.xiaoMing = xiaoMing;
    }

    @Override
    public void buy() {
        System.out.println("开始测试");
        xiaoMing.buy();
        System.out.println("测试结束");
    }
}
