
package collectionapplication;

public class CollectionApplication {

    public static void main(String[] args) {
      Car automobile = new Car(123, "Suzuki", "Dyna", "12h:00", "17h:00", true);
        
        Seat st = new Seat();
        st.seatColor = "yellow";
        st.seatId = 124;
        automobile.setSeat(st);
        automobile.displayCar();
        String[] cartyre = automobile.getTyres();
        Tyres[] cartyres = automobile.carTyres();
        for(int i = 0; i < cartyre.length;  i++){
            System.out.println(cartyre[i]);
        }
        for(Tyres tr: cartyres){
            System.out.println("tyre id: " + tr.TyreId + " type size: " +tr.getTyreSize());
        }
    }
    
}
