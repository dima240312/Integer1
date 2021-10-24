fun main() {
    Integer1()
}
fun Integer1() {

    print("Integer1. Дано расстояние L в сантиметрах. Используя операцию деления\n" +
            "нацело, найти количество полных метров в нем (1 метр = 100 см).\n")
    print("Введите растояние в сантиметрах:")
    var L_santim = readLine()!!.toInt()
    var full_metr = L_santim/100
    print("растояние в метрах $full_metr ")

}