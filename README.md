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

    **使用场景:** 

    **元素:** 

    **pros:** 

    **cons:** 


### Structural Patterns
***
### Behavioral Patterns
***