package design_mode.behaviour.mediator.database;

import lombok.Data;

@Data
public abstract class AbstractMediator {

    protected MySQLDatabase mySQLDatabase;
    protected RedisDatabase redisDatabase;
    protected EsDatabase esDatabase;

    public abstract void sync(String databaseName, String data);

}
