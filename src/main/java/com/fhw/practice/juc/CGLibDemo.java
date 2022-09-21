package com.fhw.practice.juc;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author fhw
 * @version 1.0
 * @date 2022-09-07 20:54
 */


public class CGLibDemo {
    static class Sister {
        public void sing() {
            System.out.println("I am Jinsha, a little sister.");
        }
    }

    //  著作权归https://pdai.tech所有。
    //链接：https://www.pdai.tech/md/interview/x-interview-2.html


    static class CGLibProxy implements MethodInterceptor {

        private Object target;

        public Object getInstance(Object target) {
            this.target = target;
            Enhancer enhancer = new Enhancer();
            // 设置父类为实例类
            enhancer.setSuperclass(this.target.getClass());
            // 回调方法
            enhancer.setCallback(this);
            // 创建代理对象
            return enhancer.create();
        }

        @Override
        public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
            //   著作权归https://pdai.tech所有。
            // 链接：https://www.pdai.tech/md/interview/x-interview-2.html
            System.out.println("introduce yourself...");
            Object result = methodProxy.invokeSuper(o, objects);
            System.out.println("score...");
            return result;
        }
    }

    public static void main(String[] args) {
        CGLibProxy cgLibProxy = new CGLibProxy();
        //获取动态代理类实例
        Sister proxySister = (Sister) cgLibProxy.getInstance(new Sister());
        System.out.println("CGLib Dynamic object name: " + proxySister.getClass().getSimpleName());
        proxySister.sing();
    }
}
