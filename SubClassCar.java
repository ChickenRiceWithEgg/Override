package chapter8;

public class SubClassCar extends SuperClassCar {
	public int oil = 1;
	public SubClassCar(){
		super("黑色");  //调用父类的构造函数
	}
	/* (non-Javadoc)
	 * @see chapter8.SuperClassCar#drive()
	 */
	@Override  //这个要在对应的重写方法的上面一行
	public void drive() {
		if (oil >0){
			super.drive();
		}else{
			System.out.println("车子没油了，无法驾驶");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubClassCar A = new SubClassCar();
		A.drive();
		System.out.println(A.color);
	}

}
