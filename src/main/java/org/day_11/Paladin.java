package org.day_11;

public class Paladin extends Hero implements PhysAttack, Healer {

    public Paladin() {
        super();
        this.setPhysAtt(15);
        this.setPhysDef(50);
        this.setMagicDef(20);
    }

    @Override
    public void healHimself() {
        if((this.getHealth() + 25) <= 100){
            this.setHealth(this.getHealth() + 25);
        } else {this.setHealth(100);}
    }

    @Override
    public void healTeammate(Hero hero) {
        if((hero.getHealth() + 10) <= 100){
            hero.setHealth(hero.getHealth() + 10);
        } else {hero.setHealth(100);}
    }

    @Override
    public void physicalAttack(Hero hero) {
        hero.setHealth(hero.getHealth() - (this.getPhysAtt() - this.getPhysAtt() * hero.getPhysDef()/100));
    }
    @Override
    public String toString() {
        return "Paladin{health = " + this.getHealth() + "}";
    }

}
