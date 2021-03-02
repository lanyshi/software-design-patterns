import chainofresponsibility.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestChainOfResponsibility {

    public TestChainOfResponsibility() {}

    @Test
    public void testGetTrashType() {
        Trash trash = new Trash(TrashType.PAPER_PAPERBOARD, "");
        assertEquals(TrashType.PAPER_PAPERBOARD, trash.getTrashType());
    }

    @Test
    public void testGetTrashDescription() {
        Trash trash = new Trash(TrashType.PAPER_PAPERBOARD, "toilet paper core");
        assertEquals("toilet paper core", trash.getTrashDescription());
    }

    @Test
    public void testMarkTrashCategorized() {
        Trash trash = new Trash(TrashType.PAPER_PAPERBOARD, "");
        trash.markCategorized();
        assertEquals(true, trash.isCategorized());
    }

    @Test
    public void testTrashToString() {
        Trash trash = new Trash(TrashType.PAPER_PAPERBOARD, "toilet paper core");
        assertEquals("toilet paper core", trash.toString());
    }

    @Test
    public void testProcessTrash() {
        Trash trash = new Trash(TrashType.PAPER_PAPERBOARD, "toilet paper core");
        PaperProcessor paperProcessor = new PaperProcessor(null);
        assertEquals(false, trash.isCategorized()); // before processing, should return false
        paperProcessor.processTrash(trash);
        assertEquals(true, trash.isCategorized());  // after processing, should return true
    }

    @Test
    public void testTrashProcessorToString() {
        GlassProcessor glassProcessor = new GlassProcessor(null);
        assertEquals("Glass processor", glassProcessor.toString());
    }

    @Test
    public void testPaperProcessor() {
        Trash trash = new Trash(TrashType.PAPER_PAPERBOARD, "toilet paper core");
        PaperProcessor paperProcessor = new PaperProcessor(null);
        assertEquals("Paper and Paperboard processor", paperProcessor.toString());
        paperProcessor.processTrash(trash);
        assertEquals(true, trash.isCategorized());
    }

    @Test
    public void testGlassProcessor() {
        Trash trash = new Trash(TrashType.GLASS, "empty beer bottle");
        GlassProcessor glassProcessor = new GlassProcessor(null);
        assertEquals("Glass processor", glassProcessor.toString());
        glassProcessor.processTrash(trash);
        assertEquals(true, trash.isCategorized());
    }

    @Test
    public void testMetalsProcessor() {
        Trash trash = new Trash(TrashType.METALS, "empty soda can");
        MetalsProcessor metalsProcessor = new MetalsProcessor(null);
        assertEquals("Metals processor", metalsProcessor.toString());
        metalsProcessor.processTrash(trash);
        assertEquals(true, trash.isCategorized());
    }

    @Test
    public void testPlasticProcessor() {
        Trash trash = new Trash(TrashType.PLASTIC, "empty beverage bottle");
        PlasticProcessor plasticProcessor = new PlasticProcessor(null);
        assertEquals("Plastic processor", plasticProcessor.toString());
        plasticProcessor.processTrash(trash);
        assertEquals(true, trash.isCategorized());
    }

    @Test
    public void testWoodProcessor() {
        Trash trash = new Trash(TrashType.WOOD, "twig");
        WoodProcessor woodProcessor = new WoodProcessor(null);
        assertEquals("Wood processor", woodProcessor.toString());
        woodProcessor.processTrash(trash);
        assertEquals(true, trash.isCategorized());
    }

    @Test
    public void testRubberLeatherTextileProcessor() {
        Trash trash = new Trash(TrashType.RUBBER_LEATHER_TEXTILE, "old jeans");
        RubberLeatherTextileProcessor rubberLeatherTextileProcessor = new RubberLeatherTextileProcessor(null);
        assertEquals("Rubber, Leather and Textile processor", rubberLeatherTextileProcessor.toString());
        rubberLeatherTextileProcessor.processTrash(trash);
        assertEquals(true, trash.isCategorized());
    }

    @Test
    public void testNonRecyclableProcessor() {
        Trash trash = new Trash(TrashType.NONRECYCLABLE, "paper towel");
        NonRecyclableProcessor nonRecyclableProcessor = new NonRecyclableProcessor(null);
        assertEquals("Non-Recyclable processor", nonRecyclableProcessor.toString());
        nonRecyclableProcessor.processTrash(trash);
        assertEquals(true, trash.isCategorized());
    }

    @Test
    public void testUserThrowTrash() {
        User user = new User();
        Trash trash = new Trash(TrashType.PLASTIC, "empty water bottle");
        user.throwTrash(trash);
        assertEquals(true, trash.isCategorized());
    }
}

