
import java.util.Scanner;

public class lab1 {

    public static void helloWord() {
        System.out.println("Hello word");
    }

    public static void nhapTenVaIn(Scanner sc) {
        System.out.println("What`s your name?");
        String hoVaTen = sc.nextLine();
        System.out.println("Ho va ten:" + hoVaTen);
    }

    public static void tongHaiSo(Scanner sc) {
        System.out.println("Nhap A:");
        int a = sc.nextInt();
        System.out.println("Nhap B:");
        int b = sc.nextInt();
        int kq = a + b;
        System.out.println("Tong cua 2 so a va b = " + kq);

    }

    public static void soChanHayLe(Scanner sc) {
        System.out.println("Kiem tra so chan le ");
        System.out.println("Nhap so can kiem tra");
        int numberCheck = sc.nextInt();

        if (numberCheck % 2 == 0) {
            System.out.println(numberCheck + " la so chan");
        } else {
            System.out.println(numberCheck + " la so le");
        }
    }

    public static void inRaThang(Scanner sc) {
        boolean isTrue = true;
        while (isTrue) {
            System.out.println("Vui long nhap thang");
            int thang = sc.nextInt();
            if (!sc.hasNextInt() || thang < 1 || thang > 12) {
                System.out.println("Vui long chi nhap so tu 1 - 12");
            } else {
                switch (thang) {
                    case 1:
                        System.out.println("January");
                        break;
                    case 2:
                        System.out.println("February");
                        break;
                    case 3:
                        System.out.println("March");
                        break;
                    case 4:
                        System.out.println("April");
                        break;
                    case 5:
                        System.out.println("May");
                        break;
                    case 6:
                        System.out.println("June");
                        break;
                    case 7:
                        System.out.println("July");
                        break;
                    case 8:
                        System.out.println("August");
                        break;
                    case 9:
                        System.out.println("September");
                        break;
                    case 10:
                        System.out.println("October");
                        break;
                    case 11:
                        System.out.println("November");
                        break;
                    case 12:
                        System.out.println("December");
                        break;
                    default:
                        isTrue = false;
                        sc.close();
                        System.out.println("STOP");
                        break;
                }
            }
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // // helloWord();
        // // nhapTenVaIn(sc);
        // // tongHaiSo(sc);
        // // soChanHayLe(sc);
        // inRaThang(sc);
    }
}
