package com.j1.address;

public class DaoPatternDemo {
  public static void main(String[] args) {
    AddressBookDao addressDao = new AddressBookDao();
    System.out.println("-------My addressBook-------\n");   
    for (Address address :  addressDao.getAllAddress()) {
      System.out.println("Address [phone-number:"+address.getNumber()+", Name:"+address.getName()+"]");
    }
    System.out.println("\n-------update-------\n");
    Address address = addressDao.getAllAddress().get(0);
    address.setName("newSoooooding");
    addressDao.updateAddress(address);
    //System.out.println("\n");
    addressDao.getAddress(0);
    System.out.println("\n-------My addressBook-------\n");
    for (Address address2 :  addressDao.getAllAddress()) {
      System.out.println("Address [phone-number:"+address2.getNumber()+", Name:"+address2.getName()+"]");
    }
    System.out.println("\n-------delete-------\n");
    Address address1 = addressDao.getAllAddress().get(1);
    addressDao.deleteAddress(address1);
    System.out.println("\n-------My addressBook-------\n");
    for (Address address2 : addressDao.getAllAddress()) {
      System.out.println("Address [phone-number:"+address2.getNumber()+", Name:"+address2.getName()+"]");
    }
    
  }
}