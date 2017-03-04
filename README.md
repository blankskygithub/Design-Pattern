# Design Pattern练习

### Creational Patterons
***
*   Factory Pattern

    **使用场景:** 不确定有多少产品，但产品都属于同一类

    **元素:** 具体工厂(ShapeFactory)，抽象产品(Shape)，具体产品(Circle,Rectangle,Square)

    **pros:** 客户端不需要直接创建产品对象，即产品对象的创建对用户隐藏，用户只需要“消费”该产品（getShape()）,
    对产品而言，满足开闭原则（对扩展开放，对修改关闭）。

    **cons:** 当增加一个新的产品时，对工厂类需要增加逻辑判断，不满足开闭原则。

    **改进:** 增加新的抽象工厂来代替原先的具体工厂作为核心，当有新的产品产生时，生成具体工厂与新的具体产品，
    但为避免产生多个具体工厂类，应视情况而定。

*   Abstract Factory Pattern

    **使用场景:** 不确定有多少产品，以及产品类（不同的产品族）

    **元素:** 抽象工厂(AbstractFactory)，具体工厂(ShapeFactory,ColorFactory)，抽象产品(Shape,Color)，具体产
    品(Circle,...,Red,...)

    **pros:** 具有工厂模式的优点，以及可以在类(FactoryProducer)内部中对产品族进行约束

    **cons:** 当增加新的产品族时，对FactoryProduce需要增加逻辑判断，当增加新的产品时，对工厂类增加逻辑判断

*   Singleton Pattern

    **使用场景:** 保证整个程序生命周期中一个类只有一个实例化对象

    **要点:** 构造函数声明为private,通过get函数来进行访问

    **pros:** 保证整个程序生命周期中该类只有一个实例化对象

    **cons:** 单例类在自身被加载时instance会被实例化，对于一些资源开销大的单例对象，应该在使用它的时候创建单例对象，即使用惰性加载，具体实现，见代码注释；在惰性加载代码中，多线程情况下，当多个线程同时使用getInstance()时，会创建多个实例，因此在创建实例之前需要添加，线程验证代码，以验证是否其他线程正在创建实例，具体实现见代码注释

*   Builder Pattern
    
    **使用场景:** 将构建复杂对象的过程和它的部件(简单对象)解耦，一步步的完成一个复杂对象的创建；有多个复杂对象(有不同的构造部件)

    **要点:** 使用构造器(MealBuilder)构造不同种类的复杂对象(VegMeal,ChickenMeal),它们的区别就在于其组成部件不同，当创建新的复杂对象时，可以通过几种部件的组合只在构造器中添加新的构造过程，而不需要修改其他的代码

    **pros:** 对用户隐藏具体的构造细节，使用户可以只通过接口(prepareVegMeal.prepareChickenMeal)来得到复杂对象;当需要多个复杂对象时，如本例中的Meal实例，不使用Builder模式，使用Meal类作为父类，需要新的复杂对象，继承Meal类，增加新的子类，使用Builder模式，只需要在构造器(MealBuilder)中添加新的组合，向用户提供一个新的接口(prepareNewMeal)，减少了类的数量

    **cons:** 需要对产品之间的关系有着清晰地理解，从而才能保证通过不同的组合构造出复杂对象

*   Prototype Pattern

    **使用场景:** 

    **要点:** 

    **pros:** 

    **cons:** 

### Structural Patterns
***
### Behavioral Patterns
***