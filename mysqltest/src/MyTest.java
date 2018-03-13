/**
 * @author: lyh
 * @date: 2018/3/13
 * @description: 尝试连接数据库
 */
import java.sql.*;
public class MyTest {

    public static void main( String[] args) throws ClassNotFoundException, SQLException
    {

        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://127.0.0.1:3306/universegaming";
        String user = "root";
        String password ="123456";
        try{
            Class.forName(driver);      //加载驱动
            Connection con = DriverManager.getConnection( url, user,password);
            if(!con.isClosed()){    //判断数据库是否链接成功
                System.out.println("已成功链接数据库！");
                Statement st = con.createStatement();   //创建Statement对象
                String sql = "select *from user";   //查询user表的所有信息
                ResultSet rs = st.executeQuery(sql);    //查询之后返回结果集
                while (rs.next()){
                    System.out.println(rs.getString("Sid") + "\t" + rs.getString("Sname"));
                }
                rs.close();
                con.close();
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}