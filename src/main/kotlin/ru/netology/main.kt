package ru.netology

fun main() {

    val result = commission("Mastercard",0,1000)
    val result2 = commission("Mastercard",0,100000)
    val result3 = commission("VISA",0,1000)
    val result4 = commission("VISA",0,36)
    val result5 = commission("VK pay",0,1000)
    println(result)
    println(result2)
    println(result3)
    println(result4)
    println(result5)

}

const val masterCard = "Mastercard"
const val maestro = "Maestro"
const val visa = "VISA"
const val mir = "Мир"
const val vkPay = "VK Pay"
var comissionVisa = 35
const val maxTransferWithoutCommission = 75000



fun commission(
    typeCard: String = "VK pay",
    sumTransferInMonth: Int =0,
    sumMoneyTransfer: Int
): Any {
    return when (typeCard) {
        masterCard, maestro ->
            if (sumMoneyTransfer < maxTransferWithoutCommission) sumMoneyTransfer
            else sumMoneyTransfer * 0.994 - 20
        visa, mir ->
            if (sumMoneyTransfer * 0.0075 > comissionVisa) sumMoneyTransfer * 0.9925

            else sumMoneyTransfer - 35
        else -> sumMoneyTransfer

    }

    }
