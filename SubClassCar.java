package chapter8;

public class SubClassCar extends SuperClassCar {
	public int oil = 1;
	public SubClassCar(){
		super("��ɫ");  //���ø���Ĺ��캯��
	}
	/* (non-Javadoc)
	 * @see chapter8.SuperClassCar#drive()
	 */
	@Override  //���Ҫ�ڶ�Ӧ����д����������һ��
	public void drive() {
		if (oil >0){
			super.drive();
		}else{
			System.out.println("����û���ˣ��޷���ʻ");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubClassCar A = new SubClassCar();
		A.drive();
		System.out.println(A.color);
	}

}
