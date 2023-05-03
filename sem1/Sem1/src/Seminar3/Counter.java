package Seminar3;

import javax.naming.OperationNotSupportedException;

public class Counter implements AutoCloseable {
    private int count =0;
    private boolean isClosed = false;
    public void add() throws OperationNotSupportedException{
        if(isClosed)
            throw new OperationNotSupportedException("Can not use closed resource");
        count ++;
    }

    @Override
    public void close() throws OperationNotSupportedException {
        if(isClosed)
            throw new OperationNotSupportedException("Can not close closed resource");
        isClosed = true;
    }
}

/* public class Main {
    public static void main(String[] args) {
        try(Counter counter = new Counter()){
// counter.close();
            counter.add();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }



    }
}
*/