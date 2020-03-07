package design_mode.structure.facade;

public class Manager {

    Player player;


    public Manager(Player vipPlayer) {
        player = vipPlayer;
    }


    public void fightAndBuythings(MonsterHouse monsterHouse, Store store) {
        monsterHouse.fight(player);
        store.sellSword(player);
    }
}
