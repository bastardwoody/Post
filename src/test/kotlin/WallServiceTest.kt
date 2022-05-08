import org.junit.Test
import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun addPost() {
        // arrange
        val service = WallService()
        val post = service.addPost(Post(
            id = null,
            ownerId = 384,
            fromId = 243,
            createdBy = 346,
            date = 1739,
            text = "Good",
            replyOwnerId = 243,
            replyPostId = 707,
            friendsOnly = false,
            comments = Comments(
                93,
                true,
                true,
                true,
                false
            ),
            copyright = Copyright(
                98,
                "https://netology.ru/",
                "Нетология",
                "XZ"
            ),
            likes = Likes(
                83,
                true,
                true,
                true
            ),
            reposts = Reposts(
                21,
                false
            ),
            views = Views(
                47
            ),
            postType = "Bad",
            postSource = PostSource(),
            attachments = emptyArray(),
            geo = Geo(
                type = "GPS",
                coordinates = "76.78757, 34.35790",
                place = Geo.Place()
            ),
            signerId = 75,
            copyHistory = emptyArray(),
            canPin = true,
            canDelete = false,
            canEdit = false,
            isPinned = false,
            markedAsAds = false,
            isFavorite = false,
            donut = Donut(
                isDonut = true,
                paidDuration = 432,
                placeHolder = Any(),
                canPublishFreeCopy = true,
                editMode = "duration",
            ),
            postponedId = 2465
        ))

        // act
        val result = post.id

        // assert
        assertEquals(1062117592, result)
    }

    @Test
    fun updatePostTrue() {
        // arrange
        val service = WallService()
        val post1 = service.addPost(Post(
            id = null,
            ownerId = 384,
            fromId = 243,
            createdBy = 346,
            date = 1739,
            text = "Good",
            replyOwnerId = 243,
            replyPostId = 707,
            friendsOnly = false,
            comments = Comments(
                93,
                true,
                true,
                true,
                false
            ),
            copyright = Copyright(
                98,
                "https://netology.ru/",
                "Нетология",
                "XZ"
            ),
            likes = Likes(
                83,
                true,
                true,
                true
            ),
            reposts = Reposts(
                21,
                false
            ),
            views = Views(
                47
            ),
            postType = "Bad",
            postSource = PostSource(),
            attachments = emptyArray(),
            geo = Geo(
                type = "GPS",
                coordinates = "76.78757, 34.35790",
                place = Geo.Place()
            ),
            signerId = 75,
            copyHistory = emptyArray(),
            canPin = true,
            canDelete = false,
            canEdit = false,
            isPinned = false,
            markedAsAds = false,
            isFavorite = false,
            donut = Donut(
                isDonut = true,
                paidDuration = 432,
                placeHolder = Any(),
                canPublishFreeCopy = true,
                editMode = "duration",
            ),
            postponedId = 2465
        ))
        val post2 = service.addPost(Post(
            id = null,
            ownerId = 508,
            fromId = 343,
            createdBy = 496,
            date = 454,
            text = "Good",
            replyOwnerId = 2340,
            replyPostId = 78,
            friendsOnly = false,
            comments = Comments(
                13,
                true,
                true,
                true,
                false
            ),
            copyright = Copyright(
                83,
                "https://netology.ru/",
                "Нетология",
                "XZ"
            ),
            likes = Likes(
                80,
                true,
                true,
                true
            ),
            reposts = Reposts(
                220,
                false
            ),
            views = Views(
                367
            ),
            postType = "Bad",
            postSource = PostSource(),
            attachments = emptyArray(),
            geo = Geo(
                type = "GPS",
                coordinates = "76.78757, 34.35790",
                place = Geo.Place()
            ),
            signerId = 78,
            copyHistory = emptyArray(),
            canPin = true,
            canDelete = false,
            canEdit = false,
            isPinned = false,
            markedAsAds = false,
            isFavorite = false,
            donut = Donut(
                isDonut = true,
                paidDuration = 52,
                placeHolder = Any(),
                canPublishFreeCopy = true,
                editMode = "duration",
            ),
            postponedId = 94
        ))
        val post3 = service.addPost(Post(
            id = null,
            ownerId = 564,
            fromId = 43,
            createdBy = 300,
            date = 949,
            text = "Good",
            replyOwnerId = 293,
            replyPostId = 277,
            friendsOnly = false,
            comments = Comments(
                193,
                true,
                true,
                true,
                false
            ),
            copyright = Copyright(
                118,
                "https://netology.ru/",
                "Нетология",
                "XZ"
            ),
            likes = Likes(
                808,
                true,
                true,
                true
            ),
            reposts = Reposts(
                221,
                false
            ),
            views = Views(
                567
            ),
            postType = "Bad",
            postSource = PostSource(),
            attachments = emptyArray(),
            geo = Geo(
                type = "GPS",
                coordinates = "76.78757, 34.35790",
                place = Geo.Place()
            ),
            signerId = 790,
            copyHistory = emptyArray(),
            canPin = true,
            canDelete = false,
            canEdit = false,
            isPinned = false,
            markedAsAds = false,
            isFavorite = false,
            donut = Donut(
                isDonut = true,
                paidDuration = 63,
                placeHolder = Any(),
                canPublishFreeCopy = true,
                editMode = "duration",
            ),
            postponedId = 45
        ))

        // act
        val result = service.updatePost(post1)

        // assert
        assertTrue(result)
    }

    @Test
    fun updatePostFalse() {
        // arrange
        val service = WallService()
        val post1 = service.addPost(Post(
            id = null,
            ownerId = 384,
            fromId = 243,
            createdBy = 346,
            date = 1739,
            text = "Good",
            replyOwnerId = 243,
            replyPostId = 707,
            friendsOnly = false,
            comments = Comments(
                93,
                true,
                true,
                true,
                false
            ),
            copyright = Copyright(
                98,
                "https://netology.ru/",
                "Нетология",
                "XZ"
            ),
            likes = Likes(
                83,
                true,
                true,
                true
            ),
            reposts = Reposts(
                21,
                false
            ),
            views = Views(
                47
            ),
            postType = "Bad",
            postSource = PostSource(),
            attachments = emptyArray(),
            geo = Geo(
                type = "GPS",
                coordinates = "76.78757, 34.35790",
                place = Geo.Place()
            ),
            signerId = 75,
            copyHistory = emptyArray(),
            canPin = true,
            canDelete = false,
            canEdit = false,
            isPinned = false,
            markedAsAds = false,
            isFavorite = false,
            donut = Donut(
                isDonut = true,
                paidDuration = 432,
                placeHolder = Any(),
                canPublishFreeCopy = true,
                editMode = "duration",
            ),
            postponedId = 2465
        ))
        val post2 = service.addPost(Post(
            id = null,
            ownerId = 508,
            fromId = 343,
            createdBy = 496,
            date = 454,
            text = "Good",
            replyOwnerId = 2340,
            replyPostId = 78,
            friendsOnly = false,
            comments = Comments(
                13,
                true,
                true,
                true,
                false
            ),
            copyright = Copyright(
                83,
                "https://netology.ru/",
                "Нетология",
                "XZ"
            ),
            likes = Likes(
                80,
                true,
                true,
                true
            ),
            reposts = Reposts(
                220,
                false
            ),
            views = Views(
                367
            ),
            postType = "Bad",
            postSource = PostSource(),
            attachments = emptyArray(),
            geo = Geo(
                type = "GPS",
                coordinates = "76.78757, 34.35790",
                place = Geo.Place()
            ),
            signerId = 78,
            copyHistory = emptyArray(),
            canPin = true,
            canDelete = false,
            canEdit = false,
            isPinned = false,
            markedAsAds = false,
            isFavorite = false,
            donut = Donut(
                isDonut = true,
                paidDuration = 52,
                placeHolder = Any(),
                canPublishFreeCopy = true,
                editMode = "duration",
            ),
            postponedId = 94
        ))
        val post3 = service.addPost(Post(
            id = null,
            ownerId = 564,
            fromId = 43,
            createdBy = 300,
            date = 949,
            text = "Good",
            replyOwnerId = 293,
            replyPostId = 277,
            friendsOnly = false,
            comments = Comments(
                193,
                true,
                true,
                true,
                false
            ),
            copyright = Copyright(
                118,
                "https://netology.ru/",
                "Нетология",
                "XZ"
            ),
            likes = Likes(
                808,
                true,
                true,
                true
            ),
            reposts = Reposts(
                221,
                false
            ),
            views = Views(
                567
            ),
            postType = "Bad",
            postSource = PostSource(),
            attachments = emptyArray(),
            geo = Geo(
                type = "GPS",
                coordinates = "76.78757, 34.35790",
                place = Geo.Place()
            ),
            signerId = 790,
            copyHistory = emptyArray(),
            canPin = true,
            canDelete = false,
            canEdit = false,
            isPinned = false,
            markedAsAds = false,
            isFavorite = false,
            donut = Donut(
                isDonut = true,
                paidDuration = 63,
                placeHolder = Any(),
                canPublishFreeCopy = true,
                editMode = "duration",
            ),
            postponedId = 45
        ))

        // act
        val result = service.updatePost(Post(
            id = 43254648,
            ownerId = 564,
            fromId = 43,
            createdBy = 300,
            date = 949,
            text = "Good",
            replyOwnerId = 293,
            replyPostId = 277,
            friendsOnly = false,
            comments = Comments(
                193,
                true,
                true,
                true,
                false
            ),
            copyright = Copyright(
                118,
                "https://netology.ru/",
                "Нетология",
                "XZ"
            ),
            likes = Likes(
                808,
                true,
                true,
                true
            ),
            reposts = Reposts(
                221,
                false
            ),
            views = Views(
                567
            ),
            postType = "Bad",
            postSource = PostSource(),
            attachments = emptyArray(),
            geo = Geo(
                type = "GPS",
                coordinates = "76.78757, 34.35790",
                place = Geo.Place()
            ),
            signerId = 790,
            copyHistory = emptyArray(),
            canPin = true,
            canDelete = false,
            canEdit = false,
            isPinned = false,
            markedAsAds = false,
            isFavorite = false,
            donut = Donut(
                isDonut = true,
                paidDuration = 63,
                placeHolder = Any(),
                canPublishFreeCopy = true,
                editMode = "duration",
            ),
            postponedId = 45
        ))

        // assert
        assertFalse(result)
    }
}