
abstract class programming {
    public abstract void Developer();
    public abstract void Rank();
}
abstract class Java extends programming{
    @Override
    public void Developer(){
        System.out.println("tykb");
    }
}
 class position extends Java {
    @Override
    public void Rank(){
        System.out.println("2nd");
    }
}
public class Main
{
	public static void main(String[] args) {
	programming r = new position();
	r.Developer(); r.Rank();
	}
}