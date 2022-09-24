

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

/**
 * jdbc扫描，接收数据
 * @author Brian
 * @date 2022/9/19 9:27 AM
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JdbcVO extends BaseScan{
    /**
     * 数据库类型
     */
    private String dbType;

    /**
     * 数据库主机地址
     */
    private String host;

    /**
     * 端口号
     */
    private String port;

    /**
     * schema名称 [MySQL 与database相同]
     */
    private String schema;

    /**
     * 数据库名称 [MySQL 与schema相同]
     */
    private String database;

    /**
     * 表名
     */
    private String tableName;


    /**
     * 是否全量更新 1:全量。其余增量
     */
    private Integer updateAll;

    /**
     * 时间字段-用作增量更新依据
     */
    private String updateColumnDependency;


}
