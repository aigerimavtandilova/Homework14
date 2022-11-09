public class Dancer extends Person{
    private String groupName;
    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName=groupName;
    }

    public String getGroupName() {
        return groupName;
    }
    public void dancing(){
        System.out.println(getName()+" is dancing.");
    }
    @Override
    public String toString() {
        return getName()+" is "+getDesignation()+" in "+getGroupName()+".";
    }
}
