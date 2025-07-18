public final class Slime extends Monster{
    public Slime( int hp,char suffix) {
        super("スライム", hp,suffix);
    }

    public void attack(Creature target){
        setHp(getHp() - 10);
        System.out.println("スライムの体当たり攻撃！" + getName() + "は10ダメージ与えた");
    }
}
