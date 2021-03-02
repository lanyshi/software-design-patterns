package chainofresponsibility;

/**
 * Processor for paper
 */
public class PaperProcessor extends TrashProcessor {

    public PaperProcessor(TrashProcessor processor) {
        super(processor);
    }

    @Override
    public void processTrash(Trash trash) {
        if (TrashType.PAPER_PAPERBOARD == trash.getTrashType()) {
            printProcessing(trash);
            trash.markCategorized();
        }
        else {
            super.processTrash(trash);
        }
    }

    @Override
    public String toString() {
        return "Paper and Paperboard processor";
    }
}
