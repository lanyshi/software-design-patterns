package chainofresponsibility;

import java.util.Objects;

/**
 * Trash class
 */
public class Trash {

    /**
     * Used by each processor to see if the trash belongs in its category
     */
    private final TrashType trashType;

    /**
     * A description of the trash
     */
    private final String trashDescription;

    /**
     * If the trash is categorized by a processor
     */
    private boolean categorized;

    /**
     * Create a trash based on type and description
     *
     * @param trashType
     * @param trashDescription
     */
    public Trash(final TrashType trashType, final String trashDescription) {
        this.trashType = Objects.requireNonNull(trashType);
        this.trashDescription = Objects.requireNonNull(trashDescription);
    }

    /**
     * Get the trash type. Used by a processor to see if it should be in its own category
     *
     * @return
     */
    public TrashType getTrashType() {
        return trashType;
    }

    /**
     * Get the description of the trash
     * @return
     */
    public String getTrashDescription() {
        return trashDescription;
    }

    /**
     * If the trash is being processed by the matching processor, mark the trash categorized
     */
    public void markCategorized() {
        this.categorized = true;
    }

    /**
     * If the trash is categorized by a processor
     *
     * @return
     */
    public boolean isCategorized() {
        return this.categorized;
    }

    @Override
    public String toString() {
        return getTrashDescription();
    }

}
