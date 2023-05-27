package DAY58;
// 1. Set up a new Java project in your preferred IDE or text editor.
import java.util.LinkedList;

import java.util.Queue;

import java.util.Random;

public class SharedBuffer { // 2. Define a SharedBuffer class to handle the shared buffer between producer and consumer threads. Implement the following functionalities:
        private LinkedList<Integer> buffer= new LinkedList<>();  // a. Store and manage the buffer.
        private int maxSize;

        public SharedBuffer(int maxSize) {
            this.buffer = new LinkedList<>();
            this.maxSize = maxSize;          // 2b. Limit the maximum buffer size.
        }

        // 2c. Provide synchronized methods for adding elements to and removing elements from the buffer.
        public synchronized void add(int number) throws InterruptedException {  // Synchronized method to add elements
            while (buffer.size() == maxSize) {          // Waits to see if buffer is full
                wait();         // Use wait() and notifyAll() methods to coordinate access to the buffer.

            }

            buffer.add(number);         // Add element to buffer
            notifyAll();                //Use wait() and notifyAll() methods to coordinate access to the buffer.


        }

        public synchronized int remove() throws InterruptedException { // Synchronized method to remove elements
            while (buffer.size() == 0) {            // Waits to see if buffer is empty
                wait();             //Use wait() and notifyAll() methods to coordinate access to the buffer.

            }

            int number = buffer.removeFirst();      // Remove element to buffer
            notifyAll();            // Use wait() and notifyAll() methods to coordinate access to the buffer.


            return number;
        }
    }


    // 3. Implement a Consumer class that represents the consumer thread. This class should:
    class Consumer implements Runnable {
        private SharedBuffer buffer;
        private int sum;

        public Consumer(SharedBuffer buffer) {  // a. Accept a reference to the SharedBuffer object.
            this.buffer = buffer;
            this.sum = 0;
        }

        public void run() {
            while (true) {
                try {
                    int number = buffer.remove();       // b. Retrieve numbers from the shared buffer using the appropriate synchronized method.
                    sum += number;      // c. Calculate the sum of the retrieved numbers.
                    System.out.println("Consumer consumed: " + number + ", Current sum: " + sum);
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    // 4. In the main method or a separate Main class:
    class Main { // In the main method or a separate Main class:
        public void main(String[] args) {
            int maxSize = 10;
            SharedBuffer buffer = new SharedBuffer(maxSize); // a. Create an instance of the SharedBuffer class with a specified maximum size.

            // b. Instantiate the Producer and Consumer classes, passing the SharedBuffer instance to both.
            Producer producer = new Producer(buffer);
            Consumer consumer = new Consumer(buffer);

            // c. two Thread objects, one for the producer and one for the consumer, using the instances created in the previous step.
            Thread producerThread = new Thread(producer);
            Thread consumerThread = new Thread(consumer);

            //  Start both threads.
            producerThread.start();
            consumerThread.start();
        }
    }

        // 5. Test the program to ensure that the producer generates random numbers, the consumer calculates their sum, and proper coordination is maintained between the two threads using synchronization, wait(), and notifyAll() methods.

        // 6. Implement a Producer class that represents the producer thread. This class should:
        class Producer implements Runnable {
            private SharedBuffer buffer;

            public Producer(SharedBuffer buffer) { // a. Accept a reference to the SharedBuffer object.
                this.buffer = buffer;
            }

            // b. Generate random numbers.
            public void run() {
                Random random = new Random();
                while (true) {
                    int number = random.nextInt(100);

                    try {
                        buffer.add(number);     // c. Add the random numbers to the shared buffer using the appropriate synchronized method.
                        System.out.println("Producer produced: " + number);
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }


    // HELLA confused why the logic steps were written with the producer class being last. My logic was more of like a supply chain belt in the kitchen where a producer task would be first then a consumer task run concurrently after.
    // Broke it while trying to test it. Need to change infinite loop to for loop to test with a limited # iteration. IDK why I can't run it, PROB NEED TO FIX MAIN METHOD. BUT I TRIED