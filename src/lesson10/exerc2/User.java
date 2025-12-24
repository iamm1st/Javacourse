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
        Address newAddress = new Address(this.address);
        return new User(this.id, this.name, newAddress);
    }

    @Override
    public String toString() {
        return "User{id=" + id + ", name='" + name + "', address=" + address + "}";
    }
}