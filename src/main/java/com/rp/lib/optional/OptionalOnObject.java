package com.rp.lib.optional;

import com.rp.lib.tuple.Customer;
import com.rp.lib.tuple.Item;
import com.rp.lib.tuple.JSONtoObj;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Optional;
import org.apache.logging.log4j.core.util.Loader;

import java.io.File;
import java.io.IOException;

public class OptionalOnObject {
    private static Logger log = LogManager.getLogger();
    private static Loader loader;

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        processItem("item.json");
        processCustomer("customer.json");
    }

    static void processItem(String JSONFileName) throws ClassNotFoundException, IOException {
        File JSONFile = new File(loader.getClassLoader().getResource(JSONFileName).getFile());
        Item item = (Item) JSONtoObj.parse(JSONFile, Item.class.getName());

        log.info("item: {}",item.toString());

        Optional<Integer> tID = item.getInt("TransactionNumber");
        log.info(tID);
        Optional<Double> price = item.getDouble("UnitPrice");
        log.info(price);
        Optional<Double> discount = item.getDouble("Discount");
        log.info(discount);
    }

    static Customer processCustomer(String JSONFileName) throws ClassNotFoundException, IOException {
        File JSONFile = new File(loader.getClassLoader().getResource(JSONFileName).getFile());
        Customer customer = (Customer) JSONtoObj.parse(JSONFile, Customer.class.getName());

        log.info("customer: {}",customer.toString());
        log.info(customer.get("phoneNumber"));
        log.info(customer.address);
        log.debug(customer.get("address"));

        return customer;
    }
}
