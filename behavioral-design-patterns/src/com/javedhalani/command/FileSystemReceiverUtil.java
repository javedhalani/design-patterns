package com.javedhalani.command;

public class FileSystemReceiverUtil {

    public static FileSystemReceiver getUnderlyingFileSystem() {
        String osName = System.getProperty("os.name");
        System.out.println("OS = " + osName);
        switch (osName) {
            case "Windows 10" : return new WindowsFileSystemReceiver();
            default: return new UnixFileSystemReceiver();
        }
    }
}
