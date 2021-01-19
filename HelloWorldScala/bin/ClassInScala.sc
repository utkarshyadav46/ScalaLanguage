object ClassInScala {
  case class Student(var rollno:Int=1 ,var name: String ="Navin" ,var marks:Int =90 )
{

def show()=println("Hii");

def >(s2 :Student ): Boolean = marks >s2.marks;

}
val s1=Student();                                 //> s1  : ClassInScala.Student = Student(1,Navin,90)
val s2=Student(2,"Rahul",98);                     //> s2  : ClassInScala.Student = Student(2,Rahul,98)
val res0: Boolean = s1.>(s2)                      //> res0  : Boolean = false

val nums = List(4,7,2,3)                          //> nums  : List[Int] = List(4, 7, 2, 3)

for(n <- nums)
{
println(n);                                       //> 4
                                                  //| 7
                                                  //| 2
                                                  //| 3
}
//Lambda Funciton
nums.foreach{i :Int => println(i)}                //> 4
                                                  //| 7
                                                  //| 2
                                                  //| 3


//reverse  Function
val reverseNums = nums.reverse                    //> reverseNums  : List[Int] = List(3, 2, 7, 4)
reverseNums.foreach{i:Int => println(i)}          //> 3
                                                  //| 2
                                                  //| 7
                                                  //| 4
 
 
 
 
 //remove funtion
val arr= List(2,7,4,5,6,3,1,5,9)                  //> arr  : List[Int] = List(2, 7, 4, 5, 6, 3, 1, 5, 9)
 arr.drop(2)                                      //> res0: List[Int] = List(4, 5, 6, 3, 1, 5, 9)
 arr.drop(2).take(2)                              //> res1: List[Int] = List(4, 5)
 arr drop 2 take 4                                //> res2: List[Int] = List(4, 5, 6, 3)
 arr.foreach{i:Int =>println(i)}                  //> 2
                                                  //| 7
                                                  //| 4
                                                  //| 5
                                                  //| 6
                                                  //| 3
                                                  //| 1
                                                  //| 5
                                                  //| 9
  //We can use Val and Var both in scala .
 //The difference between val and var is that val makes a variable immutable — like final in Java — and var makes a variable mutable. Because val fields can't vary, some people refer to them as values rather than variables.
 var arr1 = List(1,2,true,"ABC")                  //> arr1  : List[Any] = List(1, 2, true, ABC)
  
  
 var studentArray = List(Student(1,"Raman",95),Student(2,"Einstein",89),Student(3,"Edison",98));
                                                  //> studentArray  : List[ClassInScala.Student] = List(Student(1,Raman,95), Stud
                                                  //| ent(2,Einstein,89), Student(3,Edison,98))
 var first = studentArray.head                    //> first  : ClassInScala.Student = Student(1,Raman,95)
 var last = studentArray.tail                     //> last  : List[ClassInScala.Student] = List(Student(2,Einstein,89), Student(3
                                                  //| ,Edison,98))
 //We can use tail.tail, tail.head etc
 
 
 
 //use of filters
 var toppers = studentArray.filter(s => s.marks>90)
                                                  //> toppers  : List[ClassInScala.Student] = List(Student(1,Raman,95), Student(3
                                                  //| ,Edison,98))
 
 //Partition in Scala
 var partitions = studentArray.partition(s => s.marks>=60)
                                                  //> partitions  : (List[ClassInScala.Student], List[ClassInScala.Student]) = (L
                                                  //| ist(Student(1,Raman,95), Student(2,Einstein,89), Student(3,Edison,98)),List
                                                  //| ())
 val part1 ,part2 =studentArray.partition(s => s.marks>=90)
                                                  //> part1  : (List[ClassInScala.Student], List[ClassInScala.Student]) = (List(S
                                                  //| tudent(1,Raman,95), Student(3,Edison,98)),List(Student(2,Einstein,89)))
                                                  //| part2  : (List[ClassInScala.Student], List[ClassInScala.Student]) = (List(S
                                                  //| tudent(1,Raman,95), Student(3,Edison,98)),List(Student(2,Einstein,89)))
 //
}