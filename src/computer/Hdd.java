package computer;

import java.util.Objects;

public class Hdd {


    private String brand;
    private int size;

    public Hdd(String brand, int size) {
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
        return "Hdd{" +
                "brand='" + brand + '\'' +
                ", size=" + size +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hdd hdd = (Hdd) o;
        return size == hdd.size && Objects.equals(brand, hdd.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, size);
    }
}
