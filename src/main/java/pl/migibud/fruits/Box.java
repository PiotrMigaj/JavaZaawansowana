package pl.migibud.fruits;

public class Box<T> {

    private T content;

    public Box(T content) {
        this.content = content;
    }

    public T getContent(){
        return content;
    }
}
