package com.javedhalani.command;

public class UnixFileSystemReceiver implements FileSystemReceiver {

    @Override
    public void openFile() {
        System.out.println("Open file in Unix System");

    }

    @Override
    public void closeFile() {
        System.out.println("Close file in Unix System");
    }

    @Override
    public void readFile() {
        System.out.println("Read file in Unix System");
    }
}
