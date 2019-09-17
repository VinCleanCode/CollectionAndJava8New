package com.rp.lib.tuple;

import java.util.Optional;

public class Item extends JSONtoObj {

    public Optional<Integer> getInt(String k){
        Optional<Integer> optInt = Optional.empty();
        Object obj = this.get(k);
        if(obj instanceof Integer) {
            optInt = Optional.ofNullable((Integer) obj);
        }
        return optInt;
    }

    public Optional<Double> getDouble(String k){
        Optional<Double> optDouble = Optional.empty();
        Object obj = this.get(k);
        if(obj instanceof Double) {
            optDouble = Optional.ofNullable((Double) obj);
        }
        return optDouble;
    }
}
