# Java-DesignPatterns

23-DesignPatterns to Java

* [����ģʽ](#����ģʽ)

# ����ģʽ

* ֻ��Ҫ����һ����ȷ�Ĳ������Ϳ��Ի�ȡ������Ҫ�Ķ��󣬶�����֪���䴴��ϸ�ڡ�

* ����ͻ���ֱ��ȥ��������

* �������ְ����Թ��أ������µĲ�Ʒ��Ҫ�޸Ĺ�������ж��߼���Υ������ԭ��

* �޷�ʵ�ֻ��ڼ̳еĵȼ��ṹ

���� Person: 
![2](image/2.PNG)

ʵ��:
![2](image/3.PNG)
![2](image/4.PNG)

ʹ�ù�����������:
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

���洴������:
```java
public class Test {
    public static void main(String[] args) {
        Person person = new Student() ;
        person.printWork();
    }
}
```
![1](image/5.PNG)

����������:
![1](image/6.PNG)

Ϊ����ѭ����ԭ�򣬹�����������Ҫ��������������������ɣ�����Ӵ���ʱֻ��Ҫ��չFactory��Person�����༴�ɡ�

![1](image/7.PNG)
![1](image/8.PNG)

������ģʽ�¿����ڲ��޸Ĵ���Ļ����ϣ�ֱ�����Class�ļ�����������ࡣ

![1](image/9.PNG)
![1](image/10.PNG)

