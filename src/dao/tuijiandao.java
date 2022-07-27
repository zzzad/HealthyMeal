package dao;

import java.sql.*;

import bean.tuijian;
import app.JDBC;

public class tuijiandao {
 public tuijian getresult(String zz) throws SQLException {
     tuijian tuijians = new tuijian();
     ResultSet rs = null;
     try {
         String sql = "select * from sheet1";
         rs = JDBC.chabiao(sql);
         while (rs.next()) {
             if (zz.equals(rs.getString(1))) {
                 String zd = rs.getString(1);
                 String zhz = rs.getString(2);
                 String tj = rs.getString(3);
                 tuijian tuijian1 = new tuijian(zd, zhz, tj);
                 tuijians = tuijian1;
             }
         }

     } finally {
         try {
             if (rs != null) {
                 rs.close();
             }
         } catch (SQLException e) {
             e.printStackTrace();
         }


         return tuijians;
     }
 }
 }
