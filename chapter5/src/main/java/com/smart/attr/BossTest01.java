package com.smart.attr;

import java.util.*;

public class BossTest01 {
   private List fas = new ArrayList();

    private Map map = new HashMap();
   private Properties properties = new Properties();

    public List getFas() {
        return fas;
    }

    public void setFas(List fas) {
        this.fas = fas;
    }


    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "BossTest01{" +
                "fas=" + fas +
                ", map=" + map +
                ", properties=" + properties +
                '}';
    }
}
