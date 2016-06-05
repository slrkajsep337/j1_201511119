package com.j1.address;

import java.util.ArrayList;
import java.util.List;

public class AddressBookDao implements AddressDao {
  List<Address> addressBook;
  
  public AddressBookDao() {
    addressBook = new ArrayList<Address>();
    Address address1 = new Address("Soooooding","01079129889");
    Address address2 = new Address("Sooooobing","01028502541");
    addressBook.add(address1);
    addressBook.add(address2);
  }
//@Override
  public void deleteAddress(Address address) {
    //¼öÁ¤; addressBook.remove(address.getNumber());
    int x = addressBook.indexOf(address);
    addressBook.remove(x);
    
    System.out.println("Address: phone-number:" + address.getNumber() + ", deleted from database");
  }
//@Override
  public List<Address> getAllAddress() {
    return addressBook;
  }
//@Override
  public Address getAddress(int number) {
    return null;
  }
//@override
  public void updateAddress(Address address) {
    int x = addressBook.indexOf(address);

    addressBook.get(x).setName(address.getName());
    System.out.println("Address: phone-number:" + address.getNumber() + ", updated in the database");
  }
}
  
  