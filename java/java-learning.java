
=======================================================================================
                              java-runnoob_java基础
=======================================================================================

简介
Java是由Sun Microsystems公司(简称Sun)在1995.05推出的面向对象的高级程序设计语言和Java平台的总称，
主要由James Gosling开发。

Java三个体系
1)JavaSE(J2SE) (Java2 Platform Standard Edition, java平台标准版)
2)JavaEE(J2EE) (Java2 Platform Enterprise Edition, java平台企业版)
3)JavaME(J2EE) (Java2 Platform Micro Edition, java平台微型版)
2005.06，JavaOne大会上Sun发布Java SE 6，各个版本取消数字2，更名为SE，EE以及ME

主要特性
 1)简单：语法与C和C++类似
 2)面向对象
 3)分布式：支持Internet应用开发
 4)健壮的：Java提供的强类型机制、异常处理、垃圾自动回收和安全检查机制等保证了语言的健壮性
 5)安全：安全机制、安全防范机制以及安全管理机制
 6)体系结构中立：.java由编译器编译为.class(字节码)文件，可在任意系统的JVM中解释执行
 7)可移植：编译器由Java实现，运行环境由ANSI C实现。来源于上一条。
 8)解释型
 9)高性能
10)多线程
11)动态


基础语法

一个Java程序可认为是一系列对象的集合，调用彼此的方法来协同工作。
对象：类的实例，有状态(属性)和行为(方法)
类：对象模板
方法：实现特定功能

注意事项
大小写敏感
类名首字母大写，后续采用驼峰写法
方法名首字母小写，后续驼峰写法
源文件与类名相同
所有Java程序有main()方法开始执行

标识符
Java组成部分名字。如类名、变量名及方法名。
以字母，美元符或下划线开始
首字符之后可以字母，美元符、下划线或数字
关键字不能作为标识符
大小写敏感

修饰符
修饰类中的方法和属性
访问修饰符：default,public,protected,private
非访问控制修饰符：final,abstract,strictfp

变量
局部变量：一般是在方法或语句块中，无访问修饰词，只在该方法和语句块中可见，存储在栈上
类变量：静态变量，必须声明为static，大多数情况声明为常量，存储在静态存储区
成员变量：类变量，无static修饰

数组
存储在堆上

枚举
限制变量只能是设定好的值
class FreshJuice{
	enum FreshJuiceSize{
		SMALL, MEDIUM, LARGE
	}
	FreshJuiceSize size;
}

注释
/*多行注释
 *
 */
//单行注释
/*单行注释*/


对象和类

主要概念：多态、继承、封装、抽象、类、对象、实例、方法、重载

构造方法
方法名与类名一致，用于初始化实例对象，没有显式编译器默认提供一个隐式构造方法。

源文件声明规则
一个源文件(.java)只能有一个public类，可以有多个非public类
package语句有的话必须位于首行，import有的话必须位于package和类定义之间

包
主要用于对类或接口进行分类


基本数据类型

两大数据类型
1)内置数据类型
2)引用数据类型

内置数据类型/包装类
1)byte/Byte      8bit 
2)short/Short   16bit
3)int/Integer   32bit
4)long/Long     64bit
5)float/Float   32bit
6)double/Double 64bit
7)boolean/Boolean true/false  默认 false
8)char/Char     16bit \u0000 - \uffff <==>[0, 65535]
9)void/Void 无法直接操作

引用数据类型
对象、数组都是引用类型

常量
程序运行时不能被修改
使用final修饰，变量名一般大写
byte/int/long/short 表示常量时，0开头表示8进制，0x开头表示16进制
char/String 表示Unicode字符，char使用单引号，String使用双引号，\u开头

自动类型转换
低----->高
byte,short,char-->int-->long-->float-->double
boolean 类型不能转换

自动类型装换/强制类型转换


修饰符

访问控制修饰符
实现对类、变量、方法和构造方法的访问控制
default ：缺省，适用于类、接口、变量和方法
private ：同一类中可见，适用于变量和方法
public ：对所有类可见，适用于类、接口、变量和方法
protected ：对同一包内的类可所有子类可见，适用于变量和方法 

访问控制和继承
父类private方法不能被继承
父类中非private方法在子类中必须使用相同访问控制符或更宽松的访问控制符

非访问控制修饰符
static 用于修饰类方法和类变量或静态语句块
final 用于修饰类、方法和变量，分别为不可继承，不能重新定义和常量，表示不可修改
abstract 用于修饰抽象类和抽象方法
synchronized,volatile 主要用于线程编程


运算符
1)算术运算符
2)关系运算符
3)位运算符
4)逻辑运算符
5)赋值运算符
6)其他运算符

其他运算符
条件运算符，也叫三元运算符  ? :

instanceof 运算符
用于检查对象是否为一个特定类型（类类型或接口类型）

循环结构
while
do...while
for

分支结构
if...else
switch(expression){
	case value: //value支持byte、short、int或char，Java7开始支持String
	    //语句
		break; //可选
	case value:
	    //语句
		break; //可选
	//case语句可以有任意个
	default: //可选
	    //语句
}


Number和Math类
Byte、Integer、Double、Float、Short和Long包装类都是抽象类Number的子类

自动拆箱装箱
包装类和内置数据类型的相互转换，由编译器完成

Math类
包含所有用于执行基本数学运算的属性和方法，所有方法均为static形式


Charater类
char的包装类


String类
有约11中构造方法，初始化方式较多

格式化输出字符串
System.out.printf(); //格式化输出，返回PrintStream对象
String.format(); //格式化输出，返回String类型


StringBuffer和StringBuilder
主要用于需要修改的字符串
StringBuffer线程安全，速度慢;StringBuilder相反


数组

声明数组
dataType[] array = new dataType[arraySize];


日期时间

java.util.Date类封装当前日期与时间
Data()和Date(long millisec)两个构造方法初始化Date对象
SimpleDateFormat类用于格式化日期

休眠
Thread.sleep(1000); //阻塞当前线程，单位ms

测量时间
long t = System.currentTimeMills(); //获取当前时间与1970.1.1 00:00:00差值，单位ms

Calendar抽象类
比Date功能强大得多，实现方式也更复杂
Calendar c = Calendar.getInstance(); //初始化，获取当前日期

GregorianCalendar类
Calendar的一个实现类，实现了公立日历


正则表达式
定义了字符串的模式
适用于搜索、编辑或处理文本
几乎所有语言都有正则，但有细微差别

正则处理类
java.util.regex包主要包括Pattern、Matcher和PatternSyntaxException这三个类

Pattern类
其对象为正则表达式的编译表示。该类没有公共构造方法。
通过调用其公共静态方法compile()创建实例化对象，返回Pattern(模式)对象。

Matcher类
其对象是解析及操作字符串的引擎。
需通过调用其公共静态方法matcher()创建实例化对象，返回Matcher(匹配)对象。

PatternSyntaxException
此类是一个非强制异常类，表示正则表达式模式中的语法错误。


方法
System.out.println();
System为系统类
out为标准输出对象
println()为一个方法

命名
一般采用驼峰命名，首字母小写，见名知意。
下划线一般出现在Junit中测试方法用于分割名称的逻辑组件，下划线前后采用驼峰命名。

可变参数的方法
typeName... parameterName

main()的两种形式
main(String[] args) <==> main(String... args)

finalize()方法
一般用于主动清除回收对象，作用于系统垃圾回收之前。
声明格式
protected void finalize(){
	//终结代码
}


Stream、File和IO
java.io包几乎包含了 所有操作输入、输出需要的类。
java.io包中的流支持多种格式，比如：基本类型、对象以及本地化字符集等。
一个流表示一个数据的序列。输入流表示从一个源读取数据，输出流表示向一个目标写数据。
广泛应用于文件传输和网络编程。

控制台输入
import java.io.*
public class BRRead{
	public static void main(String[] args){
		char c; //如需要的读取的是字符串，此句改为 String str;
		//使用System.in创建BufferedReader(输入流)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Systen.out.println("输入字符，按'q'退出。");
		do{
			//不断从控制台读取字符，直到用户输入'q'
			c = (char) br.read();  //如需读取的是字符串，此句改为 str = br.readLine();
			System.out.println(c);
		}while(c != 'q');  //如判断某字符串结束，条件改为 !str.equals("end")
	}
}

控制台输出
绝大部分情况由print()和println()方法完成，在java.io.PrintStream类中定义，System.out是该类对象的一个引用。
PrintStream继承了OutputStream类，实现了write()，最简单的格式如下：
void write(int byteval); //将byteval的第八位字节写到流中

write()实例
int b = 'A';
System.out.write(b);
System.out.write('\n');

读写文件
IO流包括字符流和字节流
字符流包括Reader和Writer //一个或多个字节表示一个字符，由指定的字符编码决定，常见有Unicode编码(utf-8是其中一字符集)
字节流包括InputStream和OutputStream

读写文件最重要的两个字节流是FileInputStream和FileOutputStream

FileInputStream //文件输入流，用于从文件中读取数据
//实例化1
InputStream f1 = new FileInputStream("C:/hello.java");
//实例化2
File f = new File("C:/hello.java");
InputStream f2 = new FileInputStream(f);

FileOutputStream //文件输出流，用于向文件中写入数据
//实例化1
OutputStream f1 = new FileOutputStream("C:/hello.java");
//实例化2
File f = new File("C:/hello.java");
OutputStream f2 = new FileOutputStream(f);

//二进制写入文件并输出到控制台
import java.io.*

public class fileStreamTest{
	public static void main(String[] args){
		try{
			byte[] bWrite = {11,45,77,876,786,3,8,9};
			OutputStream os = new FileOutputStream("test.txt"); //创建字节输出流对象
			for(int i = 0; i < bWrite.length; i++)
				os.write(bWrite[i]); //按二进制字节流写入到文件中
		    os.close(); //关闭输出流
		    InputStream is = new FileInputStream("test.txt"); //创建输入流
		    for(int i = 0; i < is.available(); i++)
			    System.out.print((char)is.read() + " "); //调用输入流的read()方法读取 
		    is.close();
		}catch(IOException e){
			System.out.print("Exception");
		}
	}
}

//指定编码格式写入文件
public class fileStreamTest2{
	public static void main(String[] args){
		File f = new File("test.txt");
		FileOutputStream fos = new FileOutputStream(f); //创建字节输出(写入)流对象，文件不存在会自动创建。输出表示从内存中输出。
		OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8"); //创建字符输出流，指定编码格式
		osw.append("中文输入"); //调用append()方法，写入缓冲区
		osw.append("\r\n"); //换行
		osw.append("English");
		osw.close(); //关闭写入流并把缓冲区内容写入到文件中;也可以主动调用flush方法刷新缓冲区，写入文件
		fos.close(); //关闭输出流，释放系统资源
		FileInputStream fis = new FileInputStream(f); //创建字节输出流对象
		InputStreamReader isr = new InputStreamReader(fis, "UTF-8"); //创建字符输入(读取)流对象，指定编码格式
		StringBuffer sb = new StringBuffer();
		while(isr.ready())
			sb.append((char) isr.read()); //将字符输出流中字符追加到StringBuffer对象中
		System.out.println(sb.toString());
		isr.close(); //关闭读取流
		fis.close(); //关闭输入流，释放系统资源
	}
}

文件和I/O
主要需要知道三个类，分别是File、FileReader和FileWriter

File类
File f = new File("/tmp/user/java/bin"); //创建文件对象
f.mkdir(); //创建bin文件夹，若/tmp/user/java文件夹不存在时，不会创建bin并返回false
f.mkdirs(); //创建文件夹，包含所有父文件夹，类似于Linux里的 mkdir -p
f.isDirectory(); //判断f是否为目录
String[] str = f.list(); //返回文件夹中所有的子文件和子目录
delete(f); //删除文件或空文件夹

删除指定目录中所有的子文件和子目录
import java.io.File;

public class DeleteFileDemo{
	public static void main(String[] args){
		File f = new File("/tmp/java"); //创建文件对象
		deleteFolder(f); //递归删除java目录下所有的文件和文件夹
	}
	public static void deleteFolder(File f){
		File[] fs = f.listFiles(); //创建文件数组，获取指定目录下的文件和文件夹对象
		if(fs != null){
			for(File f : fs){ //foreach循环
				if(f.isDirectory) //判断是否为文件夹
					deleteFolder(f); //递归删除
				else
					f.delete(); //删除文件或空文件夹
			}
		}
		f.delete(); //删除指定目录或文件
	}
}


Scanner类
用于获取用户输入
Scanner s = new Scanner(Sysytem.in); //获取键盘输入
next()和nextLine()方法获取输入字符串
hasNext()和hasNextLine()判断是否还有输入数据
hasNextInt(); //判断输入是否为Int类型数据；其他基本类型类似

next()和nextLine()的区别
next()
必须读取到有效输入才可以结束输入
字符串前空格会忽略，后面的空格作为结束符
nextLine()
Enter作为结束符,能获取带有空格的字符串


异常处理
主要为以下三类
1.检查型异常：用户错误或问题引起的，程序员无法预见，编译时不能简单被忽略
2.运行时异常：程序员可能避免的异常，编译时可被忽略
3.错误：错误不是异常，一般指程序脱离控制。在代码通常被忽略，编译时无法被检查到。

Exception类的层次
所有异常类都是java.lang.Exception类的子类
Throwable类包括Error类和Exception类
Exception包括IOException、RuntimeException等子类
Error一般指运行时环境发生的错误，例如：JVM内存溢出、通信时网络中断等


继承
目的
1.代码复用
2.便于创建等级层次的类

class A extends B{   //A继承B
    //code	
}

class C implements A,B{  //C实现借口A和B
	//code
}

继承的特性
子类拥有父类非 private 的属性及方法
子类可以拥有自己的属性及方法，用于对父类的扩展
可以对父类的非 final 方法重新实现
java为单继承，但可以实现多个接口来体现多继承的形式
提高了类之间的耦合性
final 类不能被继承

super 和 this 关键词分别实现对父类和子类成员的访问

构造器
用于初始化实例
子类不能继承父类的构造方法
父类构造器带有参数，子类构造器中必须通过 super 关键词显式调用父类构造器
父类构造器无参数时，子类构造器无需显式调用，系统会自动调用父类的无参构造器


重写(Override)
子类对父类的允许访问的方法的实现过程重新编写

重写规则
返回值类型需相同或者其兼容类型(子类型)
形参类型数量顺序都不能变
成员方法只能被它的子类重写
private 和 final 方法不能被重写
static 方法不能被重写，可以再次声明
子类和父类不在同一包内，只能重写申明为 public 和 protected 的非final方法
重写的方法可以任何非强制异常，但不能抛出新的检查异常以及更宽泛的异常
构造方法不能被重写

重载(Overload)
重载是在同一个类中，方法名相同，参数列表不同。返回值类型可以不同。

重载规则
重载方法名必须相同
重载方法必须改变参数列表，即参数数量、顺序或参数类型一项或多项不一致
返回值类型可以不同
访问修饰符可以不同
可以申明新的或者更广的检查异常

总结
重写和重载是Java多态的不同表现
重写体现同一方法在父子类中不同的实现形式
重载体现的是同一个类中方法功能的扩展，例如：原方法只能实现两个整数的和，通过重载可以实现两个浮点数或一个整数和一个浮点数的和或多个整数的和


多态

优点或作用
1.消除类型直接的耦合性
2.可替代性
3.可扩充性
4.接口性
5.灵活性
6.简化性

实现方式
1.Override和Overload
2.接口
3.抽象类和抽象方法

多态存在的三个必要条件
继承;重写;父类引用指向子类对象

//例子如下
Parent p = new Child();
当通过对象p调用某方法时，先检查父类中是否有此方法，
如没有编译报错，有的话调用子类同名方法。
这种调用方式也叫做虚拟方法调用


抽象类
通过 abstract class 来描述一个类
不能实例化，只能通过其非抽象子类实现
有抽象方法的类必须声明为抽象类
其子类必须重写父类所有抽象方法，除非子类也是抽象类
抽象类不一定包括抽象方法
构造方法、类方法（ static 修饰）不能声明为抽象方法

抽象方法
用 abstract 修饰的方法
只有方法名，没有方法体，由子类实现


封装
隐藏实现细节
防止该类的代码和数据被外部定义的代码随机访问
减少耦合
内部实现细节可自由修改

实现封装步骤
1.private 修饰成员变量
2.通过get和set方法获取和设置成员变量的值


接口/Inreface
一个抽象类型，是抽象方法的集合
非抽象类必须实现所继承接口的所有方法
接口无法实例化

接口与一般类的区别
与类很相似
不能实例化对象
没有构造方法
所有方法都是抽象方法
没有成员变量，可以有final和static变量
支持多继承

接口特性
接口声明前不加 abstract 关键词
其每方法都是是隐式抽象的,并被隐式的指定为 public abstract,声明时一般不加 abstract
其变量会被隐式的指定为 public static final,
其方法是不能在接口中实现的，只能由实现接口的类来实现接口中的方法
使用 implements 关键词在class声明后面实现该接口，若实现多个接口，需逗号隔开


接口的声明
[可见度修饰词] interface 接口名称 [extends 接口A,接口B,...]{
	//声明变量
	//抽象方法
}

标记接口
没有任何方法和属性的接口，仅仅表明实现它的类属于特定类型，供其他代码来测试允许做的一些事情
其作用是给某个对象打个标(盖个戳)，使对象拥有某个或某些特权
主要目的：
1.建立一个公共父接口，用于建立一组接口的父接口
2.向一个类添加数据类型，其实现类通过多态性变成一个接口类型


包/package

包的作用
1.为了更好地组织类、接口等，把功能相似或相关的放在同一个包中，方便查询和使用
2.同文件夹一样，包采取树形目录的存储方式
3.包机制主要解决命名冲突，访问控制，提供搜索和定位类、接口、枚举和注释等

package/import 分别用于创建和导入包
包名一般互联网域名的倒序方式，一般为小写，例如：com.baidu.test


数据结构
Java工具包提供了强大的数据结构，主要包括以下几种接口和类:
枚举/Enumeration //此接口本身不属于数据结构，定义了一种从数据结构中取回连续元素的方式
位集合/BitSet    //实现了一组可以单独设置和清除的位或标志，处理一组布尔值比较方便
向量/Vector      //类似于传统数组，但长度可以动态变化
栈/Stack         //对象垂直分布的栈，先进后出，后进先出
字典/Dictionary  //定义了键映射到值得数据结构的抽象类，通过键访问值
哈希表/Hashtable //此类提供了一种在用户定义键结构的基础上组织数据的手段
属性/Properties  //继承于Hashtable.Properties
以上的类或接口是传统遗留的，之后版本主要为集合框架(Collection)


集合框架

特性
1.高性能。基本集合(动态数组，链表，树，哈希表)的实现也必须是高效的
2.允许不同类型的集合，以类似的方式工作，具有高度的互操作性
3.对一个集合的扩展和适应是简单的

集合框架主要包括两种类型的容器接口：Collection和Map

框架内容
1.接口：代表集合的抽象数据类型。如：Collection/List/Set/Map等，用于操作不同的集合对象
2.实现类：接口的具体实现。如：ArrayList/LinkList/HashSet/HashMap
3.算法/方法：对集合元素的常见操作，一般通过Collections类的静态方法实现。如：搜索和排序

集合接口

Collection接口
最基本的接口，Java不直接提供继承于该类的实现类，而是提供了子接口(List和Set)。存储一组不唯一，无序的对象

List接口
不唯一、有序，和数组类似，可根据实际存储数据的长度自动增长，
检索效率高，插入删除效率低，主要实现类有ArrayList、LinkedList、Vector

Set接口
唯一、无序，检索效率低，删除插入效率高且不会改变元素位置，
主要实现类为HashSet和TreeSet

SortedSet接口
继承于Set，但有序

Map接口
存储一组键值对对象，并提供key到value的映射

集合实现类/抽象类
1.AbstractCollection 
实现了大部分的集合接口。
2.AbstractList 
继承于AbstractCollection 并且实现了大部分List接口。
3.AbstractSequentialList 
继承于 AbstractList ，提供了对数据元素的链式访问而不是随机访问。
4.LinkedList
该类实现了List接口，允许有null（空）元素。主要用于创建链表数据结构，
该类没有同步方法，如果多个线程同时访问一个List，则必须自己实现访问同步，
解决方法就是在创建List时候构造一个同步的List。例如：
Listlist=Collections.synchronizedList(new LinkedList(...));
LinkedList 查找效率低。
5.ArrayList
该类也是实现了List的接口，实现了可变大小的数组，随机访问和遍历元素时，
提供更好的性能。该类也是非同步的,在多线程的情况下不要使用。
ArrayList 增长当前长度的50%，插入删除效率低。
6.AbstractSet 
继承于AbstractCollection 并且实现了大部分Set接口。
7.HashSet
该类实现了Set接口，不允许出现重复元素，不保证集合中元素的顺序，
允许包含值为null的元素，但最多只能一个。
8.LinkedHashSet
具有可预知迭代顺序的 Set 接口的哈希表和链接列表实现。
9.TreeSet
该类实现了Set接口，可以实现排序等功能。
10.AbstractMap 
实现了大部分的Map接口。
11.HashMap 
HashMap 是一个散列表，它存储的内容是键值对(key-value)映射。
该类实现了Map接口，根据键的HashCode值存储数据，具有很快的访问速度，
最多允许一条记录的键为null，不支持线程同步。
12.TreeMap 
继承了AbstractMap，并且使用一颗树。
13.WeakHashMap 
继承AbstractMap类，使用弱密钥的哈希表。
14.LinkedHashMap 
继承于HashMap，使用元素的自然顺序对元素进行排序.
15.IdentityHashMap 
继承AbstractMap类，比较文档时使用引用相等。

java.util中定义的类
1.Vector 
该类和ArrayList非常相似，但是该类是同步的，可以用在多线程的情况，
该类允许设置默认的增长长度，默认扩容方式为原来的2倍。
2.Stack 
栈是Vector的一个子类，它实现了一个标准的后进先出的栈。
3.Dictionary 
Dictionary 类是一个抽象类，用来存储键/值对，作用和Map类相似。
4.Hashtable 
Hashtable 是 Dictionary(字典) 类的子类。
5.Properties 
Properties 继承于 Hashtable，表示一个持久的属性集，
属性列表中每个键及其对应值都是一个字符串。
6.BitSet
一个Bitset类创建一种特殊类型的数组来保存位值。BitSet中数组大小会随需要增加。

集合算法
集合框架定义了几种算法，可用于集合和映射。这些算法被定义为集合类的静态方法。
还有三个静态变量：EMPTY_SET、EMPTY_LIST、EMPTY_MAP

迭代器/Iterator
一般数组遍历使用for或增强for，也可以用于集合框架
也可以使用Iterator或ListIterator接口的实现类遍历集合框架的元素或删除其中的元素
ListIterator继承了Iterator，允许双向遍历List和修改元素

集合框架总结
集合框架为程序员提供了预先包装的数据结构和算法来操纵它们
集合是一个类，用于容纳其他对象的引用
集合框架的类和接口均在java.util
任何对象加入某个集合后自动转为Object类型，取出时需要做强制类型转换


泛型/generics
jdk 5 中引入的的一个新特性，提供编译时类型安全监测机制
本质是参数化类型，即所操作的数据类型被指定一个参数

泛型方法
泛型方法在调用时可以接受不同类型的参数
定义规则如下：
1.声明在返回类型之前。 //如：public static < E > void printArray( E[] inputArray ){}
2.泛型参数只能是引用类型

有界参数类型的泛型方法 //用于限定参数类型的范围
如下比较三个可比较的对象的最大值
public static < T extends Comparable<T> > T maximum(T x, T y, T z){
	T max = x;
	if(y.compareeTo(max) > 0)
		max = y;
	if(z.compareeTo(max) > 0)
		max = z;
	return max;
}

泛型类 
类名后添加泛型参数声明部分
public class Box< T >{
	private T t;
	public void add(T t){
		this.t = t;
	}
	public T get(){
		return t;
	}
	
	public static void main(String[] args){
		Box<integer> iBox = new Box<Integer>(); 
		Box<String> sBox = new Box<String>();
		iBox.add(new Integer(10));
		sBox.add(new String("runoob"));
	}
}

类型通配符
例如：List<?>
//main()方法中实例化三个对象
List<String> s = new ArrayList<String>();
List<Integer> i = new ArrayList<Integer>();
List<Number> n = new ArrayList<Number>();
//类方法统配调用
//方法1
public static void getData(List<?> data){
	//直接获取三个对象的值，无需调用三次
	System.out.println(data.get(0));
}
//方法2，设定通配上限。非Number类及其子类的对象参数会被过滤掉
public static void getUperNumber(List<? extends Number> data){
	//直接获取三个对象的值，无需调用三次，实际不会获取对象 s 的值
	System.out.println(data.get(0));
}
通配符上限形如 List<? extends T> //匹配T类型及其子类
通配符下限形如 List<? super T> //匹配T类型及其父类


序列化
对象序列化机制中，一个对象可以被表示为一个字节序列，将序列化对象写到文件之后，
可以从文件中读取出来，并对其反序列化，就可以在内存新建其对象

对象序列化条件
1.此类必须实现java.io.Serizable接口。可查API文档或通过反射获取是否已实现此接口
2.该类所有的属性必须是可序列化的。如果某个属性不是可序列化的，则该属性必须注明是短暂的


网络编程

java.net包提供了两种常见的网络协议的支持
TCP：传输控制协议，解决了两个应用程序之间的可靠通信。常用的通信互联网协议，被称为TCP/IP
UDP：用户数据报协议，无连接式广播协议，用于两个应用程序之间，但不是可靠的

Socket编程/套接字编程
套接字使用TCP提供了两台计算机之间的通信机制。
java.net.Socket类和ServerSocket类表示客户端和服务端之间的套接字
以下是连接步骤：
1.服务端实例化一个ServerSocket对象
2.服务端的对象调用accept()方法等待客户端连接
3.客户端实例化一个Socket对象，向客户端发出连接请求
4.通过三次握手建立通信连接，然后发送或接受数据


多线程编程
一个线程指的是某个进程中一个单一顺序的控制流，不能独立存在
一个进程可以有多个线程，每个线程执行不同的任务

线程的生命周期
新建状态   //使用new关键词和Thread或其子类建立一个线程对象，知道执行start()方法之前
就绪状态   //执行start()方法，线程处于就绪队列中，并等待JVM线程调度器调用
运行状态   //获取系统资源，执行run()方法
阻塞状态   //一个线程执行了sleep()、suspend(挂起)等方法，失去所占用的资源。可理解为暂停等待状态中
  等待阻塞 //执行了wait()方法
  同步阻塞 //获取synchronized同步锁失败(同步锁被其他线程占用)
  其他阻塞 //执行sleep()或join()后
死亡状态   //线程完成任务或其他终止条件发生时

线程优先级
方便操作系统调用，确定执行顺序
优先级为整数[1,10]/[Thread.MIN_PRIORITY,Thread.MAX_PRIORITY]
默认优先级为5
线程优先级不能保证线程的执行顺序，而且非常依赖与平台

创建一个线程
以下三种方法都可用于创建一个线程
1.实现Runnable接口
2.继承Thread类
3.通过Callable和Future创建


文档注释
Java支持三种文档注释方式
1.//       单行注释
2./* */    多行注释
3./**      文档注释
     */

javadoc标签


Java 8
Oracle公司于2014.03.18发布，支持函数式编程，
新的JavaScript引擎，新的日期API，新的Stream API等

新特性
1.Lambda表达式。允许函数作为方法的参数
2.方法引用。可以直接引用已有Java类或者对象的方法或者构造器
3.默认方法。在接口里有了一个实现的方法
4.新的工具。新的编译工具，如：Nashorm引擎jjs、类依赖分析器jdeps
5.Stream API。引入函数式编程
6.Date Time API。加强对时间与日期的处理
7.Optional类。java类库的一部分，用于解决空指针异常
8.Nashorm JavaScript引擎。允许在JVM运行特定的js程序


Java 9
java9于2017.09.22发布，最主要的新特性是已经实现的模块化系统

新特性
 1.模块系统。模块是一个包的容器，引入了模块系统(Jigsaw)
 2.REPL(JShell)。交互式编程环境
 3.HTTP/2客户端。HTTP/2标准是HTTP协议的最新版本，新的HTTPClientAPI支持WebSocket和HTTP2流以及服务器推送特性。
 4.改进的Javadoc。Javadoc支持在API文档中的进行搜索，Javadoc的输出符合兼容HTML5标准。
 5.多版本兼容JAR包。能让你创建仅在特定版本的Java环境中运行库程序时选择使用的class版本。
 6.集合工厂方法。List，Set和Map接口中，新的静态工厂方法可以创建这些集合的不可变实例。
 7.私有接口方法。在接口中使用private私有方法。我们可以使用private访问修饰符在接口中编写私有方法。
 8.进程API。用于控制和管理操作系统进程。
 9.改进的Stream API。添加了一些便利的方法，使流处理更容易，并使用收集器编写复杂的查询。
10.改进try-with-resources。该语句中使用final变量，而无需在语句中声明一个新变量。
11.改进的弃用注解@Deprecated。用于标记 Java API 状态，被标记的 API 将会被移除或已经破坏。
12.改进钻石操作符(Diamond Operator)。匿名类可以使用钻石操作符(Diamond Operator)。
13.改进Optional类。java.util.Optional 添加了很多新的有用方法，Optional 可以直接转为 stream。
14.多分辨率图像API。定义多分辨率图像API，开发者可以很容易的操作和展示不同分辨率的图像了。
15.改进的CompletableFuture API。次类的异步机制可以在 ProcessHandle.onExit 方法退出时执行操作。
16.轻量级的JSON API。内置了一个轻量级的JSON API
17.响应式流（Reactive Streams) API。引入了新的响应式流 API 来支持 Java 9 中的响应式编程。




=======================================================================================
                              java-runnoob_java示例
=======================================================================================

环境设置
1.1 编译运行java文件-HelloWorld.java
先配置好系统java运行环境
将代码通过文本编辑器(推荐使用Notepad++)写入HelloWorld.java文件中
命令行执行：
javac /path/HelloWorld.java  //编译java文件，生成.class字节码文件
java /path/HelloWorld   //调用jvm并加载java类库，解释执行字节码文件

1.2 查看java版本
命令行执行
java -version

1.3 获取当前时间与1970.01.01 00:00:00的差值
long startTime = System.currentTimeMillis(); //以毫秒计
long endTime = System.currentTimeMillis();
 
字符串
2.1 字符串比较
比较两个字符串，并返回字符串中第一个字母ASCII的差值
string1.compareTo(string2)
string1.compareToIgnoreCase(string2) //忽略大小写

2.2 字符串/字符查找
//返回string2在string1中最后出现的的位置(索引)，若返回-1说明无此字符串
int lastIndex = string1.lastIndexOf(string2)
//返回字符串出现第一个位置索引,不存在返回-1
int intIndex = str.IndexOf(string)

2.3 字符串截取
//截取[i,j)直接的字符串
String str = string.substring(int startIndex, int endIndex)
String str = string.substring(int startIndex)

2.4 字符串/字符替换
str.replace(char c1, char c2)
str.replaceFirst(String oldString, String newString)
str.replaceAll(String oldString, String newString)

2.5 字符串反转
String reverse = new StringBuffer(str).reverse().toString();

2.6 字符串切割
//delimeter为指定分隔符(特殊字符需要转义)，split()方法将字符串分割成字符串数组
String str = "asdas dwefradwe"
String[] strArray = str.split(String delimeter)
//StringTokenizer类
StringTokenizer st = new StringTokenizer(String str); //通过空格分割
StringTokenizer st = new StringTokenizer(String str, String delimeter); //通过delimeter分割
while(st.hasMoreElements()){
	System.out.println(st.nextElement());
}

2.7 字符串大小写转换
String str = new String(string).toUpperCase(); //转大写
String str = new String(string).toLowerCase(); //转小写

2.8 字符串区域是否相等
//ignoreCase:值为true是表示忽略大小写
//toffset:str的第(toffset - 1)位开始比较
//ooffset:otherStr的第(ooffset - 1)位开始比较
//len:比较位数
boolean isMath = str.regionMatches(boolean ignoreCase, int toffset, String otherStr, int ooffset, int len);
boolean isMath = str.regionMatches(int toffset, String otherStr, int ooffset, int len); //不忽略大小写	

2.8 字符串优化
String.intern(); 
//jdk1.7/1.8 常量池置于堆空间，可用于节约内存空间，
//减少垃圾回收(GC)时间,主要用于大量使用相同字符串的场景

//jdk1.6及以下 常量池置于Perm 区（属于方法区）中，与堆空间独立

2.9 格式化字符串
System.out.format()

2.10 字符串连接
//+连接
String str = String str1 + String str2;
//调用StringBuffer的append()方法
StringBuffer strb.append(String str);


数组
3.1 数组排序及查找
//常用排序算法及实现
https://blog.csdn.net/hguisu/article/details/7776068
Arrays.sort(array); //调用Array.sort()方法排序，从大到小
//Arrays.binarySearch()方法返回索引
int index = Arrays.binarySearch(array, array.Element);

3.2 数组长度
String[][] data = new String[2][5];
data.length = 2; //一维数组长度,列长度
data[0].length = 5;  //二维数组长度,行长度
注：string.length()为字符串方法，表示字符串中字符个数

3.3 数组反转
ArrayList<String> arrayList = new ArrayList<String>();  //集合字符串数组
arrayList.add(string_1); //通过add()方法添加字符串数组
...
arrayList.add(string_n);
Collections.reverse(arrayList);  //通过Collections.reverse()方法反转数组

3.4 数组访问
String[] str = new String[];
str[index];  //访问方式，index从0开始

3.5 获取数组最值
//通过Arrays.asList()转化成List集合，再调用Collections.min()方法取得最值
Integer[] numbers = { 8, 2, 7, 1, 4, 9, 5};
int min = (int) Collections.min(Arrays.asList(numbers));
int max = (int) Collections.max(Arrays.asList(numbers));

3.6 数组合并
List list = new ArrayList(Arrays.asList(String[] a));
list.addAll(Arrays.asList(String[] b));
String[] c = Arrays.toString(list.toArray())

3.7 数组填充
int[] array = new int[6];
//通过 Arrays.fill(arrayname,value)填充6个100
Arrays.fill(array, 100);
//通过下面方法可以对数组指定位置赋值
Arrays.fill(arrayname ,int startIndex ,int endIndex ,value)

3.8 数组扩容
//src_arrayname   源数组
//int src_index   从源数组取元素位置
//dest_arrayname  目的数组/需要填充数组
//int dest_index  目的数组扩充位置
//int length      填充长度
System.arraycopy(src_arrayname, int src_index, dest_arrayname, int dest_index, int length);

3.9  删除数组元素
ArrayList<String> arr = new ArrayList<String>();
arr.clear();  //清空元素
arr.add(0,"元素0"); 
arr.add(1,"元素1"); 
arr.add(2,"元素2"); 
arr.remove(1); //按照索引删除
arr.remove("元素0"); //按照值删除

3.10 数组差集
ArrayList arr = new ArrayList();
ArrayList arr1 = new ArrayList();
arr.removeAll(arr1); //返回arr，删除arr中arr1存在的元素

3.11 数组交集
ArrayList arr = new ArrayList();
ArrayList arr1 = new ArrayList();
arr.retainAll(arr1); //返回arr，结果arr和arr1交集元素

3.12 数组包含关系
ArrayList<String> arr = new ArrayList<String>();
ArrayList<String> arr1 = new ArrayList<String>();
boolean isContains = arr.contains(arr1); //arr1是否是arr的子集
boolean isContains = arr.contains(String str) //arr是否包含str字符串

3.13 判断数组是否相等
//判断str和str1是否相等
boolean isEqual = Arrays.equals(String[] str, String[] str1);

3.14 数组并集
String[] str = new String[];
String[] str1 = new String[];
String[] str2 = union(str, str1); //union()实现并集
//或者通过HashSet实现元素唯一性
public static String[] union(String[] str1, String[] str2) {
    Set<String> set = new HashSet<String>();
    for (String str : str1) {set.add(str);}
    for (String str : str2) {set.add(str);}
    String[] result = {  };
    return set.toArray(result);
}


时间处理
4.1 时间格式化
Date date = new Date();
String strDateFormat = "yyyy-MM-dd HH:mm:ss";
SimpleDateFormat sdf = new SimpleDateFormat(sreDateFormat);
System.out.println(sdf.format(date));

4.2 获取当前时间
SimpleDateFormat sdf = new SimpleDateFormat(); //格式化时间
sdf.applyPattern("yyyy-MM-dd HH:mm:ss a");  //a为am标记
Date date = new Date(); //获取当前时间
System.out.println("现在时间" + sdf.format(date));

4.3 获取年份/月份
Calendar cal = Calendar.getInstance();
int day = cal.get(Calendar.DATE); //当月多少号
int month = cal.get(Calendar.MONTH) + 1;
int year = cal.get(Calendar.YEAR);
int dow = cal.get(Calendar.DAY_OF_WEEK);
int dom = cal.get(Calendar.DAY_OF_MONTH);
int doy = cal.get(Calendar.DAY_OF_YEAR);
String time = cal.getTime(); //格式例如Fri Mar 27 21:44:15 CST 2015

4.4 时间戳转换成时间
Long timeStamp = System.currentTimeMillis(); //获取当前时间戳
SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
Date date = new Date(Long.parseLong(String.valueof(timeStamp))); //转化时间对象
String sd = sdf(date); //格式化时间为字符串


方法
5.1 Overloading 重载/方法重写
主要用于继承，子类重载父类方法
方法名相同，返回类型不同或参数个数或参数类型或参数顺序等一个或多个差异
myFunction(); //原方法
myFunction(int i);
int myFunction(int i, int j);

5.2 输出数组元素
通过重载和foreach循环打印数组
例如：
void printArray(Integer[] inputArray)
for(Integer element : inputArry){
	System.out.printf("%s ", element)
}

5.3 递归算法-汉诺塔
三个杆子A,B,C ，A上有若干碟子从大到小依次从下往上排列，
要求：所有碟子从A杆移到C杆，每次只能移动一个盘子，大的不能放到小的上面
public class MainClass{
	public static void main(String[] args){
		int nDisks = 3;
		doTowers(nDisks, 'A', 'B', 'C');
	}
	public static void doTowers(int topN, char from, char inter, char to){
		if(topN == 1){
			System.out.println("Disk1 1 from" + from + " to " + to);
		}else{
			doTowers(topN -1, from, to, inter);
			System.out.println("Disk " + topN + " from " + from + " to " + to);
			doTowers(topN - 1, inter, from, to);
		}
	}
}

5.4 斐波那契数列
long fibonacci(int n){
	if((n == 0) || (n == 1))
		return n;
	else
		return fibonacci(n - 1) + fibonacci(n - 2);
}

5.5 阶乘
long factorial(int n){
	if(n <= 1)
		return 1;
	else
		return n * factorial(n - 1);
}

5.6 Overriding 方法覆盖
重写父类方法，不同的实现方式，返回类型、方法名、参数签名完全一致

5.7 instanceof 二元操作符，用于判断对象实例
boolean i = a instanceof B; //判断a是否是B类的实例

5.8 循环标签break和continue
break    //跳出循环体
continue //跳出本次循环，进行下次循环

5.9 枚举类和switch语句
enum Car {lamborghini,tata,audi,fiat,honda}; //定义枚举类

Car c = Car.tata;
switch(c){
	case lamborghini:
		System.out.println("你选择了lamborghini!");
		break;
	case tata:
		System.out.println("你选择了tata!");
		break;
	...
	default:
		System.out.println("不知道你的车型!");
		break;
}

5.10 枚举类构造函数及方法的使用
enum关键字用于创建枚举类，隐含了所创建的类型都是java.lang.Enum的子类
enum Car{
	a(1231),b(12434),c(23453);
	prinate int price;
	Car(int p){
		price = p;
	}
	int getPrice(){
		return price;
	}
}
//foreach循环输出
for(Car x : Car.values()){
	System.out.println(x + " 需要 " + x.getPrice() + " 千美元。");
}

5.11 循环语句
//常规for循环
for(初始化;布尔表达式;更新语句){
	//代码语句
}
//加强for循环--foreach
for(元素类型 变量名：遍历对象){
	//语句
}

5.12 可变参数
//可变参数求和
int mySum(int... intArrays){
	int sum = 0;
	for(int i = 0; i < intArrays.length; i++){
		sum += intArrays[i];
	}
	return sum;
}
//引用
sum = mySum(new in[]{1,43,89,8,45})


文件操作
//需引入io库
import java.io.*;
6.1 文件写入
try{
	BufferedWriter out = new BufferedWriter(
	    new FileWriter("runoob.txt"));
	out.write("菜鸟教程")；
	out.close();
}catch(IOException e)

6.2 文件读取
try{
	BufferedReader in = new BufferedReader(
		new FileReader("test.log"));
	while((String str = in.readLine()) != null){
		System.out.println(str);
	}
	System.out.println(str);  //此时，str已经是null
}catch(IOException e)

6.3 文件删除
try{
	File file = new File("c:\\test.txt");
	if(file.delete()){
		System.out.println(file.getName() + "文件删除成功!");
	}else{
		System.out.println("文件删除失败！");
	}
}catch(IOException e){
	e.printStackTrace(); //捕获堆栈信息
}

6.4 文件内容复制
BufferedWriter out1 = new BufferedWriter(new FileWriter("src_file"));
out1.write("string to be copied\n");
out1.close();
InputStream in = new FileInputStream(new File("src_file"));
OutputStream out = new FileOutputSream(new File("deat_file"))
byte[] buf = new byte[1024];
int len;
while((len = in.read(buf)) > 0){
	out.write(buf,0,len);
}

6.5 文件内容追加
try{
	BufferedWriter out = new BufferedWriter(new FileWriter("filename"))；
	out.write("aString1\n");
	out.close();
	out = new BufferedWriter(new FileWriter("filename", true));
	out.write("aString2\n");
	out.close();
	BufferedReader in = new BufferedReader(new FileReader("filename"));
	while((String str = in.readLine()) != null){
		System.out.println(str);
	}
	in.close();
}catch (IOException e){
	Sysytem.out.println("Exception occoured" + e);
}

6.6 临时文件的创建
a)File.createTempFile(String prefix, String suffix) //参数分别为前缀、后缀
public static void main(String[] args) throws Exception{
	File temp = File.createTempFile("tmp", ".txt") //创建tmp.txt临时文件
	String path = temp.getAbsolutePath(); //获取文件绝对路径
	temp.deleteOnExit();  //执行后删除临时文件
	BufferedWriter out = new BufferedWriter(new FileWriter(temp));
	out.write("aString\n"); //向临时文件中写入数据
	out.close();
}
b)File.createTempFile(String prefix, String suffix, File directory)
File f = null;
try{
	f = File.createTempFile("tmp", ".txt", new File("C:/")); //创建临时文件
	f1 = File.createTempFile("tmp", null, new File("D:/")); //创建不带后缀的临时文件
	f.deleteOnExit(); //执行后删除文件
	f1.deleteOnExit(); //执行后删除文件	
}catch(Exception e){
	e.printStackTrace();  //如有错误输出内容
}

6.7 文件修改日期
File f = new File("C:/my.txt"); //创建文件
f.lastModified(); //修改最后修改时间
Date fTime = new Date(f.lastModified()); //获取修改时间
System.out.println(f.toString());  //将修改时间转换成String类型并输出
boolean b = f.setLastModified(System.currentTimeMillis()); //修改最后修改时间，返回值为布尔类型
fTime = new Date(f.lastModified()); //获取修改时间
System.out.println(f.toString());  //输出时间

6.8 获取文件大小
File f = new File(filename); //创建文件对象
boolean b1 = f.exists(); //判断文件是否存在
boolean b2 = f.isFile(); //判断是否为文件
long size = f.length(); //获取文件大小，以byte计

6.9 文件重命名
File f_old = new File(filename1);
file f_new = new File(filename2);
boolean b = f_old.renameTo(f_new); //重命名成功返回true

6.10 设置文件只读
File f = new File(filename);
boolean b1 = f.setReadOnly(); //设置只读
boolean b2 = f.canWrite(); //判断是否可写

6.11 指定目录创建文件
File dir = new File(path);
File file = File.createTempFile("文件名", "后缀名", dir);

6.12 创建文件
try{
	File f = new File("C:/myfile.txt"); //创建新文件
	boolean b = f.createNewFile(); //判断新文件是否创建
}catch(IOException e){
	e.printStackTrace();
}

6.13 判断文件是否在同一目录下
File f1 = new File("C:/File/123.txt");
File f2 = new File("C:/java/234.txt");
if(f1.compareTo(f2) == 0)  //判断文件路径是否一致
	System.out.println("文件路径一致");
else
	System.out.println("文件路径不一致");


目录操作
7.1 创建目录
String dir = "D:\\a\\b\\c\\d\\e"; //定义目录
File f = new File(dir); //创建文件对象
boolean b = f.mkdir(); //返回创建结果

7.2 删除目录
public static void main(String[] args) thorows Exceptiom{
	deleteDir(new File("./test")); //删除test
}

public static boolean deleteDir(File dir){
	if(dir.isDirectory()){ //判断是否为目录
		String[] children = dir.list(); //返回目录下所有文件及目录
		for(int i = 0;i < children.length; i++){ //递归删除
			boolean success = deleteDir(new File(dir, children[i]));
			if(!success){
				return false;
			}
		}
	}
	if(dir.delete()){
		System.out.println("目录已被删除！");
		return true;
	}else{
		System.out.println("目录删除失败！");
		return false;
	}
}

7.3 判断目录是否为空
File file = new File("./testdir");
file.isDirectory(); //判断是否为目录
file.list().length; //返回目录下目录和文件总数

7.4 判断目录是否隐藏
File file = new File("C:/test.txt");
boolean b = file.isHidden();

7.5 获取目录大小
long size = FileUtils.sizeOfDirctory(new Fiile("C:/test")); //以byte计

7.6 获取文件上级目录
File file = new File("C:/file/test.txt");
String strParenDir = file.getParent();

7.7 打印目录结构
public static void main(String[] args) throws IOException{
	showDir(1, new File("c:\\test"));
}
static viod showDir(int indent, File file) throws IOException{
	for(int i = 0; i < indent; i++)
		Systen.out.print('-');
	System.out.println(file.getNmae());
	if(file.isDirectory()){
		File[] files = file.listFiles();
		for(int i = 0; i < files.length; i++)
			showDir(indent + 4,files[i]);
	}
}

7.8 遍历指定目录下的所有目录
File dir = new File("c:");
File[] files = dir.listFiles();
FileFilter ff = new FileFilter(){
	public boolean accept(File file){
		return file.isDirectory();
	}
};
files = dir.listFiles();
if(files.length == 0){
	System.out.println("目录不存在或不是目录");
}else{
	for(int i = 0; i < files.length; i++){
		File f = Files[i];
		System.out.println(f.toString());
	}
}

7.9 遍历指定目录下所有文件及目录
File f = new File("C:");
String[] children = f.list(); //返回指定目录下的所有文件及目录列表的数组

7.10 遍历系统根目录
File[] roots = File.listRootd();
for(int i = 0; i < roots.length; i++){
	System.out.println(roots[i].toString());
}

7.11 获取当前工作目录
String curDir = System.getProperty("user.dir");

7.12 遍历目录
public static void mian(String[] args) throws Exception{
	File dir = new File("c:/myDir"); //指定遍历的目录
	visitAllDirAndFiles(dir);
}
public static void visitAllDirAndFiles(File f){
	if(f.isDirectory()){
		String[] children = f.list();
		for(int i = 0; i < children.length; i++){
			visitAllDirAndFiles(new File(f, children[i]));
		}
	}
}


异常处理
8.1 System.err.println() 处理异常
try{
	throw new Exception("My Exception");
}catch(Exception e){
	System.err.println("Caught Exception");
	System.err.println(e.getMessage()); //获取异常错误消息字符串，不返回错误类型
	System.err.println(e.getLocalizedMessage());
	e.printStackTrace(); //打印错误位置及原因
}

8.2 多catch
try{
	throw new Type();
}catch(Type1 t1){
	//异常代码1
}catch(Type2 t2){
	//异常代码2
}catch(Type3){
	//异常代码3
}finally{
	//一般为资源关闭相关代码
}

8.3 多线程异常处理
class MyThread extends Thread{  //继承Thread类，并重写run()方法
	public void run(){
		throw new RuntimeException(); //跑出运行时异常
	}
}
class Main{
	public static void main(String[] args){
		MyThread t = new MyThread();
		t.start(); //开始进程
		try{
			Thread.sleep(1000); //休眠1000ms
		}catch(Exception e){ //捕获异常，并输出详情
			System.out.println("Caught it " + e);
		}
		System.out.println("Exiting main"); //输出推出信息
	}
}

8.4 链式异常
public static void main(String[] args) throws Exception{
	try{
		int result = 20/0;
		System.out.println("表达式结果为" + result);
	}catch(ArithmeticException ex){  //捕获算数异常
		System.out.println("算数异常" + ex)
		try{
			throw new NumberFormatException(); //手动/强制抛出数字格式异常
		}catch(NumberFormatException e){
			System.out.println("强制抛出异常：" + e)
		}
	}
}

8.5 自定义异常
class MyException extends Exception{ //创建自定义异常，继承于Exception类
	MyException(String str){
		super(str);
	}
}
class Input{
	void method() throws MyException{
		throw new Myexception("My Exception");  //抛出自定义异常
	}
}
class Test{
	public static void main(String[] args){
		try{
			new Input().method();
		}catch(Myexception e){
			System.out.println(e.getMessage());
		}
	}
}


数据结构
9.1 链表(LinkedList)
LinkedList<String> myList = new LinkedList<String>(); //实例化LinkedList
myList.add("1"); //添加元素，默认从链表尾部添加
myList.addFirst("0"); //在链表开头添加元素
myList.addLast("2"); //在链表结尾添加元素
System.out.println(myList); //输出  [0,1,2]
myList.getFirst(); //获取链表的栈顶元素
myList.removeFirst(); //移除栈顶元素
myList.subList(2,4).clear(); //删除指定位置元素，按照索引下标删除。[2,4)
myList.indexOf("1"); //返回指定元素第一次出现的位置
myList.last.IndexOf("1"); //返回指定元素最后一次出现的位置
myList.set(2, "3"); //修改指定位置元素的值

9.2 向量(Vector)
Vector v = new Vector();
v.add("A");
v.add("B");
v.add("C");
Collections.sort(v); //排序
int index = Collections.binarySearch(v, "A"); //查找指定位置索引
Object obj = Collections.max(v); //返回元素最大值
Collections.swap(v, 0, 2); //旋转指定元素，包括索引位置

9.3 队列(Quenue)
//一种特殊线性表，只允许表前端进行删除，后端进行插入
Quenue<String> q = new LinkedList<String>(); //实例化队列，LinkList类实现了Quenue接口
//添加元素。不使用add()添加，remove()删除，这两种方法在失败后会抛出异常，不推荐使用
q.offer("a");
q.offer("b");
q.offer("c");
q.poll(); //返回第一个元素并删除该元素，删除a
q.element(); //返回第一个元素
q.peek(); //返回第一个元素

集合
10.1 数组转集合
String[] str = new String[5];
for(int i =0; i < 5; i++){
	str[i] = String.valueOf(i); //数组赋值
}
List<String> list = Arrays.asList(str); //数组转集合

10.2 集合和元素比较
String[] coins = {"Penney","nickel","dime","Quarter","dollar"}; //创建字符串数组
Set<String> set = new TreeSet<String>(); //TreeSet类实现了Set接口
for(int i = 0; i < coins.length; i++){
	set.add(coins[i]); //数组转化成集合
}
Object obj = Collections.min(set); //返回最小元素
Collections.min(set, String.CASE_INSENSITIVE_ORDER); //忽略大小写返回最小值

10.3 HashMap遍历
HashMap<String, String> hm = new HashMap<String, String>();
hm.put("1", "1st"); //添加元素
hm.put("2", "2nd");
hm.put("3", "3rd");
boolean b = col.isEmpty(); //判断集合是否为空
int size = col.size(); //返回集合长度
Collection col = hm.values(); //获取HashMap元素集合
//迭代遍历
Iterator itr = col.iterator(); //创建集合迭代器
while(itr.hasNext()){
	System.out.println(itr.next());
}
//传统for循环遍历
for(int i = 0; i < size; i++){
	String value = col.get(i);
	System.out.println(value);
}
//foreach循环遍历
for(String value; col){
	System.out.println(value);
}

10.4 打乱集合元素
List<Integer> list = new ArrayList<Intrger>();
for(int i = 0; i < 10; i++){
	list.add(new Integer(i));
}
Collections.shuffle(list); //打乱集合元素

10.5 集合反转
Collections.reverse(List);

10.6 只读集合
public static void main(String[] args) throws Exception{
	List stuff = Array.asList(new String[]{"a", "b", "c"});
	List list = new ArrayList(stuff);
	list = Collections.unmodifiableList(list); //设置只读
	try{
		list.set(0, "new value");
	}catch(UnsupportedOperationException e){
		//捕获的异常代码
	}
	Set set = new HashSet(stuff);
	set = Collections.unmodifiableList(set); //设置只读
	Map map = new HashMap();
	map = Collection.unmodifiableList(map); //设置只读
}

10.7 集合输出
TreeMap tMap = new TreeMap();
tMap.put(1, "Sunday"); //插入数据
tMap.put(2, "Monday");
tMap.put(3, "Tuesday");
tMap.put(4, "Wedesday");
tMap.put(5, "Thursday");
tMap.put(6, "Friday");
tMap.put(7, "Saturday");
tMap.keySet(); //返回 key
tMap.values(); //返回 values
tMap.get(key); //返回指定键的值
tMap.firstKey();
tMap.lastKey();
tMap.remove(key); //移除指定键对应的键值对

10.8 循环移动元素
String str = "A B C B";
List list = Array.asList(str.split(" ")); //按照指定分隔符将字符串转化成集合
Collections.rotate(list, 2); //指定移动截止索引位置，输出结果[C, D, A, B]

10.9 遍历HashTable的键值
HashTable ht new HashTable();
ht.put("1", "one");
ht.put("2", "two");
Enumeration e = ht.keys(); 接收键
//Enumeration e = ht.keys(); //接收值
while(e.hashMoreElements()){
	System.out.println(e.nextElement());
}

10.10 不同集合添加元素
List linkList = new LinkList();
List arrayList = new ArrayList();
Set hashSet = new HashSet();
SortedSet treeSet = new TreeSet();
LinkedHashSet linkedHashSet = new LinkedHashSet();
Map hashMap = new HashMap();
SortedMap treeMap = new TreeMap();
LinkedHashMap linkedHashMap = new LinkedHashMap();
linkList.add("v");
arrayList.add("v");
hashSet.add("v");
treeSet.add("v");
linkedHashSet.add("v");
hashMap.put("k", "v");
treeMap.put("k", "v");
//迭代器输出方法
void displayAll(Collection col){
	Iterator itr = col.iterator();
	while(itr.hasNext()){
		System.out.print(" " + (String)itr.next());
	}
}

10.11 集合元素替换
String str = "A B C D";
List list = Array.asList(str.split(" ")); //按照指定分隔符将字符串转化成集合
Collections.replaceAll(list, "A", "a"); //将A替换成a

10.12 List截取
String str = "A B C D";
List list = Array.asList(str.split(" ")); //按照指定分隔符将字符串转化成集合
String subStr = "B C";
List subList = Array.asList(str.split(" ")); 
int firstIndex = Collections.indexOfSubList(list, subList); //返回之列在列表中第一次出现的索引
int lastIndex = Collections.last.IndexOfSubList(list, subList); //返回之列在列表中最后一次出现的索引


网络实例
11.1 获取指定主机的IP地址
import java.net.InetAddress;
import java.net.UnknowHostException;
InetAddress address = null;
try{
	address = InetAddress.getByname("www.runoob.com");
}catch(UnknowHostException e){
	System.exit(2);
}
String str = address.getHostName(); //返回主机名
String str1 = address.getHostAddress(); //返回主机地址
System.exit(0); //正常退出，关闭JVM。方法为0为正常关闭；其他参数为非正常关闭。

11.2 检测本机端口是否被占用
import java.io.*;
import.java.net.*;
public static void main(String[] args){
	Socket s;
	String host = "localhost";
	if(args.length > 0){
		host = args[0];
	}
	for(int i = 0;i < 1024; i++){
		try{
			System.out,println("查看 " + i)
			s = new Socket(host, i);
			System.out.println("端口" + i +"已被使用！")
		}catch(UnknowHostException e){
			System.out.println("Exception occured " + e)
			break;
		}catch(IOException e){
			
		}
	}
}

11.3 获取本机IP地址及主机名
public static void main(String[] args) throws Exception{
	InetAddress addr = InetAddress.getLocalHost();
	String str = addr.getHostAddress(); //返回主机地址
	String str1 = addr.getHostName(); //返回主机名
}

11.4 获取远程文件大小
import java.net.URL;
import java.netURLConnection;
public static void main(String[] args) throws Exception{
	//定义连接
	URL url = new URL("http://www.runoob/wp-content/thems/runoob/assets/img/newlogo.png");
	URLConnection conn = url.openConnection(); //打开连接
	int size = conn.getContentLength(); //返回资源大小，以byte计。若size<0,表示无法获取文件大小。
	conn.getInputStream().close(); //关闭连接
}

11.5 Socket实现多线程服务器程序
public class MultiThreadServer implements Runnable{ //实现Runnable接口
	Socket csocket;
	MultiThreadServer(Socket csocket){
		this.csocket = csocket;
	}
	
	public static void main(String[] args) throws Exception{
		ServerSocket ss = new ServerSocket(1234); //创建服务器
		System.out.println("Listening");
		while(true){
			Socket s = ss.accept(); //连接服务器
			System.out.println("Connected");
			new Thread(new MultiThreadServer(s).start()); //创建多线程连接
		}
	}
	
	public void run(){ //重写run()方法
		try{
			PrintStream ps = new PrintStream(csocket.getOutputStream());
			for(int i = 100; i >= 0; i--){
				ps.println(i + " bottles of beer on the wall");
			}
			ps.close();
			csocket.close();
		}catch(IOException e){
			System.out.println(e);
		}
	}
}

11.6 查看主机指定文件最后修改时间
URL url = new URL("http://127.0.0.1/java.bmp");
URLConnection uc = url.openConnection(); //打开连接
uc.setUseCaches(flase); //设置请求不能使用缓存
long t = uc.getLastModified(); //返回时间戳

11.7 使用Scoket连接到指定主机
try{
	Scoket s = new Scoket("IPAddress", port); //创建Scoket连接，并指定端口
	InetAddress addr = s.getInetAddrress();
	s.close();
}catch(IOException e){
	System.out.println("无法连接 " + args[0]);
	System.out.println(e);
}

11.8 网页抓取
//抓取网页源码，存放当前目录的Data.html文件中
public static void main(String[] args) throws Exception{
	URL url = new URL("http://www.runoob.com");
	BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
	BufferedWriter writer = new BufferedWriter(new FileWriter("Data.html"));
	while((String line = reader.reader.readerline()) != null){
		System.out.println(line);
		Writer.write(line);
		Writer.newLine();
	}
	reader.close();
	writer.close();
}

11.9 获取URL响应头的日期信息
URL url = new URL("http://www.runoob.com");
HttpURLConnection httpCon = (HttpConnection)url.openConnection();
long date = httpCon.get.Date(); //返回响应时间，无响应返回0.
Date d = new Date(date); 

11.10 获取URL响应头信息
public static void main(String[] args) throws IOException{
	URL url = new URL("http://www.runooob.comm");
	URLConnection conn = url.openConnection(); //打开连接
	Map headers = conn.getHeaderFields(); //Map接收响应信息
	Set<String> keys = headers.keySet();
	for(String key : keys){
		String val = conn.getHeaderField(key);
		System.out.println(key + "   " + val);
	}
	System.out.println(conn.getLastModified());
}

11.11 解析URL
URL url = new URL("http://ip/?.html");
url.toString(); //返回URL
url.getProtocol(); //返回协议
url.getFile(); //返回文件名
url.getHost(); //返回主机名
url.getPath(); //返回文件路径
url.getPort(); //返回端口号
url.getDefaultPort(); //返回默认端口号

11.12 ServerSocket和Socket通信实例
服务端
public class Server{
	public static void main(String[] args){
		try{
			ServerSocket ss = new ServerSocket(88888);
			System.out.println("启动服务器....");
			Socket s = ss.accept();
			System.out.println("客户端：" + s.getInetAddress().getLocalHost() + " 已连接到服务器")；
			BufferedReader br = new BufferedReader(new InputSreamReader(s.getInputStream()));
			//读取客户端发来的消息
			String mess br.readline();
			System.out.println("客户端：" + mess);
			BufferedWriter bw = new BufferedWriter(new OutputStream(s.getOutputStream()));
			bw.write(mess + "\n");
			bw.flush();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
客户端
try{
	Socket s = new Socket("127.0.0.1", 8888);
	//构建IO
	InputStream is = s.hetInputStream();
	OutputStream os = s.getOutputStream();
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
	String mess = br.readLine();
	System.out.println("服务器：" + mess);
}catch(UnknowHostException e){
	e.printStackTrace();
}catch(IOException e){
	e.printStackTrace();
}

线程
12.1 查看线程是否存活
public class TwoThreadAlive extends Thread{ //继承Thread接口
	public void run(){ //重写run()方法
		for(int i = 0; i < 10; i++){
			printMsg();
		}
	}
	public void printMsg(){
		Thread t = Thread.currentThread();
		String str = t.getName(); //获取线程名
		System.out.println("name:" + str);
	}
	public static void main(String[] args){
		TwoThreadAlive tt = new TwoThreadAlive(); //实例化对象
		tt.setName("Thread"); //设置线程名
		System.out.println("before start(),tt.isAlive()=" + tt.isAlive()); //判断线程是否存活
		tt.start(); //启动线程
		System.out.println("after start(),tt.isAlive()=" + tt.isAlive());
		for(int i = 0; i < 10; i++){
			tt.printMsg();
		}
		System.out.println("The and of main(),tt.isAlive()=" + tt.isAlive());
	}
}

12.2 线程状态监测
class MyThread extends Thread{
	boolean waiting = true;
	boolean ready = false;
	MyThread(){}
	public viod run(){
		String tName = Thread.currentThread().getName(); //获取当前进程名
		System.out.println(tName + "starting...");
		while(waiting)
			System.out.println("waiting is " + waiting);
	    System.out.println("waiting...");
		startWait();
		try{
			Thread,sleep(1000); //休眠1s
		}catch(Exception e){ //捕获异常返回进程被打断
			System.out.println(tName + " interrupted.");
		}
		System.out.println(tName + " terminating."); //输出进程结束
	}
	synchronized void startWait(){ //加锁
		try{
			while(!ready) wait();
		}catch(InterruptedException e){
			System.out.println("wait() interrupted!");
		}
	}
	synchronized void notice(){
		ready = true;
		notify();
	}
}
public class Main{
	public static void main(String[] args) throws Exception{
		MyThread mt = new MyThread();
		mt.setName("MyThread #1"); //设置进程名
		showThreadStatus(mt); //显示进程状态
		mt.start(); //启动进程
		Thread.sleep(50); //休眠50ms
		showThreadStatus(mt);
		mt.waiting = false;
		Thread.sleep(50);
		showThreadStatus(mt);
		mt.notice();
		Thread.sleep(50);
		showThreadStatus(mt);
		while(mt.isAlive())
			System.out.println("alive");
	    showThreadStatus(mt)
	}
	static void showThreadStatus(Thread t){
		System.out.println(t.getName() + "Alive=" + t.isAlive() +
			" state=" + t.getState());
	}
}

12.3 线程优先级设置
public class SimplePriorities extends Thread{
	private int countDown = 5;
	/*
	volatile(轻快的)，能部分实现synchronized功能，
	编译后代码量少，资源开销也更少;
	并提供对其他线程的可见性。
	使用场景：
	1）对变量的写操作不依赖于当前值
　　2）该变量没有包含在具有其他变量的不变式中
	*/
	private volatile double d = 0;
	public SimplePriorities(int priority){
		setPriority(priority); //设置线程优先级
		start();
	}
	public String toString(){
		return super.toString() + ":" + countDown;
	}
	public void run(){
		while(true){
			for(int i = 1; i < 100000; i++)
				d = d + (Math.PI + Math.E)/(double)i;
			System.out.println(this);
			if(--countDown == 0)
				return;
		}
	}
	public static void main(String[] args){
		new SimplePriorities(Thread.MAX_PRIORITY);
		for(int i = 0; i < 5; i++)
			new SimplePriorities(Thread.MIN_PRIORITY);
	}
}

12.4 死锁及解决方法
死锁：多个线程同时被阻塞，他们中一个或多个线程都在等待某个资源释放
产生的必要条件：
1.资源互斥
2.资源不可抢夺
3.请求和保持
4.循环等待
//死锁测试
public class LockTest{
	public static String str1 = "str1";
	public static String str2 = "str2";
	public static void main(String[] args){
		LockA la = new LockA();
		new Thread(la).start();
		LockB lb = new LockB();
		new Thread(lb).start();
	}
}
class LockA implements Runnable{
	public void run(){
		try{
			System.out.println(new Date().toString() + " LoackA开始执行")；
			while(true){
				synchronized (LockTest.str1){
					System.out.println(new Date().toString() + " locakA锁住str1");
					Thread.sleep(3 * 1000); //等待给B能锁住的机会
					synchronized (LockTest.str2){
						System.out.prinln(new Date().toString() + " LockA锁住str2")；
						Thread.sleep(60 * 1000); //为了测试，不释放资源
					} 
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
class LockB implements Runnable{
	public void run(){
		try{
			System.out.println(new Date().toString() + " LocakB开始执行");
			while(true){
				synchronized (LockTest.str2){
					System.out.println(new Date().toString() + " LockB锁住str2")；
					Thread.sleep(3 * 1000); //等待给A能锁住的机会
					synchronized (LockTest.str1){
						System.out.println(new Date().toString() + " LockB锁住str1");
						Thread.sleep(60 * 1000); //为了测试，不释放资源
					}
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
//解锁测试
import java.util.*;
public class UnlockTest{
	public static String str1 = "str1";
	public static final Semaphore a1 = new Semaphore(1);
	public static String str2 = "str2";
	public static final Semaphore a2 = new Semaphore(1);
	public static void main(String[] args){
		LockAa la = new LockAa();
		new Thread(la).start();
		LockBb lb = new LockBb();
		new Thread(lb).start();
	}
}
class LockAa implements Runnable{
	public void run(){
		try{
			System.out.println(new Date().toString() + " LockA开始执行")；
			while(true){
				if(UnlockTest.a1.tryAcqure(1, TimeUnit.SECONDS)){
					System.out.println(new Date().toString() + " LockA锁住str2");
					if(UnlockTest.a2.tryAcqure(1, TimeUnit.SECONDS)){
					    System.out.println(new Date().toString() + " LockA锁住str2");
					    Thread.sleep(60 * 1000);
					}else{
					System.out.println(new Date().toString() + " LockA锁str2失败");
					}
				}else{
					System.out.println(new Date().toString() + " LockA锁str1失败");
				}
				UnlockTest.a1.release(); //释放资源
				UnlockTest.a2.release();
				Thread.sleep(1000);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
class LockBb implements Runnable{
	public void run(){
		try{
			System.out.println(new Date().toString() + " LockA开始执行")；
			while(true){
				if(UnlockTest.a2.tryAcqure(1, TimeUnit.SECONDS)){
					System.out.println(new Date().toString() + " LockA锁住str2");
					if(UnlockTest.a1.tryAcqure(1, TimeUnit.SECONDS)){
					    System.out.println(new Date().toString() + " LockA锁住str2");
					    Thread.sleep(60 * 1000);
					}else{
					System.out.println(new Date().toString() + " LockA锁str2失败");
					}
				}else{
					System.out.println(new Date().toString() + " LockA锁str1失败");
				}
				UnlockTest.a1.release(); //释放资源
				UnlockTest.a2.release();
				Thread.sleep(10 * 1000);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}

12.5 获取线程ID
public class Main extends Object implements Runnable{
	private ThreadID var;
	public Main(ThreadID v){
		this.var = v;
	}
	public void run(){
		try{
			print("var getThreadID = " + var.getThreadID());
			Thread.sleep(2 * 1000);
			print("var getThreadID = " + var.getThreadID());
		}catch(InterruptedException e){}
	}
	private static void print(String msg){
		String name Thread.currentThread().getName();
		System.out.println(name + ": " + msg);
	}
	public static void main(String[] args){
		ThreadID tid = new ThreadId();
		Main shared = new Main(tid);
		try{
			Thread t1 = new Thread(shared, "t1");
			t1.start();
			Thread.sleep(500);
			Thread t2 = new Thread(shared, "t2");
			t2.start();
			Thread.sleep(500);
			Thread t3 = new Thread(shared, "t3");
			t3.start();
		}catch(InterruptedException e){}		
	}
}
class ThreadID extends ThreadLocal{
	private int nextID;
	public ThreadID(){
		nextID = 10001;
	}
	private synchronized Integer getNewID(){
		Integer id = new Integer(nextID);
		nextID++；
		return id;
	}
	protected Object initialValue(){
		print("in initialValue()");
		return getNewID();
	}
	private static void print(String msg){
		String name = Thread.currentThread().getName();
		System.out.println(name + ": " + msg);
	}
}

12.6 线程挂起
public class SleepingThread extends Thread{
	private int countDown = 5;
	private static int threadCount = 0;
	public SleepingThread(){
		super("" + ++threadCount);
		start();
	}
	public String toString(){
		return "#" + getName() + ": " + countDown;
	}
	public void run(){
		while(true){
			System.out.println(this);
			if(--countDown == 0)
				return;
			try{
				sleep(100);
			}catch(InterruptedException e){
				throw new RuntimeException(e);
			}
		}
	}
	public static void main(String[] args) throws InterruptedException{
		for(int i = 0; i < 5; i++)
			new SleepingThread().join();
		System.out.println("线程已被挂起");
	}
}

12.7 终止线程
public class ThreadInterrupt extends Thread{
	public void run(){
		try{
			sleep(10 * 1000);
		}catch(InterruptedException e){
			Sysytem.out.println(e.getMessage());
		}
	}
	public static void main(String[] args) throws{
		Thread t = new ThreadInterrupt();
		t.start();
		System.out.println("在10s内按任意键中断线程")；
		System.in.read();
		t.interrupt();
		t.join();
		System.out.println("线程已经退出！");
	}
}

12.8 生产者/消费者问题
//处理资源共享、占用等问题
public class ProducerConsumerTest{
	public static void main(String[] args){
		CubbyHole c = new CubbyHole();
		Producer p1 = new Producer(c, 1);
		Consumer c1 = new Consumer(c, 1);
		p1.start();
		c1.start();
	}
}
class CubbyHole{
	private int contents;
	private boolean available = false;
	public synchronized int get(){
		while(available == false){
			try{
				wait();
			}catch(InterruptedException e){}
		}
		available = false;
		notifyAll();
		return contents;
	}
	public synchronized void put(int value){
		while(available == true){
			try{
				wait();
			}catch(InterruptedException e){}
		}
		contents = value;
		available = true'
		notifyAll();
	}
}
class Consumer extends Thread{
	private CubbyHole cubbyHole;
	private int number;
	public Consumer(CubbyHole c, int number){
		cubbyHole = c;
		this.number = number;
	}
	public void run(){
		int value = 0;
		for(int i = 0; i < 10; i++){
			value = cubbyHole.get();
			System.out.println("消费者 #" + this.number + " put: " + i);
			try{
				sleep((int) (Math.random() * 100));
			}catch(InterruptedException e){}
		}
	}
}

12.9 获取线程状态
java线程生命周期大致分为五种状态
1.新建状态（new）：新创建一个线程对象
2.就绪状态（Runnable）：调用了start()方法，线程位于运行线程池，等待CPU使用权
3.运行状态（Running）：获取了CPU使用权，执行代码
4.阻塞状态（Blocked）：线程因某种原因放弃CPU使用权，暂停运行，直到进入就绪状态才能转为运行状态
  阻塞情况分为三种：
  a)等待阻塞：执行wait()方法，JVM会把线程放到等待池
  b)同步阻塞：运行线程获取对象的同步锁被其他线程占用时，JVM会把该线程放入锁池
  c)其他阻塞：执行sleep()或join()方法，或者发出I/O请求时，JVM会将线程置为阻塞状态，直到方法或请求完成时，线程才会重新转入就绪状态
5.死亡状态（Dead）：线程执行完毕或因异常退出了run()方法，该线程结束生命周期
class MyThread extends Thread{
	boolean waiting = true;
	boolean ready = false;
	MyThread(){}
	public run(){
		String tName = Thread.currentThread().getName();
		System.out.println(tName + " 启动");
		while(waiting)
			System.out.println("等待: " + waiting);
		System.out.println("等待...");
		startWait();
		try{
			Thread.sleep(1000);
		}catch(Exception e){
			System.out.println(tName + " 中断");
		}
		System.out.println(tName + " 结束")
	}
	synchronized void startWait(){
		try{
			while(!ready)
				wait();
		}catch(InterruptedException e){
			System.out.println("wait() 中断");
		}
	}
	synchronized void notice(){
		ready = true;
		notify();
	}
}
public class Main{
	public static void main(String[] args) throws Exceptiom{
		MyThread thrd = new MyThread();
		thrd.setName("MyThread #1");
		showThreadStatus(thrd);
		thrd.start();
		Thread.sleep(50);
		showThreadStatus(thrd);
		thrd.waiting = false;
		Thread.sleep(50);
		showThreadStatus(thrd);
		thrd.notice();
		Thread.sleep(50);
		showThreadStatus(thrd);
		while(thrd.isAlive()){
			System.out.println("alive");
		}
		showThreadStatus(thrd);
	}
	static void showThreadStatus(Thread t){
		System.out.println(t.getName() + " 存活:" + t.isAlive() + " 状态:" + t.getState());
	}
}

12.10 获取所有线程
public class Main extends Thread{
	public static void main(String[] args){
		Main t1 = new Main();
		t1.setName("thread1");
		t1.start();
		ThreadGroup currentGroup = Thread.currentThread().getThreadGroup();
		int noThreads = currentGroup.activeCount();
		Thread[] lsThreads = new Thread[noThreads];
		currentGroup.enumerate(lsThreads);
		for(int i = 0; i < noThreads; i++){
			System.out.println("线程号：" + i " = " + lsThreads[i].getName());
		}
	}
}

12.11 查看线程优先级
public class Main extends Object{
	private static Runnable makeRunnable(){
		Runnable r = new Runnable(){
			public void run(){
				for(int i = 0; i < 5; i++){
					Thread t = Thread.currentThread();
					System.out.println("In run() - priority = " + t.getPriority() + ", name = " + t.getName());
					try{
						Thread.sleep(2000);
					}catch(InterruptedException e){}
				}
			}
		};
		return r;
	}
	public static void main(String[] args){
		System.out.println("In main() - Thread.currentThread().getPriority() = " + Thread.currentThread().getPriority());
		System.out.println("In main() - Thread.currentThread().getName() = " + Thread.currentThread().getName());
		Thread threadA = new Thread(makeRunnable(), "threadA");
		threadA.start();
		try{
			Thread.sleep(3000);
		}catch(InterruptedException e){}
		System.out.println("In main() - threadA.getPriority() = " + threadA.getPriority());
	}
}

12.12 中断线程
public class Main extends object implements Runnable{
	public void run(){
		try{
			System.out.println("In run() - 将运行work2()方法");
			work2();
			System.out.println("In run() - 从work()方法回来");
		}catch(InterruptedException e){
			System.out.println("In run() - 中断work2()方法");
			return;
		}
		System.out.println("In run() - 休眠后执行");
		System.out.println("In run() - 正常离开");
	}
	public work2() throws InterruptedException{
		while(true){
			if(Thread.currentThread().isInterrupted()){
				System.out.println("C isInterrupted() = " + Thread.currentThread().isInterrupted());
				Thread.sleep(2000);
				System.out.println("D isInterrupted() = " + Thread.currentThread().isInterrupted());
			}
		}
	}
	public static void main(String[] args){
		Main si = new Main();
		Thread t = new Thread(si);
		t.start();
		try{
			Thread.sleep(2000);
		}catch(InterruptedException e){}
		System.out.println("In main() - 中断其他线程");
		t.interrupt();
		System.out.println("In main - 离开");
	}
}




=======================================================================================
                                  Java常用语句
=======================================================================================

String/字符串

String str = "this-is-my-dog"; //声明字符串
String delimeter = "-"; //设置分隔符，特殊字符需要转义
String[] temp = str.split(String delimeter); //按分隔符将字符串转为字符串数组
boolean res = str.contains(CharSequence s); //CharSequence为可读写字符序列(字符串)，判断是否包含s
int index = str.indexOf(String s); //获取值第一次出现对应的索引
int index = str.lastIndexOf(String s); //获取值最后一次出现对应的索引
int res = str.compareTo(String s); //返回两个字符串第一个Unicode差值
int res = str.compareToIgnoreCase(String s); //忽略大小写，同上
str == String s; //比较两个字符串引用是否都相等
str.equals(String s); //比较两个字符串内容是否都相等
String s1 = String s2 + String s3 + String s4; //字符串拼接
String str = str1.concat(String s); //字符串拼接
StringBuffer sb = new StringBuffer(); //线程安全的可变数组
sb.append(String s); //字符串追加

//实际调用java.io.PrintStream.format(String format, Object... args)的方法，返回打印流
PrintStream ps = System.out.format(String format, Object... args);

//实际调用java.io.PrintStream.print(String s)
System.out.print(String s); //打印字符串，不换行

System.out.println(String s); //打印字符串，换行
String str = String.format(String format, Object... args); //格式化打印字符串
String str1 = str.intern(); //将str放入常量池，并返回str的引用赋给str1

//比较字符串指定位置是否相等
boolean b = str1.regionMatches(int toffset, String str2, int ooffset, int len);

String s = str.replace(char oldChar, char newChar); //替换所有字符
String s = str.replaceFirst(String str1, String str2); //替换第一个出现的子字符串
String s = str.replaceAll(String str1, String str2); //替换所有出现的子字符串

//先将String转为StringBuffer，然后转置，再转为String
String reverse = new StringBuffer(str).reverse().toString();

char[] cs = str.toCharArray(); //将字符串转为字符数组
String su = str.toLowerCase(); //转为小写
String su = str.toUpperCase(); //转为大写

//返回字符串中指定位置对应的Unicode值，index表示第几位
int Unicode = str.codePointBefore(int index);


Array/数组

int[] array = new int[6]; //数组声明，元素默认为null，基本类型为基本类型的默认值
int[] array = new int[] {1,5,2,6,15}; //初始化
int[] array = {1,5,7,0,3,7,8}; //数组声明并初始化
Arrays.sort(array); //排序，从大到小
Arrays.fill(array, 100); //填充数组，会覆盖原有数据
Arrays.fill(array, 3, 6, 99); //按照索引填充
boolean b = Arrays.asList(array).contains(1); //元素查找
int index = Arrays.binarySearch(array, 2); //二分查找
int min = (int) Collections.min(Arrays.asList(array)); //求最小值
int max = (int) Collections.max(Arrays.asList(array)); //求最大值
String str = Arrays.toString(array); //一维转为单个字符串，输出：[1, 5, 7, 0, 3, 7, 8]
String str = Arrays.deepToString(array); //二维或以上转为单个字符串
Arrays.equals(array1, array2); //比较两个数组对应元素是否都相等
array1 == array2; //比较两个数组引用是否都相等
String[][] data = new String[2][5]; //至少要指定一位数组的长度
int index = data.length; //数组列数，类似于数据库表中字段数
int index = data[0].length; //数组行数

//从源数组src的srcPos位置开始覆盖目标数组的destPos位置，复制长度为length
System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length);


Collection/集合框架

List<String> list = new ArrayList<String>(); //声明集合
List<String> list = Arrays.asList(array); //数组转为List
List<String> list = Arrays.asList(str1.split(str2)); //将字符串按指定分隔符转化为集合
list.add("A"); //Set和List添加元素方式，Map使用put()方法
list.isEmpty(); //判断集合是否为空
list.remove(Value); //删除元素
list.poll(); //删除第一个元素
list.set(index, element); //按索引赋值
(LinkedList)list.addFirst(value); //集合头部增加元素
(LinkedList)list.addLast(value); //集合尾部增加元素
(LinkedList)list.getFirst(); //获取第一个元素
(LinkedList)list.getLast(); //获取最后一个元素
(LinkedList)list.indexOf(value); //获取值第一次出现对应的索引
(LinkedList)list.lastIndexOf(value); //获取值最后一次出现对应的索引
(LinkedList)list.subList(index1, index2).clear(); //删除索引为[index1, index2)的元素
int size = list.size(); //集合长度
Collections.min(List);  //求最小值
Collections.max(List);  //求最大值
Collections.shuffle(list); //打乱元素
Collections.swap(List, index1, index1); //交换索引对应元素
Collections.indexOfSubList(list, sublist)); //集合子集查找，返回第一次出现的索引
Collections.lastIndexOfSubList(list, sublist); //类似上
Collections.unmodifiableList(list); //返回一个不可修改的集合(包括Map)
Collections.replaceAll(list, "33", "888"); //将集合中所有的33替换为888
Collections.reverse(list); //集合反转
Collections.rotate(list, distance); //集合向右滚动

Iterator it = list.iterator(); //获取迭代器对象
while (it.hasNext()) { //集合迭代器迭代
    System.out.print(it.next());
}

//Enumeration迭代HashTable
Hashtable ht = new Hashtable();
Enumeration e = ht.elements(); //获取值的枚举对象，键可用ht.keys()
while (e.hasMoreElements()) {
    System.out.println(e.nextElement());
}

//HashMap获取迭代器对象
HashMap< String, String> hMap = new HashMap< String, String>();
hMap.put(key, value); //Map赋值
...
Collection cl = hMap.values(); //返回Map值的集合
Collection c2 = hMap.keySet(); //返回Map值的集合，一般是Set
hMap.get(key); //按键获取值
hMap.firstKey(); //获取第一个键
hMap.lastKey(); //获取最后一个键
hMap.remove(key); //按键删除键值对(元素)
Iterator itr = cl.iterator();


Date/时间日期格式化

Date类 //简单时间日期类型
Date d1 = new Date(); //获取当前时间
Date d2 = c1.getTime(); //获取时间
Date d3 = Calendar.getInstance().getTime(); //获取时间
String str = d1.toString(); //获取时间字符串，输出:Wed Aug 29 00:17:18 CST 2018

//设置时间格式
SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a"); //a表示上下午
String DateToStr = sdf.format(d1); //格式化时间

Calendar类 //时间日期的复杂实现
Calendar cl = Calendar.getInstance(); //实例化Calendar(抽象类),默认是当前时间
cl.setTime(d1); //设置时间
cl.add(Calendar.HOUR, 7); //当前时间增加7小时，第二个参数可以是整数，负数表示相减
cl.add(Calendar.MONTH, 1);
cl.add(Calendar.YEAR, 3);
cl.roll(Calendar.HOUR, 1); //当前时间增加一小时，除小时其他不变，按进制变化，负数表示相减
cl.get(Calendar.MINUTE); //获取c1的分钟数

//获取c1的小时数，类似的还是年月日、当月第几周和当年第几周等
cl.get(Calendar.HOUR_OF_DAY);

//创建字符串格式化类的实例，String.format()也是调用此类中的fmt.format()
Formatter fmt = new Formatter();
fmt.format("%tc", cal); //格式化时间
fmt.format("%tl:%tM", cal, cal);
fmt.format("%tB %tb %tm", cal, cal, cal);

//格式化日期
DateFormat[] df = new DateFormat[6];
df[0] = DateFormat.getInstance();                      //18-8-29 上午12:36
df[1] = DateFormat.getDateInstance();                  //2018-8-29
df[2] = DateFormat.getDateInstance(DateFormat.MEDIUM); //2018-8-29
df[3] = DateFormat.getDateInstance(DateFormat.FULL);   //2018年8月29日 星期三
df[4] = DateFormat.getDateInstance(DateFormat.LONG);   //2018年8月29日
df[5] = DateFormat.getDateInstance(DateFormat.SHORT);  //18-8-29
String str = df[i].format(new Date);

SimpleDateFormat[] sdf = new SimpleDateFormat[6];
sdf[0] = new SimpleDateFormat("yyyy/MM/dd");                        //2018/08/29
sdf[1] = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");                //29-8-2018 12:42:01
sdf[2] = new SimpleDateFormat("dd MMMM yyyy zzzz", Locale.ENGLISH); //29 August 2018 China Standard Time
sdf[3] = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z");         //星期三, 29 八月 2018 00:42:01 CST
sdf[4] = new SimpleDateFormat("yyyy-MM-dd", Locale.FRENCH);         //指定地点时间:2018-08-29
sdf[5] = new SimpleDateFormat("EEE", Locale.US);                    //Wed
String str = sdf[i].format(new Date());                             

String[] shortMonths = new DateFormatSymbols().getShortMonths(); //获取月份
String[] weekdays = new DateFormatSymbols().getWeekdays(); //获取工作日


文件与目录

String dir = "C:\\dir1\\dir12\\dir13"; //设置目录(或文件),windows环境写法，其他环境参考官方API
File f = new File(dir); // 创建文件(或目录)对象
File f = File.createTempFile(String fileName); //创建临时文件
File f = File.createTempFile(String prefix, String suffix, File directory); //同上
boolean res = f.createNewFile(); //创建文件
boolean res = f.mkdir(); //创建目录，上级目录不存在不会创建
boolean res = f.mkdirs(); //递归创建目录，类似于linux的mkdir -p
boolean res = f.isFile(); //判断是否为文件
boolean res = f.isDirectory(); //判断是否为目录
boolean res = f.delete(); //删除文件或者空文件夹
boolean res = f.isHidden(); //判断文件或文件夹是否隐藏
boolean res = f.exists(); //判断文件或文件夹是否存在
boolean res = f.setReadOnly(); //设置文件或文件夹只读
boolean res = f.canWrite(); //判断文件或文件夹是否可写
boolean res = f.setWritable(boolean writable); //设置文件或文件夹是否可写
boolean res = f.renameTo(String newName); //重命名文件或文件夹
String str = f.getName(); //获取文件名或文件夹名
String str = f.getPath(); //获取文件或文件夹的路径
String str = f.getAbsolutePath(); //同上，文件不存在时返回用户工作路径(user.dir) 
String str = f.getParent(); //获取上级目录
long lm = f.lastModified(); //获取文件最后修改时间
Date d = new Date(lm); //格式化最后修改时间

//需要导入commons.io包，返回非空文件夹大小，以bytes(字节)计
long size = FileUtils.sizeOfDirectory(f);
long size = f.length(); //返回文件大小，以bytes(字节)计

//f是目录时，获取目录下所有文件(包括目录)字符串数组，不是递归
String[] dirLists = f.list();
File[] fs = f.listFiles(); //返回文件对象数组
File[] roots = File.listRoots(); //返回可访问文件系统根目录文件对象数组

//递归删除目录下所有文件及文件夹
public static boolean deleteDir(File dir) {
    if (dir.isDirectory()) {
        String[] children = dir.list();
        for (int i = 0; i < children.length; i++) {
			//dir为相对路径或者绝对路径，children[i]为dir目录下的子目录或者文件
            boolean success = deleteDir(new File(dir, children[i]));
            if (!success) {
                return false;
            }
        }
    }
    System.out.println("The directory is deleted.");
    return dir.delete();
}

//获取指定目录下所有的子目录对象
File dir = new File(AbsolutePath); 
FileFilter ff = new FileFilter() {  //文件过滤器对象
    public boolean accept(File file) {
        return file.isDirectory();
    }
};
File[] fs = dir.listFiles(ff);


IO(输入输出)

分类(以下列名称结尾)
1)Reader         //字符输入(读取)流，磁盘文件-->内存，将磁盘文件中的数据读取输入到内存
2)Writer         //字符输出(写入)流，内存-->磁盘文件，将内存中数据写入到磁盘文件中
3)InputStream    //字节输入(读取)流，磁盘文件-->内存
4)OutputStream   //字节输出(写入)流，内存-->磁盘文件

//文件写入(字符流)
FileWriter fw = new FileWriter(String fileName); //创建文件输出流，用于向文件中写入数据，文件不存在会创建
FileWriter fw = new FileWriter(String fileName, boolean append); //append的值决定是否追加，一般是已存在文件
BufferedWriter bw = new BufferedWriter(fw); //创建缓冲输出流
bw.write(String str); //将字符串写入到文件
bw.close(); //关闭流

//文件读取(字符流)
FileReader fr = new FileReader(String fileName); //创建文件输入流，用于从文件中读取数据
BufferedReader br = new BufferedReader(fr); //创建缓冲输入流
String str;
while ((str = br.readLine()) != null) { //判断是否读取到最后一行
    System.out.println(str); //实际调用java.io.PrintStream.println(String s)
}
br.close(); //关闭流

//文件复制(字节流)
InputStream is = new FileInputStream(new File(srcfile)); //创建文件输入流
OutputStream os = new FileOutputStream(new File(destnfile)); //创建文件输出流
byte[] buf = new byte[1024]; //创建字节数组，用于缓冲
int len;
while ((len = is.read(buf)) > 0) {
    os.write(buf, 0, len);
}
in.close();
out.close();


Net/网络编程




=======================================================================================
                                  易百Java教程
=======================================================================================

https://www.yiibai.com/java/

Java

java应用程序类型
1. 独立应用程序

桌面应用程序或基于窗口的应用程序。我们需要在每台机器上安装的应用程序，
如媒体播放器，防病毒等。AWT和Swing框架在java中可用于创建独立应用程序。

2. Web应用程序

在服务器端运行并创建动态页面的应用程序称为Web应用程序。
目前，servlet，jsp，struts，jsf等技术用于在java中创建web应用程序。

3. 企业应用

自然分布的应用程序，如银行应用程序等。它具有高级别安全性，负载平衡和集群的优势。 
在java中，EJB用于创建企业应用程序。

4. 移动应用

为移动设备创建的应用程序。目前Android和Java ME用于创建移动应用程序。


带有{}的语句块后可不加分号

class A{  
static public void main(String... args){  
	System.out.println("hello java4");  
	}  
};// ";"- 这里加不加分号没有影响


有效的java main方法签名，必须是public
public static void main(String[] args)  //常规形式,推荐使用
public static void main(String []args)  
public static void main(String args[])  
public static void main(String... args)  
static public void main(String[] args)  //修饰词之间顺序可以调换
public static final void main(String[] args)  
final public static void main(String[] args)  
final strictfp public static void main(String[] args)


java程序运行方式

		编译器				解释器
XX.java---------> XX.class---------->执行程序命令


jdk:Java Development Kit     //java开发工具集,包含jre和开发工具等
jre:Java Runtime Environment //java运行时环境，包含jvm和运行类库等
jvm:Java Virtual Machine     //java虚拟机，提供程序运行环境


JVM

JVM(Java虚拟机)是：

指定Java虚拟机的工作的规范。 但实现提供程序是独立的选择算法。 
其实现是由Sun和其他公司提供。

它的实现被称为JRE(Java运行时环境)。

运行时实例只要在命令提示符上编写java命令来运行java类，就会创建JVM的实例。


JVM作用

加载代码
验证代码
执行代码
提供运行时环境

JVM提供了以下定义

内存区
类文件格式
寄存器集合
垃圾收集堆
致命错误报告等

JVM内部体系结构

1)类加载器

Classloader是JVM的一个子系统，用于加载类文件。

2)类(方法)区域

类(方法)区域存储每个类结构，例如运行时常量池，字段和方法数据，方法的代码。

3)堆

它是分配对象的运行时数据区。

4)堆栈
Java堆栈存储帧。它保存局部变量和部分结果，并在方法调用和返回中起作用。
每个线程都有一个私有JVM堆栈，同时创建线程。每次调用方法时都会创建一个新的框架。
框架在其方法调用完成时被销毁。

5)程序计数器寄存器

PC(程序计数器)寄存器。 它包含当前正在执行的Java虚拟机指令的地址。

6)本地方法堆栈

它包含应用程序中使用的所有本地方法。

7)执行引擎

执行引擎包含：

虚拟处理器
解释器：读取字节码流，然后执行指令。
即时(JIT)编译器：它用于提高性能，JIT编译的同时有类似字节代码部分的功能，从而减少编译所需的时间。编译器是指从Java虚拟机(JVM)的指令集到特定CPU的指令集的转换器。


java使用Unicode系统而非ASCII码系统编码。 
char 型数据默认值为 \u0000，占用2byte(字节)


在Unicode之前，有很多语言标准：

ASCII (美国信息交换标准代码)。
ISO 8859-1 用于表示西欧语言。
KOI-8 用于表示俄文。
GB18030 和 BIG-5 用于表示中文等等。


java中有三种整型移位运算符

<<  //左移运算符，num << 1,相当于num乘以2

>>  //右移运算符，num >> 1,相当于num除以2

>>> //无符号右移，忽略符号位，空位都以0补齐


switch 语句
switch(expression){    
    case value1:    
       //code to be executed;    
       break;  //optional  
    case value2:    
       //code to be executed;    
       break;  //optional  
    ......    

    default:   //  
       // code to be executed if all cases are not matched;    
}


for循环
1. 简单For循环
for(initialization;condition;incr/decr){  
    //code to be executed  
}
2. for-each循环
for-each循环用于在java中遍历数组或集合。
它比简单的for循环更容易使用，因为不需要递增值和使用下标符号。
for(Type var:array){  
   //code to be executed  
}
3. Java标记For循环  
我们可以让每个for循环的名称。 为此，在for循环之前使用标签。
它是有用的，如果在嵌套for循环中，可以使用break/continue指定循环。
通常，break和continue关键字断开/继续最内循环。
语法：
labelname:  
for(initialization;condition;incr/decr){  
    //code to be executed  
}
实例：
public class LabeledForExample  {
    public static void main(String[] args) {
        step1: for (int i = 1; i <= 3; i++) {
            step2: for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {  //
                    break step2;
                }
                System.out.println(i + " " + j);
            }
        }
    }
}
输出
1 1
1 2
1 3
2 1
3 1
3 2
3 3
4. 无限循环
for(;;){  
    //code to be executed  
}


break
用于断开循环或switch语句。它在指定条件下中断程序的当前流程。 
在内循环的情况下，它仅中断内循环，外循环仍然可继续执行。
continue
语句用于继续循环。 它继续程序的当前流程，并在指定条件下跳过剩余的代码。


注释
//  单行注释
/*  多行注释
code...
code...
*/
/** 文档注释
code...
code...
*/


对象的初始化  //不是创建
1)通过引用变量初始化对象
2)通过方法初始化对象
3)通过构造函数初始化对象


对象的创建
1)通过new关键字
2)通过newInstance()方法
3)通过clone()方法
4)通过反序列化
5)通过工厂方法等


匿名对象
匿名只是表示没有名。没有引用的对象(也就是不使用实例变量)称为匿名对象。它只能在创建对象时使用。如果只需要使用一个对象，匿名对象是一个很好的方法。 例如：

new Calculation();//匿名对象
Calculation c = new Calculation();// 使用实例变量，所以不是匿名对象
new Calculation().fact(5); //通过匿名对象调用方法


构造函数/构造器 
规则：
构造函数名称必须与其类名称相同
构造函数必须没有显式返回类型  //构造函数返回当前类的一个实例


static
java中的static关键字主要用于内存管理。
我们可以应用java static关键字在变量，方法，块和嵌套类中。 
static关键字属于类，而不是类的实例。
静态变量的优点：它能使程序存储器高效(即它节省内存)。

主要修饰：
1.变量(也称为类变量)
2.方法(也称为类方法)
3.代码块
4.嵌套类


静态代码块作用：
1.用于初始化静态数据成员。
2.它在类加载时在main方法之前执行。


this 用法如下：

1.this 关键字可用来引用当前类的实例变量。
2.this 关键字可用于调用当前类方法(隐式)。
3.this()可以用来调用当前类的构造函数。
4.this 关键字可作为调用方法中的参数传递。
5.this 关键字可作为参数在构造函数调用中传递。
6.this 关键字可用于从方法返回当前类的实例。


super 用法如下：

1.super可以用来引用直接父类的实例变量。
2.super可以用来调用直接父类方法。
3.super()可以用于调用直接父类构造函数。


聚合

如果一个类有一个类的实体引用(类中的类)，则它称为聚合。 聚合表示HAS-A关系。

当没有is-a关系时，通过聚合也能最好地实现代码重用。
只有在所涉及的对象的整个生命周期内维持关系为is-a时，才应使用继承; 否则，聚合是最好的选择。


方法重载

只改变方法的返回类型来实现方法重载是不可能的，因为这样具有模糊性，无法预知返回类型

重载 main()方法

可通过方法重载在类中有任意数量的main方法。
 但是JVM调用main()方法，它只接收字符串数组作为参数。

class Test{  
    public static void main(String[] args){System.out.println("main with String[]");}  
    public static void main(String args){System.out.println("main with String");}  
    public static void main(){System.out.println("main without args");}  
}

输出：main with String[]

数据类型提升
byte可以被提升为short，int，long，float或double。 
short数据类型可以提升为int，long，float或double。 
char数据类型可以提升为int，long，float或double等等。

class A {
    A() {
        System.out.println("parent class constructor invoked");
    }
}


实例初始化顺序

加载顺序
无继承：静态成员变量(包含静态代码块)，类保存的时候及就会加载
有继承：静态相关先父类后子类，然后调用父类构造器，再子类。构造器中加载成员变量


public class SubClass extends SuperClass {
	SubClass() {
        super();
        System.out.println("子类无参构造器被调用了");
    }

	SubClass(int a) {
        super();
        System.out.println("子类含参构造器被调用了 " + a);
    }

    static{
        System.out.println("子类静态代码块初始化");
    }
    
    {
        System.out.println("子类非静态代码块初始化");
    }

    public static void main(String args[]) {
    	SubClass s1 = new SubClass();
        System.out.println("====================================");
        SubClass s2 = new SubClass();
    }
}

class SuperClass {
	SuperClass() {
        System.out.println("父类无参构造器被调用了");
    }
	
	static{
        System.out.println("父类静态代码块初始化");
    }
	
	{
        System.out.println("父类非静态代码块初始化");
    }
}

输出：
父类静态代码块初始化
子类静态代码块初始化
父类非静态代码块初始化
父类无参构造器被调用了
子类非静态代码块初始化
子类无参构造器被调用了
====================================
父类非静态代码块初始化
父类无参构造器被调用了
子类非静态代码块初始化
子类含参构造器被调用了 10

在声明时未初始化的final变量称为空白final变量。

如果要在创建一个对象时初始化变量，并且变量在初始化后就不会被改变，
它只能在构造函数中初始化(如果是静态的，只能在静态代码块中初始化)。


绑定

将方法调用连接到方法体称为绑定
分别是：
静态绑定(也称为早期绑定)
动态绑定(也称为后期绑定)

静态绑定
当编译时(由编译器)确定对象的类型时，它被称为静态绑定。
如果在类中有任何private，final或static方法，则有静态绑定。

动态绑定
当在运行时确定对象的类型时，它被称为动态绑定。


abstract

实现抽象的方法
在java中有两种实现抽象的方法，它们分别是：

抽象类(部分)
接口 (完全)


从Java 8开始，我们可以在接口中有方法体，也叫接口增强
普通方法/扩展方法
需要使用default修饰此方法，可重载Object中的方法，不能重写。可直接在实现类中使用。
interface Drawable {
    void draw();

    default void msg() {
        System.out.println("default method");
    }
}

静态方法
需要使用static修饰此方法
interface Drawable {
    void draw();

    static int cube(int x) {
        return x * x * x;
    }
}

标记或标记的接口

没有成员的接口(仅定义一个空的接口)称为标记或标记接口。 
例如：可序列化，可克隆，远程等。它们用于向JVM提供一些基本信息，
以便JVM可以执行一些有用的操作。

public interface Serializable{  
}

嵌套接口
interface printable {
    void print();

    interface MessagePrintable {
        void msg();
    }
}


Java按值调用和引用调用方法，前者值不变，后者会改变


strictfp 关键字  //strict float point (精确浮点)
确保您将在每个平台上获得相同的结果，可用于方法，类和接口,不能应用于抽象方法，变量或构造函数。






















