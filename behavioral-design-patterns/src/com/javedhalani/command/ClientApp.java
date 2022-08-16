package com.javedhalani.command;

public class ClientApp {

    public static void main(String[] args) {

        FileSystemReceiver fs = FileSystemReceiverUtil.getUnderlyingFileSystem();

        OpenFileCommand cmd = new OpenFileCommand(fs);
        FileInvoker file = new FileInvoker(cmd);
        file.execute();

        ReadFileCommand cmd1 = new ReadFileCommand(fs);
        file = new FileInvoker(cmd1);
        file.execute();

    }
}
