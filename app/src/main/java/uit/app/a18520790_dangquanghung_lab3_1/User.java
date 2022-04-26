package uit.app.a18520790_dangquanghung_lab3_1;

public class User {
    String name;
    String country;

    public User(String username, String region){
        name = username;
        country = region;
    }

    public String getName(){
        return name;
    }

    public String getCountry(){
        return country;
    }
}
