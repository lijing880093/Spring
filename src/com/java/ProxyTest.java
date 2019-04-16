package com.java;

/**
 * @author: Iman
 * date   : 2019/4/16
 */
public class ProxyTest {
    public static void main(String[] args) {
        Proxy proxy=new Proxy();
        XiaoMing xiaoMing=new XiaoMing();
        proxy.setXiaoMing(xiaoMing);
        proxy.buy();
    }

}
