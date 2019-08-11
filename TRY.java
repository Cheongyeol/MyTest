import java.util.Scanner;

public class TRY {
    static Scanner newInt = new Scanner(System.in);
    public static void main(String[] args) {

        while(true) {
            System.out.println("1~5사이 숫자 입력하세요>>");
            Scanner newInt11 = new Scanner(System.in);
            int inputValue = 0;
            try {
                inputValue = newInt11.nextInt();
            } catch (Exception e) {
                System.out.println("숫자만 입력가능합니다.");
            }
            switch (inputValue){
                case 1: System.out.println("1");break;
                case 2: System.out.println("2");break;
            }



        }



    }
}
