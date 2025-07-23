public final class Slime extends Monster{
    public Slime( int hp,char suffix) {
        super("スライム", hp,suffix);
    }

    public void attack(Creature target){
        target.setHp(target.getHp() - 5);
        System.out.println("スライムの体当たり攻撃！" + target.getName() + "に5ダメージ与えた！");
    }
}
