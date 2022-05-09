import components.*
import exceptions.ComplaintException
import exceptions.PostNotFoundException
import org.junit.Test
import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun addPost() {
        // arrange
        val service = WallService()

        // act
        val result = service.addPost(Post()).id

        // assert
        assertEquals(kotlin.math.abs(result.hashCode()), result)
    }

    @Test
    fun updatePostTrue() {
        // arrange
        val service = WallService()
        val post1 = service.addPost(Post())
        val post2 = service.addPost(Post())
        val post3 = service.addPost(Post())

        // act
        val result = service.updatePost(post1)

        // assert
        assertTrue(result)
    }

    @Test
    fun updatePostFalse() {
        // arrange
        val service = WallService()
        val post1 = service.addPost(Post())
        val post2 = service.addPost(Post())
        val post3 = service.addPost(Post())

        // act
        val result = service.updatePost(Post())

        // assert
        assertFalse(result)
    }

    @Test
    fun createComment() {
        // arrange
        val service = WallService()
        val post1 = service.addPost(Post())
        val post2 = service.addPost(Post())
        val post3 = service.addPost(Post())
        val comment = service.createComment(Comment(postId = post2.id))

        // act
        val result = comment.postId

        // assert
        assertEquals(post2.id, result)
    }

    @Test(expected = PostNotFoundException::class)
    fun shouldThrowCreateComment() {
        val service = WallService()
        val post1 = service.addPost(Post())
        val post2 = service.addPost(Post())
        val post3 = service.addPost(Post())
        val comment = service.createComment(Comment())
    }

    @Test
    fun complaint() {
        // arrange
        val service = WallService()
        val post1 = service.addPost(Post())
        val post2 = service.addPost(Post())
        val post3 = service.addPost(Post())
        val comment1 = service.createComment(Comment(postId = post1.id))
        val comment2 = service.createComment(Comment(postId = post2.id))
        val comment3 = service.createComment(Comment(postId = post3.id))
        val complaint = service.complaint(comment3, Reasons.DRUGS)

        // act
        val result = comment3.postId

        // assert
        assertEquals(post3.id, result)
    }

    @Test(expected = ComplaintException::class)
    fun shouldThrowComplaint() {
        val service = WallService()
        val post1 = service.addPost(Post())
        val post2 = service.addPost(Post())
        val post3 = service.addPost(Post())
        val comment1 = service.createComment(Comment(postId = post1.id))
        val comment2 = service.createComment(Comment(postId = post2.id))
        val comment3 = service.createComment(Comment(postId = post3.id))
        val complaint = service.complaint(Comment(), Reasons.DRUGS)
    }
}