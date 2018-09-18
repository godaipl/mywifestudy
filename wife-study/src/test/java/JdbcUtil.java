import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @ClassName JdbcUtil
 * @Description 数据库连接工具类
 * @Author yandongjun
 * @Date 2018/8/20 下午4:11
 * @Version 1.0
 **/
public class JdbcUtil {
    // 数据库ip
    private static String dbIp = "127.0.0.1";
    // 数据库端口，一般没改过就是3306
    private static String dbPort = "3306";
    // 数据库
    private static String database = "imooc";
    // 数据库用户名
    private static String USER = "root";
    // 数据库密码
    private static String PASSWORD = "tiger";

    private static String URL =
            "jdbc:mysql://" + dbIp + ":" + dbPort + "/" + database + "?useUnicode=true&amp;characterEncoding=utf-8";

    public static void doUpdateUserSign(String lastSignTime, int useId) throws ClassNotFoundException, SQLException {
        //1.加载驱动程序
        Class.forName("com.mysql.jdbc.Driver");
        //2.获得数据库链接
        Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
        //3.通过数据库的连接操作数据库，实现增删改查（使用Statement类）
        Statement st = conn.createStatement();

        // String sql = "update bitan_oauth.user_sign set last_sign_time='2018-08-09' where user_id='62';";
        String sql = "update bitan_oauth.user_sign set last_sign_time='" + lastSignTime + "' where user_id='" + useId + "';";


        boolean isOK = st.execute(sql);

        System.out.println("执行结果 " + isOK);

        //关闭资源
        st.close();
        conn.close();
    }
}
