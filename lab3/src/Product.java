public class Product {
    private String code;
    private String name;
    private double unitPrice;
    private int quantity;

    public Product() {
    }

    public Product(String code, String name, double unitPrice, int quantity) {
        setCode(code);
        setName(name);
        setUnitPrice(unitPrice);
        setQuantity(quantity);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        if (code == null || code.trim().isEmpty()) {
            throw new IllegalArgumentException("Mã sản phẩm không được để rỗng.");
        }
        this.code = code.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Tên sản phẩm không được để rỗng.");
        }
        this.name = name.trim();
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        if (unitPrice <= 0) {
            throw new IllegalArgumentException("Đơn giá phải lớn hơn 0.");
        }
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("Số lượng phải không âm (>= 0).");
        }
        this.quantity = quantity;
    }

    public double inventoryValue() {
        return unitPrice * quantity;
    }

    public String toCsvLine() {
        return String.format("%s,%s,%.2f,%d", code, name, unitPrice, quantity);
    }

    @Override
    public String toString() {
        return String.format("Mã: %-10s | Tên: %-25s | Đơn giá: %,12.0f VNĐ | Số lượng: %,5d | Tồn kho: %,15.0f VNĐ",
                code, name, unitPrice, quantity, inventoryValue());
    }
}