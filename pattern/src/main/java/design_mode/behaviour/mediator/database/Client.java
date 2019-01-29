package design_mode.behaviour.mediator.database;

public class Client {

    public static void main(String[] args) {
        AbstractMediator mediator = new SyncMediator();
        MySQLDatabase mySQLDatabase = new MySQLDatabase(mediator);
        RedisDatabase redisDatabase = new RedisDatabase(mediator);
        EsDatabase esDatabase = new EsDatabase(mediator);

        mediator.setRedisDatabase(redisDatabase);
        mediator.setMySQLDatabase(mySQLDatabase);
        mediator.setEsDatabase(esDatabase);

        System.out.println("\n---------mysql 添加数据 1，将同步到Redis和ES中-----------");
        mySQLDatabase.add("1");
        mySQLDatabase.select();
        redisDatabase.cache();
        esDatabase.count();

        System.out.println("\n---------Redis添加数据 2，将不同步到其它数据库-----------");
        redisDatabase.add("2");
        mySQLDatabase.select();
        redisDatabase.cache();
        esDatabase.count();

        System.out.println("\n---------ES 添加数据 3，只同步到 Mysql-----------");
        esDatabase.add("3");
        mySQLDatabase.select();
        redisDatabase.cache();
        esDatabase.count();


    }

}
