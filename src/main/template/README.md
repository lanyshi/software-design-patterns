# Template Pattern (Refactoring)

This is the EmailGeneration application refactored, utilizing the template pattern.

# Application Description

### Task

There are a lot of dispensables in the program, such as different types of Customer classes which don't have to be written until further implementation.

The old program adopts the Strategy pattern. It's not the optimal choice for this program as it creates change preventers, making changes to the code difficult and time-consuming.
 
The program would grow rapidly in size with more classes added during future development since the coupling among classes was handled poorly.

### Approach

I refactor the program using the Template pattern, which better supplies the purpose of the application.

Doing so, I can lower the coupling within the application by deleting or re-writing classes and interface.

## UML Diagram
![UML](https://raw.githubusercontent.com/lanyshi/software-design-patterns/main/src/main/template/template_uml.png)
