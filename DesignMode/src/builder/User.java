package builder;

/**
 * 优点
	支持多个可变参数
	对于使用者清晰易读
	在构造期给每个参数都赋予有意义的名称
	缺点
	为了创建对象，必须创建构造器
	代码重复
 *
 */
public class User {
	private final String name; //必填
	private final String idCard; //必填
	private final int age;//选填
	private final String address;//选填
	private final String number;//选填
	private final int weight;//选填
	
	public static class Builder{
		private String name; //必填
		private String idCard; //必填
		private int age;//选填
		private String address;//选填
		private String number;//选填
		private int weight;//选填
		
		public Builder(String name, String idCard) {
			this.name = name;
			this.idCard = idCard;
			System.out.println("builder.name=" + this.name);
			System.out.println("builder.idCard=" + this.idCard);
		}
		public Builder age(int age) {
			this.age = age;
			System.out.println("builder.age=" + this.age);
			return this;
		}
		public Builder address (String address) {
			this.address = address;
			System.out.println("builder.address=" + this.address);
			return this;
		}
		
		public Builder number (String number) {
			this.number = number;
			System.out.println("builder.number=" + this.number);
			return this;
		}
		
		public Builder weight (int weight) {
			this.weight = weight;
			System.out.println("builder.weight=" + this.weight);
			return this;
		}
		public User build() {
			return new User(this);
		}
		
	}
	
	private User(Builder builder) {
		this.name = builder.name;
		this.idCard = builder.idCard;
		this.age = builder.age;
		this.address = builder.address;
		this.number = builder.number;
		this.weight = builder.weight;
		System.out.println("User.name=" + this.name);
		System.out.println("User.idCard=" + this.idCard);
		System.out.println("User.age=" + this.age);
		System.out.println("User.address=" + this.address);
		System.out.println("User.number=" + this.number);
		System.out.println("User.weight=" + this.weight);
		
	}
}
