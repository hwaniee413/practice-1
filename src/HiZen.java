public class HiZen {  
  String sayHi(String name){
    String hi = "Hi "  + name + "! long time no see :)";
    return hi;
  }
  String msg(){
    return "I bet you will be a good and skilled developer!\nTake care of you!" ;
  }
  String seeYa(){
    return  "See you around!";
  }
  public static void main(String args[]){
    HiZen hiZen = new HiZen();
    System.out.println(hiZen.sayHi("Zen"));
    System.out.println(hiZen.msg());
    System.out.println(hiZen.seeYa());
  }
}
