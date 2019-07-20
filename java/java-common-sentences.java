Java常用语句


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
StringBuffer sb = new StringBuffer(); //线程安全的可变数组
sb.append(String s); //字符串追加

//out为java.io.PrintStream实例
PrintStream ps = System.out.format(String format, Object... args);

//out为java.io.PrintStream实例
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
Collection c2 = hMap.keySet(); //返回Key值的集合，一般是Set型
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
boolean res = f.createNewFile(); //创建文件
boolean res = f.mkdir(); //创建目录，上级目录不存在不会创建
boolean res = f.mkdirs(); //递归创建目录，类似于linux的mkdir -p
boolean res = f.isDirectory(); //判断是否为目录
boolean res = f.delete(); //删除文件或者空文件夹
boolean res = f.isHidden(); //判断文件是否隐藏
String str = f.getName(); //获取文件名或文件夹名
String str = f.getPath(); //获取文件或者文件夹的路径
String str = f.getAbsolutePath(); //获取文件或者文件夹的绝对路径
String str = f.getParent(); //获取上级目录
long lm = f.lastModified(); //获取文件最后修改时间
Date d = new Date(lm); //格式化最后修改时间

//需要导入commons.io包，返回非空文件夹大小，以bytes(字节)计
long size = FileUtils.sizeOfDirectory(f);

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
FileFilter ff = new FileFilter() {     //文件过滤器对象
    public boolean accept(File file) {
        return file.isDirectory();
    }
};
File[] fs = dir.listFiles(ff);























