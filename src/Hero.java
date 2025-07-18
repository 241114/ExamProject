public class Hero extends Character{
    String weapon;

    public String getWeapon(){
        return this.weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public Hero(String name,int hp,String weapon){
        super(name,hp);
        setWeapon(weapon);
    }

    public void attack(Creature target){
        setHp(getHp() - 10);
        System.out.println(getName() + "は" + getWeapon() + "で攻撃!" + target.getName() + "に１０ダメージ与えた。");
    }
}
