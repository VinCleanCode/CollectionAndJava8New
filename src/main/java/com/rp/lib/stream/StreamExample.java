package com.rp.lib.stream;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class StreamExample {
    private static Logger log = LogManager.getLogger();

    public static void main(String[] args) {
        log.error("Test grep log error");
        log.info("Test grep log debug");
        log.debug("Test grep log debug");
    }
}
