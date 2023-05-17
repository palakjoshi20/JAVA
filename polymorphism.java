/*
Method overloading:-
  :-Same name
  :-Same class
  :-Different arguments
    :-> No of arguments
    :->Sequence of arguments
    :->Types of arguments

----FOLLOWS CONCEPT OF PROMOTION OF DATATYPES



 Method overriding:-
  :-Same name
  :-Different class
  :-Same arguments
    :->No of arguments
    :->Sequence of arguments
    :->Types of arguments
  */
 
 
 
 //METHOD OVERIDING


   
// class A{
//     void wish(){
//     // final void wish(){ //final keyword restricts copies of the function and doesn,t allow changes
//         System.out.println("Good morning ");
//     }
// }

// class B extends A{
//     void wish(){
//         System.out.println("Good night ");// method overiding
//     }
// }

// class c{
//     public static void main(String[] args) {
//      B p1=new B();
//      p1.wish(); 
//     }
// }





//METHOD OVERLOADING

// class Student{
// void show(){
//     System.out.println("1");
// }
// void show(int a){
//     System.out.println("2");
// }

// public static void main(String[] args) {
//     Student s1=new Student();
//     s1.show();
//     s1.show(7);
// }
// }



// class Student{
//     void show(String name,int a){
//         System.out.println("first function");
//     }
//     void show(int a,String b){
//         System.out.println("2");
//     }
    
//     public static void main(String[] args) {
//         Student s1=new Student();
//         s1.show("Palak",7);
        
//     }
//     }
    


class Student{
    void show(Object a){
        System.out.println("Object function");
    }
    void show(String a){
        System.out.println("String function");
    }
    
    public static void main(String[] args) {
        Student s1=new Student();
        //s1.show("Palak");
        s1.show('a');//Promoted to object datatype
        
    }
    }





























