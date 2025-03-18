package com.ua.crow.cprint.utils;


import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.function.Consumer;

public class  Microbus<T>  {
    private List<Consumer<T>> consumers = new LinkedList<>();


    public Microbus(ExecutorService executorService) {
        this.executorService = executorService;
    }

    private ExecutorService executorService;
    public void acceptAsync(T t){
        consumers.forEach(c->{
            executorService.submit(()->{c.accept(t);});
        });
    }

    public void addConsumer(Consumer<T> consumer){
        consumers.add(consumer);
    }

}
