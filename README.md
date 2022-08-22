# spring-boot-demo
The content of this repository is from the Youtube Channel "Amigoscode".

https://www.youtube.com/watch?v=9SGDpanrc8U&t=535s&ab_channel=Amigoscode

# Notes

In Backend part of this application, we have three layers to handle the data

1. API Layer = StudentController class in this project. A controller is a class object to handle the data
flow of the application in the MVC pattern.
1. Service Layer =  StudentService class in this project. The controller ask service to get the data or modify the data
2. Data Access Layer


## Java Annotations
Java annotations are metadata (data about data) for program source code. They tells the complier additional information
about our program. However, it does not affect the execution of the complied program. For example @Override annotation 
tells the complier that this method is override with its super class. 
- Compiler instructions - Annotations can be used for giving instructions to the compiler, detect errors or suppress warnings. The built-in annotations @Deprecated, @Override,@SuppressWarnings are used for these purposes.
- Compile-time instructions - Compile-time instructions provided by these annotations help the software build tools to generate code, XML files and many more.
- Runtime instructions - Some annotations can be defined to give instructions to the program at runtime. These annotations are accessed using Java Reflection.

## Model-View-Controller (MVC) Pattern
This pattern is used to separate application's concerns.

- Model - Model represents an object or JAVA POJO carrying data. It can also have logic to update controller if its data changes.

- View - View represents the visualization of the data that model contains.

- Controller - Controller acts on both model and view. It controls the data flow into model object and updates the view whenever data changes. It keeps view and model separate.This pattern is used to separate application's concerns.

## Modifier: Final
final is a non-access modifier that used for classes, attributes, and methods, which makes them non-changeable (impossible to inherit or override).

