/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun main() {
fun print() {
println("Hi Marwa")
}
print()

val colors = arrayOf("Red" , "Orange")
println(colors[0])

val name = "Marwa";
val loggedIn = true;

if(loggedIn){
    println(name)

}

    var userName: String = "سالم"
    val age: Int = 72
    var medicinesPerDay: Int = 3
    var reminderEnabled: Boolean = true
    val sleepHours:Double = 7.5

    println("اسم المستخدم: " + userName)
    println("العمر: " + age)
    println("عدد الأدوية يوميا: " + medicinesPerDay)
    println("هل التذكير مفعل؟ " + reminderEnabled)
    println("عدد ساعات النوم: " + sleepHours)

    medicinesPerDay = 4
    println("عدد الأدوية بعد التحديث: " + medicinesPerDay)

    val medicines = arrayOf<Any>("دواء الضغط", "فيتامين د", 5)

    println("الدواء الأول: " + medicines[0])
    println("الدواء الثاني: " + medicines[1])
    println("الدواء الثالث: " + medicines[2])

//     بعد تصحيح الكود، أضف:
// مصفوفة ثانية تحتوي على أوقات تناول الأدوية.
// متغيرًا جديدًا من النوع Double.
// سطرًا يعرض أول وقت من أوقات الأدوية.
  val times = arrayOf<Double>(10.00 , 3.00  , 8.00 )
  println("الوقت الأول: " + times[0])

  for (i in 1..3){
     println(i)
   }  
}