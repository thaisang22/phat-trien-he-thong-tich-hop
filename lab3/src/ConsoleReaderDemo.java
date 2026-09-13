
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class ConsoleReaderDemo {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in, StandardCharsets.UTF_8));

        int count = 0;
        System.out.println("Nhập văn bản; nhập q để kết thúc");
        try {
            while (true) {
                String line = reader.readLine();
                if (line == null || line.equalsIgnoreCase("q")) {
                    break;
                }
                count++;
                System.out.printf("Dòng %d: %s%n", count, line);
            }
        } catch (IOException e) {
            System.err.printf("Không thể đọc dữ liệu:" + e.getMessage());
        }
        System.out.println("Tổng số lượng đã nhập " + count);
    }
    /*
     * Câu hỏi suy luận
     * 1. Vì sao cần InputStreamReader giữa System.in và BufferedReader?
     * System.in là InputStream đọc dữ liệu dưới dạng byte thô còn BufferedReader
     * lại làm việc với các Reader ở dạng ký tự nên cần có InputStreamReader để
     * chuyển đổi từ byte thô sang ký tự
     * 2. Giá trị trả về của readLine() khi gặp EOF
     * Phương thức readLine() trả về null khi đọc đến cuối luồng (EOF - End Of
     * File).
     * 
     * 3. Lý do nhiều ví dụ không đóng reader gắn với System.in
     * Khi gọi phương thức close() trên BufferedReader bao bọc System.in, Java sẽ tự
     * động đóng luôn System.in của hệ thống. Điều này gây ra hai vấn đề chính:
     * 
     * Không thể tái sử dụng: System.in là một tài nguyên toàn cục của JVM. Nếu đóng
     * nó, bạn sẽ không thể đọc dữ liệu từ bàn phím ở bất kỳ phần nào khác của
     * chương trình sau đó.
     * 
     * Tự động giải phóng tài nguyên: Trong các ứng dụng console nhỏ hoặc ví dụ mã
     * nguồn, hệ điều hành và JVM sẽ tự động thu hồi toàn bộ tài nguyên khi chương
     * trình kết thúc, khiến việc gọi close() trở nên không bắt buộc. Tuy nhiên,
     * trong các ứng dụng lớn, việc quản lý vòng đời luồng vẫn cần được cân nhắc kỹ
     * lưỡng.
     */
}
