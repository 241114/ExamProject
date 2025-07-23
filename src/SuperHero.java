public  class SuperHero extends Hero{
    public SuperHero(Hero hero){
        super(hero.getName(),hero.getHp(),hero.getWeapon());
    }

    public void attack(Creature target){
        target.setHp(target.getHp() - 25);
        System.out.println(getName() + "は"+ target.getName() + "に25ダメージ与えた");
    }


}
