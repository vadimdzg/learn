package org.day_11;

public class Magician extends Hero implements PhysAttack, MagicAttack{
    public Magician() {
        super();
        this.setPhysAtt(5);
        this.setMagicAtt(20);
        this.setPhysDef(0);
        this.setMagicDef(80);
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
        return "Magician{health = " + this.getHealth() + "}";
    }
}
