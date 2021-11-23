package anotherpackage;

import somepackage.Car;

public class CombatCar extends Car {
  private int armorQnt;

  public String publics = "This is a public variable";
  private String privates = "This is a private variable";
  protected String protecteds = "This is a protected variable";

  public CombatCar(String name, int armor) {
    // in inheritance is needed to pass all constructor params of parent class to
    // constructor of child class, to do that use: super

    // super is the constructor of parent class to be used in child
    super(name);

    setArmamento(true);
    setBlindagem(armor);

    this.armorQnt = 100;
  }

  public int getArmorQnt() {
    // for use mehod of parent class, use super too
    super.info();
    return this.armorQnt;
  }

  public String getPrivates() {
    return this.privates;
  }

  public String getProtecteds() {
    return this.protecteds;
  }
}