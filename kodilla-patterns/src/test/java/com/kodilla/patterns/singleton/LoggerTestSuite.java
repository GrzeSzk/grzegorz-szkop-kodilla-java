package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    private static Logger logger;

    @BeforeAll
    public static void logLogger() {
        logger = Logger.INSTANCE;
        logger.log("last log");
    }

    @Test
    void testLastLog() {
        //Given
        //When
        String result = logger.getLastLog();
        //Then
        assertEquals("last log", result);
    }
}
