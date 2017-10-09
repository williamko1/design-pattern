package builder;

/**
 * �ŵ�
	֧�ֶ���ɱ����
	����ʹ���������׶�
	�ڹ����ڸ�ÿ�����������������������
	ȱ��
	Ϊ�˴������󣬱��봴��������
	�����ظ�
 *
 */
public class User {
	private final String name; //����
	private final String idCard; //����
	private final int age;//ѡ��
	private final String address;//ѡ��
	private final String number;//ѡ��
	private final int weight;//ѡ��
	
	public static class Builder{
		private String name; //����
		private String idCard; //����
		private int age;//ѡ��
		private String address;//ѡ��
		private String number;//ѡ��
		private int weight;//ѡ��
		
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
