package components

class Geo(
    val type: String,
    val coordinates: String,
    val place: Place,
) {

    class Place(
        val countryId: Int = (0..999).random(),
    )
}