package com.javedhalani.command;

public class WindowsFileSystemReceiver implements FileSystemReceiver {

    @Override
    public void openFile() {
        System.out.println("Open file in Windows System");

    }

    @Override
    public void closeFile() {
        System.out.println("Close file in Windows System");
    }

    @Override
    public void readFile() {
        System.out.println("Read file in Windows System");
    }
}
