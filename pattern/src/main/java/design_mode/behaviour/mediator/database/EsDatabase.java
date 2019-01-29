package design_mode.behaviour.mediator.database;

import java.util.ArrayList;
import java.util.List;

public class EsDatabase extends AbstractDatabase{

    private List<String> dataset = new ArrayList<>();

    public EsDatabase(AbstractMediator mediator) {
        super(mediator);
    }

    @Override
    public void add(String data) {
        System.out.println("elasticsearch add data : " + data);
        addData(data);
        mediator.sync(ELASTICSEARCH, data);
    }

    @Override
    public void addData(String data) {
        dataset.add(data);
    }

    public void count() {
        int count = dataset.size();
        System.out.println("Elasticsearch 统计，目前有" + count + "条记录，数据：" + dataset);
    }
}
