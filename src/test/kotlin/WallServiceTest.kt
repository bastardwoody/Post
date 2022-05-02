import org.junit.Test
import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun addPost() {
        // arrange
        val service = WallService()
        val post = Post(
            id = 111,
            ownerId = 3648,
            fromId = 13123,
            createdBy = 157664,
            date = 32635472,
            text = "Bay",
            replyOwnerId = 15675,
            replyPostId = 16867,
            friendsOnly = false,
            postType = "Next",
            signerId = 19757477,
            canPin = true,
            canDelete = false,
            canEdit = false,
            isPinned = false,
            markedAsAds = false,
            isFavorite = false,
            postponedId = 156478
        )
        service.addPost(post)

        // act
        val result = post.id

        // assert
        assertEquals(307508243, result)
    }

    @Test
    fun updatePostTrue() {
        // arrange
        val service = WallService()
        service.addPost(Post(
            id = 111,
            ownerId = 3648,
            fromId = 13123,
            createdBy = 157664,
            date = 32635472,
            text = "Bay",
            replyOwnerId = 15675,
            replyPostId = 16867,
            friendsOnly = false,
            postType = "Next",
            signerId = 19757477,
            canPin = true,
            canDelete = false,
            canEdit = false,
            isPinned = false,
            markedAsAds = false,
            isFavorite = false,
            postponedId = 156478
        ))
        service.addPost(Post(
            id = 222,
            ownerId = 1542,
            fromId = 4564,
            createdBy = 342,
            date = 678,
            text = "Good",
            replyOwnerId = 4243,
            replyPostId = 908,
            friendsOnly = false,
            postType = "Go",
            signerId = 546323,
            canPin = true,
            canDelete = false,
            canEdit = false,
            isPinned = false,
            markedAsAds = false,
            isFavorite = false,
            postponedId = 4565675
        ))
        service.addPost(Post(
            id = 333,
            ownerId = 2321,
            fromId = 657,
            createdBy = 34,
            date = 676,
            text = "Wow",
            replyOwnerId = 54643,
            replyPostId = 454,
            friendsOnly = false,
            postType = "Back",
            signerId = 5675,
            canPin = true,
            canDelete = false,
            canEdit = false,
            isPinned = false,
            markedAsAds = false,
            isFavorite = false,
            postponedId = 234
        ))
        val update = Post(
            id = 307508243,
            fromId = 4343,
            createdBy = 231,
            text = "Bad",
            replyOwnerId = 675,
            replyPostId = 89,
            friendsOnly = false,
            postType = "Ugly",
            signerId = 345,
            canPin = true,
            canDelete = false,
            canEdit = false,
            isPinned = false,
            markedAsAds = false,
            isFavorite = false,
            postponedId = 1240
        )

        // act
        val result = service.updatePost(update)

        // assert
        assertTrue(result)
    }

    @Test
    fun updatePostFalse() {
        // arrange
        val service = WallService()
        service.addPost(Post(
            id = 111,
            ownerId = 3648,
            fromId = 13123,
            createdBy = 157664,
            date = 32635472,
            text = "Bay",
            replyOwnerId = 15675,
            replyPostId = 16867,
            friendsOnly = false,
            postType = "Next",
            signerId = 19757477,
            canPin = true,
            canDelete = false,
            canEdit = false,
            isPinned = false,
            markedAsAds = false,
            isFavorite = false,
            postponedId = 156478
        ))
        service.addPost(Post(
            id = 222,
            ownerId = 1542,
            fromId = 4564,
            createdBy = 342,
            date = 678,
            text = "Good",
            replyOwnerId = 4243,
            replyPostId = 908,
            friendsOnly = false,
            postType = "Go",
            signerId = 546323,
            canPin = true,
            canDelete = false,
            canEdit = false,
            isPinned = false,
            markedAsAds = false,
            isFavorite = false,
            postponedId = 4565675
        ))
        service.addPost(Post(
            id = 333,
            ownerId = 2321,
            fromId = 657,
            createdBy = 34,
            date = 676,
            text = "Wow",
            replyOwnerId = 54643,
            replyPostId = 454,
            friendsOnly = false,
            postType = "Back",
            signerId = 5675,
            canPin = true,
            canDelete = false,
            canEdit = false,
            isPinned = false,
            markedAsAds = false,
            isFavorite = false,
            postponedId = 234
        ))
        val update = Post(
            id = 11,
            fromId = 4343,
            createdBy = 231,
            text = "Bad",
            replyOwnerId = 675,
            replyPostId = 89,
            friendsOnly = false,
            postType = "Ugly",
            signerId = 345,
            canPin = true,
            canDelete = false,
            canEdit = false,
            isPinned = false,
            markedAsAds = false,
            isFavorite = false,
            postponedId = 1240
        )

        // act
        val result = service.updatePost(update)

        // assert
        assertFalse(result)
    }
}