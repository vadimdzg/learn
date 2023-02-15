package org.day_11;

public class Warrior extends Hero implements PhysAttack {
    public Warrior() {
        super();
        this.setPhysAtt(30);
        this.setPhysDef(80);
        this.setMagicDef(0);
    }

    @Override
    public void physicalAttack(Hero hero) {
        if((hero.getHealth() - (this.getPhysAtt() - this.getPhysAtt() * hero.getPhysDef()/100))>0)
        {hero.setHealth(hero.getHealth() - (this.getPhysAtt() - this.getPhysAtt() * hero.getPhysDef()/100));
    } else hero.setHealth(0);
}

    @Override
    public String toString() {
        return "Warrior{health = " + this.getHealth() + "}";
    }
}
