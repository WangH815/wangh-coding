package com.wangh.spring.jdbctemplate.base;

import javax.sql.DataSource;
import java.util.List;

/**
 * Student实体操作接口
 */
public interface StudentDao {
    // 初始化数据源
    void setDataSource(DataSource dataSource);

    // 数据插入
    void insert(String name, Integer age);

    // 按id删除
    void deleteById(Integer id);

    // 按id更新
    void updateAgeById(Integer id, Integer age);

    // 删除
    void deleteAll();

    // 数据查询
    Student queryStudentById(Integer id);

    /**
     * 返回所有数据列表
     */
    List<Student> listStudents();
}
