package com.example.ejer6kot

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.ejer6kot.ui.theme.Ejer6KotTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Ejer6KotTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                }
            }
        }
    }
}

fun main() {


    var cuenta1 = CuentaBancaria("Cuenta Vivienda", 200.000)
    var cuenta2 = CuentaBancaria("Cuenta Corriente", 350.000)
    var cuenta3 = CuentaBancaria("Cuenta Ahorros", 159.000)

// cta1
    println("")
    println("...................................")
    println(".......Historico de Cuenta1........")
    cuenta1.deposito(200.000)
    cuenta1.retiro(150.000)
    cuenta1.retiro(120.000)  // Retiro fallido
    cuenta1.deposito(80.000)
    cuenta1.retiro(100.000)

// cta2
    println("")
    println("...................................")
    println(".......Historico de Cuenta2........")
    cuenta2.deposito(50.000)
    cuenta2.retiro(300.000)
    cuenta2.retiro(100.000)  // Retiro fallido
    cuenta2.deposito(80.000)
    cuenta2.retiro(40.000)

    // cta3
    println("")
    println("...................................")
    println(".......Historico de Cuenta3........")
    cuenta3.deposito(158.000)
    cuenta3.retiro(120.000)
    cuenta3.retiro(300.000)  // Retiro fallido
    cuenta3.deposito(350.000)
    cuenta3.retiro(50.000)



    println("")
    println("...................................")
    println(".......*** Hoja 2 ***........")


    // Mostrar saldos y historiales
    println("")
    println("...................................")
    println(".......Historia de saldo cuenta1........")
    cuenta1.mostrarSaldo()
    cuenta1.mostrarHistorial()


    println("")
    println("...................................")
    println(".......Historia de saldo cuenta2........")
    cuenta2.mostrarSaldo()
    cuenta2.mostrarHistorial()


    println("")
    println("...................................")
    println(".......Historia de saldo cuenta3........")
    cuenta3.mostrarSaldo()
    cuenta3.mostrarHistorial()
}
