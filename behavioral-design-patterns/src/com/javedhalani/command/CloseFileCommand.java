package com.javedhalani.command;

public class CloseFileCommand implements Command {

    private FileSystemReceiver fileSystemReceiver;

    public CloseFileCommand(FileSystemReceiver fs) {
        this.fileSystemReceiver = fs;
    }

    @Override
    public void execute() {
        this.fileSystemReceiver.closeFile();
    }
}
