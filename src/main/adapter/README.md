# Adapter Pattern

This is an application utilizing the adapter pattern

# Application Description
A company has two systems to access customer data. One is the new developed system and the
other one is the old legacy system.
The old system access the customer data using USB connection to get the customer data from
some binary files stored on external disk.
The new system access the customer data using REST API over HTTPS connection to an external server.
You can consider that the two systems have the following APIs.
```interface CustomerDataOverUSB {
   void printCustomer(CustomerID id);
   void getCustomer_withUSBConnect(CustomerID id);
}
```
The new system has the following API to access customer data using customer ids.
```
interface CustomerDataOverHTTPS {
   void printCustomer(CustomerID id);
   void getCustomer_withHTTPConnect(CustomerID id);
}
```
You task is to implement a software system that can allow the interface of the old system to be
used as the new interface and is able to convert these two interfaces.

# Implementation Description
* How flexible is your implementation?
    * My implementation applies the Adapter pattern
    * It flexible and can be easily modified in the future.

* How is the simplicity and understandability of your implementation?
    * The structure of the application is very straightforward based on how Adapter pattern is normally implemented. 

* How you avoided duplicated code?
    * I used interfaces and predefined methods to avoid duplicated code.

# UML Diagram
![UML](https://raw.githubusercontent.com/lanyshi/software-design-patterns/main/src/main/adapter/adapter_UML.png)