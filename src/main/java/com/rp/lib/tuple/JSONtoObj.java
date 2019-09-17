package com.rp.lib.tuple;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.HashMap;
import java.io.*;

public class JSONtoObj extends HashMap{

    public static JSONtoObj parse(File JSONFile, String className) throws ClassNotFoundException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
        mapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS, true);
        mapper.configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true);

        JSONtoObj JSONtoObj = (JSONtoObj) mapper.readValue(JSONFile, Class.forName(className));
        return JSONtoObj;
    }
}
