public class List {
    private ListElement head = null;
    public void append(String elem) {
        if(elem == null || elem.isEmpty()) {
            throw new IllegalArgumentException("cannot append null");
        }
        ListElement newLElem = new ListElement(elem);
        if(this.head == null) {
            this.head = newLElem;
        }
        else {
          ListElement elemIt = head;
          while(elemIt.getNext() != null) {
              elemIt = elemIt.getNext();
          }
          elemIt.setNext(newLElem);
        }
    }
    public String remove(String elem) {
        String cache;
        if(elem == null || elem.isEmpty()) {
            throw new IllegalArgumentException("cannot remove null");
        }
        if(head != null) {
            if(head.getContent().equals(elem)) {
                cache = head.getContent();
                head = head.getNext();
                return cache;
            }
            ListElement elemIt = head;
            while(elemIt.getNext() != null) {
                if(elemIt.getNext().getContent().equals(elem)) {
                    cache = elemIt.getNext().getContent();
                    if(elemIt.getNext().getNext() != null) {
                        elemIt.setNext(elemIt.getNext().getNext());
                    }
                    return cache;
                }
                elemIt = elemIt.getNext();
            }
        }
          return null;
    }
}   