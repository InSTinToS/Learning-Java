public class LinkedList<T> {
  private Node<T> start;

  public void add(T value) {
    Node<T> node = new Node<T>();

    node.setValue(value);
    node.setNext(start);

    this.start = node;
  }

  @Override
  public String toString() {
    return "LinkedList [start=" + start + "]";
  }
}
