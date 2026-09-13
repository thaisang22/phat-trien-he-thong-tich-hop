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
            if (!sc.hasNext()) {
                System.out.println("STOP");
                break;
            }

            String luaChon = sc.next();
            int number;
            try {
                number = Integer.parseInt(luaChon);
            } catch (NumberFormatException exception) {
                System.out.println("Lua chon phai la so nguyen!");
                continue;
            }

            switch (number) {

                case 1:
                    System.out.println("Thong tin su tu:");
                    System.out.println("Ten: " + lion.getName());
                    System.out.println("Can nang: " + lion.getWeight());
                    System.out.println("Luong thuc an moi ngay: " + lion.getEat());
                    System.out.println("So lan an moi ngay: " + lion.getEatOnDay());
                    break;

                case 2:
                    System.out.println("Thong tin ran:");
                    System.out.println("Ten: " + snake.getName());
                    System.out.println("Can nang: " + snake.getWeight());
                    System.out.println("Dai: " + snake.getLength());
                    System.out.println("Mot ngay an bao nhieu lan: " + snake.getEatOnDay());
                    break;

                case 3:
                    System.out.println("Thong tin khi:");
                    System.out.println("Ten: " + monkey.getName());
                    System.out.println("Can nang: " + monkey.getWeight());
                    System.out.println("Thuc an yeu thich: " + monkey.getFoodLove());
                    System.out.println("Mot ngay an bao nhieu lan: " + monkey.getEatOnDay());
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
