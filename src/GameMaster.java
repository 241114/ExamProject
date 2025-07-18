import java.util.ArrayList;

public class GameMaster {
    public static void main(String[] args) {

        Hero hero = new Hero("勇者",100,"剣");
        SuperHero superhero= new SuperHero(hero);
        Wizard wizard = new Wizard("魔法使い",60);
        Thief thief = new Thief("盗賊",70);
        ArrayList<Character> party = new ArrayList<>();

        Matango matango = new Matango(60,'A');
        Goblin goblin = new Goblin(30,'A');
        Slime slime = new Slime(20,'A');
        ArrayList<Monster> monsters = new ArrayList<>();
        monsters.add(goblin);
        monsters.add(slime);
        monsters.add(matango);



        party.add(hero);
        party.add(wizard);
        party.add(thief);

        System.out.println("---味方パーティ---");
        for (Character c : party) {
            c.showStatus();
        }

        System.out.println("---敵グループ---");
        for (Monster m : monsters) {
            m.showStatus();
        }


        System.out.println("味方の総攻撃");
        for(Character c : party) {
            for(Monster m : monsters) {
                c.attack(m);
            }
        }
        System.out.println("敵の総攻撃");
        for(Monster m : monsters) {
            for(Character c : party) {
                m.attack(c);
            }
        }

        System.out.println("ダメージを受けた勇者が突然光始めた。");
        System.out.println("勇者はスーパーヒーローに進化した");
        party.add(superhero);



        for(Character c : party) {
            for(Monster m : monsters) {
                c.attack(m);
            }
        }

        System.out.println("---味方パーティの最終ステータス---");
        for(Character c : party) {
            for(Monster m : monsters) {
                c.showStatus();
                c.isAlive();
            }
        }
        System.out.println("---敵グループの最終ステータス---");
        for(Monster m : monsters) {
            for(Character c : party) {
                m.showStatus();
                m.isAlive();
            }
        }
    }
}
