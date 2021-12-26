package com.blz.javaio;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NIOFileAPITest {

    private static String HOME = System.getProperty("user.home");
    private static String PLAY_WITH_NIO = "TempPlayGround";

    @Test
    public void givenPathWhenCheckedThenConfirm() throws IOException{

        //Check File Exists
        Path homePath = Paths.get(HOME);
        Assert.assertTrue(Files.exists(homePath));


    }

}
