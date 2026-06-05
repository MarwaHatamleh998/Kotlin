fun calculateTotalUsage(usages: IntArray): Int {
    var total = 0

    for (usage in usages) {
        total += usage
    }

    return total
}

fun checkDevice(usage: Int): String {
    return if (usage > 500) {
        "High consumption"
    } else {
        "Normal consumption"
    }
}

fun findHighestUsage(devices: Array<String>, usages: IntArray): String {
    var highestIndex = 0

    for (i in usages.indices) {
        if (usages[i] > usages[highestIndex]) {
            highestIndex = i
        }
    }

    return devices[highestIndex]
}

fun main() {

    // المرحلة الأولى
    val appName = "Electricity Usage Assistant"
    val maxAllowedUsage = 1000
    var systemRunning = true

    val devices = arrayOf(
        "TV",
        "Fridge",
        "AC",
        "Washing Machine"
    )

    val usages = intArrayOf(
        150,
        300,
        700,
        400
    )

    val deviceCount = devices.size

    println("=== $appName ===")
    println("Number of devices: $deviceCount")
    println("Maximum allowed usage: $maxAllowedUsage W")
    println("System running: $systemRunning")

    // اختبار الفهرسة
    println("\nSample device:")
    println("${devices[1]} consumes ${usages[1]} W")

    // المرحلة الثانية
    val totalUsage = calculateTotalUsage(usages)

    println("\nTotal usage: $totalUsage W")

    // المرحلة الثالثة والرابعة
    println("\nDevice Status:")

    for (i in devices.indices) {
        println("${devices[i]} -> ${checkDevice(usages[i])}")
    }

    // مقارنة الاستهلاك الكلي بالحد الأعلى
    if (totalUsage > maxAllowedUsage) {
        println("\nWarning: High electricity usage!")
    } else {
        println("\nGood job! Usage is under control.")
    }

    // التحدي الإضافي
    val highestDevice = findHighestUsage(devices, usages)

    println("Highest consuming device: $highestDevice")
}