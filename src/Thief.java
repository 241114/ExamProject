public class Thief extends Character{

    public Thief(String name,int hp){
        super(name,hp);
    }

    public void attack(Creature target) {
        target.setHp(target.getHp() - 5);
        System.out.println(getName() + "素早く攻撃した！" + target.getName() + "はに5ダメージ与えた。");
    }
}
