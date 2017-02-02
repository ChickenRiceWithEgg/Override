package chapter8;

public class SuperClassCar {
//这是超类
		public String color ="蓝色";
		public int speed = 1;
		public int level;
	
		public void gear(int a){
			level = a;
			speed = 10*level*level;
		}

		public void drive(){
			System.out.println("我是一辆"+color+"的小汽车");
			System.out.println("现在以时速"+speed+"公里每小时的速度行驶中");
			System.out.println("档位是"+level+"档");
		}
		
		public static void main(String arg[]){
			//public String col ="蓝色"; 在方法中定义变量是不需要加访问修饰符（public、private、protected），但可以加final	
		}
		
}
