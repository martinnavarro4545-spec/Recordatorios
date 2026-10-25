package com.example.recordatorios
// Sealed class para el estado del recordatorio
sealed class Estado {
    object Pendiente : Estado()
    object Completado : Estado()
}

// Sealed class para la prioridad
sealed class Prioridad {
    object Alta : Prioridad()
    object Media : Prioridad()
    object Baja : Prioridad()
}

// Data class para la categoría
data class Categoria(val nombre: String)

// Data class principal para el recordatorio
data class Recordatorio(
    val id: Int,
    val titulo: String,
    val descripcion: String,
    val categoria: Categoria,
    val prioridad: Prioridad,
    val estado: Estado
)