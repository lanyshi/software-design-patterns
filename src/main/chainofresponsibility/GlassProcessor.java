package chainofresponsibility;

/**
 * Processor for glass
 */
public class GlassProcessor extends TrashProcessor {

    public GlassProcessor(TrashProcessor processor) {
        super(processor);
    }

    @Override
    public void processTrash(Trash trash) {
        if (TrashType.GLASS == trash.getTrashType()) {
            printProcessing(trash);
            trash.markCategorized();
        } else {
            super.processTrash(trash);
        }
    }

    @Override
    public String toString() {
        return "Glass processor";
    }
}

