import java.sql.SQLException;

/**
 * @ClassName JdbcTest
 * @Description 示范数据库的使用
 * @Author yandongjun
 * @Date 2018/8/20 下午2:07
 * @Version 1.0
 **/
public class JdbcTest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String lastSignTime = "2018-08-09";
        int userId = 62;
        JdbcUtil.doUpdateUserSign(lastSignTime, userId);
    }
}
