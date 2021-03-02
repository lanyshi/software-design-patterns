package chainofresponsibility;

/**
 * User throws trash that is processed by the trashcan processing chain
 */
public class User {

    private TrashProcessor chain;

    public User() {
        activateTrashCan();
    }

    /**
     * The trashcan processing system is consisted of 7 processors with one chained with another.
     */
    public void activateTrashCan() {
        chain = new PaperProcessor(new GlassProcessor(new MetalsProcessor(new PlasticProcessor(
                new WoodProcessor(new RubberLeatherTextileProcessor(new NonRecyclableProcessor(null)))))));
    }

    /**
     * The user throws trash in the trashcan then the trashcan starts processing.
     *
     * @param trash
     */
    public void throwTrash(Trash trash) {
        chain.processTrash(trash);
    }
}