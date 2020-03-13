package org.turingsquad.cards.bank;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Bank implements Runnable {
    private BlockingQueue<Operation> operationBlockingQueue;

    public void process(Operation operation) {
        try {
            operationBlockingQueue.put(operation);
        } catch (InterruptedException e) {
            System.out.println("BlockingQueue was interrupted");
        }
    }

    public Bank() {
        this.operationBlockingQueue = new LinkedBlockingQueue<Operation>();
    }

    public void run() {
        try {
            Operation operation = operationBlockingQueue.take();
            operation.execute();
        } catch (InterruptedException e) {
            System.out.println("BlockingQueue was interrupted");
        }
    }
}
