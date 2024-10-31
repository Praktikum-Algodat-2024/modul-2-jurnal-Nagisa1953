package PACKAGE_NAME;

class LinkedList {
    private Node front;
    private Node rear;
    private Node top;

    public void enqueue(Antrian antrian) {
        if (rear == null) {
            front = rear = antrian;
        } else {
            rear.setNext(antrian);
            rear = antrian;
        }
    }

    public Antrian dequeue() {
        if (front == null) {
            return null;
        }
        Antrian dequeueAntrian = (Antrian) front;
        front = front.getNext();

        if (front == null) {
            rear = null;
        }
        return dequeueAntrian;
    }

    public void push(Buku buku) {
        buku.setNext(top);
        top = buku;
    }

    public Buku pop() {
        if (top == null) {
            return null;
        }
        Buku popBuku = (Buku) top;
        top = top.getNext();
        return popBuku;
    }

    public void displayQueue() {
        System.out.println("====================================\n" +
                "=          DAFTAR  ANTRIAN         =");
        if (front == null) {
            System.out.println("Antrian Kosong");
            return;
        }

        Node current = front;
        int posisi = 1;
        while (current != null) {
            System.out.println("====================================");
            Antrian antrian = (Antrian) current;
            antrian.setPosisi(posisi);
            System.out.println(antrian.getData());
            System.out.println("====================================");

            posisi++;
            current = current.getNext();
        }
    }

    public void displayStack() {
        Node temp = front;
        Antrian antrian = (Antrian) temp;
        System.out.println("====================================\n" +
                "=           BUKU " + antrian.getNama() + "           =");

        if (top == null) {
            return;
        }

        Node current = top;
        while (current != null) {
            System.out.println("====================================");
            Buku buku = (Buku) current;
            System.out.println(buku.getData());
            System.out.println("====================================");
            current = current.getNext();
        }
    }

    public void swapQueue(int pos1, int pos2) {
        if (pos1 == pos2 || front == null) return;

        Node prev1 = null, prev2 = null;
        Node node1 = front, node2 = front;
        int currentPos = 1;

        while (node1 != null && currentPos != pos1) {
            prev1 = node1;
            node1 = node1.getNext();
            currentPos++;
        }

        currentPos = 1;
        while (node2 != null && currentPos != pos2) {
            prev2 = node2;
            node2 = node2.getNext();
            currentPos++;
        }

        if (node1 == null || node2 == null) return;

        if (prev1 != null) prev1.setNext(node2);
        else front = node2;

        if (prev2 != null) prev2.setNext(node1);
        else front = node1;

        Node temp = node1.getNext();
        node1.setNext(node2.getNext());
        node2.setNext(temp);
    }

    public void deleteQueue(int pos) {
        if (front == null) return;

        if (pos == 1) {
            front = front.getNext();
            if (front == null) rear = null;
            return;
        }

        Node current = front;
        Node prev = null;
        int currentPos = 1;

        while (current != null && currentPos != pos) {
            prev = current;
            current = current.getNext();
            currentPos++;
        }

        if (current == null) return;

        prev.setNext(current.getNext());
        if (current == rear) rear = prev;
    }

    public void swapStack(int pos1, int pos2) {
        if (pos1 == pos2 || top == null) return;

        Node prev1 = null, prev2 = null;
        Node node1 = top, node2 = top;
        int currentPos = 1;

        while (node1 != null && currentPos != pos1) {
            prev1 = node1;
            node1 = node1.getNext();
            currentPos++;
        }

        currentPos = 1;
        while (node2 != null && currentPos != pos2) {
            prev2 = node2;
            node2 = node2.getNext();
            currentPos++;
        }

        if (node1 == null || node2 == null) return;

        if (prev1 != null) prev1.setNext(node2);
        else top = node2;

        if (prev2 != null) prev2.setNext(node1);
        else top = node1;

        Node temp = node1.getNext();
        node1.setNext(node2.getNext());
        node2.setNext(temp);
    }
}