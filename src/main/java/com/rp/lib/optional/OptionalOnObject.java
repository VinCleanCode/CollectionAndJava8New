package com.rp.lib.optional;

import com.rp.lib.tuple.JSONtoObj;
import com.rp.lib.tuple.Item;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;

import static org.apache.logging.log4j.core.util.Loader.getClassLoader;

public class OptionalOnObject {
    private static Logger log = LogManager.getLogger();

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File JSONFile = new File(getClassLoader().getResource("item.json").getFile());
        Item item = (Item) JSONtoObj.parse(JSONFile, Item.class.getName());
        log.info("item Action: {}",item.get("Action"));
    }
}
