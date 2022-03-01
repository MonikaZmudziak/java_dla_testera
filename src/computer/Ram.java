package computer;

import java.util.Objects;

public class Ram {

    private String brand;
    private int size;

    public Ram(String brand, int size) {
        this.brand = brand;
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


    @Override
    public String toString() {
        return "Ram{" +
                "brand='" + brand + '\'' +
                ", size=" + size +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ram ram = (Ram) o;
        return size == ram.size && Objects.equals(brand, ram.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, size);
    }
}
