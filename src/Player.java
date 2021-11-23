public class Player {
  static boolean alert;

  private String name;
  public int age;

  public Player(String name, int age) {
    this.name = name;
    this.age = age;

    System.out.println("Player created");
  }

  public void setName(String name) {
    // remember to not use this in static variables
    alert = true;

    this.name = name;
  }

  public String getName() {
    return this.name;
  }
}
