class Sticker(
    val productId: Int,
    val stickerId: Int,
    val images: Array<Images>,
    val imagesWidthBackground: Array<ImagesWidthBackground>,
    val AnimationUrl: String,
    val isAllowed: Boolean,
)

    class Images(
        val url: String,
        val width: Int,
        val height: Int,
    )

    class ImagesWidthBackground(
        val url: String,
        val width: Int,
        val height: Int,
    )