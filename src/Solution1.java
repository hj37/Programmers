public class Solution1 {
	/*멀쩡한 사각형 문제 */
	public static void main(String[] args){
		Solution s = new Solution();
		System.out.println("가로 8, 세로 12일때의 정답은 "+s.solution(8,12));
	}
}

class Solution {
	public long solution(int w,int h) {
        long sum =(long)w * (long)h;
        int gcd = 1;
        
        //최대공약수는 공약수 중에 가장 큰 수이므로 아래와같이 가장 큰 공약수를 구하자마자 멈추고 gcd값을 갱신해준다.
        for(int i= (w>h) ? w:h; i > 0; i--){
            if(w%i == 0 && h % i == 0){
                gcd = i;
                break;
            }
        }
        //블록단위별로 해당하는 블록의 개수 구하고 최대공약수를 곱해줘서 전체적으로 빼야할 블록수를 구함
        return sum - gcd*((w/gcd) + (h/gcd)-1);  
    }
}

//https://greenapple16.tistory.com/89 참고사이트 