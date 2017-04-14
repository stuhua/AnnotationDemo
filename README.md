# AnnotationDemo

编译时注解的小实例

# 背景

使用EventBus时发现的用了反射，单例内部维持一个map对象存储了一堆方法，post根据参数查找方法进行反射调用

注解可以分为：

1. 反射时注解：大量数据时效率不高

2. 编译时注解

#步骤

实现AbstractProcessor，重写其中的process方法

得到注解，再操作

#总结

在面试中能为自己加分的一个东西，好好看看吧 

----
# AnnotationDemo

1. @Retention <br>
   SOURCE, 只在源码中可用//用来标记的，比如Override, SuppressWarnings <br>
   CLASS, 在源码和字节码中可用//编译时注解，需要继承AbstractProcessor类, 实现其抽象方法 <br>
   RUNTIME, 在源码,字节码,运行时均可用//运行时注解,需要用到反射 
 
2. 反射的三种方法

3. Effective Java第六章第35-37条说了注解优先于命名模式

4. [Java 面试题问与答：编译时与运行时](http://www.importnew.com/1796.html)

[![Build Status](https://travis-ci.org/meolu/walle-web.svg?branch=master)](https://travis-ci.org/meolu/walle-web)

**Android Support Annotations**

- Nullness注解@NonNull @Nullable

- 资源类型注解@StringRes

- IntDef和StringDef注解

# 演示

# 特点

 ```
 //元注解
 @Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Test {
}
 ```
 注解并没有什么魔法, 之所以产生作用, 是对其解析后做了相应的处理. 注解仅仅只是个标记罢了.

# CHANGELOG
[Android 注解](https://juejin.im/entry/577142c3a633bd006435eea4)




