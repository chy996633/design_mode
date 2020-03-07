package design_mode.structure.facade;


public class Main {
    public static void main(String[] args) {
        // 玩家需要与各个系统交互: 打怪，买装备，卖装备，买药，交易 ……
        Player player = new Player();
        player.fight(new MonsterHouse());
        player.buySword(new Store());
        //...

        // 使用外观模式后，玩家只需要与管家交互
        Player vipPlayer = new Player();
        Manager manager = new Manager(vipPlayer);
        manager.fightAndBuythings(new MonsterHouse(), new Store());

    }

}
