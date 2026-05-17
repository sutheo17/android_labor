package hu.bme.aut.android.highrollersden.domain.model

data class H2HMatch(
    val date: String,
    val fullTimeScore: String, // pl: "2-1"
    val halfTimeScore: String  // pl: "0-1"
)