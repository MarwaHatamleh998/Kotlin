fun main() {

    // تعريف المتغير الذي يمثل العدد المراد حساب جذره التربيعي
    val number: Double = 2.3

    // تخمين أولي لقيمة الجذر التربيعي
    var guess: Double = 4.4

    // متغير لتخزين القيمة الجديدة في كل تكرار
    var newGuess: Double = 0.0

    // التحقق إذا كان العدد غير صالح (صفر أو سالب)
    if (number <= 0) {
        println("الرجاء إدخال عدد موجب")
    } else {

        // بدء عملية الحساب
        println("بدء الحساب للجذر التربيعي للعدد $number")

        // حلقة تكرار لتحسين النتيجة عدة مرات
        for (i in 1..guess.toInt()) {

            // تطبيق معادلة Babylonian Algorithm
            newGuess = (guess + (number / guess)) / 2

            // طباعة النتيجة في كل دورة
            println("Iteration $i: $newGuess")

            // تحديث قيمة التخمين بالقيمة الجديدة
            guess = newGuess
        }

        // طباعة النتيجة النهائية التقريبية
        println("Approximate square root = $guess")
    }
}