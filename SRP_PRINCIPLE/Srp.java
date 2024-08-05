package SRP_PRINCIPLE;
/*Solid Principle : 
 1. A class should having only one responsibility or one reason to change.
   This means that the class should having one job or one responsibility.
 2. A class should only be Responsible for one thing.
 3. There is a place for every thing ans everything is at place.
 book blanket tools food chips computyer utensils
 4. find one reason to change and  take everything else out of class.

 Goal: following SRP makes your code more modulus easier to understand, maintain and extend. it helps to isolating functionalities,
 doing debugging and testing more straight forword.

 Advantage:
--> code Modular
--> Easy to understand
--> Easy to maintain and extend
--> isolating Functionality
--> Easy to debugging
 */

//  class userInfo{
//     public void  Adduser(String name)
//     {
//         System.out.println(name+" is added");
//     }

//     public void logError(String error)
//     {
//         System.out.println(error);
//     }
//     // This class has no single responsibilty. suppose a exceptuion is thrown. Is it good idead to find logger related exception in userInfo
//  }

//  class Srp{
//     public static void main(String[] args) {
//         userInfo uf = new userInfo();
//         uf.Adduser("ishan");
//         uf.logError("logger related exception thrown");

//     this code is not good as design perspective.
//     }
//  }


class userInfo{
    public void Adduser(String name)
    {
        System.out.println(name + " is added");
    }
}

class logger{
    public void error(String error)
    {
        System.out.println(error);
    }
}

class Srp{
        public static void main(String[] args) {
            userInfo uf = new userInfo();
            uf.Adduser("ishan");
            logger lg = new logger();
            lg.error("logging error");
        }
     }
