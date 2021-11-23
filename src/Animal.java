abstract class Animal implements LivingBeing {
  private String name;

  public Animal(String name) {
    this.name = name;
  }

  public void move() {
  }

  public void eat(int mass) {
  }

  public String info() {
    return "name: " + this.name;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = "Ant-" + name;
  }
}
