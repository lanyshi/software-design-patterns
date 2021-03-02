package chainofresponsibility;

/**
 * Processor for rubber, leather, textile
 */
public class RubberLeatherTextileProcessor extends TrashProcessor {

    public RubberLeatherTextileProcessor(TrashProcessor processor) {
        super(processor);
    }

    @Override
    public void processTrash(Trash trash) {
        if (TrashType.RUBBER_LEATHER_TEXTILE == trash.getTrashType()) {
            printProcessing(trash);
            trash.markCategorized();
        }
        else {
            super.processTrash(trash);
        }
    }

    @Override
    public String toString() {
        return "Rubber, Leather and Textile processor";
    }
}
