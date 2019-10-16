public class kadai02{
	public static void main(String[] args) {
		Renban r1=Renban.getInstance();
		Renban r2=Renban.getInstance();
		System.out.println(r1.getNumber());
		System.out.println(r2.getNumber());
		System.out.println(r1.getNumber());
	}
}

class Renban{
	private static Renban renban =new Renban();
	private int num = 0;
	private Renban() {}
	public static Renban getInstance() {
		return renban;
	}

	public String getNumber() {
		num=num+1;
		return String.format("%04d",num);
	}
}
