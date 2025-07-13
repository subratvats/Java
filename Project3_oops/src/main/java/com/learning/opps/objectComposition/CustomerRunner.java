package com.learning.opps.objectComposition;

public class CustomerRunner {
    public static void main(String[] args) {

        Address homeAddress = new Address("home address", "delhi", "541618");
        Customer customer = new Customer("Subrat", homeAddress);

        Address workAddress = new Address("add for work", "delhi", "541618");
        customer.setWorkAddress(workAddress);

        System.out.println(customer);

    }
}
