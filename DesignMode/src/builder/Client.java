package builder;

public class Client {
	public static void main(String[] args) {
		User user1 = new User.Builder("wanglikun", "111").age(19).address("555").number("13501929772").build();
		System.out.println("________________________________________________________");
		User user2 = new User.Builder("wzf", "31010719891211661x").build();
	}
}
