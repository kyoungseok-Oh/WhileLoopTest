public class WhileLoopTest {
    public static void main(String[] args) {
        //Q. 0~5까지의 수를 출력하세여
        int i =0; // 초기식
        while (i<=5){ // 조건식
            System.out.println(i);
            i++; // 증감심
        }
        //Q. int[] numbers={1,2,3,4,5,6,7,8,9,10} 주어진 배열의 모든 원소를 출력하시오
        int[] numbers={1,2,3,4,5,6,7,8,9,10};
        i=0;
        while (i<numbers.length){
            System.out.println(numbers[i]);
            i++;
        }
        //do-while문
        i=1;
        do {
            System.out.println(i);
            i++;
        }while(i<=5);
    }
}
