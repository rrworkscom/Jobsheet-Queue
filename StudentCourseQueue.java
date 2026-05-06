public class StudentCourseQueue {
    Student[] data;
    int front, rear, size, max;
    int processed = 0; 

    public StudentCourseQueue(int n) {
        max = n;
        data = new Student[max];
        size = 0;
        front = rear = -1;
    }

    boolean isEmpty() {
        return size == 0;
    }

    boolean isFull() {
        return size == max;
    }

    void clear() {
        front = rear = -1;
        size = 0;
        System.out.println("Queue cleared!");
    }

    void enqueue(Student std) {
        if (isFull()) {
            System.out.println("Queue is full!");
            return;
        }

        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % max;
        }

        data[rear] = std;
        size++;
        System.out.println(std.name + " added to queue");
    }

    void dequeue2() {
        if (size == 0) {
            System.out.println("Queue is empty!");
            return;
        }

        int count = Math.min(2, size);

        System.out.println("Processing KRS approval:");
        for (int i = 0; i < count; i++) {
            Student s = data[front];
            s.print();

            front = (front + 1) % max;
            size--;
            processed++;

            if (size == 0) {
                front = rear = -1;
                break;
            }
        }
    }

    void printAll() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }

        int i = front;
        while (i != rear) {
            data[i].print();
            i = (i + 1) % max;
        }
        data[i].print();
    }

    void peek2Front() {
        if (size == 0) {
            System.out.println("Queue is empty!");
            return;
        }

        System.out.println("First student:");
        data[front].print();

        if (size > 1) {
            System.out.println("Second student:");
            data[(front + 1) % max].print();
        }
    }

    void viewRear() {
        if (!isEmpty()) {
            System.out.println("Last student:");
            data[rear].print();
        } else {
            System.out.println("Queue is empty!");
        }
    }

    void info() {
        System.out.println("Total in queue: " + size);
        System.out.println("Processed students: " + processed);
        System.out.println("Not yet processed: " + (30 - processed));
    }
}