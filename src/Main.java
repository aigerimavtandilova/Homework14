public class Main {

    public static void main(String[] args) {
    Programmer programmer=new Programmer("Aibek","programmer","Peaksoft");
    Dancer dancer= new Dancer("Aliya","dancer","Bereke");
    Singer singer=new Singer("Nurbek","singer","Dance Nation");
        System.out.println(programmer);
        programmer.coding();
        System.out.println(dancer);
        dancer.dancing();
        System.out.println(singer);
        singer.playGuitar();


    }
}