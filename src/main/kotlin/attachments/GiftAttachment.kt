package attachments

import media.Gift

class GiftAttachment(
    val gift: Gift,
) : Attachments {
    override val type: String = "gift"
}