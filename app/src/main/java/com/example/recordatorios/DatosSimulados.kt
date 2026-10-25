package com.example.recordatorios
// Categorías
val categoriaTrabajo = Categoria(nombre = "Trabajo")
val categoriaPersonal = Categoria(nombre = "Personal")
val categoriaEstudio = Categoria(nombre = "Estudio")

// Map: asocia cada categoría con una etiqueta (String)
val etiquetasCategorias: Map<Categoria, String> = mapOf(
    categoriaTrabajo to "Trabajo",
    categoriaPersonal to "Personal",
    categoriaEstudio to "Estudio"
)

// List: contiene los recordatorios simulados
val recordatoriosSimulados: List<Recordatorio> = listOf(
    Recordatorio(
        id = 1,
        titulo = "Revisar documentos",
        descripcion = "Controlar la documentación pendiente.",
        categoria = categoriaTrabajo,
        prioridad = Prioridad.Alta,
        estado = Estado.Pendiente
    ),
    Recordatorio(
        id = 2,
        titulo = "Comprar insumos",
        descripcion = "",
        categoria = categoriaPersonal,
        prioridad = Prioridad.Media,
        estado = Estado.Pendiente
    ),
    Recordatorio(
        id = 3,
        titulo = "Estudiar Kotlin",
        descripcion = "Repasar colecciones y funciones.",
        categoria = categoriaEstudio,
        prioridad = Prioridad.Alta,
        estado = Estado.Pendiente
    ),
    Recordatorio(
        id = 4,
        titulo = "Enviar informe",
        descripcion = "",
        categoria = categoriaTrabajo,
        prioridad = Prioridad.Baja,
        estado = Estado.Completado
    )
)

// Set: obtiene las categorías sin repetidas
val categoriasUnicas: Set<Categoria> = recordatoriosSimulados.map { it.categoria }.toSet()