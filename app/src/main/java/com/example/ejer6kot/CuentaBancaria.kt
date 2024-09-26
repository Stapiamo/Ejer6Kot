package com.example.ejer6kot

class CuentaBancaria(private val nombreCuenta: String, var saldoDisponible: Double) {
    private val historial: MutableList<String> = mutableListOf()

    fun deposito(monto: Double) {
        if (monto > 0) {
            saldoDisponible += monto
            historial.add("Depósito: $$monto")
            println("Depósito de $$monto realizado.")
        } else {
            println("El monto del depósito debe ser positivo.")
        }
    }

    fun retiro(monto: Double) {
        if (monto > 0 && monto <= saldoDisponible) {
            saldoDisponible -= monto
            historial.add("Retiro: $$monto")
            println("Retiro de $$monto realizado.")
        } else if (monto > saldoDisponible) {
            println("Retiro fallido: Saldo insuficiente.")
        } else {
            println("El monto del retiro debe ser positivo.")
        }
    }

    fun mostrarSaldo() {
        println("Saldo disponible en $nombreCuenta: $$saldoDisponible")
    }

    fun mostrarHistorial() {
        println("Historial de transacciones de $nombreCuenta:")
        for (transaccion in historial) {
            println(transaccion)
        }
    }
}
