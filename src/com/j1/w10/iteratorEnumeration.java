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
    //object�� ���� ū Ÿ��, �ƹ��ų� �ٵ�
    return iterator.next();
  }
}