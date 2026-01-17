package lesson10.exerc2;

public class User {

    int id;
    String name;
    Address address;

    public User(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public User shallowClone() {
        return new User(this.id, this.name, this.address);
    }

    public User deepClone() {
        new Address (this.address.id, this.address.city);
        return null;
    }

    @Override
    public String toString() {
        return "User{id=" + id + ", name='" + name + "', address=" + address + "}";
    }
}