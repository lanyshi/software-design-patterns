package chainofresponsibility;

import java.util.logging.Logger;

/**
 * Trash processor which is responsible for processing trash
 */
public abstract class TrashProcessor {

    private static final Logger logger = Logger.getLogger(TrashProcessor.class.toString());

    private final TrashProcessor next;

    /**
     * A processor is followed by the next processor
     *
     * @param next
     */
    public TrashProcessor(TrashProcessor next) {
        this.next = next;
    }

    /**
     * The next processor will process trash unless the processor is null
     * @param trash
     */
    public void processTrash(Trash trash) {
        if (next != null) {
            next.processTrash(trash);
        }
    }

    protected void printProcessing(Trash trash) {
        logger.info(this + " processing trash \"" + trash + "\"");
    }

    public abstract String toString();
}
