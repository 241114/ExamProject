public  class SuperHero extends Hero{
    public SuperHero(Hero hero){
        super(hero.getName(),hero.getHp(),hero.getWeapon());
    }

    public void attack(Creature target){
        setHp(getHp() - 10);
        System.out.println(getName() + "は10ダメージ与えた");
    }


}
