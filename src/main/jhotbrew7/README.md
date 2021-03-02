# JHotBrew 7 Design Pattern Analysis

## Composite Pattern
The composite pattern is used in this framework. Figure interface is the Component, GraphicalCompositeFigure class is the Composite, and RectangleFigure class, lineFigure class, etc. are the Leaves.
A figure is specified by the concrete child classes (leaves). The composite stores all the leaves and handles their behavior. By adopting the composite pattern, the framework is able to handle a collection of figures uniformly.
It’s easy to add a concrete class that behaves as a leaf to the framework, because it has no children and can be easily added and removed from the composite.
![UML](https://raw.githubusercontent.com/lanyshi/software-design-patterns/main/src/main/jhotbrew7/composite_uml.png)

## State Pattern
Another pattern used in this framework is the state pattern. SelectionTool class is the Context, SelectAreaTracker class, HandleTracker class, and DragTracker are different States. There are four states for the editor – initial state, selecting figure, dragging figure, handling figure. The editor keeps track of the tools are being used to manipulate figures and handles different states by different child tool classes.
A user can easily define their own tool. For example, they can add a custom selection tool that extends SelectionTool for capturing certain mouse events. This kind of changes are feasible because adding a tool will not affect the structure of the framework or interfere the editor tracking user’s actions, as the tool class is a child class.
![UML](https://raw.githubusercontent.com/lanyshi/software-design-patterns/main/src/main/jhotbrew7/state_uml.png)

## MVC Pattern
Finally the framework also adopts the model-view-controller pattern, where Figure and Drawing are the Models, DrawingView is the View, and Tool is the Controller.
When a user toggles a figure on the editor, the view gets action data from the user, transfers the data to the controller. The controller takes the input and processes it for the model. The model then retrieves the state and announces the stage changes to the observers.
The easiest component to add a new class to is a model. Having multiple models is common because it can help to deal with changes in multiple states of a program based on user activity.
![UML](https://raw.githubusercontent.com/lanyshi/software-design-patterns/main/src/main/jhotbrew7/mvc_uml.png)
