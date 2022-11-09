public class Programmer extends Person{
    private String companyName;
    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName=companyName;
    }

    public String getCompanyName() {
        return companyName;
    }
    public void coding(){
        System.out.println(getName()+"  is coding");
    }

    @Override
    public String toString() {
        return getName()+" is "+getDesignation()+" in "+getCompanyName()+".";
    }
}
