public class Goblin extends Monster{
    public Goblin( int hp,char suffix) {
        super("ゴブリン", hp,suffix);
    }
    public void attack(Creature target){
        setHp(getHp() - 10);
        System.out.println("ゴブリン " + getSuffix() + "はナイフで切りつけた！" +getName() + "は10ダメージ与えた");
    }
}
