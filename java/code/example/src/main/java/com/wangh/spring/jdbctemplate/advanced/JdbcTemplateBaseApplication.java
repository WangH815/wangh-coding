package com.wangh.spring.jdbctemplate.advanced;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Spring + JDBC 方式有大量冗余代码，不是很推荐
 */
public class JdbcTemplateBaseApplication {
    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("jdbcTemplate/base/spring-jdbc.xml");

        StudentDao studentDao = (StudentJdbcTemplate) context.getBean("studentJdbcTemplate");

        System.out.println("----查询所有数据----");
        for (Student record : studentDao.listStudents()) {
            System.out.print("[ ID : " + record.getId());
            System.out.print(", Name : " + record.getName());
            System.out.println(", Age : " + record.getAge() + " ]");
        }

//        System.out.println("----删除一条记录-----");
////        studentDao.deleteById(100);
//
//        System.out.println("----清空已有记录-----");
//        studentDao.deleteAll();

        System.out.println("----插入记录-----");
        studentDao.insert("Maxsu", 19);
        studentDao.insert("Minsu", 23);
        studentDao.insert("Allen", 27);

        // 未报错也没有更新成功，待解决
        System.out.println("----更新一条数据-----");
        studentDao.updateAgeById(1, 100);

        System.out.println("----查询一条数据-----");
        Student student = studentDao.queryStudentById(1);
        if (!(student == null)) {
            System.out.println("[ " + student.getId() + "," + student.getName() + "," + student.getAge() + " ]");
        }

        System.out.println("----查询所有数据----");
        List<Student> students = studentDao.listStudents();
        for (Student record : students) {
            System.out.print("[ ID : " + record.getId());
            System.out.print(", Name : " + record.getName());
            System.out.println(", Age : " + record.getAge() + " ]");
        }
    }

}
