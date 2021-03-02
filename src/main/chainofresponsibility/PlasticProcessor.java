package chainofresponsibility;

/**
 * Processor for plastic
 */
public class PlasticProcessor extends TrashProcessor {

    public PlasticProcessor(TrashProcessor processor) {
        super(processor);
    }

    @Override
    public void processTrash(Trash trash) {
        if (TrashType.PLASTIC == trash.getTrashType()) {
            printProcessing(trash);
            trash.markCategorized();
        }
        else {
            super.processTrash(trash);
        }
    }

    @Override
    public String toString() {
        return "Plastic processor";
    }
}
