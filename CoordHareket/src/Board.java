import java.util.ArrayList;

public class Board {

    private int SIZE_X;
    private int SIZE_Y;
    private String  bg;

    ArrayList<GameObject> GameObjects = new ArrayList<GameObject>();

    public Board(int SIZE_X, int SIZE_Y, String background){

        this.bg = background;
        this.SIZE_X = SIZE_X;
        this.SIZE_Y = SIZE_Y;

    }

    public Coord getCenter(){
        return new Coord(((SIZE_X+1)/2),((SIZE_Y+1)/2));
    }

}