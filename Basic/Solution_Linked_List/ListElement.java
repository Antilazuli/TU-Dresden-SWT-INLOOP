public class ListElement {
    private String content;
    private ListElement next = null;
    public ListElement(String content) {
        if(content == null || content.isEmpty()) {
            throw new IllegalArgumentException("content must not be null");
        }
        this.content = content;
    }
    public String getContent() {
        return this.content;
    }
    public ListElement getNext() {
        return next;
    }
    public void setContent(String content) {
        if(content == null || content.equals("")) {
            throw new IllegalArgumentException("content must not be null");
        }
        this.content = content;
    }
    public void setNext(ListElement next) {
        this.next = next;
    }
}