package attachments

import media.Photo

class PhotoAttachment(
    val photo: Photo,
) : Attachments {
    override val type: String = "phote"
}