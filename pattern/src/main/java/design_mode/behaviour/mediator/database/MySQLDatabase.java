package design_mode.behaviour.mediator.database;

import java.util.ArrayList;
import java.util.List;

public class MySQLDatabase extends AbstractDatabase {

    private List<String> dataset = new ArrayList<>();

    public MySQLDatabase(AbstractMediator mediator) {
        super(mediator);
    }

    @Override
    public void add(String data) {
        System.out.println("mysql add data : " + data);
        addData(data);
        mediator.sync(MYSQL, data);
    }

    @Override
    public void addData(String data) {
        dataset.add(data);
    }

    public void select() {
        System.out.println("- Mysql 查询，数据：" + this.dataset.toString());
    }
}
