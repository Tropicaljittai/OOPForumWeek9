# OOP
Joseph Ruys
L2AC
2602116964

## 1.(a) By making use of an example from the above scenario, distinguish between a class and an instantiation of a class. (3 points)
- A class is only a template that has its own properties and methods, while the instance of that class is the actual implementation of the template that was given in the class for example in a game there would be an entity class, that has its own HP, speed, etc while the instance of that class would be an actual entity that will be in that game(player, monster, etc).
The different modules in the program each open a graphical user interface (GUI). Each GUI has a similar design but contains differences specific to each module. (b) By giving two examples, explain how the principles of inheritance can be incorporated into the design of this administration program. (4 points)
-	example 1 = The main GUI class may have some common properties and attributes in which is found in all the UI classes, however each UI class may have an extended attribute and method compared to the parent GUI class which makes each UI different from the other but still sharing somewhat of a similar functioning system
-	example 2 = an "entity" superclass in a game will allow us to make more instances of its class and inherit their characteristics for example a player, or a monster each with their own respective HP and speed, but with these classes we can extend more with their own properties and methods(attack behavior and the sorts).
## (c) Describe how the use of libraries can facilitate the development of programs like this company’s administration program. (3 points)
- Libraries will allow us to do certain tasks easier as they have already a pre-built functions and codes in them in which will save us time and optimize our code as these libraries usually contains important and essentials functions
## 2.(b) Explain why accessor methods are necessary for the SalesPerson class. (3 points)
- When making an instance of that class we do not have access to all their attributes, the private ones to be exact, but with an accessor method we will be able to access them
## (c) (ii) Outline a negative effect that a future change in the design of the Sales object might have on this suite of programs. (2 points)
- If a change is done to the SalesPerson class will also affect the Sales class, for example CalcTotalSales is relying on the Sales class.
## A further class in this suite of programs is the Payroll class. This class is run at the end of each month to calculate each salesperson’s salary, which is based on the sales that have been made during that month.
## (h) Suggest changes that must be made to the SalesPerson class and/or the Sales class to allow these calculations to be made. (3 points)
- We will need a date variable that is going to help us count the salary for each month, and its own setters/getters. Which will affect the CalcTotalSales function too, as the date variable will be needed to be taken into account in this function
## (i) Discuss the use of polymorphism that occurs in this suite of programs. (3 points)
- The use of polymorphism that occurs in this suite of programs is overloading, as shown by the 2 constructors in the SalesPerson class, as it has the method and name but will behave differently according to the parameters that are given

### UML diagram and output
![UML](https://cdn.discordapp.com/attachments/734045662169137234/1106218959000305765/image.png)
![OUTPUT](https://cdn.discordapp.com/attachments/734045662169137234/1106219581963509901/image.png)
