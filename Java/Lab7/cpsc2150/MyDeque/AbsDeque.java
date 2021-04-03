package cpsc2150.MyDeque;

public abstract class AbsDeque<T> implements IDeque<T> {

    /**
     * @return String
     * @post returns the String of the deque formatted as <a, b>
     */
    @Override
    public String toString(){
        String deque= "<";
        int length= length();
        for( int i=0; i< length; i++){
            if (i==length()-1)
                deque+= get(i+1);
            else
                deque+= (get(i+1)+", ");
            }
        deque+= ">";
        return deque;
    }
}
