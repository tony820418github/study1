package com.sh.zfc.sourcestudy;

import org.apache.ibatis.reflection.TypeParameterResolver;

import java.util.Map;

public class ParameterResoledStudy<K,V> {
    protected Map<K,V> map;

    public Map<K, V> getMap() {
        return map;
    }

    public void setMap(Map<K, V> map) {
        this.map = map;
    }
}
