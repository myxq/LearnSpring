package com.icss.dao;

import com.icss.model.User;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import javax.jws.soap.SOAPBinding;
import javax.management.relation.RelationType;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * @author 李永庆
 * @since 2020/6/4
 */
public class UserDaoImpl implements IUserDao {
    private JdbcTemplate jdbcTemplate;


    public void insertUser(User user) throws ParseException {
        System.out.println("============insertUser()=============");
        jdbcTemplate.update("insert into person(id,name,birthday, salary) values(?,?,?,?)",
                user.getId(),user.getName(),user.getBirthday(),user.getSalary()
                );
    }

    public void updateUserSalary(float salary, int id) {
        System.out.println("============updateUserSalary(salary,id)=============");
        jdbcTemplate.update("update person set salary=salary+? where id=?",new Object[]{salary,id});
    }

    public void delUser(int id) {
        System.out.println("============delUser()=============");
        jdbcTemplate.update("delete from person where id=?",id);
    }

    public List<User> findAll() {
        return jdbcTemplate.query("select * from person", new RowMapper<User>() {
            public User mapRow(ResultSet resultSet, int i) throws SQLException {
                User user = new User(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getDate("birthday"),
                        resultSet.getFloat("salary")
                );
                return user;
            }
        });
    }

    public User selectUserById(int id) {
        return jdbcTemplate.query("select * from person where id=?",
                new Object[]{id}, new ResultSetExtractor<User>() {
                    public User extractData(ResultSet resultSet) throws SQLException, DataAccessException {
                        if (resultSet.next()){
                            User user = new User(
                                    resultSet.getInt("id"),
                                    resultSet.getString("name"),
                                    resultSet.getDate("birthday"),
                                    resultSet.getFloat("salary")
                            );
                            return user;
                        }
                        return null;
                    }
                });
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
