package com.j1.address;

import java.util.List;

public interface AddressDao {
  public List<Address> getAllAddress();
  public Address getAddress(int number);
  public void updateAddress(Address address);
  public void deleteAddress(Address address);
}