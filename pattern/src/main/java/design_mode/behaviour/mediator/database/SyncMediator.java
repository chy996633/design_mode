package design_mode.behaviour.mediator.database;

public class SyncMediator extends AbstractMediator {

    @Override
    public void sync(String databaseName, String data) {
        if (databaseName.equalsIgnoreCase(AbstractDatabase.MYSQL)) {
            //同步至es,redis
            this.esDatabase.addData(data);
            this.redisDatabase.addData(data);
        } else if (databaseName.equalsIgnoreCase(AbstractDatabase.REDIS)) {
            //不需要同步
        } else if (databaseName.equalsIgnoreCase(AbstractDatabase.ELASTICSEARCH)) {
            //同步至Mysql
            this.mySQLDatabase.addData(data);
        }
    }
}
