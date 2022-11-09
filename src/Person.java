public class Person {
    private String name,designation;

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }
    public void learn(){
        System.out.println("name+"+"  is learning English.");
    }
    public void walk(){
        System.out.println("name+"+"  is walking.");
    }
    public void eat(){
        System.out.println("name+"+"  is eating burger.");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }
}
