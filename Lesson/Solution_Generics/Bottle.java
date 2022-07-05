public class Bottle<T extends Drink> {
    private T content;
    public boolean isEmpty() {
        if(content != null) {
            return false;
        }
        else {
            return true;
        }
    }
    public void fill(T content) throws IllegalStateException {
        if(isEmpty()) {
            this.content = content;
        }
        else {
            throw new IllegalStateException("Bottle was allready filled when fill() was called!");
        }
    }
    public T empty() throws IllegalStateException {
        if(!isEmpty()) {
            T out = content;
            content = null;
            return out;
        }
        else {
            throw new IllegalStateException("Bottle was allready empty when empty() was called!");
        }
    }
}