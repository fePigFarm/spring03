package com.faith.entity;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @Auther: yangguoqiang01
 * @Date: 2019-05-22
 * @Description: com.faith.entity
 * @version: 1.0
 */
public class AllCollection {
    private List<String> list;
    private String[] strings;
    private Set<String> set;
    private Map<String, String> map;
    private Properties props;

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public String[] getStrings() {
        return strings;
    }

    public void setStrings(String[] strings) {
        this.strings = strings;
    }

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public Properties getProps() {
        return props;
    }

    public void setProps(Properties props) {
        this.props = props;
    }

    public String showInfo() {
        String s = "";
        for (String str : strings) {
            s += str + ", ";
        }
        return s + "\n"
                + this.list
                + "\n" + this.map
                + "\n" + this.set
                + "\n" + this.props;
    }
}
