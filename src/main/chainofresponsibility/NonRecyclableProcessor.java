package chainofresponsibility;

/**
 * Processor for nonrecyclables
 * Must be the last one in the chain
 */
public class NonRecyclableProcessor extends TrashProcessor {

    public NonRecyclableProcessor(TrashProcessor processor) {
        super(processor);
    }

    @Override
    public void processTrash(Trash trash) {
        if (TrashType.NONRECYCLABLE == trash.getTrashType()) {
            printProcessing(trash);
            trash.markCategorized();
        }
        else {
            super.processTrash(trash);
        }
    }

    @Override
    public String toString() {
        return "Non-Recyclable processor";
    }
}
