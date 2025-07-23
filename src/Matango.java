public class Matango extends Monster{
    public Matango( int hp,char suffix) {
        super("お化けキノコ",hp,suffix);
    }
    public void attack(Creature target){
        target.setHp(target.getHp() - 6);
        System.out.println("お化けキノコ"+ getSuffix()+"は体当たり攻撃！" + target.getName() + "に６ダメージ与えた！");
    }
}
