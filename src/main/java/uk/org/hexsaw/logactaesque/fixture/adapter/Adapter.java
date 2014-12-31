package uk.org.hexsaw.logactaesque.fixture.adapter;


public interface Adapter<F, T> {
    
    public T to(F f);

}
