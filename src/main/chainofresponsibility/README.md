# Chain of Responsibility Pattern

This is an application utilizing the chain of responsibility pattern.

# Application Description

The world is overflowed with trash and people aren't doing enough about it. My idea for this project is to implement a simple smart-trashcan system which helps to identify trash and categorize it automatically for recycling.

According to [EPA.gov](https://www.epa.gov/facts-and-figures-about-materials-waste-and-recycling/national-overview-facts-and-figures-materials), there are mainly 6 types of materials that can be recycled: __Paper and Paperboard__, __Glass__, __Metals__, __Plastic__, __Wood__, and __Rubber, Leather and Textile__.

How the system works is that it takes pieces of trash from the user and process them with different types of processors. Each processor evaluates one piece of trash at a time: Does it belong in my category or not? If so, the processor will accept it, if not, it will be pass the trash to the next processor, and so on so forth. If the trash has been processed by all 6 processors but is accepted by none of them, it will be put into the last one: __Non-Recyclable__.

## Implementation Description

The following questions help to evaluate my implementation for the system.

* How is the flexibility, of your implementation, e.g., how you add or remove in future new
  types?
  
  My implementation is fairly flexible as it's simply a reflection of the design pattern itself with the functionalities of a smart-trashcan system.
  
* How is the simplicity and understandability of your implementation?

  The system doesn't contain any unnecessary code, and all the existing code serves certain purpose, so the implementation is as simple as it can be. Any person that is familiar with the Chain of Responsibility pattern will be able to understand the implementation as well.  

* How you avoided duplicated code?

  There are various situations where I use association and inheritance in the implementation to avoid duplication.

# UML Diagram
![UML](https://raw.githubusercontent.com/lanyshi/software-design-patterns/main/src/main/chainofresponsibility/uml.png)