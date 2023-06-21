package Interface.com;

public interface princhair {
    void chair();
}
interface TV{
    void TV();
}
class school{

}
class Room implements printable,TV,{

    @Override
    public void TV() {
        System.out.println("NTTI");
    }

    @Override
    public void prin() {
        System.out.println("Electronic room");
    }

}
