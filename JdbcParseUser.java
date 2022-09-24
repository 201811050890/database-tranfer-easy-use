

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 解析jdbc-user-password.json
 * @author Brian
 * @date 2022/9/19 11:05 AM
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JdbcParseUser {
    private String hostPort;
    private String user;
    private String password;
    private List<DatabaseList> databaseList;
    /**
     * 模式列表
     * Auto-generated: 2022-09-19 11:3:11
     *
     * @author json.cn (i@json.cn)
     * @website http://www.json.cn/java2pojo/
     * @date 2022/09/19
     */
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class DatabaseList {
        private String database;
        private String user;
        private String password;

    }


}


