public class TADouble implements TANumber{

    private double value_double;

    public TADouble(){

    }

    public void set(double d){
        value_double = d;
    }

    public void evaluate(){

    }

    protected Double get(){
        return value_double;
    }
}