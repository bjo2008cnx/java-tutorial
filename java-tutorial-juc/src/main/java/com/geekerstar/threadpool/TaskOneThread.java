package com.geekerstar.threadpool;

/**
 * @author geekerstar
 * @date 2020/2/6 19:02
 * @description
 */
public class TaskOneThread {
    public static void main(String[] args) {
        Thread thread = new Thread(new Task());
        thread.start();
    }

    static class Task implements Runnable {

        @Override
        public void run() {
            System.out.println("执行了任务");

        }
    }
}
