package com.sh.zfc.sourcestudy;

import org.apache.ibatis.reflection.TypeParameterResolver;
import sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class TestType {

    SubClassA<Long> sa = new SubClassA<>();

    public static void main(String[] args) throws NoSuchFieldException {
        Field f = ParameterResoledStudy.class.getDeclaredField("map");

        System.out.println(f.getGenericType());
        System.out.println(f.getGenericType() instanceof ParameterizedType);

        ParameterizedType p1 = (ParameterizedType)f.getGenericType();
        System.out.println(p1.getRawType());
        System.out.println(p1.getOwnerType());
        for (Type t : p1.getActualTypeArguments()) {
            System.out.println(t);
        }


        Type type = TypeParameterResolver.resolveFieldType(f, ParameterizedTypeImpl.make(SubClassA.class,new Type[]{Long.class},TestType.class));
        System.out.println(type.getClass());

        ParameterizedType p = (ParameterizedType)type;

        System.out.println(p.getRawType());
        System.out.println(p.getOwnerType());
        for (Type t : p.getActualTypeArguments()) {
            System.out.println(t);
        }
    }
}
