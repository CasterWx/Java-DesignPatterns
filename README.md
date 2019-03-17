# Java-DesignPatterns

23-DesignPatterns to Java

* [工厂模式](#工厂模式)

# 工厂模式

* 只需要传入一个正确的参数，就可以获取你所需要的对象，而无须知道其创建细节。

* 免除客户端直接去创建对象

* 工厂类的职责相对过重，增加新的产品需要修改工厂类的判断逻辑，违背开闭原则。

* 无法实现基于继承的等级结构

基类 Person: 
![2](image/2.PNG)

实现:
![2](image/3.PNG)
![2](image/4.PNG)

使用工厂创建对象:
```java
public class Test {
    public static void main(String[] args) {
        PersonFactory personFactory = new PersonFactory() ;
        Person person = personFactory.getPerson("student") ;
        person.printWork();
    }
}
```
![1](image/1.PNG)

常规创建对象:
```java
public class Test {
    public static void main(String[] args) {
        Person person = new Student() ;
        person.printWork();
    }
}
```
![1](image/5.PNG)

工厂类的设计:
![1](image/6.PNG)

为了遵循开闭原则，工厂类我们需要将其任务由其子类来完成，在添加代码时只需要扩展Factory与Person的子类即可。

![1](image/7.PNG)
![1](image/8.PNG)

在这种模式下可以在不修改代码的基础上，直接添加Class文件来添加其他类。

![1](image/9.PNG)
![1](image/10.PNG)

