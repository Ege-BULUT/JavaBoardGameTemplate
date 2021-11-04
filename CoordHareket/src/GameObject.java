public class GameObject {

    private Coord coordinate = new Coord(0,0);
    private String SYMBOL;
    private String TYPE;
    private String NAME;

    public GameObject(String Type, String Symbol){
        this.TYPE = Type;
        this.SYMBOL = Symbol;
    }

    public GameObject(String Type, String Symbol, String NAME){
        this.TYPE = Type;
        this.NAME = NAME;
        this.SYMBOL = Symbol;
    }

    public void rename(String Name){
        this.NAME = Name;
    }

    public void setCoordinate(Coord newCoordinate){
        this.coordinate = newCoordinate;
    }

}
