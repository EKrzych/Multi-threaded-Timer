package com.codecool;

public class Timer extends Thread {
    String timerName;
    int time;

    public Timer(String timerName, String threadId) {
        super(threadId);
        this.timerName = timerName;
        increment();
    }

    public void start() {
        this.time = 0;
    }

    public int check() {
        return this.time;
    }

    private void increment() {
        try {
            this.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println(this.timerName + "received interrupt while sleeping");
            return;
        }
        this.time++;
    }

    public void stopThread(){
        this.interrupt();

    }
}
