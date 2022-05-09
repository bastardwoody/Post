package attachments

import media.Graffiti

class GraffitiAttachment(
    val graffiti: Graffiti,
) : Attachments {
    override val type: String = "graffiti"
}