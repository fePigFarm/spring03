package com.faith.service;

/**
 * @Auther: yangguoqiang01
 * @Date: 2019-05-24
 * @Description: com.faith.service
 * @version: 1.0
 */
public class AopTest {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayName() {
        System.out.println("说出你的名字");
    }
}
