package day14;

public class Test05 {

	public Test05() {
		
		try {
			System.out.println("TRY ���� �߻� ��");
			throw new ClassCastException(); // ���� ���� �߻�
//			System.out.println("TRY ���� �߻� ��");
		} catch(ClassCastException e) {
			System.out.println("CATCH ���� �߻� :  ClassCastException");
//			System.out.println(e);
			e.printStackTrace();
		} catch(RuntimeException e) {
			System.out.println("CATCH ���� �߻� :  Exception");
		} catch(Exception e) {
			System.out.println("CATCH ���� �߻� :  Exception");
		/*
		 * ���� Exception catch ������ ��� ���ܰ� �ɷ����� ������
		 * ������ ���ܵ��� �������� ���� �ʱ� ������
		 * �ǹ̰� ��� ������ �߻��Ѵ�.
		} catch(RuntimeException e) {
			System.out.println("CATCH ���� �߻� :  Exception");
		*/
		}
		
	}

	public static void main(String[] args) {
		new Test05();
	}

}
