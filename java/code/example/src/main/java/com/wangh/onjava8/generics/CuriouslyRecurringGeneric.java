package com.wangh.onjava8.generics;// generics/CuriouslyRecurringGeneric.java
// (c)2017 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.

class GenericType<T> {
}

public class CuriouslyRecurringGeneric
        extends GenericType<CuriouslyRecurringGeneric> {
}
