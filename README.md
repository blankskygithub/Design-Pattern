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

    **使用场景:** 需要重复创建相似对象(对象创建过程比较复杂)，使用原型模式，以提高性能

    **要点:** Prototype类(Shape)实现Cloneable接口，并重写clone()函数，返回对象的一个拷贝（Prototype类需要将clone方法的作用域修改为public类型）；使用原型模式创建对象时不需要调用构造函数，调用Object类的clone()方法，直接拷贝内存中的数据块；浅拷贝(只拷贝对象中的基本数据类型属性，数组，容器等类型的属性不拷贝)&深拷贝(拷贝对象中的基本数据类型属性以及数组等数据类型属性)

    **pros:** 使用Object类的clone()方法，返回对象的一个拷贝，从而提升性能；简化对象的创建，类似于复制粘贴


### Structural Patterns
***
*   Adapter Pattern

    **使用场景:** 系统需要使用现有的类，但现有的类不符合系统的接口(基本使用场景)；两个实现相似功能的类，但提供不同的接口，使用适配器模式以提供统一的调用，并将其功能组合起来(代码场景);

    **元素:** 目标接口(play(audioType,fileName))，已存在类(Mp4Player,VlcPlayer，AudioPlayer)，适配器(MediaAdapter)

    **要点:** 新系统的客户需要使用一个特定的接口，原系统已存在的类无法提供该接口，因此增加适配器类来提供目标接口

    **pros:** 不修改原有系统；对已有类复用

    **代码注解:** 这个代码示例中，是对适配器模式的具体应用，已存在的Mp4Player与VlcPlayer分别能够播放mp4文件与vlc文件，AudioPlayer能够播放mp3文件，客户端需要一个play(audioType,filename)接口，来播放各种类型的文件。因此需要增加一个MediaAdapter来对Mp4Player与VlcPlayer进行适配,由于Mp4Player与VlcPlayer都实现了AdvancedMediaPlayer接口，因此只需要提供一个适配器类就可以对所有实现AdvancedMediaPlayer接口的类进行适配，之后在AudioPlayer类中添加MediaAdapter成员，并且为客户提供play(audioType,fileName)接口

    **优化:** 本例中的架构可以转化为工厂模式，将MediaPlayer视为抽象产品，Mp4Player、VlcPlayer、Mp3Player作为工厂中的具体产品，增加一个具体工厂，根据audioType来生成具体的产品，从而满足需求，不过这应该是在系统设计时就决定的架构，当已存在原系统的情况下，适配器模式是最佳的选择，不过这也证明了在不同的时期，可以使用不同的设计模式来完成特定的需求

*   Bridge Pattern

    **使用场景:** 一个对象有多个维度方向上的变化，将这些变化因素抽象，使这个对象更好地依赖于抽象，而不是依赖于具体的因素

    **要素:** 抽象化角色(Circle),具体化角色(RedCircle,BlueCircle)

    **pros:** 对用户而言，只是执行的抽象角色(Circle)的方法(draw()),但他的实现细节是通过调用具体对象(RedCircle,BlueCircle)的方法,因此具体实现对用户透明；将不同的维度分离，当一个维度改变时，对原系统不造成影响，可扩展性高；

    **代码注解:** 本例中的变化维度是Shape的种类与颜色，即不同的颜色执行不同的draw()方法，传统方法是使用继承来得到具体的角色(RedCircle,BlueCircle),但是当系统扩展(两个维度同时增加)时，类的数量会很快膨胀，因此使用Bridge Pattern在抽象层将继承关系转化为聚合关系，实现Shape与Color动态耦合

    **例子:** [桥接模式应用](http://blog.csdn.net/sells2012/article/details/8242712) 在Java中，使用桥接模式实现平台的无关性

*   Filter Pattern

    **使用场景:** 开发者使用不同的标准对一组对象进行筛选，通过逻辑运算以解耦的方式把它们连接起来

    **pros:** 将整个系统的输入，输出行为看成是多个过滤器行为的简单合成;在增加新的过滤标准时，不影响系统中的其他部分;支持并行运算，即每一个过滤器可以作为一个单独的任务;重用性较好;

    **cons:** 不适合处理交互;导致进程成为批处理的结构;每个过滤器都增加了解析和合成数据的工作,这样就导致了系统性能下降,并增加了编写过滤器的复杂性

*   Composite Pattern

    **使用场景:** 希望忽略单个对象和组合对象的区别，统一使用组合结构中的所有对象（封装变化的思想）

    **元素:** Component抽象对象，提供接口；Leaf组合的叶子对象，没有后继，定义组成原始对象的行为(Display())；Composite非叶子对象，实现Component中的孩子操作行为(Add(),Remove());

    **要点:** 将对象组合成树形结构以表示‘部分-整体’的层次关系（树状结构）。组合模式使得用户对单个对象和组合对象使用具有一           致性;
    
              透明方式:在Component中声明所有用来管理子对象的方法，如Add()方法，Remove()方法及GetChild()方法，所有实现Component接口的子类都具备这些方法，这使得Component和子类具备一致的行为接口，使得对客户端无需区别树叶和树枝对象；
    
              安全模式：在透明模式基础上把Component中声明所有用来管理子对象的方法移到Composite中，在Composite实现子对象的管理方法，那么Leaf就没有子对象管理方法，这使得Composite和Leaf的行为接口不一致，所以客户端在调用时要知道树叶和树枝对象存在

### Behavioral Patterns
***