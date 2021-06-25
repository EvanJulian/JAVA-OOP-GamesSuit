public class Komputer extends Pemain{
    public Komputer(){
        super();
    }
    public Komputer(Integer nyawa){
        super(nyawa);
    }
    public Integer getAction(){
        Integer i = 1 + (int)(Math.random()*3);
        return i;
    }
}
