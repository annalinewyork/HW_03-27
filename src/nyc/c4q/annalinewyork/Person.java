package nyc.c4q.annalinewyork;

/**
 * Created by c4q-nali on 3/30/15.
 */
public class Person {
    /*You are provided with a nyc.c4q.annalinewyork.Person class.
    This class has private fields name, phoneNumber and city, along with their getter and setter methods.
     */
    private String name;
    private String city;
    private String phonenumber;


    public Person() {

    }

    public Person(String name) {
        this.name = name;
    }
    //not sure what's this part used for???

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
    //name, city , phonenumber are private, can not use directly, so I use "get/set" to re-set.

    public boolean checkSamCity(Person person1, Person person2) {

        if (person1.getCity().equals(person2.getCity())) {
            return true;
        } else {
            return false;
        }

    }
    //to check if person1 and person2 from same city.

    public static Person registerChild(Person parent) {

        Person child = new Person("Abc"); //This is an object.

        child.setCity(parent.getCity());
        child.setPhonenumber(parent.getPhonenumber());
        return child;
    }
    //set a new child, and make child's city and phonenumber same with parents'.

}


