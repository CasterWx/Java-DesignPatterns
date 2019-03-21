# Java-DesignPatterns

23-DesignPatterns to Java

* [����ģʽ](#����ģʽ)
* [���󹤳�ģʽ](#���󹤳�ģʽ)
* [�������ģʽ](#�������ģʽ)
    * [�������ģʽ-����ģʽ](#����ģʽ)
        * [���߳�Debug��������](#���߳�Debug��������)
    * [�������ģʽ-����ģʽ](#����ģʽ)

# <span id="����ģʽ">����ģʽ</span>

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

# <span id="���󹤳�">���󹤳�</span>

���󹤳�ģʽ�ṩһ���ӿڣ����ڴ�����ػ���������ļ��壬������Ҫ��ȷָ�������ࡣ���������Ƕ��������������ϡ�

![1](image/11.PNG)

![1](image/12.PNG)

����:

![1](image/13.PNG)
![1](image/14.PNG)

# <span id="�������ģʽ">�������ģʽ</span>
 
## <span id="����ģʽ">�������ģʽ-����ģʽ</span>

����ģʽҪҪ�����һ����ֻ�����һ��ʵ����Ҫ��ﵽ����Ч��������Ҫ�ľ��ǽ����췽������Ϊ˽�У�Ȼ��ͨ��static�ķ�������ȡ����

![1](image/15.PNG)

## <span id="���߳�Debug��������">���߳�Debug��������</span>

������Ʋ����̰߳�ȫ����Ϊ��`lazySingleton = new LazySingletion()`��һ�����ܻᷢ���̵߳��л������³��ֶ��lazySingletion����

����ͨ�����߳�Debug�����ԡ�

�߳���:

![1](image/16.PNG)

������:

![1](image/17.PN  G)

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

����`synchronized`������������ʹ���������ǳ�������ܻ��кܴ��Ӱ�죬�������ǿ���ʹ��`˫����֤`+`synchronized`�ķ���������������

```java
public class LazySingleton {
    private static LazySingleton lazySingleton = null ;
    private LazySingleton(){
    }
    public synchronized static LazySingleton getInstance(){
        if (lazySingleton==null){
            lazySingleton = new LazySingleton() ;
        }
        return lazySingleton ;
    }
    public synchronized static LazySingleton getInstance(){
        if (lazySingleton==null){
            synchronized (LazySingleton.class){
                if (lazySingleton==null){
                    lazySingleton = new LazySingleton();
                }
            }
        }
        return lazySingleton ;
    }   
}
```

���ַ�������ȥû��ʲô���⣬�������Ч�ʣ�������`lazySingleton = new LazySingleton();`��������Jvm��Դ˴�ָ�����š�

������˵���ȳ�ʼ���ö����ַ���ٽ�lazySingletonָ��õ�ַ��

���Ե�һ���߳̽��������ڳ�ʼ��lazySingletonʱ��û���ȳ�ʼ���ö����ڴ��ַ�������Ƚ�lazySingletonָ�����ĵ�ַ���ᵼ��`lazySingleton!=null`��Ȼ��ֱ��ִ��`return lazySingleton;` ��Ҫ���������⣬���Խ�`lazySingleton`��ӹؼ���`volatile`��

## <span id="����ģʽ">�������ģʽ-����ģʽ</span>

����ʽ��Ҫ������ڴ���ʵ��ʱ��ɶ���ĳ�ʼ����

```java
public class HungrySingleton {
    private static HungrySingleton hungrySingleton = null ;
    static {
        hungrySingleton = new HungrySingleton() ;
    }
    public static HungrySingleton getInstance(){
        return hungrySingleton ;
    }
}
```

���þ�̬��������������ڼ���ʱ��ɳ�ʼ����

# ��Ԫģʽ

Ӧ����ϵͳ�ײ�Ŀ������Ա���ϵͳ���������⣬������ϵͳ�д������ƶ�����Ҫ����صĳ�����

�ŵ�: ���ٶ���Ĵ����������ڴ��ж��������������ϵͳ���ڴ棬���Ч�ʡ������ڴ�֮���������Դռ�á�

ȱ��: ��ע��/�ⲿ״̬����ע�̰߳�ȫ���⡣ʹϵͳ�߼����ӻ���