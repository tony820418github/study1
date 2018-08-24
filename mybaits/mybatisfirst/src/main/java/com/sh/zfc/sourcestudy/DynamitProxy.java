package com.sh.zfc.sourcestudy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamitProxy {
    public static void main(String[] args) {
        IDynamtiSubject sub = new DynamtiSubject();
        TestInokerHandler invoker = new TestInokerHandler(sub);
        IDynamtiSubject proxy = (IDynamtiSubject) invoker.getProxy();

        proxy.test();
        proxy.hello("helo");
    }
}

class TestInokerHandler implements InvocationHandler{
    private Object target;

    public TestInokerHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(target,args);
        System.out.println("after  called zfc dynamit!");
        return result;
    }

    public Object getProxy(){
        return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(),target.getClass().getInterfaces() , this);
    }
}