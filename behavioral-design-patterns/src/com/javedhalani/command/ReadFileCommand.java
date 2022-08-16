package com.javedhalani.command;

public class ReadFileCommand implements Command {

    private FileSystemReceiver fileSystemReceiver;

    public ReadFileCommand(FileSystemReceiver fs) {
        this.fileSystemReceiver = fs;
    }

    @Override
    public void execute() {
        this.fileSystemReceiver.readFile();
    }
}
