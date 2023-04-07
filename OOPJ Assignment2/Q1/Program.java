// class SingleTon{
//   private static String reference=null;

//   public static String getInstance()
//   {
//     if (SingleTon.reference==null)
//     {
//          SingleTon.reference=SingleTon.reference+1;
//         SingleTon SingleTon=new SingleTon();
//         System.out.println("Hello");
//     }
//     return SingleTon.reference;
//   }

//}
// class Program
// {
//   public static void main(String[] args)
//   {
//     String s1=SingleTon.getInstance();
//     String s2=SingleTon.getInstance();
//      String s3=SingleTon.getInstance();
//       String s4=SingleTon.getInstance();

//   }
// }

// class SingleTon{
//   private static SingleTon reference;

//   public static SingleTon getInstance()
//   {
//     if (reference==null)
//     {
        
//         reference=new SingleTon();
//         System.out.println("Hello");
//     }
//     return reference;
//   }

// }
// class Program
// {
//   public static void main(String[] args)
//   {
//     SingleTon s1=SingleTon.getInstance();
//     SingleTon s2=SingleTon.getInstance();
//      SingleTon s3=SingleTon.getInstance();
//       SingleTon s4=SingleTon.getInstance();

//   }
// }


// class Singleton{
  
//   private Singleton( ){
   
//   }
//   private static Singleton reference;
//   public static Singleton getReference( ){
//     if( reference == null ){
//       reference = new Singleton( );
//       System.out.println("Hello");}
//     return reference;
//   }
 
//  }
// class Program{
//   public static void main(String[] args) {
//     Singleton s1 = Singleton.getReference(); 
//     Singleton s2 = Singleton.getReference(); 
//     boolean b=s1.equals(s2);
//     System.out.println(b);
//   }
// }


class Singleton{
 
 private static Singleton reference;
 static{
 reference = new Singleton();
 }
 public static Singleton getReference() {
  System.out.println("Hello");
 return reference;
 }

 }
 class Program{
 public static void main(String[] args) {
 Singleton s1 = Singleton.getReference();
 Singleton s2 = Singleton.getReference();
  boolean b=s1.equals(s2);
  System.out.println(b);
 }
 }
