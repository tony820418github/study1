package com.sh.zfc.sourcestudy;

public class DynamtiSubject implements IDynamtiSubject {
    @Override
    public void test(){
        System.out.println("DynamicSubject");
    }

    @Override
    public void hello(String str){
        System.out.println(str);
    }
}
