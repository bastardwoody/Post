package attachments

import media.Audio

class AudioAttachment(
    val audio: Audio,
) : Attachments {
    override val type: String = "audio"
}