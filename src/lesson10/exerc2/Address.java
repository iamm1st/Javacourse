package lesson10.exerc2;

public class Address {

    int id;
    String city;

    public Address(int id, String city) {
        this.id = id;
        this.city = city;
    }

    // констр. копирования (для deep clone)
    public Address(Address other) {
        this.id = other.id;
        this.city = other.city;
    }

    @Override
    public String toString() {
        return "Address{id=" + id + ", city='" + city + "'}";
    }
}