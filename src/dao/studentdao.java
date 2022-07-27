package dao;

import java.sql.*;

import app.JDBC;
import bean.student;

public class studentdao {
public int getcheck(String username,String password){
    student students = new student();
    ResultSet rs = null;
    int count = -1;
    try{
        String sql = "select count(*) from login where username = '"+username+"' and password = '"+password+"'  ";
        rs = JDBC.chabiao(sql);
        if (rs.next()) {
            count = rs.getInt(1);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return count;
}
}
