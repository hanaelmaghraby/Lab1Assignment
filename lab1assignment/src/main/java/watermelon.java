public class watermelon {

    public boolean ifeven(int weight){
        if (weight<1 || weight>100 )
            return false;

        if (weight%2 == 0)
            return true;
        else
            return false;

    }

}
