package ru.netology

import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun commissionMastercard() {
        val typeCard = "Mastercard"
        val sumTransferInMonth = 0
        val sumMoneyTransfer = 1000
        val expected = 1000

        val result = commission(typeCard, sumTransferInMonth, sumMoneyTransfer)


        assertEquals(expected, result)
    }

    @Test
    fun commissionMastercardOverPay() {
        val typeCard = "Mastercard"
        val sumTransferInMonth = 0
        val sumMoneyTransfer = 100000
        val expected = 99380

        val result = commission(typeCard, sumTransferInMonth, sumMoneyTransfer)


        assertEquals(expected, result)
    }
    @Test
    fun commissionVisa() {
        val typeCard = "VISA"
        val sumTransferInMonth = 0
        val sumMoneyTransfer = 1000
        val expected = 965

        val result = commission(typeCard, sumTransferInMonth, sumMoneyTransfer)


        assertEquals(expected, result)
    }
    @Test
    fun commissionVisaMinPay() {
        val typeCard = "VISA"
        val sumTransferInMonth = 0
        val sumMoneyTransfer = 36
        val expected = 1

        val result = commission(typeCard, sumTransferInMonth, sumMoneyTransfer)


        assertEquals(expected, result)
    }
    @Test
    fun commissionVK() {
        val typeCard = "VK pay"
        val sumTransferInMonth = 0
        val sumMoneyTransfer = 1000
        val expected = 1000

        val result = commission(typeCard, sumTransferInMonth, sumMoneyTransfer)


        assertEquals(expected, result)
    }
}