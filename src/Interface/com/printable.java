package Interface.com;

public interface printable {
    void prin();
    }
interface Showable extends printable{
    void show();
    }
  class Interface4 implements Showable{

      @Override
      public void prin() {
          System.out.println("welcome");
      }

      @Override
      public void show() {
          System.out.println("Hello");
      }
  }

