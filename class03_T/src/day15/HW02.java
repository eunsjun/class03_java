package day15;


/*
 * [6-20] ������ ���� ���ǵ� �޼��带 �ۼ��ϰ� �׽�Ʈ�Ͻÿ�.
[ ] ���� Math.random() . �� ����ϴ� ��� �������� �ٸ� �� ����
�޼���� : shuffle
�� �� �־��� �迭�� ��� ���� ��ġ�� �ٲٴ� �۾��� �ݺ��Ͽ� �ڼ��̰� �Ѵ� : .
ó���� �迭�� ��ȯ�Ѵ�.
��ȯŸ�� : int[]
�Ű����� �������� ��� �迭 
 */
public class HW02 {

	/*
	 * suffle() ���� �ϼ���...
	 */
	public static int[] shuffle(int[] original) {
		
		return original;
	}
	
	public static void main(String[] args) {
		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(java.util.Arrays.toString(original));
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));

	}

}
