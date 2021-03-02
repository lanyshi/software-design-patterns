package chainofresponsibility;

/**
 * Processor for metals
 */
public class MetalsProcessor extends TrashProcessor {

    public MetalsProcessor(TrashProcessor processor) {
        super(processor);
    }

    @Override
    public void processTrash(Trash trash) {
        if (TrashType.METALS == trash.getTrashType()) {
            printProcessing(trash);
            trash.markCategorized();
        }
        else {
            super.processTrash(trash);
        }
    }

    @Override
    public String toString() {
        return "Metals processor";
    }
}
