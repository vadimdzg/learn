package org.day_11;

public class Shaman extends Hero implements PhysAttack, MagicAttack,Healer{

    public Shaman() {
        super();
        this.setPhysAtt(10);
        this.setMagicAtt(15);
        this.setPhysDef(20);
        this.setMagicDef(20);
    }

    @Override
    public void healHimself() {
        if((this.getHealth() + 50)<=100){
        this.setHealth(this.getHealth() + 50);
    } else {this.setHealth(100);}
    }

    @Override
    public void healTeammate(Hero hero) {
        if((hero.getHealth() + 30) <= 100){
            hero.setHealth(hero.getHealth() + 30);
        } else {hero.setHealth(100);}
    }

    @Override
    public void magicalAttack(Hero hero) {
        hero.setHealth(hero.getHealth() - (this.getMagicAtt() -this.getMagicAtt()*hero.getMagicDef()/100));
    }

    @Override
    public void physicalAttack(Hero hero) {
        hero.setHealth(hero.getHealth() - (this.getPhysAtt() - this.getPhysAtt() * hero.getPhysDef()/100));
    }

    @Override
    public String toString() {
        return "Shaman{health = " + this.getHealth() + "}";
    }
}
