package classstructuremethods2;

public class Client {
    private String name;
    private int birthYear;
    private String address;

    public String getName(){
        return name;
    }

    public int getBirthYear(){
        return birthYear;
    }

    public String getAddress(){
        return address;
    }

    public void setName(String newName)
    {
        this.name = newName;
    }

    public void setBirthYear(int newBirthYear)
    {
        this.birthYear = newBirthYear;
    }

    public void migrate(String newAddress)
    {
        this.address = newAddress;
    }

    public Client(String address) {
        this.address = address;
    }
}
