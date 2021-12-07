package edu.soft2.dao.impl;

import edu.soft2.dao.UserDao;
import edu.soft2.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    private User user;
//    @Autowired
//    @Qualifier("user")
//    public void setUser(User user) {
//        this.user = user;
//    }
    @Override
    public int addUser(User user) {
        if (user != null){
            //1.获取JDBC的链接对象Connection
            //2.sql语句拼接
            String sql = "insert user(name,pwd) values("+user.getName()+","+user.getPwd()+")";
            System.out.println("add的sql语句："+sql);
            //3.PreparedStatement执行sql语句，用executeUpdate()
            //4.获取sql执行结果
            System.out.println("数据库add操作");
            return 1;
        }
        return 0;
    }

    @Override
    public int deleUser(User user) {
        if (user != null){
            String sql = "delete * from user where name = "+user.getName()+" ";
            System.out.println("delete的sql语句："+sql);
            System.out.println("数据库dele操作");
            return 1;
        }
        return 0;
    }

    @Override
    public int update(User user) {
        if (user != null){
            String sql = "update user set name where name = "+user.getName()+"";
            System.out.println("update的sql语句："+sql);
            System.out.println("数据库updatae操作");
            return 1;
        }
        return 0;
    }

    @Override
    public int viewUser(User user) {
        if (user != null){
            String sql = "select * from user";
            System.out.println("select的sql语句："+sql);
            System.out.println("数据库select操作");
            return 1;
        }
        return 0;
    }
}
