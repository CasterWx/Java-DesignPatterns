# Java-DesignPatterns

23-DesignPatterns to Java

* [����ģʽ](#����ģʽ)
* [���󹤳�ģʽ](#���󹤳�ģʽ)
* [�������ģʽ-����ģʽ](#����ģʽ)

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

# ���󹤳�

���󹤳�ģʽ�ṩһ���ӿڣ����ڴ�����ػ���������ļ��壬������Ҫ��ȷָ�������ࡣ���������Ƕ��������������ϡ�

![1](image/11.PNG)

![1](image/12.PNG)

����:

![1](image/13.PNG)
![1](image/14.PNG)


# �������ģʽ-����ģʽ

����ģʽҪҪ�����һ����ֻ�����һ��ʵ����Ҫ��ﵽ����Ч��������Ҫ�ľ��ǽ����췽������Ϊ˽�У�Ȼ��ͨ��static�ķ�������ȡ����

![1](image/15.PNG)

������Ʋ����̰߳�ȫ����Ϊ��`lazySingleton = new LazySingletion()`��һ�����ܻᷢ���̵߳��л������³��ֶ��lazySingletion����

����ͨ�����߳�Debug�����ԡ�

�߳���:

![1](image/16.PNG)

������:

![1](image/17.PNG)

�ڶ��߳�Debugʱ��Ҫ�ڶϵ㴦��ѡ`Thread`��

![1](image/18.PNG)

֮��ʼDebug��

![1](image/19.png)

��ʼʱ����������LazyThread�̶߳���

![1](image/20.png)

���Կ���Ŀǰ���������̣�`Main`,`Thread-0`,`Thread-1`��

�����л���`Thread-0`�����߳�ִ�е�LazySingleton���󴴽�����

![1](image/21.png)

��ʱlazySingleton��û��ʵ������Ϊnull������`Thread-1`Ҳ����ͨ��if�жϽ������С����ǽ�`Thread-1`�߳�Ҳִ�����˴���

![1](image/22.png)

��������˳�������ν�ˣ������̶߳���ȥ�Լ�ʵ����lazySingleton����

![1](image/23.png)

ִ����ɺ�ͨ����ӡ����lazySingleton������ʵ����ͬһ����

����������������أ�

![1](image/24.png)

���Է��ִ󲿷�����¶���ʱͬһ��lazySingleton����

Ϊ�˱�֤�̰߳�ȫ�ԣ�����ͨ��`synchronized`������getInstance������

������������µĵ��ԣ���`Thread-0`����`synchronized`����ʱ���л���`Thread-1`�ᷢ���޷����롣

