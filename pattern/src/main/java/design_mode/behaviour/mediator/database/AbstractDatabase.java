package design_mode.behaviour.mediator.database;

/**
 *  https://juejin.im/post/5bd275dc51882529290fe2c5
 */

public abstract class AbstractDatabase {

    public static final String MYSQL = "mysql";
    public static final String REDIS = "redis";
    public static final String ELASTICSEARCH = "elasticsearch";
    protected final AbstractMediator mediator;

    public AbstractDatabase (AbstractMediator mediator) {
        this.mediator = mediator;
    }

    public abstract void add(String data);

    public abstract void addData(String data);

}
