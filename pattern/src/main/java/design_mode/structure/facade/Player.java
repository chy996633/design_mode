package design_mode.structure.facade;

public class Player {

    Player fight(MonsterHouse monsterHouse) {
        monsterHouse.fight(this);
        return this;
    }

    Player buySword(Store store) {
        store.sellSword(this);
        return this;
    }

}
