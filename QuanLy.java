import java.util.Scanner;

public class QuanLy {

    public static void Menu() {
        System.out.println("=====MENU=====");
        System.out.println("CHON DONG VAT CAN XEM THONG TIN:");
        System.out.println("1: Su tu");
        System.out.println("2: Ran");
        System.out.println("3: Khi");
        System.out.println("0: Thoat");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        SuTu lion = new SuTu("lion", 300, "cho an 3/ngay", 5);
        Ran snake = new Ran("boa", 50, "cho an 1/ngay", 5);
        Khi monkey = new Khi("monkey", 150, "cho an 3/ngay", "chuoi");

        boolean isTrue = true;

        while (isTrue) {

            Menu();

            System.out.print("Nhap: ");
            int number = sc.nextInt();

            switch (number) {

                case 1:
                    System.out.println("Thong tin su tu:");
                    System.out.println("Ten: " + lion.name);
                    System.out.println("Can nang: " + lion.weight);
                    System.out.println("Thuc an moi ngay: " + lion.eat);
                    break;

                case 2:
                    System.out.println("Thong tin ran:");
                    System.out.println("Ten: " + snake.name);
                    System.out.println("Can nang: " + snake.weight);
                    System.out.println("Dai: " + snake.length);
                    System.out.println("Mot ngay an bao nhieu lan: " + snake.eatOnDay);
                    break;

                case 3:
                    System.out.println("Thong tin khi:");
                    System.out.println("Ten: " + monkey.name);
                    System.out.println("Can nang: " + monkey.weight);
                    System.out.println("Thuc an yeu thich: " + monkey.foodLove);
                    System.out.println("Mot ngay an bao nhieu lan: " + monkey.eatOnDay);
                    break;

                case 0:
                    isTrue = false;
                    System.out.println("STOP");
                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
            }
        }

        sc.close();
    }
}