public class Goblin extends Monster{
    public Goblin( int hp,char suffix) {
        super("ゴブリン", hp,suffix);
    }
    public void attack(Creature target){
        target.setHp(target.getHp() - 8);
        System.out.println("ゴブリン " + getSuffix() + "はナイフで切りつけた！" +target.getName() + "に8ダメージ与えた");
    }
}
