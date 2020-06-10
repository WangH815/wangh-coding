Java注解

JDK自带注解
@Override         //表示当前方法覆盖了父类的方法
@Deprecation      //表示方法已经过时,方法上有横线，使用时会有警告
@SuppviseWarnings //表示关闭一些警告信息(通知java编译器忽略特定的编译警告)


文档类型
//       单行注释
    
/*       多行注释
code
*/

/**      文档注释，也称javadoc注释
*
*/


javadoc 标签
javadoc 工具软件识别以下标签：
标签	        描述	                                                示例
@author	        标识一个类的作者	                                    @author description
@deprecated	    指名一个过期的类或成员	                                @deprecated description
{@docRoot}	    指明当前文档根目录的路径	                            Directory Path
@exception	    标志一个类抛出的异常	                                @exception exception-name explanation
{@inheritDoc}	从直接父类继承的注释	                                Inherits a comment from the immediate surperclass.
{@link}	        插入一个到另一个主题的链接	                            {@link name text}
{@linkplain}	插入一个到另一个主题的链接，但是该链接显示纯文本字体	Inserts an in-line link to another topic.
@param	        说明一个方法的参数	                                    @param parameter-name explanation
@return	        说明返回值类型	                                        @return explanation
@see	        指定一个到另一个主题的链接	                            @see anchor
@serial	        说明一个序列化属性	                                    @serial description
@serialData	    说明通过writeObject( ) 和 writeExternal( )方法写的数据	@serialData description
@serialField	说明一个ObjectStreamField组件	                        @serialField name type description
@since	        标记当引入一个特定的变化时	                            @since release
@throws	        和 @exception 标签一样.	The                             @throws tag has the same meaning as the @exception tag.
{@value}	    显示常量的值，该常量必须是static属性。	                Displays the value of a constant, which must be a static field.
@version	    指定类的版本	                                        @version info

示例
/** 这个类绘制一个条形图
* @author runoob
* @version 1.2
*/

Eclipse加载插件JAutodoc
参考注释
类：
/*
 * <p>项目名称: ${project_name} </p> 
 * <p>文件名称: ${file_name} </p> 
 * <p>描述: [类型描述] </p>
 * <p>创建时间: ${date} </p>
 * <p>公司信息: ************公司 *********部</p> 
 * @author <a href="mail to: *******@******.com" rel="nofollow">作者</a>
 * @version v1.0
 * @update [序号][日期YYYY-MM-DD] [更改人姓名][变更描述]
 */
 
方法：
/**
 * @Title：${enclosing_method}
 * @Description: [功能描述]
 * @Param: ${tags}
 * @Return: ${return_type}
 * @author <a href="mail to: *******@******.com" rel="nofollow">作者</a>
 * @CreateDate: ${date} ${time}</p> 
 * @update: [序号][日期YYYY-MM-DD] [更改人姓名][变更描述]     
 */
getter 和 setter

/**
 * 获取  ${bare_field_name}
 */



/**
 * 设置   ${bare_field_name} 
 * (${param})${field}
 */




Spring

Lombok 

Lombok项目是一个Java库，它会自动插入编辑器和构建工具中，Lombok提供了一组有用的注释，用来消除Java类中的
大量样板代码。仅五个字符(@Data)就可以替换数百行代码从而产生干净，简洁且易于维护的Java类。

常用注解：
@Setter                   // 注解在类或字段，注解在类时为所有字段生成setter方法，注解在字段上时只为该字段生成setter方法。
@Getter                   // 使用方法同上，区别在于生成的是getter方法。
@ToString                 // 注解在类，添加toString方法。
@EqualsAndHashCode        // 注解在类，生成hashCode和equals方法。
@NoArgsConstructor        // 注解在类，生成无参的构造方法。
@RequiredArgsConstructor  // 注解在类，为类中需要特殊处理的字段生成构造方法，比如final和被@NonNull注解的字段。
@AllArgsConstructor       // 注解在类，生成包含类中所有字段的构造方法。
@Data                     // 注解在类，生成setter/getter、equals、canEqual、hashCode、toString方法，如为final属性，则不会为该属性生成setter方法。
@Slf4j                    // 注解在类，生成log变量，严格意义来说是常量。


Spring Web

@RequestMapping("/")      // 将 HTTP 请求映射到 MVC 和 REST 控制器的处理方法上

@Component                // 把普通pojo实例化到spring容器中，相当于配置文件中的
@Controller               // 控制器
@Service                  // 服务组件(注入dao)
@Repository               // 数据访问层，即DAO组件
