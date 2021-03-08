import TrainningModule1.Student

fun main(args : Array<String>)
{
    var Ajay = Student()
    Ajay.name = "Ajay sharma"
    Ajay.mobile = "9758990388"
    Ajay.English = 80
    Ajay.Maths = 75
    Ajay.Science = 92

    var vijay = Student()
    vijay.name = "vijay sharma"
    vijay.mobile = "9211470726"
    vijay.English = 75
    vijay.Maths = 62
    vijay.Science = 85

    var deepak = Student()
    deepak.name = "Deepak Bhardwaj"
    deepak.mobile = "9643762201"
    deepak.English = 78
    deepak.Maths = 89
    deepak.Science = 68

    var kallu = Student()
    kallu.name = "kallu Bhardwaj"
    kallu.mobile = "8929848216"
    kallu.English = 35
    kallu.Maths = 34
    kallu.Science = 33

    println("${Ajay.name} \t ${Ajay.mobile} \t English ${Ajay.English}\t Maths ${Ajay.Maths}\t Science ${Ajay.Science}")
    println("${vijay.name} \t ${vijay.mobile} \t English ${vijay.English}\t Maths ${vijay.Maths}\t Science ${vijay.Science}")
    println("${deepak.name}\t ${deepak.mobile} \t English ${deepak.English}\t Maths ${deepak.Maths}\t Science ${deepak.Science}")
    println("${kallu.name} \t ${kallu.mobile} \t English ${kallu.English}\t Maths ${kallu.Maths}\t Science ${kallu.Science}")




}


