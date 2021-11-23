abstract class Animal implements LivingBeing {
  private String name;

  public Animal(String name) {
    this.name = name;
  }

  public void move() {
  }

  public void eat(int mass) {
  }

  public void info() {
  }

  public String getName() {
    return this.name;
  }
}
