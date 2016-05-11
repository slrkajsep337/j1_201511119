package com.j1.w10;

public class iteratorEnumeration implements Enumeration {
  Iterator iterator;
  public iteratorEnumeration(Iterator iterator) {
    this.iteraotor=iterator;
  }
  public boolean hasMoreElements() {
    return iterator.hasNext();
  }
  public Object nextElement() {
    //object가 가장 큰 타입, 아무거나 다들어감
    return iterator.next();
  }
}