package components

import attachments.Attachments

class Comment(
    val ownerId: Int = (0..99).random(),
    val postId: Int = (0..99).random(),
    val fromGroup: Int = (0..99).random(),
    val message: String = "",
    val replyToComment: Int = (0..99).random(),
    val attachment: Array<Attachments> = emptyArray(),
    val stickerId: Int = (0..99).random(),
    val guid: String = "",
)