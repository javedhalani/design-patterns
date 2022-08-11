package com.javedhalani.proxy;

public class ClientApp {

    public static void main(String[] args) {
        CommandExecutor executor = new CommandExecutorProxy("Javed", "1234");
        try {
            executor.runCommand("ls");
            executor.runCommand("rm -rf abc.pdf");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
