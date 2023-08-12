package day28interfacescollections;

        /*
            1)Java does not support "multiple inheritance" for classes but
              if you put all common functionalities into a single parent class
              the parent class will be so huge which we do not want it because
              "atomic structure" is recommended in coding.
            2)To be able to use "multiple inheritance" in Java, Java created "interface"
              structure. You can make multiple interfaces parent of a class, so
              for interfaces "multiple inheritance" is supported in Java.
            3)"interface" is "interface", "interface" is not a class
            4)"interface"s have "common" and "mandatory" functionalities.
              "interface"s are "to-do list" for "concrete child classes".
            5)Methods in an interface
                i)All methods are "abstract" in an interface
                ii)All methods are "public" in an interface
                iii)All methods must be overridden by the concrete child classes
            6)Body part of methods can create issue for the child classes in
              multiple inheritance, but we do not have any concrete methods in interfaces
              that is why there is no confusion for the child classes.
            7)Variables in an interface
                i)All variables are final in an interface
                ii)All variables are public in an interface
                iii)All variables are static in an interface because we cannot create object
                    from interfaces
             8)"interface"s have abstract methods which are uncompleted codes that is why
               Java does not let create objects from an interface
               Note:"interface"s do not have constructors.
             9)You can use methods with the same name in parent interfaces, but return types
               of the methods must be same as well.
             10)Normally we cannot put "method with body" in an interface but by using
                two keywords we can create "method with body" in an interface
                    i)default ==> It is not mandatory to override
                              ==> To use default methods create object from the concrete child class
                    ii)static ==> It is not mandatory to override
                              ==> To use static methods no need to create object use interface name
            11) Class ==> Class : extends
                interface ==> interface : extends
                Class ==> interface : implements
                interface ==> Class : This is impossible, a Class cannot be the parent of an interface
         */

public class Honda implements Engine, Brake, Ac{

    @Override
    public void run() {
        System.out.println("Honda engine runs well");
    }

    @Override
    public int weight() {
        return 500;
    }

    @Override
    public int price() {
        return 2000;
    }

    @Override
    public boolean isKillingBacteria() {
        return true;
    }

}