package day15;

/*
  	����]
		Nemo Ŭ������ ����µ�
		���ο� ������ ���̰� ������ ���� �׸� �ǵ����ϼ���.
		�׸���
		���۷��������� ����ϸ�
			���ΰ� *** , ���ΰ� *** �� �簢���� ���̴� **** �Դϴ�.
		�� ��µǰ� �ϼ���.
 */
public class HW01 {

	public HW01() {
		Object o1 = new String("abcd");
		Object o2 = new String("abcd");
		boolean bool = o1.equals(o2);	// ���?? ������???
		
		Nemo nemo1 = new Nemo(4, 3);
		Nemo nemo2 = new Nemo(3, 4);
		System.out.println(nemo1);
		System.out.println(nemo2);
		System.out.println("nemo1.equals(nemo2) : " + nemo1.equals(nemo2));
	
		Object obj1 = new String("abcd");
		Object obj2 = "abcd";
		boolean bool2 = obj1.equals(obj2); // ==> true	<== equals() StringŬ�������� �������̵� �� �Լ��� ����ϱ� ������....
		
		
	}

	public static void main(String[] args) {
		new HW01();
	}

}
