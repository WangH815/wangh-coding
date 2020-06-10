package com.wangh.spring.jdbc;

import com.wangh.spring.jdbc.dao.CustomerDao;
import com.wangh.spring.jdbc.model.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Spring + JDBC 方式有大量冗余代码，不是很推荐
 */
public class SpringJdbcApplication {
    public static void main(String[] args) {
        System.out.println("================================");
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbc/spring-jdbc.xml");
        System.out.println("JDBC测试:");
        CustomerDao customerDAO = (CustomerDao) context.getBean("customerDAO");
        Customer customer = new Customer(1, "wangh", 25);
        customerDAO.delete(1);
        System.out.println("customer表清理完成...");
        customerDAO.insert(customer);
        System.out.println("已插入一条记录...");
        customerDAO.findByCustomerId(1);
        Customer myCustomer = customerDAO.findByCustomerId(1);
        System.out.println("查询结果：");
        System.out.println(myCustomer.getCustomerID() + " " + myCustomer.getName() + " " + myCustomer.getAge());

    }

}
