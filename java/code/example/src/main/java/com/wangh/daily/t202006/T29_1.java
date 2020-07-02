package com.wangh.daily.t202006;

import org.junit.jupiter.api.BeforeAll;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class T29_1 {
    private static Logger log = LoggerFactory.getLogger(T29_1.class);

    public static void main(String[] args) throws IOException {
        beforeAllMsg();

        log.info("hello logging");
        log.error("hello logging");
        log.warn("hello logging");

        System.out.println(System.getProperty("os.name"));
        Path p = Paths.get("T29_1.java").toAbsolutePath();
        say("Exists", Files.exists(p));
        say("Directory", Files.isDirectory(p));
        say("Executable", Files.isExecutable(p));
        say("Readable", Files.isReadable(p));
        say("RegularFile", Files.isRegularFile(p));
        say("Writable", Files.isWritable(p));
        say("notExists", Files.notExists(p));
        say("Hidden", Files.isHidden(p));
        say("size", Files.size(p));
        say("FileStore", Files.getFileStore(p));
        say("LastModified: ", Files.getLastModifiedTime(p));
        say("Owner", Files.getOwner(p));
        say("ContentType", Files.probeContentType(p));
        say("SymbolicLink", Files.isSymbolicLink(p));
        if (Files.isSymbolicLink(p))
            say("SymbolicLink", Files.readSymbolicLink(p));
        if (FileSystems.getDefault().supportedFileAttributeViews().contains("posix"))
            say("PosixFilePermissions", Files.getPosixFilePermissions(p));

    }

    @BeforeAll  // 测试注解其他测试操作都需要的运行一次的方法
    static void beforeAllMsg() {
        System.out.println(">>>BeforeAll");
    }

    static void say(String str, Object p) {
        System.out.println(str + ":" + p);
    }
}
