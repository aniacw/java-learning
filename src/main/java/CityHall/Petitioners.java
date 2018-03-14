package CityHall;

public class Petitioners {
    private String firstName;
    private String lastName;
    public char matterType;

    public Petitioners(String firstName, String lastName, char matterType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.matterType = matterType;
    }

    public char getMatterType() {
        return matterType;
    }
}