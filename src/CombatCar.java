public class CombatCar extends Car {
  private int armorQnt;

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
}
