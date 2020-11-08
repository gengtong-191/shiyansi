#第四次实验

##一、实验目的

掌握Java中抽象类和抽象方法的定义；

掌握Java中接口的定义，熟练掌握接口的定义形式以及接口的实现方法

了解异常的使用方法，并在程序中根据输入情况做异常处理

##二、实验内容

某学校为了给学生提供勤工俭学机会，也减轻授课教师的部分压力，准许博士研究生参与课程的助教工作。此时，该博士研究生有双重身份：学生和助教教师。

设计两个管理接口：学生管理接口和教师管理接口。学生接口必须包括缴纳学费、查学费的方法；教师接口包括发放薪水和查询薪水的方法。

设计博士研究生类，实现上述的两个接口，该博士研究生应具有姓名、性别、年龄、每学期学费、每月薪水等属性。

编写测试类，并实例化至少两名博士研究生，统计他们的年收入和学费。根据两者之差，算出每名博士研究生的年应纳税金额。

##三、实验要求

在博士研究生类中实现各个接口定义的抽象方法;

对年学费和年收入进行统计，用收入减去学费，求得纳税额；

国家最新纳税标准（系数），属于某一时期的特定固定值，与实例化对象没有关系，考虑如何用static final修饰定义。

实例化研究生类时，可采用运行时通过main方法的参数args一次性赋值，也可采用Scanner类实现运行时交互式输入。

根据输入情况，要在程序中做异常处理。

##四、实验步骤

1.先用interface来定义students和teachers这两个接口接口

2.然后在Graduate里面用implements来实现这两个接口

3.在Graduate里面把学费，收入，纳税的算法写出来

4.用for循环来把这些变量循环，一直到有两个研究生后退出程序

5.加入try-catch函数做异常处

##五.核心代码
 ```a
 for(int i=0;i<2;i++) {
	            Graduate graduate1 = new Graduate();
	            Graduate graduate2 = new Graduate();
	            System.out.println("输入姓名，性别，年龄");
	            Scanner y = new Scanner(System.in);
	            String name = y.nextLine();
	            String sex = y.nextLine();
	            int age = y.nextInt();
	            graduate1.setGraduate(name, sex, age);
	            try {
	                Scanner in = new Scanner(System.in);
	                System.out.println(graduate1);
	                System.out.println("请输入你的月工资：");
	                double pay = in.nextDouble();
	                graduate1.Teachersgetmoney(pay);
	                System.out.println("请输入你的学费：");
	                double free = in.nextDouble();
	                graduate1.Studentsgetmoney(free);
	                graduate1.setRatal();
	                System.out.println("\t");
	                graduate2.setGraduate(name, sex, age);
	            }
	            catch (Exception in){
	                System.out.println("输入有问题，再次输入");
	                i--;
	            }
```
##六.实验结果

![a](https://github.com/gengtong-191/shiyansi/blob/main/62d39ffebc90e518a8ece1506b025af.png)

##七.实验感想

通过这次试验，对for和和scaaner有了更深刻的了解，初次应用了try-catch，对异常处理有了新的认识

interface定义接口，implement实现接口，抽象类既可以重写接口中的方法，也能直接拥有接口中的方法，还有重写接口的方法在实验中的应用，对java有了进一步的认识。
