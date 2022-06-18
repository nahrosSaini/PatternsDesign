package com.Creational.Singleton;

public class SingletonMainDemo {

    public static void main(String arg[]){

        Singleton instance1=Singleton.getInstance();
        Singleton instance2=Singleton.getInstance();

        if(instance1==instance2){
            System.out.println("Both objects are same.");
        }else{
            System.out.println("Both objects are different.");
        }

    }
}

/*

Singleton insure only one object is available in entire application and provides a global point of access to it.

Singleton creates the object once and that too only when we need it.

There are many objects we need only one of it :

1. Thread pools
2. Cache
3. Dialog boxes
4. Objects that handle preference and registry settings
5. Objects that are used for Logging
6. Objects that acts as device drivers to devices like printers and graphic cards

Problems of if above are not only one of its kind:

1. Incorrect program behaviour
2. Overuse of resources
3. Inconsistent results

PITFALLS :

1. Overuse
2. Difficult to unit test
3. If not careful,not thread-safe
4. Sometimes confused for factory
5. java.util.Calendar is not a Singleton
    -> prototype


CONTRAST :

Singleton                                   Factory

1. Returns same instance            1. Returns various instances
2. One no-arg Constructor           2. Multiple Constructor
3. No Interface Driven              3. Interface Driven
4.                                  4. Adaptable to environments easily


 */