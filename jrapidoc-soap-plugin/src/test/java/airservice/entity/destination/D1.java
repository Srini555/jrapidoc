package airservice.entity.destination;

import airservice.entity.ObjectInterface;

import java.util.List;

public class D1<T1 extends Destination & ObjectInterface, T2 extends T1>{

    public T1 destination;
    public T2 object;
}
