import java.util.*

data class Post(
    val id: UUID = UUID.randomUUID(),
    val ownerId: Int = (0..999).random(),
    val fromId: Int = (0..999).random(),
    val createdBy: Int = (0..999).random(),
    val date: Int = (0..999).random(),
    val text: String = listOf("Hello", "Bay", "Whats up").random(),
    val replyOwnerId: Int = (0..999).random(),
    val replyPostId: Int = (0..999).random(),
    val friendsOnly: Boolean = true,
    val postType: String = listOf("Good", "Bad", "Ugly").random(),
    val signerId: Int = (0..999).random(),
    val canPin: Boolean = true,
    val canDelete: Boolean = true,
    val canEdit: Boolean = true,
    val isPinned: Boolean = true,
    val markedAsAds: Boolean = true,
    val isFavorite: Boolean = true,
    val postponedId: Int = (0..999).random()
)