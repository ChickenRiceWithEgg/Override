package chapter8;

public class SuperClassCar {
//���ǳ���
		public String color ="��ɫ";
		public int speed = 1;
		public int level;
	
		public void gear(int a){
			level = a;
			speed = 10*level*level;
		}

		public void drive(){
			System.out.println("����һ��"+color+"��С����");
			System.out.println("������ʱ��"+speed+"����ÿСʱ���ٶ���ʻ��");
			System.out.println("��λ��"+level+"��");
		}
		
		public static void main(String arg[]){
			//public String col ="��ɫ"; �ڷ����ж�������ǲ���Ҫ�ӷ������η���public��private��protected���������Լ�final	
		}
		
}
