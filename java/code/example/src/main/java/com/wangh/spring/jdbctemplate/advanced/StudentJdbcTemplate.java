package com.wangh.spring.jdbctemplate.advanced;

import javax.sql.DataSource;
import java.util.List;

/**
 * StudentDao的实现类
 */
public class StudentJdbcTemplate implements StudentDao {
    private DataSource dataSource;
    private MyJdbcTemplate jdbcTemplate;

    @Override
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new MyJdbcTemplate(dataSource);
    }

    @Override
    public void insert(String name, Integer age) {
        String sql = "insert into student (name, age) values (?, ?)";
        jdbcTemplate.update(sql, name, age);
        System.out.println("此条数据已插入！");
    }

    @Override
    public void deleteById(Integer id) {
        String sql = "delete from student where id = ?";
        jdbcTemplate.update(sql, id);
        System.out.println("此条记录已删除！");
    }

    @Override
    public void updateAgeById(Integer id, Integer age) {
        String sql = "update student set age = ? where id = ?";
        jdbcTemplate.update(sql, id, age);
        System.out.println("此条记录已更新！");
    }

    @Override
    public void deleteAll() {
        String sql = "delete from student where 1 = 1";
        jdbcTemplate.update(sql);
        System.out.println("已删除所有记录！");
    }

    @Override
    public Student queryStudentById(Integer id) {
        String sql = "select id, name, age from student where id = ?";
        Student student = (Student) jdbcTemplate.queryForObject(sql, new Object[]{id}, new StudentMapper());
        if (student == null) {
            return null;
        } else {
            return student;
        }
    }

    @Override
    public List<Student> listStudents() {
        String sql = "select * from student";
        List<Student> students = jdbcTemplate.query(sql, new StudentMapper());
        return students;
    }
}
