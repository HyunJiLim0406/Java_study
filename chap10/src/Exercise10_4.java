import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Exercise10_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd");
        SimpleDateFormat sdf2 = new SimpleDateFormat("입력하신 날짜는 E요일입니다.");

        Date inputDate = null;
        do{
            System.out.println("날짜를 yyyy/MM/dd의 형태로 입력해주세요. (입력예:2007/05/11)");
            try{
                System.out.print(">>");
                inputDate = sdf1.parse(sc.nextLine());
                break;
            } catch (Exception e) { }
        }while(true);

        System.out.println(sdf2.format(inputDate));
    }
}
