
package collectionapplication;

public class Tyres {
    public int TyreId;
    private String TyreSize;
    
    public Tyres(int id, String size){
        this.TyreId = id;
        this.TyreSize = size;
    }
    
    public String getTyreSize(){
        return this.TyreSize;
    }
}
