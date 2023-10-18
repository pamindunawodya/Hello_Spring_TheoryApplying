package lk.ijse.spring.dto;

public class CustomerDTO {

    private String name;
    private String address;
    private Double salary;

    public CustomerDTO(String name, String address, Double salary) {
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    public CustomerDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "CustomerDTO{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                '}';
    }
}
