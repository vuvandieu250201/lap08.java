package Person;

public class Person {
  private String name, address;

  //khai bao
  public Person(String name, String address) {
    this.name = name;
    this.address = address;
  }

  //truyen gia tri
  public String getName() {
    return name;
  }

  public String getAddress() {
    return address;
  }

  //setter
  public void setAddress(String address) {
    this.address = address;
  }

  @Override
  public String toString() {
  return name + "(" + address +")";
  }
}
