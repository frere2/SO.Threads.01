package controller;

public class ModThread extends Thread {

    @Override
    public void run() {
        int id = (int) threadId();
        System.out.println("ID: " + id);
    }
}
