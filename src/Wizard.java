public class Wizard extends Character{

    public Wizard(String name,int hp){
        super(name,hp);
    }


    public void attack(Creature target){
        target.setHp(target.getHp() - 3);
        System.out.println(getName() + "は火の玉を放った！"+ target.getName()+ "に3ダメージ与えた。");
    }
}
