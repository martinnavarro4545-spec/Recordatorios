package com.example.recordatorios
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    PantallaRecordatorios()
                }
            }
        }
    }
}

@Composable
fun PantallaRecordatorios() {
    Column(modifier = Modifier.padding(16.dp)) {
        Text(
            text = "Mis recordatorios",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 8.dp)
        )
        Text(
            text = "Categorías: ${categoriasUnicas.size}",
            modifier = Modifier.padding(bottom = 16.dp)
        )

        LazyColumn(verticalArrangement = Arrangement.spacedBy(8.dp)) {
            items(recordatoriosSimulados) { recordatorio ->
                RecordatorioCard(recordatorio)
            }
        }
    }
}

@Composable
fun RecordatorioCard(recordatorio: Recordatorio) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = recordatorio.titulo, fontWeight = FontWeight.Bold, fontSize = 18.sp)
            Spacer(modifier = Modifier.height(4.dp))
            Text(text = "Categoría: ${recordatorio.categoria.nombre}")
            Text(text = "Prioridad: ${recordatorio.prioridad.javaClass.simpleName}")
            Text(text = "Estado: ${recordatorio.estado.javaClass.simpleName}")

            if (recordatorio.descripcion.isNotEmpty()) {
                Spacer(modifier = Modifier.height(8.dp))
                Text(text = recordatorio.descripcion, style = MaterialTheme.typography.bodyMedium)
            }
        }
    }
}