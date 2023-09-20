public class Pair<T, S>
{
  private T first;
  private S second;
  public Pair(T f, S s) {
    first = f;
    second = s;
  }

  public T getFirst() {
    return first;
  }

  public S getSecond() {
    return second;
  }

  public String toString() {
    return "(" + first + ", " + second + ")";
  }

  public static void main(String[]args)
  {
	  Pair<Integer, String> p = new Pair<Integer, String>(new Integer(10),"Hallo");
	  System.out.println(p.toString());
  }
}