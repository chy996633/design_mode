package design_mode.behaviour.mediator.database;

import java.util.ArrayList;
import java.util.List;

public class RedisDatabase extends AbstractDatabase{

    private List<String> dataset = new ArrayList<>();

    public RedisDatabase(AbstractMediator mediator) {
        super(mediator);
    }

    @Override
    public void add(String data) {
        System.out.println("redis add data : " + data);
        addData(data);
        mediator.sync(REDIS, data);
    }

    @Override
    public void addData(String data) {
        dataset.add(data);
    }

    public void cache() {
        System.out.println("- Redis 缓存的数据：" + this.dataset.toString());
    }
}
