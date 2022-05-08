class StickerAttachment(
    val sticker: Sticker,
) : Attachments {
    override val type: String = "sticker"
}