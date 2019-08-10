package com.tester.spring5.plus.ioc.case2;

import java.util.List;

public interface GlobalService<T, I> {
    public void add(T t);

    public Employee delete(T employee);

    public T get(I index);

    public List<T> getAll();

    public T update(T t);


}
