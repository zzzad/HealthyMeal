package app;

import java.sql.*;

public class JDBC {
    private static Connection conn = null;

    private static String driverClass = "com.mysql.cj.jdbc.Driver";
    private static String url = "jdbc:mysql://10.253.145.173:3306/sys?useUnicode=true&characterEncoding=utf-8";
    private static String user = "root";
    private static String pass = "194586";

    private static PreparedStatement prs;

    private static ResultSet rs = null;
    private static Statement st = null;

    public static ResultSet chabiao(String sql) {
        try {
            rs = null;
            Class.forName(driverClass);
            conn = DriverManager.getConnection(url, user, pass);
            prs = conn.prepareStatement(sql);
            rs = prs.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return rs;
    }

    public static PreparedStatement ps(String sql){
        try{
            rs = null;
            Class.forName(driverClass);
            conn = DriverManager.getConnection(url, user, pass);
            prs = conn.prepareStatement(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return prs;
    }
}
