public class Solution1 {
	/*������ �簢�� ���� */
	public static void main(String[] args){
		Solution s = new Solution();
		System.out.println("���� 8, ���� 12�϶��� ������ "+s.solution(8,12));
	}
}

class Solution {
	public long solution(int w,int h) {
        long sum =(long)w * (long)h;
        int gcd = 1;
        
        //�ִ������� ����� �߿� ���� ū ���̹Ƿ� �Ʒ��Ͱ��� ���� ū ������� �����ڸ��� ���߰� gcd���� �������ش�.
        for(int i= (w>h) ? w:h; i > 0; i--){
            if(w%i == 0 && h % i == 0){
                gcd = i;
                break;
            }
        }
        //��ϴ������� �ش��ϴ� ����� ���� ���ϰ� �ִ������� �����༭ ��ü������ ������ ��ϼ��� ����
        return sum - gcd*((w/gcd) + (h/gcd)-1);  
    }
}

//https://greenapple16.tistory.com/89 �������Ʈ 