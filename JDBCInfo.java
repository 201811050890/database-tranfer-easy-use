

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 配置JDBC连接用
 * @author Brian
 * @date 2022/8/29 9:34 AM
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JDBCInfo {
    /**
     * 驱动程序类名称
     */
    private String driverClassName;
    /**
     * url
     */
    private String url;
    /**
     * 密码
     */
    private String password;
    /**
     * 用户
     */
    private String user;

    /**
     * 数据库类型
     */
    private String type;

    /**
     * 表名
     */
    private String tableName;

    /**
     * schema [MySQL:与database相同]
     */
    private String schema;

    /**
     * database [MySQL:与schema相同]
     */
    private String database;
}
