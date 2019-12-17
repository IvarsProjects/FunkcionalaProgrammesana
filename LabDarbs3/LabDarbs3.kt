package kt.rtuset.empty
import org.junit.Test
import kotlin.math.sqrt
typealias Set = (Int) -> Boolean

infix fun Set.contains(elem: Int): Boolean = this(elem)

fun singletonSet(elem: Int): Set = 
{
    it == elem
}

infix fun Set.union(set: Set): Set = 
{
    this(it) || set(it)
}

infix fun Set.intersect(set: Set): Set = 
{
    this(it) == set(it)
}

infix fun Set.diff(set: Set): Set = 
{
    this(it) != set(it)
}

fun Set.filter(predicate: (Int) -> Boolean): Set = 
{
    this(it) && predicate(it)
}


class RtuSetTest {

    @Test
    fun `Set contains a given element`()
    {
        val set: Set = { it == 1 }
        assert(set contains 1)
    }

    @Test
    fun `Singleton set contains a given element`() 
    {
        val set: Set = singletonSet(2)
        assert(set contains 2)
    }

    @Test
    fun `Union set contains both elements`() 
    {
        val set = singletonSet(1) union singletonSet(2)
        assert(set contains 1)
        assert(set contains 2)
    }

    @Test
    fun `Intersect set works correctly`()
    {
        val set = singletonSet(1) union singletonSet(2) intersect singletonSet(1)
        assert(set contains 1)
        assert((set contains 2).not())
    }

    @Test
    fun `Diff set works correctly`()
    {
        val set = singletonSet(1) union singletonSet(2) union singletonSet(3) diff singletonSet(2)
        assert(set contains 1)
        assert(set contains 3)
        assert((set contains 2).not())
    }

    @Test
    fun `Filter set works correctly`()
    {
        val set = (singletonSet(1) union singletonSet(2)).filter { it == 1 }
        assert(set contains 1)
        assert((set contains 2).not())
    }

}