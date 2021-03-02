package chainofresponsibility;

/**
 * Processor for wood
 */
public class WoodProcessor extends TrashProcessor {

    public WoodProcessor(TrashProcessor processor) {
        super(processor);
    }

    @Override
    public void processTrash(Trash trash) {
        if (TrashType.WOOD == trash.getTrashType()) {
            printProcessing(trash);
            trash.markCategorized();
        }
        else {
            super.processTrash(trash);
        }
    }

    @Override
    public String toString() {
        return "Wood processor";
    }
}
